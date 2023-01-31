import java.util.*; // for the ArrayList
import java.util.ArrayList;


public class Main // MasterOrder 
{
        
    // NOTE: ArrayList is inherited from List
    //       so our data type can be List.
    //       (and all the methods are listed above ArrayList)
    private ArrayList<CookieOrder> orders;
    
    
    // constructor
    public Main() 
    {
        // create a new ArrayList of CookieOrder objects
    	orders = new ArrayList<CookieOrder>();    	
    }
    
    
    // given addOrder method
    public void addOrder(CookieOrder theOrder)
    {
    	orders.add(theOrder);
    }
    
    
    // *******************************
    // *******************************
    // *******************************
    // ****** to be written for part a
    // *******************************
    // *******************************
    // *******************************
    public int getTotalBoxes()
    {
      int count = 0;

      for (int i = 0; i < orders.size(); i++) {
        int numBoxes = orders.get(i).getNumBoxes();
        count += numBoxes;
      }

      return count;
    }
    
    
    // *******************************
    // *******************************
    // *******************************
    // ****** to be written for part b
    // *******************************
    // *******************************
    // *******************************
    public int removeVariety(String cookieVar)
    {
      int count = 0;

      int i = 0;
      while (i < orders.size()) {
        if (orders.get(i).getVariety().equals(cookieVar)) {
          int numBoxes = orders.get(i).getNumBoxes();
          count += numBoxes;
          orders.remove(i);
        }
        else {
          i++;
        }
      }
    	
    	return count;
    }

    
    
    public String toString()
    {
    	return orders.toString();
    }
    
    
    
    // given
    // a main method to test it
    public static void main(String[] args) 
    {
       System.out.println();
       System.out.println("An ArrayList of CookieOrder objects");
       System.out.println();
       System.out.println("My name is Ivy Yip");
       System.out.println();
       
       Main theOrders = new Main();
       
       theOrders.addOrder(new CookieOrder("Chocolate Chip",1));
       theOrders.addOrder(new CookieOrder("Shortbread",5));
       theOrders.addOrder(new CookieOrder("Macaroon",2));
       theOrders.addOrder(new CookieOrder("Chocolate Chip",3));
       
       // test for part a
       System.out.println("Total Boxes Before = "+theOrders.getTotalBoxes());
       System.out.println();
       
       // test for part b
       System.out.println("Order List Before = "+theOrders.toString());
	   System.out.println();
	   System.out.println();
	   System.out.println();

	   System.out.println("**********  Removing Chocolate Chip  **********");
	   System.out.println();
	   
	   System.out.println("Boxes Removed = "+theOrders.removeVariety("Chocolate Chip"));
	   System.out.println();
	   
       System.out.println("Total Boxes After = "+theOrders.getTotalBoxes());
       System.out.println();
       System.out.println("Order List After  = "+theOrders.toString());

	   System.out.println();
	   System.out.println();
	   System.out.println();
	   
       
    } // end of main for testing
}

// notice this class is immutable
// create a class called CookieOrder
public class CookieOrder
{
    // Define 2 instance variables.
    // Attributes, fields, properties, global variables
    // Don't forget to make them private
    // 1st variable name is variety of type String
    // 2nd variable name is numBoxes of type int
	private String variety;
	private int numBoxes;
	
    
	// constructor
	// Write a constructor
	public CookieOrder(String variety, int numBoxes)
	{
        // assign the incoming values to the
        // instance variables
        this.variety = variety;
        this.numBoxes = numBoxes;
        	    
	}
	
    
	public String getVariety()
	{
	    // fix this ???
		return variety;
	}
	
    
	public int getNumBoxes()
	{
	    // fix this ???
		return numBoxes;
	}
	
    
	// for testing results
	public String toString()
	{
		return variety + " " + numBoxes;
	} // end of method toString()
    
    
} // end of class CookieOrder
