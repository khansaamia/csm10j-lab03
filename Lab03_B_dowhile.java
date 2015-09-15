package lab_b_do.pkgwhile;

import java.util.Scanner;

public class Lab_B_DoWhile {

      static Scanner console = new Scanner(System.in);

            
    public static void main(String[] args) {
        int firstNum, secondNum;
       System.out.println("Enter two positive integers.");
       firstNum = console.nextInt();
       secondNum = console.nextInt();
       
       int i=firstNum, evenSum =0;
       System.out.println("The odd numbers between " +firstNum + " and " +secondNum +" are:");
       do{
           if(i %2 != 0)
               System.out.println(i+" ");
           else if (i %2 == 0)
               evenSum += evenSum; 
               i++;       
       }
       
       while(i <=secondNum);
       
       System.out.println("The sum of the even numbers is: " + evenSum);
        
          
       }
    
}
