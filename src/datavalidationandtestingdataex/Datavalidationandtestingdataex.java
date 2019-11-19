/*
 * Gurjit Singh
 * Tuesday November 19th - 2019
 * This program displays an example of data validation and testing data
 */

package datavalidationandtestingdataex;
import java.util.Scanner;

/**
 *
 * @author gusin5788
 */
public class Datavalidationandtestingdataex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String integerString;
        int value = 0;
        boolean valid = false;
        
        while (valid == false) {
            System.out.println("Enter an integer:");
            integerString = input.nextLine();
            System.out.println("");
            
            try {
                value = Integer.parseInt(integerString);
                valid = true;
            }
            catch (NumberFormatException nfe) {
                System.out.println("Sorry, this is not a valid input.");
                System.out.println("");
            }
        }
        
        System.out.println("Thank you!");
        System.out.println(value + " is a valid integer.");
        System.out.println("Let's continue with the rest of the program....");
        System.out.println("....");
        System.out.println("");
    }
    
}

