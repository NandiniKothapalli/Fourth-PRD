Requirements - Student Practice Tracker
Project Title : Student Practice Tracker
Project Goal
Build a simple Java console application that helps one student track daily Java practice.

The student should be able to enter basic details, add completed practice questions, update completed topics, view the current progress, and exit the application.

The program should be simple, beginner-friendly, and easy to build step by step.

Concepts Used
This project uses only:

Class

Object

Instance Variables

Local Variables

Methods

Method Parameters

this Keyword

Scanner

if-else

while Loop

Basic Arithmetic Operators

Project Story
A student is learning Java.

Every day, the student completes some topics and solves some practice questions.

The student wants a small Java program to keep track of:

Student name

Course name

Number of completed topics

Number of solved questions

The student should be able to update these values whenever more work is completed.

The application should continue running until the student chooses to exit.

Classes to Create
Create two classes:

Student
StudentApp
Step 1 — Create the Student Class
Create a class named:

Student
Create the following instance variables:

String name;
String courseName;
int completedTopics;
int questionsSolved;
These variables should store the student's current data.

Step 2 — Create a Method to Set Student Details
Create a method named:

setDetails()
The method should receive:

name
courseName
as parameters.

Use the this keyword to store the values in the instance variables.

Example idea:

this.name = name;
this.courseName = courseName;
Step 3 — Create a Method to Set Initial Progress
Create:

setProgress()
The method should receive:

completedTopics
questionsSolved
Store these values in the corresponding instance variables.

Use the this keyword.

Step 4 — Create a Method to Display Student Details
Create:

displayDetails()
The method should display:

Student Name
Course Name
Example:

Student Name : Rahul
Course Name  : Java
Step 5 — Create a Method to Display Progress
Create:

displayProgress()
The method should display:

Completed Topics
Questions Solved
Example:

Completed Topics : 5
Questions Solved : 20
Step 6 — Create a Method to Add Completed Topics
Create:

addTopics()
The method should receive the number of newly completed topics.

Example:

Current Completed Topics : 5

New Topics Completed:
2
After updating:

Total Completed Topics : 7
The new number must be added to the previous value.

Do not replace the old value.

Step 7 — Create a Method to Add Solved Questions
Create:

addQuestions()
The method should receive the number of newly solved questions.

Example:

Current Questions Solved : 20

New Questions Solved:
10
After updating:

Total Questions Solved : 30
Step 8 — Create the StudentApp Class
Create another class:

StudentApp
This class should contain the main() method.

Inside main():

Create a Scanner object.

Create one Student object.

Example:

Student student = new Student();
Step 9 — Accept Student Details
Ask the user to enter:

Student Name
Course Name
Completed Topics
Questions Solved
Example:

Enter Student Name:
Rahul

Enter Course Name:
Java

Enter Completed Topics:
5

Enter Questions Solved:
20
Call the appropriate methods to store the values.

Step 10 — Display the Main Menu
After storing the initial details, display:

============================
   STUDENT PRACTICE TRACKER
============================

1. View Student Details
2. View Progress
3. Add Completed Topics
4. Add Solved Questions
5. Exit

Enter your choice:
Step 11 — Use a While Loop
Use a while loop so that the menu appears again after each operation.

The program should continue running until the user selects:

5. Exit
Step 12 — Implement Choice 1
If the user enters:

1
call:

displayDetails()
Expected output:

Student Name : Rahul
Course Name  : Java
Step 13 — Implement Choice 2
If the user enters:

2
call:

displayProgress()
Expected output:

Completed Topics : 5
Questions Solved : 20
Step 14 — Implement Choice 3
If the user enters:

3
ask:

How many new topics did you complete?
Example:

Enter New Completed Topics:
2
Call:

addTopics()
After updating:

Topics updated successfully.
Total Completed Topics : 7
Step 15 — Implement Choice 4
If the user enters:

4
ask:

How many new questions did you solve?
Example:

Enter New Questions Solved:
10
Call:

addQuestions()
After updating:

Questions updated successfully.
Total Questions Solved : 30
Step 16 — Implement Choice 5
If the user enters:

5
display:

Thank you for using Student Practice Tracker.
Keep Practicing!
Stop the loop.

Step 17 — Handle Invalid Menu Choice
If the user enters any value other than 1 to 5, display:

Invalid choice.
Please enter a value between 1 and 5.
Then display the menu again.

Complete Sample Execution
============================
   STUDENT PRACTICE TRACKER
============================

Enter Student Name:
Rahul

Enter Course Name:
Java

Enter Completed Topics:
5

Enter Questions Solved:
20


============================
           MENU
============================

1. View Student Details
2. View Progress
3. Add Completed Topics
4. Add Solved Questions
5. Exit

Enter your choice:
2

Completed Topics : 5
Questions Solved : 20


============================
           MENU
============================

Enter your choice:
3

Enter New Completed Topics:
2

Topics updated successfully.
Total Completed Topics : 7


============================
           MENU
============================

Enter your choice:
4

Enter New Questions Solved:
10

Questions updated successfully.
Total Questions Solved : 30


============================
           MENU
============================

Enter your choice:
2

Completed Topics : 7
Questions Solved : 30


============================
           MENU
============================

Enter your choice:
5

Thank you for using Student Practice Tracker.
Keep Practicing!