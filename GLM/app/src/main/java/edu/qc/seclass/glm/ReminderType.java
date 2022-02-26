package edu.qc.seclass.glm;

import java.util.ArrayList;
public class ReminderType {
    private String reminderTypeName;
    private int reminderTypeID;


    public ReminderType(int reminderTypeID, String reminderTypeName) {
        this.reminderTypeID = reminderTypeID;
        this.reminderTypeName = reminderTypeName;
    }

    public ReminderType() {
    }

    public String getReminderTypeName() {
        return reminderTypeName;
    }

    public void setReminderTypeName(String reminderTypeName) {
        this.reminderTypeName = reminderTypeName;
    }

    public void createType(String reminderTypeName){
        ArrayList<String> reminderType = new ArrayList<String>();

    }
    public void editType(String reminderTypeName){

    }
    public void deleteType(String reminderTypeName){

    }
}
