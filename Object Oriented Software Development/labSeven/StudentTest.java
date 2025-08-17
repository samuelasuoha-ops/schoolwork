//Student ID: C00305107
//Date: 28/01/2025
package labSeven;

public class StudentTest {
    public static void main(String[] args) {
        // This creates a Student object
        Student newStudent = new Student("james", "313", "programming");

        // This prints name and module
        System.out.println("Name: " + newStudent.getName());
        System.out.println("Module: " + newStudent.getModule());

        // This changes the module using the setter method
        newStudent.setModule("design");

        // This prints updated name and module
        System.out.println("Updated Name: " + newStudent.getName());
        System.out.println("Updated Module: " + newStudent.getModule());
    }
}
