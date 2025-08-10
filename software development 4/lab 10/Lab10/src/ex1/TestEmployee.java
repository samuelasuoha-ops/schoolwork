package ex1;

public class TestEmployee {
    public static void main(String args[]) {
        //create Employee object
        Employee e1 = new Employee("John Smith", 90024, 30.0, 40);
        e1.calculateSalary();
        e1.print();

        System.out.println();
        
        //create Trainee object
        Trainee t1 = new Trainee("Mary Jones", 97778, 15.0, 20, 10);
        t1.calculateSalary();
        t1.print(); //call this method to output all details of trainee
    }
}

