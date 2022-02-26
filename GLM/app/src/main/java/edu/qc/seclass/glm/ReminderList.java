package edu.qc.seclass.glm;

public class ReminderList {
    private String listName;
    private int  listId ;

    public ReminderList(int listId, String listName) {
        this.listName = listName;
        this.listId = listId;
    }

    public ReminderList() {
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }
    public void addReminder(String reminderName){

    }
    public void EditReminder(String reminderName){

    }
    public void deleteReminder(String reminderName){

    }
    public void checkOffReminder(){

    }
    public void clearCheckedOffReminder(){

    }
    public void groupByReminderType(){

    }

    @Override
    public String toString() {
        return " " + listName;
    }
}
