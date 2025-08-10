package ex3;

class TestProduct
{
    public static void main(String[] args)
    {
        int amount = 0;    // number entered by the user.
        double profit;
        boolean sold;

        // create a test product  and initialise instance variables - allow students to use default constructor & setters
        Product prod1 = new Product(12345,"Kellogs Cornflakes",2.79,2,200);


        prod1.print();

        /*change cost and selling prices*/
        prod1.setcostPrice(2.50);
        prod1.setsellingPrice(2.80);

        prod1.stockIn(20);
        //print details
        prod1.print();

        //Q2 only
        sold = prod1.sellProd(10);

        if (!sold)
        {
            System.out.println("Sorry, unavailable, More on order");
            prod1.stockIn(100); //simulate purchasing of 100 more units
        }
        else
        {
            //calculate profit (selling - cost price)
            profit  = (10*(prod1.getsellingPrice() - prod1.getcostPrice()));
            System.out.printf("The profit is: €%.2f ", profit);
            System.out.println("The stock remaining is: " + prod1.getStock());
        }

    }
}