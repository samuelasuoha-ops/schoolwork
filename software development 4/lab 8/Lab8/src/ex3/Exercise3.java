package ex3;

public class Exercise3 {

    public static void main(String args[]){
        int [][] nums = new int[20][20]; //create 2D array to hold numbers
        int row,col;                    // row and col to be used as indexes
        int value = 0;                  //value  to be placed in array
        for(row = 0; row < nums.length; row++){
            for (col = 0; col < nums[0].length; col++){
                nums[row][col] = value;
                value++;                     // increment value
            }
        }
        //display array for debugging purposes
        System.out.println("\t\t\t Array Data");
        for(row = 0; row < nums.length; row++){
            for (col = 0; col < nums[0].length; col++){
                System.out.printf("%5d",nums[row][col]) ;
            }
            System.out.println(); //move to next line after each row
        }
    }
}
