1. A list consisting of reminders the users want to be aware of. The application must allow
users to add reminders to a list, delete reminders from a list, and edit the reminders in
the list.
To realize this requirement, I added class reminderList, reminders. 

2. The application must contain a database (DB) of reminders and corresponding data.
To realize this requirement, I added DB class connect to the ReminderList class. 

3. Users must be able to add reminders to a list by picking them from a hierarchical list,
where the first level is the reminder type (e.g., Appointment), and the second level is the
name of the actual reminder (e.g., Dentist Appointment).
To realize this requirement, I added reminderList method and listName in reminderList class.

4. UUsers must also be able to specify a reminder by typing its name. In this case, the
application must look in its DB for reminders with similar names and ask the user
whether that is the item they intended to add. If a match (or nearby match) cannot be
found, the application must ask the user to select a reminder type for the reminder, or
add a new one, and then save the new reminder, together with its type, in the DB.
To realize this requirement, I added save, add methods in reminders, and then data will be saved and updated in DB.

5. The reminders must be saved automatically and immediately after they are modified.
To realize this requirement, I added save, select and delete methods in reminders class. 

6. Users must be able to check off reminders in the list (without deleting them).
To realize this requirement, I added checkOff method in reminders class.

7. Users must also be able to clear all the check-off marks in the reminder list at once.
To realize this requirement, I added CheckOffMark method in reminders class.

8. Check-off marks for the reminder list are persistent and must also be saved immediately.
To realize this requirement, I added save method in reminders class.

9. The application must present the reminders grouped by type.

10. The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”,
“Kid’s Reminders”). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete reminder lists
To realize this requirement, I added wweekly list, monthly list and kid's reminders connect to reminderList class. 
Also added create, rename, select and delete methods into reminderList class.

11. The application should have the option to set up reminders with day and time alert. If this
option is selected allow option to repeat the behavior
To realize this requirement, I added setTimeAlert method in reminders class. 
