# Test Plan Document

**Author** : Aman Patel

## Testing Strategy

##### Overall Testing Strategy

This document aims to provide a guideline by which our _reminder application_ will be tested. The document will provide all relevant information regarding the application testing along with the end goals. We begin by going over the overall strategy of our testing, we will include particulars within this section of the document such as, unit testing, integration testing, systems testing, and regression testing strategies, along with which specific activities we will discuss as part of our testing procedure.

###### Unit testing

The goal of unit tests are to conduct tests on the smallest pieces of code that we can isolate within our application logically. An example of a such unit withing a given code would be a function or a method, which can be isolated and tested individually, the goal of doing this is to make sure that these small components are working properly providing the correct results allowing the application to function well as a whole. Unit testing can be done by two ways, manually and in an automated method. In our testing of the reminder application we will run a manual test where we will first isolate all the small sub routines within our application and test them comparing them to the out come we would expect, the goal of manual testing is to allow all members of our team to look over the application allowing for multiple reviews of the units within our application. We will also employ the automated approach in which a developer in our team, under this approach of unit testing :

- A member of our team will write comments on small units within the program with the expected outcomes of each individual method, the goal being for the developer to know where issues are occurring in the overall code. For example the dev would write the expected result of the unit, and when running the test will compare the outcome to the expected outcome, if there is not match we know where our bugs are and what part of the overall program needs to be changed.
- For more rigorous testing developers within our team will isolate the units from the code and run them in their own testing environment. Isolating the unit from the overall application code allows for us to discover any dependencies the units have amongst each other which we would eliminate as any non functional dependencies within the code would lead to possible bugs down the line.
- Developers from out group will also employ UnitTest frameworks to develop automatic test cases. Using an automated framework allows a developer from our team to code different testing criteria's into the unit test to verify if our code is correct. There are a lot of frameworks that automatically report and highlight any issues, and in some possible instances the framework may halt all together.

Unit testing techniques can often be grouped into three groups, all of which aim to test units in different ways. Black box testing includes testing of the user interface of the application along with inputs and outputs, white box testing focuses more of the functional and systemic behavior of the application, and finally gray box testing focuses on suites, methods, and different test cases. We will use the following testing frameworks in our unit testing.

1. **JUnit** -> Junit provides assertions to identify test method. This tool test data first and then inserted in the piece of code.
2. **JMockit** -> JMockit is a code coverage tool with line and path metrics. It allows for API mocking along with recording and syntax verification. The framework allows us to go through path, data and line coverage.
3. **EMMA** -> "EMMA is an open-source toolkit for analyzing and reporting code written in Java language. Emma support coverage types like method, line, basic block. It is Java-based so it is without external library dependencies and can access the source code."

We will use the above frameworks to test out code and check what bugs we get in all the aspects of our application, from front end to back end. We are using JUnit and EMMA specifically since we will be using Java as the programming language of our application.

###### Integration testing

Integration testing includes the testing of individual modules within the application and how the flow of data works from module to module. The test also includes overall module testing where each module withing the group is tested together. This form of testing has most to do with how data is channeled along these modules. In our case the modules would be the individual classes leading from the user end where the reminders are created/deleted/edited all the way to the reminder database where everything is stored.

| Case ID | Case Objective                                                                                                                                                                                        | Case Description                                                                                                                                                                                                                       | Result Expected                                                                                                                                                                                                              |
| ------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1       | Check reminder and reminder list modules. Is a reminder properly added to the reminder list                                                                                                           | In this case we will create a reminder and add it to the list                                                                                                                                                                          | The goal would be for the reminder to be stored into the adequate list since lists are grouped by the type.                                                                                                                  |
| 2       | Location API and reminder creation                                                                                                                                                                    | In this case we will test if we are able to create a reminder with a location using the API.                                                                                                                                           | The goal would be to accurately retrieve the location from the API and store it within the reminder the user creates.                                                                                                        |
| 3       | ReminderType and reminder, check if ReminderType properly gets the reminder type when a new reminder is created and if the type is not created the, the module created a new type available for users | We will create a new reminder and add an existing type to see if the user can use types already stored in the database. We will also add a new reminder type and check whether reminders are stored and available for next time usage. | The goal is for the reminder type to be available for users when creating a new reminder and when the type doesn't exist the system should be able to add the new type into the already available library of reminder types. |
| 4       | The reminder list collection and the database.                                                                                                                                                        | The test would be aimed to check the data flow between the reminder list collection and the database where all the CRUD takes place.                                                                                                   | We expect for all data to flow between the module and the database.                                                                                                                                                          |

We will use a couple off different integration testing strategies to make sure that all the modules work well and the flow of data is sequential and proper.

### Big Bang Testing

This integration testing approach tests all the modules and components of the system together, this combined set of modules are considered to be a single entity for the sake of this testing method. If the components within the unit are not completed, or pass, the testing process does not execute which tells you that there is something wrong. The advantage of this sort of testing is that smaller systems can be quickly tested without any additional work. The goal of this test is to simply let developers know if there is something wrong with the overall system, this test will not tell us which module is misbehaving it will just tell us that there is a faulty module within the system.

### Incremental Testing

The incremental testing approach as the name suggests is conducted by testing modules that are logically related to each other. The idea would be that if the "BIG BANG TEST" fails we would then go a tier lower in the testing hierarchy and test related modules, to try to find out which logical unit has issues.

### Stubs and Drivers Testing

This test will most definitely tell us which module is faulty and needs to be reviewed by the developers. So just to review, we will run the "BIG BANG TEST" to tell us if we have an issues in out system modules, next we'll run a set on incremental tests to see which set of logical units have issues and then finally the Stubs and Drivers test will let us know which modules have bugs and need to be fixed. This test is conducted by creating smaller programs which isolate modules from the entire application. Give the module the input it needs, and make sure it returns the expected outcome.

These three integration tests will help us isolate any issues within the individual modules of the overall system.

**Stub**: Is called by the Module under Test.

**Driver**: Calls the Module to be tested.

###### System Testing

This form of testing has to do with the full integration of a systems software and it's ability to full fill all the necessary software requirements and specifications. There are two types of software testing, Black and White Box testing, systems tests fall under black box testing while the internals, code of a software application are known as white box testing. The systems test involves the external application of the software from the user end.

Below are the systems test we will use to conduct out system testing. The first will be the **Usability Testing ** which will focus on the users each of use for the application with the goal being the user being able to maneuver through the application with ease and taken advantage of all the applications functionality. Next we will run a series of **Load Tests** the goal of the load test will will be to check if the application will work under real life loads. **Regression Testing** will be one of the most important tests we run as we will need to make sure that none of our updates create new bugs as we go, this will be critical as we are bound to have a few bugs, and we would not want to have new issues caused by our incremental updates. This form of testing will also make sure that none of the older bugs re appear from the addition of new and updated modules . Our final systems test will be the **Recovery Test** this test will just be a reliability test that will inform us if the system is able to recover from a crash or error, the goal would be the system can go into the previously saved state and carry on it's function.

###### Regression Testing

This is the final form of testing the application will undergo, the goal of regression testing is defined as a type of software testing to confirm that a recent program or code change will not adversely affected existing features. The reason we will test the regression of out system is to know how our system will behave in the future once it's code is changed due user related changes. Regression Testing is nothing but a full or partial selection of already executed test cases which are re-executed to ensure existing functionalities work fine. The goal is for the system to not have any adverse effects in the future once the system code is altered or changed.

For the regression testing process, we need to run through the code identifying any bugs. Once the bugs are identifies, we will change the systems code and retest until there is no error, our goal is to make sure we have no future errors due to changes made today, the regression testing is done by selecting relevant test cases from the test suite that covers both modified and affected parts of the code.

The image below provided by **guru99.com** the steps of regression testing and how the test ensure no adverse effects taken place once changes are made within the system

![Regression Testing](https://cdn.guru99.com/images/regressiontestingtypes.png)

## Adequacy Criterion

The goal of our testing is to not only fix existing bugs within the system but also avoid any possible bugs that may occur once the system is out in the wild. To make sure the all of our tests our conducted well and that all of the results from our testing are properly digested and then improved upon we will have each developer run tests and write down their own documentation that will make sure that nothing will fall through incase it was missed by a tester. The tests will get covered completely from a functional and structural stand point to make sure the system is adequate per system requirements. The more detailed the reports are the better as this would allow for debugging and fixing of the systems issues to be much more thorough.

## Bug Tracking

Bug tracking is a major part of the systems tests as the goal for these tests is to find bugs withing the system and improve them until the system can work fluently without any issues. The table below will be used to track bugs and will also act a record for changes made through the rigorous testing and iterations of the program as it evolves.

| Bug ID | Cause | Fix | Notes |
| ------ | ----- | --- | ----- |
|        |       |     |       |
|        |       |     |       |
|        |       |     |       |

The table above will be perfect for future referencing of bug removal from the system. The table will be able to allow devs to determine which bug was found, the possible cause and the fix, the notes section will allow for devs to take note of the what was done to fix the issue and if it cause any issues down the line.

## Test

```
*This section should be the core of this document. You should provide a table of test cases, one per row. For each test case, the table should provide its purpose, the steps necessary to perform the test, the expected result, the actual result (to be filled later), pass/fail information (to be filled later), and any additional information you think is relevant.*
```

| Test Case ID | Test Case              | Expected Resulted                                                                                       | Final Result | Notes |
| ------------ | ---------------------- | ------------------------------------------------------------------------------------------------------- | ------------ | ----- |
| 1            | Modules Test           |                                                                                                         |              |       |
| 1.1          | Check API              | Gets data from API and passes it on the reminder module                                                 |              |       |
| 1.2          | Reminder Module        | Build reminder                                                                                          |              |       |
| 1.3          | Type Module            | Build or add new reminder type                                                                          |              |       |
| 1.4          | List Module            | Add reminder to list based on type                                                                      |              |       |
| 1.5          | List Collection Module | Make sure all collection methods are functioning                                                        |              |       |
|              |                        |                                                                                                         |              |       |
| 2            | Unit Test              | Check all units and use frameworks to make sure unit code are functionals and work well post debugging. |              |       |
|              |                        |                                                                                                         |              |       |
| 3            | Systems Test           | Run through all system to make sure they are functional and are up to par with user requirements        |              |       |
|              |                        |                                                                                                         |              |       |
| 4            | Regression Test        | Check overall system upgrades to see if systems debugging is causing new issues.                        |              |       |
|              |                        |                                                                                                         |              |       |
