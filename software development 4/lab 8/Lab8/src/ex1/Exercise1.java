package ex1;

public class Exercise1 {
    public static void main (String args[])  {
        double  m[][] = { {6.7,4.4,7.9,9.2,7.1}, {9.0, 6.7, 3.3, 2.7,20.1} };
        int   row, column;
        double sum = 0.0;
        /*nested for loops commonly used for handling multi-dim arrays*/
        for( row = 0; row < m.length; row++ )   {
            for( column = 0; column < m[0].length; column++ ) {
                sum = sum + m[row][column];
            }
        }
        System.out.println("The total is " + sum );
    }
}
