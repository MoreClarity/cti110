
package hodgsonhandsonexam1;

/** Ryan Hodgson
 * 03/12/2020
 * Hands On Exam 1
 * I will be creating a program that displays your age in dog years
 */
import java.util.Scanner;
public class HodgsonHandsOnExam1 {

    
    public static void main(String[] args) 
    {
        // Create a new scanner object
        
        Scanner k = new Scanner(System.in);
       
        // Declare variables
        
        double dogYears;
        double age;
        
        // Input for what the program will display
        
        System.out.println("This program will calculate your age in dog years.");
        
        
        System.out.print("What is your age? ");
        age = k.nextDouble();
        
        // Calculate the user's age in dog years
        
        dogYears = age * 7;
        
        // Display the results
        
        System.out.print("Your age in dog years is: " + dogYears);
        
        
        
    }
    
}
