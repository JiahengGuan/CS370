### **Design Document**

---

Author: Jiaheng Guan and Yue Xi

#### **1) Design Considerations**

##### **1.1 Assumptions**

    * There are no app crashing bugs in the code
    * The app works on the majority of Android devices
    * The app is initiative to the end user, thus not requiring a tutorial on how to use the app
    * We are able to use the Google APIs for both login and Maps for some of the features

##### 1.2 Constraints

     * The app will only be available in one language (English)
     * The app must be able to organize the information being displayed well
     * The database we select must be able to quickly retrieve and store information

##### 1.3 System Environment

    * We are targeting Android API level 15 and above
    * We are targeting Android devices

#### 2) Architectural Design

##### 2.1 Component Diagram

<img src="https://raw.githubusercontent.com/JiahengGuan/CS370/main/component%20diagram.png" alt="Component_Diagram" style="zoom:80%;" />

The component diagram, shown above, is used to describe the dependencies between various software components. The component diagram describes the main functions of a system, such as the various classes, packages, and APIS neeeded from the perspective of the software architecture.

##### 2.2 Deployment Diagram

<img src="https://raw.githubusercontent.com/JiahengGuan/CS370/main/deployment%20diagram.png" alt="Deployment_Diagram" style="zoom: 50%;" />

The deployment diagram, shown above, is used to show the physical architecture of the software and hardware in the system. This diagram helps us understand the physical relationships between software components and hardware components. By using the deployment diagrams, you can show how the software elements and hardware elements are configured and deployed for the Reminders application.

#### 3) Low-Level Design

##### 3.1 Class Diagram

<img src="https://raw.githubusercontent.com/JiahengGuan/CS370/main/GroupDesign.png" alt="Class-Diagram"  />

The class diagram, shown above, is used to describe the relationships between the application's classes, the classes methods and variables. In the diagram, the intended classes are listed as well as any vairables and methods they might use. This diagram is subject to change once we start to code and build our application, but will be used as a reference point for the development team. Any chances made will result in the diagram being updated to reflect those changes.

##### 3.2 Other Diagrams

#### 4) User Interface Design

![interface1](https://raw.githubusercontent.com/Heather106/test1/main/gr1-small.jpg)

![interface2](https://raw.githubusercontent.com/Heather106/test1/main/gr2-small.jpg)
