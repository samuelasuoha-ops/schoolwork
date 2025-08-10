package ex1;

// Program to test class DoortoDoor
import java.util.Scanner;
public class TestDoorToDoor{
public static void main (String[] args) 
{
    Scanner in = new Scanner(System.in);
    int numHouses=0;
    int numSales=0;
    double averageSales;
    
    // Enter number of houses in the estate
    System.out.println("Enter number of houses in the estate");
    numHouses = in.nextInt(); 
    
    // create  instance of class DoortoDoor
    DoorToDoor myEstate = new DoorToDoor(numHouses);
    
    // Insert code to fill the houses array, the sales array and          
    myEstate.fillHouses();
    System.out.println(); 
    
     // display the sales figures  

     for (int i = 1; i <= numHouses; i++)
     {
            System.out.println("Enter number of sales in house : " + i);
            numSales = in.nextInt();; 
            myEstate.fillSales(i, numSales);
     }    
     
    System.out.println("Displaying sales for all houses\n " );
    myEstate.displayAll(); 
    
    averageSales = myEstate.calcAverageSales();
    System.out.println("Average sales for all houses :" + averageSales);
    
    myEstate.minSales();

   }// end main
}
 
  
 
