1. A list consisting of reminders the users want to be aware of. The application must allow
users to add reminders to a list, delete reminders from a list, and edit the reminders in
the list.
-- A user will be able to create a new list. The ReminderList class handles the user's ability
to add, edit, delete reminders from a list via the class' methods.

2. The application must contain a database (DB) of reminders and corresponding data.
-- Although how data is stored in the database has not been considered at this stage, it is modeled
in the UML diagram.

3. Users must be able to add reminders to a list by picking them from a hierarchical list,
where the first level is the reminder type (e.g., Appointment), and the second level is the
name of the actual reminder (e.g., Dentist Appointment).
-- The Reminder class has a variable for reminderType. It also has methods for getting a reminderType.
There is also a ReminderType class that helps set the names of a reminder type and has a method for creating
a new reminder type.

4. Users must also be able to specify a reminder by typing its name. In this case, the
application must look in its DB for reminders with similar namAs es and ask the user
whether that is the item they intended to add. If a match (or nearby match) cannot be
found, the application must ask the user to select a reminder type for the reminder, or
add a new one, and then save the new reminder, together with its type, in the DB.
-- The ReminderList class has a method to search by reminder types so a user can search the database
for the type. 

5. The reminders must be saved automatically and immediately after they are modified.
-- This will be handled by the database and as such is not considered at this stage.

6. Users must be able to check off reminders in the list (without deleting them).
-- The ReminderList class has a method to check off the reminders that they want.

7. Users must also be able to clear all the check-off marks in the reminder list at once.
-- The ReminderList class has a method to clear all the check off marks in a given list at once.

8. Check-off marks for the reminder list are persistent and must also be saved immediately.
-- As this will be handled by the database, it isn't being considered at this stage.

9. The application must present the reminders grouped by type.
-- The ReminderList class has a method to group the reminders by their type.

10. The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”,
“Kid’s Reminders”). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete reminder lists.
-- The user will be able to create as many lists as they wish. 

11. The application should have the option to set up reminders with day and time alert. If this
option is selected allow option to repeat the behavior.
-- The Reminder class has two methods to handle the above. The setAlert() method sets alerts for the user.
The repeatAlert() method sets up option to repeat the behavior if the user wishes.

12. Extra Credit: Option to set up reminder based on location.
-- The Reminder class has a method called locationReminder() that helps set up locations for the user.
This method will call upon the Apple Maps API or Google Maps API.

13. The User Interface (UI) must be intuitive and responsive.
-- Not considered at this stage.