package ex3;

public class Product
{
    private int prodCode;
    private String prodName;
    private double sellingPrice;
    private double costPrice;
    private int onHand;
 
 //constructor passing in arguments
    public Product(int newCode, String nameIn, double sellIn, double costIn, int currentIn)
    {
     prodCode = newCode;
     prodName = nameIn;
     sellingPrice = sellIn;
     costPrice  = costIn;
     onHand = currentIn;
    }

    public void stockIn(int amount)
    {
        onHand += amount;
    }


    public boolean sellProd(int quantity)
    {
        boolean processed = false; //local variable

        if (onHand < quantity)
            processed = false;
        else
        {
            processed = true;
            onHand -= quantity;
        }

        return processed;
    }


    public int getStock()
    {
        return onHand;
    }


    public double getcostPrice()
    {
        return costPrice;
    }


    public double getsellingPrice()
    {
        return sellingPrice;
    }

    public void setsellingPrice(double sell)
    {
        sellingPrice = sell;
    }

    public void setcostPrice(double cost)
    {
        costPrice = cost;
    }
    public void setName(String nameIn)
    {
        prodName = nameIn;
    }
    public void setCode(int codeIn)
    {
        prodCode = codeIn;
    }
    public void print(){
        System.out.println(" Product Details");
        System.out.println(" Product Code    : " + prodCode);
        System.out.println(" Product Name    : " + prodName);
        System.out.println(" Selling Priice  : " + sellingPrice);
        System.out.println(" Cost Price      : " + costPrice);
        System.out.println(" Quantity        : " + onHand);
    }



} 
  
 