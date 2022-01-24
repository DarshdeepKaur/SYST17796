package student;

import java.util.Scanner;

/**
 * This class +++ Insert class description here +++
 *
 * @author Darshdeep Kaur
 */
public class Student {
// changing 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student  name:");
        s1.setName(input.nextLine());
        
        System.out.println("name:" +s1.getName());

        Student[] studList = new Student[5];
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setName(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
