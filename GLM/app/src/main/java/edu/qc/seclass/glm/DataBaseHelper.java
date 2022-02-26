package edu.qc.seclass.glm;

import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME = "ReminderAppDB";
    private static final String REMINDERS_TABLE = "Reminder_Table";

    private static final String REMINDER = "Reminder";
    private static final String REMINDER_LIST = "Reminder_List";

    //for creating a reminder list:
    private static final String LIST_ID = "List_ID";
    private static final String LIST_TITLE = "List_Title";
    private static final String LIST_ITEM = "List_Item";
    private static final String LIST_ITEM_ID = "List_Item_ID";

    //for creating reminders
    private static final String REMINDER_ID = "Reminder_ID";
    private static final String REMINDER_NAME = "Reminder_Name";
    private static final String REMINDER_DATE = "Date";
    private static final String REMINDER_TIME = "Time";
    private static final String REMINDER_REPEAT = "Repeat";
    private static final String REMINDER_CHECKOFF = "Check_Off";
    private static final String REMINDER_ALERT = "Alert";


    public DataBaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //creates the table that will hold individual reminders
        String createReminderTableStatement = "CREATE TABLE " + REMINDER +
                "("
                + REMINDER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + LIST_ID + " INTEGER, "
                + REMINDER_NAME + " TEXT, FOREIGN KEY (" + LIST_ID + ") REFERENCES "
                + REMINDER_LIST + "(" + LIST_ID + ") )";

        //creates the table that will create a new list. This list will also serve as
        //the reminder type
        String createReminderListTableStatement = "CREATE TABLE " + REMINDER_LIST +
                "("
                + LIST_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + LIST_TITLE + " TEXT)";

        //creates a table that will connect the reminders to their reminder list
        String createReminderListItemTableStatement = "CREATE TABLE " + LIST_ITEM +
                "("
                + LIST_ITEM_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + REMINDER_DATE + " TEXT, "
                + REMINDER_TIME + " TEXT, "
                + REMINDER_ALERT + " BOOLEAN, "
                + REMINDER_CHECKOFF + " BOOLEAN, "
                + REMINDER_REPEAT + " BOOLEAN, "
                + LIST_ID + " INTEGER,"
                + REMINDER_ID + " INTEGER, FOREIGN KEY (" + LIST_ID + ") REFERENCES "
                + REMINDER_LIST + "(" + LIST_ID + "), FOREIGN KEY(" + REMINDER_ID + ") " +
                "REFERENCES " + REMINDER + "( " + REMINDER_ID + "))";

        db.execSQL(createReminderTableStatement);
        db.execSQL(createReminderListTableStatement);
        db.execSQL(createReminderListItemTableStatement);
    }

    //if we change or upgrade the database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion >= newVersion)
            return;
        db.execSQL("DROP TABLE IF EXISTS " + REMINDERS_TABLE);
        onCreate(db);
    }

    public boolean createNewList(ReminderList reminderList){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(LIST_TITLE, reminderList.getListName());
        long insert = database.insert(REMINDER_LIST, null, cv);

        if(insert == -1)
            return false;
        return true;
    }

//    public ReminderList getOne(){
//        ReminderList reminderList = new ReminderList();
//        SQLiteDatabase database = this.getReadableDatabase();
//
//        String sqlQuery = "SELECT FROM " + REMINDER_LIST + " WHERE " +
//                REMINDER_LIST_ID + " = " + reminderList.getListId();
//        Cursor cursor = database.rawQuery(sqlQuery, null);
//
//        if (cursor.moveToFirst()) {
//            do {
//                int listID = cursor.getInt(0);
//                String nameList = cursor.getString(1);
//                ReminderList newReminderList = new ReminderList(listID, nameList);
//
//                allUserLists.add(newReminderList);
//            } while (cursor.moveToNext());
//        }
//        else{
//            //failure, not adding anything to list
//        }
//        cursor.close();
//        database.close();
//
//        return allUserLists;
//    }

    public boolean deleteSelectedList(ReminderList reminderList){
        SQLiteDatabase database = this.getWritableDatabase();
        String sqlQuery = "DELETE FROM " + REMINDER_LIST + " WHERE " +
                LIST_ID + " = " + reminderList.getListId();

        Cursor cursor = database.rawQuery(sqlQuery, null);

        if(cursor.moveToFirst()){
            return true;
        }
        else{
            return false;
        }
    }


    //not finished yet
    public List<Reminder> getAllReminders() {
        List<Reminder> listOfReminders = new ArrayList<>();
        SQLiteDatabase database = this.getReadableDatabase();
        String sqlQuery = "SELECT * FROM " + REMINDER;
        Cursor cursor = database.rawQuery(sqlQuery, null);

        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(0);
                int reminderTypeID = cursor.getInt(1);
                String reminderName = cursor.getString(2);
                Reminder reminder = new Reminder(id, reminderTypeID, reminderName);

                listOfReminders.add(reminder);
            } while (cursor.moveToNext());
        }

        cursor.close();
        database.close();

        return listOfReminders;
    }

    public List<ReminderList> getAllUserLists() {
        List<ReminderList> allUserLists = new ArrayList<>();
        SQLiteDatabase database = this.getReadableDatabase();

        String sqlQuery = "SELECT * FROM " + REMINDER_LIST;
        Cursor cursor = database.rawQuery(sqlQuery, null);

        if (cursor.moveToFirst()) {
            do {
                int listID = cursor.getInt(0);
                String nameList = cursor.getString(1);
                ReminderList newReminderList = new ReminderList(listID, nameList);

                allUserLists.add(newReminderList);
            } while (cursor.moveToNext());
        }
        else{
            //failure, not adding anything to list
        }
        cursor.close();
        database.close();

        return allUserLists;
    }

//    public List<ReminderListItem> getAllItemsFromUserList(int reminderListID) {
//        List<ReminderListItem> allItemsInList = new ArrayList<>();
//        SQLiteDatabase database = this.getReadableDatabase();
//
//        String sqlQuery = "SELECT * FROM " + REMINDER_LIST_ITEM + "," + REMINDER +
//                " WHERE" + REMINDER_LIST_ITEM + "." + REMINDER_ID + " = "
//                + REMINDER + "." + REMINDER_ID + " AND " + REMINDER_LIST_ITEM + "."
//                + REMINDER_LIST_ID + " = " + reminderListID + ";";
//
//        Cursor cursor = database.rawQuery(sqlQuery, null);
//
//        if(cursor.moveToFirst()){
//         do{
//             int reminderListItemID = cursor.getInt(0);
//          int reminderID ;
//         }
//        }
//
//    }



//    public boolean addReminderToList(int reminderListID, String reminderType, int reminderID){
//        SQLiteDatabase database = this.getWritableDatabase();
//        ContentValues cv = new ContentValues();
//
//        cv.put(LIST_ID, reminderListID);
//        cv.put(REMINDER_ID, reminderID);
//        cv.put(REMINDER_TYPE, reminderType);
//        cv.put(REMINDER_CHECKOFF, false);
//
//        long insert = database.insert(LIST_ITEM, null, cv);
//        database.close();
//
//        if(insert == -1)
//            return false;
//        return true;
//    }

//    public boolean createNewList(String reminderList){
//        SQLiteDatabase database = this.getWritableDatabase();
//        ContentValues cv = new ContentValues();
//
//        cv.put(REMINDER_LIST_TITLE, reminderList);
//
//        long insert = database.insert(REMINDER_LIST, null, cv);
//        database.close();
//
//        if(insert == -1)
//            return false;
//        return true;
//    }

//    public List<Reminder> searchReminder(String keyword) {
//        List<Reminder> Reminders = null;
//        try {
//            SQLiteDatabase sqLiteDatabase = getReadableDatabase();
//            Cursor cursor = sqLiteDatabase.rawQuery("select * from " + REMINDERS_TABLE+ " where " + REMINDER_NAME + " like ?", new String[] { "%" + keyword + "%" });
//            if (cursor.moveToFirst()) {
//                Reminders = new ArrayList<Reminder>();
//                do {
//                    Reminder reminder = new Reminder();
//                      reminder.setReminderID (cursor.getInt(0));
//                       reminder.setReminderName(cursor.getString(1));
//
//                    Reminders.add(reminder);
//                } while (cursor.moveToNext());
//            }
//        } catch (Exception e) {
//            Reminders = null;
//        }
//        return Reminders;
//    }


}
