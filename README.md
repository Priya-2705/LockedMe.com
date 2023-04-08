# LockedMe.com
## Implement OOPS using JAVA with Data Structures and Beyond

A simple Menu driven File Management application

* Fetch files in ascending order from a directory
* Add a file to a directory
* Delete/Search a file from a directory

# To view project locally

* Clone this repository using git clone 
* Open the folder from Eclipse
* Open AppMain.java and Run the program
* Provide a path of the directory from your local system

This project contains following: 
| File    |  Description           |
|-----------------|-------------------         |
| `AppMain.java` | This component contains the Main method. It's the entry point of the program. |
| `BusinessLevelOperations.java` | This component contains methods for performing the file operations. |


## Expected Outcomes: 

* Specification document - Product’s capabilities, appearance, and user interactions
* Java concepts being used in the project 
* Data Structures where sorting and searching techniques are used. 
* Generic features and three operations: 
    * Retrieving the file names in an ascending order
    * Business-level operations:
        * Option to add a user specified file to the application
        * Option to delete a user specified file from the application
        * Option to search a user specified file from the application
        * Navigation option to close the current execution context and return to the main context
    * Option to close the application


## Expected Output :

* Application name and the developer details 
* The details of the user interface such as options displaying the user interaction information 
* The first option should return the current file names in ascending order. The root directory can be either empty or contain few files or folders in it
* The second option should return the details of the user interface such as options displaying the following:
    * Add a file to the existing directory list
        * You can ignore the case sensitivity of the file names 
    * Delete a user specified file from the existing directory list
        * You can add the case sensitivity on the file name in order to ensure that the right file is deleted from the directory list
        * Return a message if FNF (File not found)
    * Search a user specified file from the main directory
        * You can add the case sensitivity on the file name to retrieve the correct file
        * Display the result upon successful operation
        * Display the result upon unsuccessful operation
        * Option to navigate back to the main context
* There should be a third option to close the application
