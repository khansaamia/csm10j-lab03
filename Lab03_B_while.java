package lab03_b_while;
import java.util.Scanner;

public class Lab03_B_While {

    static Scanner console = new Scanner (System.in);
    
    public static void main(String[] args) {
       int firstNum, secondNum;
       System.out.println("Enter two positive integers.");
       firstNum = console.nextInt();
       secondNum = console.nextInt();
       
       while(firstNum <0 || secondNum <0 || firstNum>=secondNum){
           System.out.println("Enter two positive integers as the first integer is greater than the second integer.");
           firstNum= console.nextInt();
           secondNum= console.nextInt();
       }
       System.out.println();
       System.out.println("The odd numbers between " +firstNum + " and " +secondNum +" are:");
      
       while (firstNum<=secondNum){
           if(firstNum % 2 != 0)
               System.out.println(firstNum + " ");
           firstNum++;
       }
     
       int evenSum=0;
       while (firstNum<=secondNum){
           if(firstNum %2 ==0)
               evenSum+=firstNum;
           firstNum++;
       }
       System.out.println("The sum of even numbers between " +firstNum +" and " + secondNum+ " is " +evenSum); 
               
           
       }
    }
    
