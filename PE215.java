package pe2.pkg15;

/** Ryan Hodgson 
 * Programming Exercise 2-15 (Male and Female Percentages)
 * Determining the percentages & totals of male and female students
 * @author hodgsonr3396
 * CIS 115
 * 02/27/2020
*/ 
import java.util.Scanner;
public class PE215 {

    
    public static void main(String[] args) 
    {
    // create an object for keyboard input 
        Scanner keyboard  = new Scanner (System.in);
    // Declare variables
    int male, female;
    double total, percentMale, percentFemale;
    // Get the number of male & female students
        System.out.print("Enter the number of male students");
        male = keyboard.nextInt();
        System.out.print("Enter the number of female students");
        female = keyboard.nextInt();
    // Calculate the total number of male and female students
        total = male + female;
    // calculate the percentage of male and female students
        percentMale = male / total * 100;
        percentFemale = female / total * 100;
    // Display the percentage of male and female students
        System.out.println("Male: " + percentMale + ("%"));
        System.out.print("Female: " + percentFemale + ("%"));
    
    }
    
}
