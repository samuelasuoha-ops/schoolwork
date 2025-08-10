package lab6;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        double volume = 0, radius = 0 , length = 0, height = 0;
        int userChoice;
        Scanner in = new Scanner(System.in);

        //priming read, display menu & get user's initial choice
        System.out.println("*Calculation of Volume for Solid Objects*");
        System.out.println(" 1.\t Cube                ");
        System.out.println(" 2.\t Cylinder        ");
        System.out.println(" 3.\t Sphere       ");
        System.out.println(" 4.\t Exit          ");
        System.out.println(" **********************************");
        userChoice = in.nextInt();

        //loop until exit option chosen
        while (userChoice != 4 )
        {
            switch(userChoice){
                case 1:
                {
                    //Enter length of the cube for calculation
                    System.out.println("Enter the length of the cube:  ");
                    length = in.nextDouble();
                    //calculate volume
                    volume = length * length * length;
                    //print out the volume
                    System.out.println("The volume for this cube is:  " + volume );
                    break;
                }
                case 2:
                {
                    //Enter radius nad height of the cylinder for calculation
                    System.out.println("Enter the radius of the cylinder:  ");
                    radius = in.nextDouble();
                    System.out.println("Enter the height of the cylinder:  ");
                    height = in.nextDouble();
                    //calculate volume
                    volume = Math.PI * (radius * radius) * height;
                    //print out the volume
                    System.out.printf("The volume for this cylinder is:  %.2f\n",volume);
                    break;
                }
                case 3:
                {
                    //Enter radius of the sphere for calculation
                    System.out.println("Enter the radius of the sphere:  ");
                    radius = in.nextDouble();
                    //calculate volume
                    volume = (4/3.0) * Math.PI * (radius * radius * radius) ;
                    //print out the volume
                    System.out.printf("The volume for this sphere is:  %.2f\n", volume);
                    break;
                }
                default:
                {
                    System.out.println("Invalid menu option chosen");
                    break;
                }
            }//end switch statement
            //display menu and get user's next option in order to make progress in loop
            System.out.println("*Calculation of Volume for Solid Objects*");
            System.out.println(" 1.\t Cube                ");
            System.out.println(" 2.\t Cylinder        ");
            System.out.println(" 3.\t Sphere       ");
            System.out.println(" 4.\t Exit          ");
            System.out.println(" **********************************");
            userChoice = in.nextInt();

        } //end of menu
        System.out.println("Processing of Volumes completed");
    }
}
