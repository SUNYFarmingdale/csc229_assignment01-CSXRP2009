/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {
private int ID;
private String Name;
private String Code;
   // This is the default constructor
public Course(){
  
}
// This is the overloaded constructor taking in the parameters and being declared.
public Course(int ID, String Name, String Code){
    this.ID = ID;
    this.Name = Name;
    this.Code = Code;
}
// getter method which requires a return
public int getID(){
    return ID;
}
// setting the ID
public void setID(int newID){
    this.ID = newID;
}
// gets the name making for a return
public String getName(){
    return Name;
}
// sets the name
public void setName(String newName){
    this.Name = newName;
}
public String getCode(){
    return Code;
}
public void setCode(String newCode){
    this.Code = newCode;
}
}
