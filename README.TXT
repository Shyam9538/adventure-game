Student name: Mohan Shyam Murugan
Student number: 200377911

Please complete this README file for your level 3 mini-project submission.

If your level 1/2 submission did not get full marks you MUST complete the second part of this template describing how and where your have improved your code so that it now meets the level 1 and 2 requirements. If your code still does not meet level 1 and 2 requirements then you will get 0 for level 3.

LEVEL THREE

GUI

[The code will allow you to move forward with the game or cancel your choice when you press the button at each turn. To move throught the game itself you also need to enter the required input and then press ok This can be seen in the test class and an example of it being used can be seen in lines 234 and 239. 

Exceptions

[One example of exception handling can be seen in the Test_Class as there is a try catch and in line 72 where there is exception handling for the number format (NumberFormatException) on that line. Exception handling is required here as if a String is entered instead of an integer, it prevents the program from crashing and instead displays an error message telling the user to try again. This makes sure the program doesn't end every time you input letters instead of numbers for example.

Collections

[My code uses ArrayLists and this can be seen declared on line 201 and used in line 213. The array list is required as the data for each of the 4 stats is stored and so saved to the arrayList for every round so it can all be used later. These values are then printed to the file for the user to use later on.]

File I/O

[The file input is used to store the data of the results for each round into a file which the player can also view. File output is used to read the character data like the strengths.
Explain in no more than four sentences how your code implements file I/O in order to save its complete state.]


Issue:
'Something impressive'
The email works but only on my computer because it doesn't allow me to change the file location path to within the to only within the folder. So when the packages load it will only work if the file path matches the one bluej forces me to use which it will not. I have commented out the code so you can see it. The code works fine on intellij.
[My code implements an email system where the game file with the results can be sent to the player using an email address of their choice. The method asks the user for the email address and configures the email account for sending and inserts the to email address. A title and message is added and and the file is also attached to the email, which is then sent. This can be seen in the email method (which uses OOP) that starts from line 128 and this was something that was not taught on the course.]


