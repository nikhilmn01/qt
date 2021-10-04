






                                                WebDriver Automation Exercises – Level 1






Exercise 1	Exercise 2	Exercise 3	Exercise 4	Exercise 5	Exercise 6	Exercise 7	Exercise 8	Exercise 9
								


Place an X in each respective row when you complete an exercise.

 
Table of Contents
Summary	3
Project Description	3
Exercises	3
Exercise 1 – Radio Button Example	3
Exercise 2 – Suggestion Class Example	4
Exercise 3 – Dropdown Example	5
Exercise 4 – Checkbox Example	7
Exercise 4.1 – Checkbox Example: Select All	8
Exercise 4.2 – Checkbox Example: Deselect All	9
Exercise 5 – Switch Window Example	10
Exercise 6 – Switch Tab Example	11
Exercise 7 – Switch To Alert Example	13
Exercise 8 – Table Example	14
Exercise 9 – Mouse Hover Example	15

 
Summary
In this document you will find the beginner level exercises to practice Selenium WebDriver. Most of these exercises will focus primarily on element locator techniques, where one must write code that performs actions on elements/objects on the web-page. However, the catch is that one must write their code without using a unit testing framework and must perform their assertions without the aid of a testing framework. This is intentional, since it will force you to apply basic programming concepts that you learned in Java (e.g., control flow, data types, looping, etc.).

Project Description
Your task is to implement a simple Java application that automates simple interactions with the following site:
	http://www.qaclickacademy.com/practice.php
actice.phpHowever, there will be some constraints placed on your implementation which are as followed:
1.	You must write your code in a single class called: AutomationDriver. This class will initially contain one member variable called driver and one method called main. Your code execution will occur in main.
2.	Your code logic must be modularized into methods within the AutomationDriver class. Meaning, you’re not allowed to put all of your code in the main method!
3.	You must perform assertions using basic Java conditionals. No use of a unit testing framework is allowed. (e.g. TestNG, xUnit)
4.	As a starting point, utilize the barebones Java file in the directory that this document is provided in and populate each respective method with your logic.
Exercises

Exercise 1 – Radio Button Example
Create a method called “exerciseOne” that performs the following manual steps:


Step 1: Select the “Radio1” radio button and verify it’s selected. 
 
Step 2: Select the “Radio2” radio button and verify it’s selected.
 

Step 3: Select the “Radio3” radio button and verify it’s selected.
 

Exercise 2 – Suggestion Class Example
Create a method called “exerciseTwo()” that performs the following manual steps:

Step 1: Type “United States” in the “Select Countries” input field in the “Suggestions Class” example.
 

Step 2: Navigate to the “United States Minor Outlying Islands” item and click it.
Hint: Utilize an xPath to reach the element within the suggestion dropdown.
 

Step 3: Verify that the selected item is reflected in the input field.
 	
Exercise 3 – Dropdown Example
Create a method called “exerciseThree()” that performs the following manual steps:

Step 1: Click the dropdown pane in the “Dropdown” example.
 

Step 2: Click on “Option1”
 
	

Step 3:  Verify “Option1” is now the selected item in the dropdown pane
 
Step 5: Repeat steps 2-3 for “Option2”and “Option3”



Exercise 4 – Checkbox Example
Create a method called “exerciseFour()” that performs the following manual steps:

Step 1: Click the checkbox adjacent to “Option1” in the “Checkbox Example” section and verify that it is checked off.
 
Step 2: Deselect “Option1” and verify that it’s unchecked.
 
Step 3: Click the checkbox adjacent to “Option2” and verify that it has been selected.
 
Step 4: Deselect “Option2” and verify that it has been deselected.
 
Step 5: Click the checkbox adjacent to “Option3” and verify that it’s been selected.
 
Step 6: Deselect “Option3” and verify that it has been deselected.
 



Exercise 4.1 – Checkbox Example: Select All
Create a method called “exerciseFourPointOne()”  that performs the following manual steps:

Step 1: Select all of the checkboxes and verify that all the checkboxes have been selected.
 

Exercise 4.2 – Checkbox Example: Deselect All
Create a method called “exerciseFourPointTwo()” that performs the following manual steps:

Step 1: Select all the checkboxes in the “Checkbox Example” section and verify that all of the checkboxes are selected.
 

Step 2: Deselect all the checkboxes and verify that the check disappears in each respective checkbox.
 

Exercise 5 – Switch Window Example
Create a method called "exericseFive()" that performs the following manual steps:

Step 1: Click the “Open Window” button in the “Switch Window Example”.
 
Step 2: Verify that the following window has popped up on the screen:
 

Step 3: Switch back to the window that you were previously on and verify that you are in fact back on the original page.
Hint: Save the window handle of the original window as a string (by using webDriver.getWindowHandle()) and utilize that with the webDriver.switchTo() method.
 

	
Exercise 6 – Switch Tab Example
Create a method called “exerciseSix()” that performs the following manual steps:

Step 1: Click on the “Open Tab” button.
 

Step 2: Verify that you’re on the new page within a new tab in your web browser.
 


Step 3: Close out the current tab and verify that you’re back on the original web page.
Hint: Be sure to close the current window, not the entire Chrome instance.
 

Exercise 7 – Switch To Alert Example
Create a method called “exericseSeven()” that performs the following manual steps:

Step 1: Enter your name in the “Enter your name” input field in “Switch To Alert” example.
 
Step 2: Click the alert button and verify that a dialog displays a message with your name on it. Click OK to dismiss the dialog.
Hint: Utilize the switchTo().alert() method to dismiss the dialog.
 

 	

	

Exercise 8 – Table Example
Create a method called “exerciseEight()” that performs the following manual steps:

Step 1: Scroll down the page until the “Web Table” example is completely visible.
Hint: Use the JavaScriptExecutor class to execute JavaScript that scrolls down the webpage.

 

Step 2: Verify that each row in the table contains content (e.g. does 











Row 1 have an instructor, course, and price?)
Hint: Save the table element as a WebElement object, and to find rows use the findElements() method with a xpath starting at the table.

Exercise 9 – Mouse Hover Example
Create a method called "exerciseNine()" that performs the following manual steps:
Hint: You may want to look into the Actions class that WebDriver provides to perform the steps in this example.

Step 1: Scroll down the page to the “Mouse Hover” example.
 
Step 2: Hover the cursor over the “Mouse Hover” button.
 

Step 3: Hover to the item titled “Top” and click it. You will now be navigated back to the top of the page.
 

