import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ExerciseMoped {
    public static void main(String[] args) {
        final double DAY_SMALL_MOPED = 15.00;
        final double DAY_LARGE_MOPED = 25.00;

        final double END_SMALL_MOPED = 30.00;
        final double END_LARGE_MOPED = 35.00;

        final double ADD_DAY_SMALL = 2.50;
        final double ADD_DAY_LARGE = 3.50;

        final double ADD_END_SMALL = 7.50;
        final double ADD_END_LARGE = 8.50;

        final int FEE_HOURS = 3;

        String type;
        String day;
        int hours = 0;
        int extraHours = 0;
        double fee = 0.0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter moped type (50cc or 250cc):");
        type = in.nextLine();

        if(!(type.equals("50cc") || type.equals("250cc"))){
            System.out.println("Error: Unknown moped type entered");
            System.exit(1);
        }
        System.out.println("Enter which part of the week ridden (weekend or weekday");
        day = in.nextLine();

        System.out.println("Enter amount of hours ridden (weekend or weekday");
        hours = in.nextInt();

        extraHours = hours-FEE_HOURS;

        // small moped
        if(type.equals("50cc")){
            if(day.equals("weekday")){
                fee = DAY_SMALL_MOPED;

                if(extraHours>0){
                    fee = fee + (extraHours*ADD_DAY_SMALL);
                }
            }else {
                fee = END_SMALL_MOPED;
                if(extraHours>0){
                    fee = fee + (extraHours*ADD_END_SMALL);
                }
            }

        }
        // large moped
        else {
            if(day.equals("weekday")){
                fee = DAY_LARGE_MOPED;

                if(extraHours >0){
                    fee = fee + (extraHours*ADD_DAY_LARGE);
                }
            }else{
                fee = END_LARGE_MOPED;

                if (extraHours >0){
                    fee = fee + (extraHours*ADD_END_LARGE);
                }
            }

        }

        System.out.println("The fee is €" +fee + " for a scooter ride with\n" +"\tType: "
                                    +type + "\n" + "\tTime of week: " +day +"\n" +
                                    "\tHours: " +hours + "\n");


    }
}
