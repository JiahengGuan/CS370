package edu.qc.seclass.glm;


import androidx.annotation.NonNull;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;


//import androidx.annotation.NonNull;
//
//import android.os.Bundle;
//import android.view.ActionMode;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.AbsListView;
//import android.widget.Adapter;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    //references buttons and controls
//    public class MainActivity extends AppCompatActivity {
    Button btn_addList;
    ListView lv_userList;
    EditText et_listNameField;
    ArrayAdapter userListArrayAdapter;
    DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn_addList = findViewById(R.id.btn_addList);
        lv_userList = findViewById(R.id.lv_userList);
        et_listNameField = findViewById(R.id.et_listNameField);
        dataBaseHelper = new DataBaseHelper(MainActivity.this);

        userListArrayAdapter = new ArrayAdapter<ReminderList>(MainActivity.this, android.R.layout.simple_list_item_1, dataBaseHelper.getAllUserLists());
        lv_userList.setAdapter(userListArrayAdapter);
        registerForContextMenu(lv_userList);

        displayAllUserLists();

        //click listeners
        btn_addList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ReminderList reminderList;

                try{
                    reminderList = new ReminderList(-1, et_listNameField.getText().toString());
                    Toast.makeText(MainActivity.this, reminderList.toString(), Toast.LENGTH_SHORT).show();
                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                    reminderList = new ReminderList(-1, "Error");
                }

//                DataBaseHelper dataBaseHelper = new DataBaseHelper(MainActivity.this);
                boolean success = dataBaseHelper.createNewList(reminderList);
                Toast.makeText(MainActivity.this, "Success = " + success, Toast.LENGTH_SHORT).show();
                displayAllUserLists();
            }
        });//end of addList btn listener

//        lv_userList.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "Success = true.", Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });



    }//end of onCreate



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("List chosen:");
        getMenuInflater().inflate(R.menu.reminder_list_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();

        switch(menuItem.getItemId()){
            case R.id.add_reminder_option:
                Toast.makeText(MainActivity.this, "Add Reminder picked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ReminderActivity.class);
                startActivity(intent);
                return true;
            case R.id.edit_list_option:
                Toast.makeText(MainActivity.this, "Edit List picked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete_list_option:
                Toast.makeText(MainActivity.this, "Delete List picked", Toast.LENGTH_SHORT).show();
                ReminderList rl = (ReminderList)userListArrayAdapter.getItem(info.position);
                dataBaseHelper.deleteSelectedList(rl);
                displayAllUserLists();
                return true;
            default:
                return super.onContextItemSelected(menuItem);
        }
    }

    public void sendMessage(View view) {
        // Do something in response to button
    }

    private void displayAllUserLists() {
        userListArrayAdapter = new ArrayAdapter<ReminderList>(MainActivity.this, android.R.layout.simple_list_item_1, dataBaseHelper.getAllUserLists());
        lv_userList.setAdapter(userListArrayAdapter);
        registerForContextMenu(lv_userList);

//public class MainActivity extends AppCompatActivity {
//    private ListView listview;
//    private ListViewAdapter adapter;
//    private List<String> Reminder = new ArrayList<>();
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        getReminders();
//        listview = findViewById(R.id.mListView);
//
//        adapter = new ListViewAdapter(Reminder, this);
//        listview.setAdapter(adapter);
//
//
//
//    }
//
//    AbsListView.MultiChoiceModeListener modeListener = new AbsListView.MultiChoiceModeListener() {
//        @Override
//        public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {
//
//        }
//
//        @Override
//        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
//            return false;
//        }
//
//        @Override
//        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
//            return false;
//        }
//
//        @Override
//        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
//            return false;
//        }
//
//        @Override
//        public void onDestroyActionMode(ActionMode mode) {
//
//        }
//    };
//    private void getReminders(){
//        String[] items = getResources().getStringArray(R.array.reminder);
//        for(String item:items)
//        {
//            Reminder.add(item);
//        }

    }
}