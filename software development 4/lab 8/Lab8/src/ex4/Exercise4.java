package ex4;

public class Exercise4 {
    public static void main(String[] args) {
        int[][] nums = new int[20][2]; //create 2D array to hold numbers
        int row, col;                    // row and col to be used as indexes
        int value = 2;                  //value  to be placed in array

        //populate first colum
        for (row = 0; row < nums.length; row++) {
            nums[row][0] = value; // only the row changes the col is the same for each
            value += 2;                    // increment value
        }
        // populate the second column once the data has been filled in the first column
        for (row = 0; row < nums.length; row++) {
            // cater for last row put value of col 0 in col 1 only as no next row!
            if (row == 19)
                nums[row][1] = nums[row][0];
            else
                // add value from  col 0 of this row and from col 0 of next row
                nums[row][1] = nums[row][0] + nums[row + 1][0];
        }
        //display array
        for (row = 0; row < nums.length; row++) {
            System.out.print(row+" ");
            for (col = 0; col < nums[0].length; col++) {
                System.out.print(+nums[row][col] + "  ");
            }
            System.out.println();
        }
    }
}
