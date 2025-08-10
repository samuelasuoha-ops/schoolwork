package ex1;

public class Ex5 {
    public static void main(String[] args) {
        // constants for width and length in inches

        final double WIDTH=8.5;
        final double LENGTH=11.0;

        //constant for conversion factor
        final double mmPerInch=25.4;

        //variables for width and length in mm
        double widthInMms=0.0;
        double lengthInMms=0.0;

        //calculations
        widthInMms=WIDTH*mmPerInch;
        lengthInMms=LENGTH*mmPerInch;

        System.out.printf("The width in MMs is: %.2f%n", widthInMms);
        System.out.printf("The length in MMs is: %.2f%n", lengthInMms);
    }
}
