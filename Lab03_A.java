/* Program Algorithm:
The plan is to create a scanner object which will allow the user to input the number of pages to print. 
The program will then calculate the total based on input.
*/
import java.util.Scanner;

public class Lab03_A {
   
    static Scanner console = new Scanner (System.in);
    
    public static void main(String[] args) {
        int number = console.nextInt();
        System.out.println("Please enter the number of pages you would like to print. The service charge is 3.00;"
                + "the first 10 pages are $0.20 each and every page after that is $0.10.");
        if ((number>0)&&(number<=10))
            System.out.printf("Total cost:$%.2f %n");
        else if (number>10)
            System.out.printf("Total Cost: $%.2f %n", 3 + (10*0.2)+(number-10)*0.1);
        else 
            System.out.println ("Invalid number.");
    }
    
    
}
