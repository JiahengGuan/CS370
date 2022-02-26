# Use Case Model

_This is the template for your use case model. The parts in italics are concise explanations of what should go in the corresponding sections and should not appear in the final document._

**Author**: David Acuqui and Doris Moreno Alvarez

## 1 Use Case Diagram

_This section should contain a use case diagram with all the actors and use cases for the system, suitably connected._

## 2 Use Case Descriptions

_For each use case in the use case diagram, this section should contain a description, with the following elements:_

- _Requirements: High-level description of what the use case must allow the user to do._
- _Pre-conditions: Conditions that must be true before the use case is run._
- _Post-conditions Conditions that must be true once the use case is run._
- _Scenarios: Sequence of events that characterize the use case. This part may include multiple scenarios, for normal, alternate, and exceptional event sequences. These scenarios may be expressed as a list of steps in natural language or as sequence diagrams._

### Case 1:

- Requirements: The User must be able to login
- Pre-conditions: The app is launched and the home screen is the starting screen
- Post-conditions: The User is shown their lists
- Scenarios:
  - User launches the Reminders app and home screen appears
  - User enters their login information and presses the 'login' button

### Case 2:

- Requirements: The User must be able to add reminders to a selected list
- Pre-conditions: The app is launched and the home screen is the starting screen
- Post-conditions: A new reminder is added to selected list
- Scenarios:
  - User launches the Reminders app and home screen appears
  - User clicks one of their lists and the list opens up
  - User presses the 'Add Reminder' button and is prompted to give the reminder a name

### Case 3:

- Requirements: The User must be able to delete reminders from a selected list
- Pre-conditions: The app is launched and the home screen is the starting screen
- Post-conditions: A selected reminder is deleted from the selected list
- Scenarios:
  - User launches the Reminders app and home screen appears
  - User clicks one of their lists and the list opens up
  - User clicks on a reminder from the list to highlight it
  - User clicks 'delete reminder' button and is prompted to confirm deletion

### Case 4:

- Requirements: The User must be able to edit reminders from a selected list
- Pre-conditions: The app is launched and the home screen is the starting screen
- Post-conditions: A reminder is edited and renamed
- Scenarios:
  - User launches the Reminders app and home screen appears
  - User clicks one of their lists and the list opens up
  - User clicks on a reminder from the list to highlight it
  - User clicks 'edit reminder' button and is prompted to enter a new name for reminder

### Case 5:

- Requirements: The User must be able to check off all reminders from a selected list
- Pre-conditions: The app is launched and the home screen is the starting screen
- Post-conditions: All reminders from the selected list are checked off
- Scenarios:
  - User launches the Reminders app and home screen appears
  - User clicks one of their lists and the list opens up
  - User clicks 'check all' button and all the reminders are highlighted

### Case 6:

- Requirements: The User must be able to create a new list and give it a name
- Pre-conditions: The app is launched and the home screen is the starting screen
- Post-conditions: A new list will be created and added to their list of reminder lists
- Scenarios:
  - User launches the Reminders app and home screen appears
  - User clicks 'create list' button and is propmted to enter a name for the list

### Case 7:

- Requirements: The User must be able to edit a selected list
- Pre-conditions: The app is launched and the home screen is the starting screen
- Post-conditions: The selected list is edited and the new name is displayed
- Scenarios:
  - User launches the Reminders app and home screen appears
  - User clicks a list and it is highlighted
  - User clicks the 'edit' button and is prompted for a new name for the selected list

### Case 8:

- Requirements: The User must be able to delete a selected list
- Pre-conditions: The app started up properly and opened to the home screen
- Post-conditions: The selected list is deleted and removed from the list of options
- Scenarios:
  - User launches the Reminders app and home screen appears
  - User selects a list and it is highlighted
  - User clicks 'delete' button and is prompted for confirmation of deletion request

### Case 9:

- Requirements: The User must be able to search through their lists
- Pre-conditions: The app started up properly and opened to the home screen
- Post-conditions: The search returns results if reminder was found
- Scenarios:
  - User opens the app and home screen appears
  - User clicks the 'search' button and is prompted to enter a keyword search term

### Case 10:

- Requirements: The User must be able to set alerts for their reminders
- Pre-conditions: The app started up properly and opened to the home screen
- Post-conditions: A new alert is set
- Scenarios:
  - User opens the app and home screen appears
  - User clicks one of their lists
  - User clicks one of the reminders in the list
  - User clicks 'set alert' button and puts in a time and date for the alert

### Case 11:

- Requirements: The User must be able to set their location for a reminder
- Pre-conditions: The app started up properly and opened to the home screen
- Post-conditions: A location is set for the reminder
- Scenarios:
  - User opens the app and home screen appears
  - User clicks one of their lists
  - User clicks one of the reminders in the list
  - User clicks 'set location' button
