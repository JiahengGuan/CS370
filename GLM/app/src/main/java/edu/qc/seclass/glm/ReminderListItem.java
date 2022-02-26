package edu.qc.seclass.glm;

public class ReminderListItem {
    String date;
    String time;
    boolean isAllDay;
    boolean isChecked;
    boolean hasAlert;
    boolean isRepeatable;
    String location;

    public ReminderListItem(String date, String time, boolean isAllDay,
                            boolean isChecked, boolean hasAlert,
                            boolean isRepeatable, String location) {
        this.date = date;
        this.time = time;
        this.isAllDay = isAllDay;
        this.isChecked = isChecked;
        this.hasAlert = hasAlert;
        this.isRepeatable = isRepeatable;
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isAllDay() {
        return isAllDay;
    }

    public void setAllDay(boolean allDay) {
        isAllDay = allDay;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public boolean isHasAlert() {
        return hasAlert;
    }

    public void setHasAlert(boolean hasAlert) {
        this.hasAlert = hasAlert;
    }

    public boolean isRepeatable() {
        return isRepeatable;
    }

    public void setRepeatable(boolean repeatable) {
        isRepeatable = repeatable;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
