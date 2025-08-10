package ex1;

public class Ex6 {
    public static void main(String[] args) {
        // width and length in inches

        final double WIDTH=8.5;
        final double LENGTH=11.0;
        final double mmPerInch=25.4;

        double widthInMms=0.0;
        double lengthInMms=0.0;
        double perimeterInMms=0.0;
        double perimeterInIns=0.0;

        widthInMms=WIDTH*mmPerInch;
        lengthInMms=LENGTH*mmPerInch;

        perimeterInMms=((widthInMms*2)+(lengthInMms*2));
        perimeterInIns=((WIDTH*2)+(LENGTH*2));

        System.out.printf("The width in MMs is: %.2f%n", widthInMms);
        System.out.printf("The length in MMs is: %.2f%n", lengthInMms);
        System.out.printf("The perimeter in MMs is: %.2f%n", perimeterInMms);
        System.out.printf("The perimeter in INCHES is: %.2f%n", perimeterInIns);

    }
}
