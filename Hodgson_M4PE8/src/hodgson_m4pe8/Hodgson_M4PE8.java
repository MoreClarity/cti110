package hodgson_m4pe8;

/** 
 *
 * 
 */
import java.util.Scanner;
public class Hodgson_M4PE8 
{

   
    public static void main(String[] args) 
    {
        // Declare the imported scanner as object "K"
        Scanner k = new Scanner(System.in);
        
        // Declare variables
        double sqFt;
        double pricePerGallon;
       
        double gallons;
        double laborHours;
        double laborCost;
        double paintCost;
        double totalJobCost;
        
        // Get user input
        
        System.out.print("How many square feet are to be painted? ");
        sqFt = k.nextDouble();
        System.out.print("What is the price of the paint per gallon? ");
        pricePerGallon = k.nextDouble();
        
        // Calculate Number of gallons, labor hours, paint cost, labor charges
        // and the total cost of the paint job 
        
        gallons = sqFt / 115;
        laborHours = 8 * gallons;
        laborCost = 20.00 * 8 * gallons;
        paintCost = gallons * pricePerGallon;
        totalJobCost = paintCost + laborCost;
        
        // Display total gallons, labor hours, labor cost, paint cost
        // and total job cost
        
        System.out.println("You need " + gallons + " of paint");
        System.out.println("This job will take " + laborHours + " hours to finish");
        System.out.println("This job will cost " + laborCost + " dollars to finish");
        System.out.println("The paint required will cost " + paintCost + " dollars");
        System.out.println("The total cost of the job is " + totalJobCost + " dollars" );
        
        
        
        
        
    }
    
}
