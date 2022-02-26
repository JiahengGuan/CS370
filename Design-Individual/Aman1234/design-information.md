Aman Patel 

CS 370 

Requirements
\1. A list consisting of reminders the users want to be aware of. The application must allow
users to add reminders to a list, delete reminders from a list, and edit the reminders in
the list.

-- The class reminderList class with all it's methods is responsible for all of the adding,editing,deleting, and checking some or all of the reminders.

\2. The application must contain a database (DB) of remindersand corresponding data.

-- The Reminder Database is implemented.

\3. Users must be able to add reminders to a list by picking them from a hierarchical list,
where the first level is the reminder type (e.g., Appointment), and the second level is the
name of the actual reminder (e.g., Dentist Appointment).

--When the uses the addReminder function, the ReminderType class has a bunch of different reminderType which allows users to choose from a prepacked list of different types.Finally reminder class takes over and creates the new reminder.

\4. Users must also be able to specify a reminder by typing its name. In this case, the
application must look in its DB for reminders with similar names and ask the user
whether that is the item they intended to add. If a match (or nearby match) cannot be
found, the application must ask the user to select a reminder type for the reminder, or
add a new one, and then save the new reminder, together with its type, in the DB.

-- The searchLists method in the list allows for the searching of a specific reminder using the reminderName, typeName, and listName. The addReminderType also also lets users add theur reminder under a specifi list that can be searched later when needed. This allows for searching to be easy, as instead on searching the entire database, only the specific list type needs to be searced. 

\5. The reminders must be saved automatically and immediately after they are modified.

--Ideally once a reminder is finalized and saved it always saved into the database. 

\6. Users must be able to check off reminders in the list (without deleting them).

-- The reminder class has the checkOff method which is a boolean type responsible for identifying if something is checked off.

\7. Users must also be able to clear all the check-off marks in the reminder list at once.

--The reminders list has a couple of checkedOff methods either check off individual reminders or check off all reminders within a type. 

\8. Check-off marks for the reminder list are persistent and must also be saved immediately.

--the checkOff method in the reminder class is saved and moved with the object to the database, as soon the object is done being edited it's updated and saved to the database. 

\9. The application must present the reminders grouped by type.

--there is a reminderType method that groups the reminders together. It is also there incase any reminder needs to be searched within the database.

\10. The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”,
“Kid’s Reminders”). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete reminder lists.

--the reminderList class has methods that allow for the user to create, (re)name, select, and delete reminder lists. 

\11. The application should have the option to set up reminders with day and time alert. If this

-- Within the reminder class there is the allDay, date, time, which allows the users to set reminders whether they are all day, on a certain date and a time.

option is selected allow option to repeat the behavior.
\12. Extra Credit:Option to set up reminder based on location.

--There exists a setLocation() method which would invoke a location API allowing for the application to gain the devices location and set a reminder.

\13. The User Interface (UI) must be intuitive and responsive.

-- The design will be user friendly and easy to understand for the user without any prior understanding, however the UML shows none of this. 