1.In the class "reminderList", there are four methods respectively named to allow users to add reminders to a list, delete reminders from a list and edit the reminder.

2.The app has a database of reminders and corresponding data.

3.Users can add reminders to a list by picking them from a hierarchical list when the method “addRminder” is invoked, and the users can pick one predefined type of reminder in the class “reminderType”.

4.There is a method “searchTeminder()” in class “reminderList” which can search for a reminder by its name in the database and ask the users create the name or not (via GUI).

5.After modified the reminders can update to the database as the CRUD for reminders in database automatically and immediately via “reminderList” class.

6.Users can check off reminders in the list without deleting them by “checkOff” attribute in the “reminder” class.

7.Users can clear all the check-off marks in the reminder list at once by “clearCheckoffMarks()” in the method “reminderList” and change the reminders’ boolean values of “checkOff” to false.

8.Check-off marks for the reminder list are persistent and saved immediately by using “checkOff” attribute in class “reminder” via the CRUD in database.

9.The reminders grouped by type via “reminderType” when they are created or edited. 

10.The “reminderList” class collect the different types of reminders at a time and support the users create, (re)name, select and delete reminder lists.

11.In class “reminder”, there are attributes of date, time and repeat. The repeat attribute can implement repeat behavior via “repeatReminder”. The setting of date and time can determine when will be alert.

12.Users can call the “setLocaton()” method in “reminder” class to invoke the google Map API.

13.The UI is intuitive and responsive.   