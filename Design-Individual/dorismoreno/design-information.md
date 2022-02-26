1. A list consisting of reminders the users want to be aware of. The application must allow users to add reminders to a list, delete reminders from a list, and edit the reminders in the list
 to realize this requierement I create a class named <listOfReminers> , with atributes <remindername> and with operation add(), delete(), edit.
 2. The application must contain a database (DB) of reminders and corresponding data.
    To realize this requirement, I added to the design a <DB> class with attributes reminderName, date and type. 
 3. Users must be able to add reminders to a list by picking them from a hierarchical list, where the first level is the reminder type (e.g., Appointment), and the second level is the name of the actual reminder (e.g., Dentist Appointment).
      To realize this requierement I added class <secondLevel> with atributes <actualName>. class FirstLevel with atributes <actualName> and object(FirstLevel) 
4. Users must also be able to specify a reminder by typing its name. In this case, the application must look in its DB for reminders with similar names and ask the user whether that is the item they intended to add. If a match (or nearby match) cannot be found, the application must ask the user to select a reminder type for the reminder, or add a new one, and then save the new reminder, together with its type, in the DB.
   to realiza this requierement I add the class <Item> with atribute <object1(SeccondLevel)>
5. The reminders must be saved automatically and immediately after they are modified.
       this requierement doesnot affect the design
6. Users must be able to check off reminders in the list (without deleting them).
    this requierement is realize using the class <Marks> with atributes Object of type <ListOfReminders>
7. Users must also be able to clear all the check-off marks in the reminder list at once
    this requierement is realize by adding the class <Marks> with atribute Object<ListOfReminders>, this requierement will use the <clear> operation
8.  Check-off marks for the reminder list are persistent and and must also be saved immediately 
    this requierement doesnot affect the design
9.  The application must present the reminders grouped by type
this requirement is realize by adding the class <ListOfReminders> with atribute reminderName. this requieremnt will use specifically the operation groupbyType
10. The application must support multiple reminder lists at a time (e.g., 􏰋Weekly􏰌, 􏰋Monthly􏰌, 􏰋Kid􏰎s Reminders􏰌). Therefore, the application must provide the users with the ability to create, (re)name, select, and delete reminder lists.
to realize this requierement I added the class <ReminderLists> with atribute nameofReminderList:
11. Theapplication should have the option to set up reminders with day and time alert.If this option is selected allow option to repeat the behavior.
to realize this requieremnt i added <Option> class with atributes
day, time and <object<ListOfReminder>
13. The User Interface (UI) must be intuitive and responsive.
   this requierement does not affect the design

       
