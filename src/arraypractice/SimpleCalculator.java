package arraypractice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter Second number: ");

         double num2 = scan.nextDouble();

         System.out.println("Select operation: +, -, *, /");
         char operation = scan.next().charAt(0);

         switch (operation){
             case '+':
                 System.out.println("Result: " + (num1+num2));
                 break;
             case '-':
                  System.out.println("Result: "+ (num1-num2));
                  break;
             case '*':
                 System.out.println("Result: " +(num1*num2));
                 break;
             case '/':
                 System.out.println("Result: " +(num1/num2));
                 break;
             default:
                 System.out.println("Invalid operation");
         }

    }
}
