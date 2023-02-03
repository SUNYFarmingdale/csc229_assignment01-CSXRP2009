
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class CSC229_Assignment01 {
    
     public static void main(String[] args) {
        Course CSC229 = new Course();
        Course CSC230 = new Course(1, "Computer Science", "230");
        
        CSC229.setName ("Data Structures and Algorithms");
        System.out.println(CSC229.getName());
        System.out.println(CSC230.getName());
    }
    
}
