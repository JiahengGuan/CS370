package edu.qc.seclass.glm;

import androidx.annotation.NonNull;

public class Reminder {
    private int reminderID;
    private Integer reminder_type_id;
    private String reminderName;

    public Reminder(int reminderID, Integer reminder_type_id, String reminderName) {
        this.reminderID = reminderID;
        this.reminder_type_id = reminder_type_id;
        this.reminderName = reminderName;
    }

    public int getReminderID() {
        return reminderID;
    }

    public void setReminderID(int reminderID) {
        this.reminderID = reminderID;
    }

    public Integer getReminder_type_id() {
        return reminder_type_id;
    }

    public void setReminder_type_id(Integer reminder_type_id) {
        this.reminder_type_id = reminder_type_id;
    }

    public String getReminderName() {
        return reminderName;
    }

    public void setReminderName(String reminderName) {
        this.reminderName = reminderName;
    }

    @Override
    public String toString() {
        return "Reminder { id = " + reminderID +
                ", name = " + reminderName +
                ", reminder type id = " + reminder_type_id +
                "}";
    }

    //    String reminderName;
//    String reminderType;
//    String reminderListType;
//    String date;
//    String time;
//    boolean isAllDay;
//    boolean isChecked;
//    boolean hasAlert;
//    boolean isRepeatable;
//    String location;

//    public Reminder(String reminderName, String reminderType, String reminderListType,
//                    String date, String time, boolean isAllDay, boolean isChecked,
//                    boolean hasAlert, boolean isRepeatable, String location) {
//        this.reminderName = reminderName;
//        this.reminderType = reminderType;
//        this.reminderListType = reminderListType;
//        this.date = date;
//        this.time = time;
//        this.isAllDay = isAllDay;
//        this.isChecked = isChecked;
//        this.hasAlert = hasAlert;
//        this.isRepeatable = isRepeatable;
//        this.location = location;
//    }
//
//
//    public String getReminderName() {
//        return reminderName;
//    }
//
//    public void setReminderName(String reminderName) {
//        this.reminderName = reminderName;
//    }
//
//    public String getReminderType() {
//        return reminderType;
//    }
//
//    public void setReminderType(String reminderType) {
//        this.reminderType = reminderType;
//    }
//
//    public String getReminderListType() {
//        return reminderListType;
//    }
//
//    public void setReminderListType(String reminderListType) {
//        this.reminderListType = reminderListType;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public String getTime() {
//        return time;
//    }
//
//    public void setTime(String time) {
//        this.time = time;
//    }
//
//    public boolean isAllDay() {
//        return isAllDay;
//    }
//
//    public void setAllDay(boolean allDay) {
//        isAllDay = allDay;
//    }
//
//    public boolean isChecked() {
//        return isChecked;
//    }
//
//    public void setChecked(boolean checked) {
//        isChecked = checked;
//    }
//
//    public boolean isHasAlert() {
//        return hasAlert;
//    }
//
//    public void setHasAlert(boolean hasAlert) {
//        this.hasAlert = hasAlert;
//    }
//
//    public boolean isRepeatable() {
//        return isRepeatable;
//    }
//
//    public void setRepeatable(boolean repeatable) {
//        isRepeatable = repeatable;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }

}
