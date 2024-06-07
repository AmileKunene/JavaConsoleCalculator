
package com.mycompany.calculator;
import java.util.Scanner;
import java.lang.Math;


public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operators obj = new Operators();
        boolean userInputAnswer = true;
        String userInput;
        
        
        
        while(userInputAnswer){
        
        System.out.println("1.Addition");
        System.out.println("2.Subtration");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("6.Square Root");
        System.out.println("7.Exit");
        System.out.println("Choose operator: ");
       userInput = scanner.nextLine();
       
       if("7".equals(userInput)){
       userInputAnswer = false;
       System.out.println("Application End!!!");
       break;
       }
       
       switch(userInput){
           case "1":
               System.out.println("Enter first number: ");
              int addtionNum1 = scanner.nextInt();
               System.out.println("Enter second number: ");
               int addtionNum2 = scanner.nextInt();
               
               obj.Addition(addtionNum1,addtionNum2);
               break;
           case "2":
                System.out.println("Enter first number: ");
              int subtractNum1 = scanner.nextInt();
               System.out.println("Enter second number: ");
               int subtractNum2 = scanner.nextInt();
               
               obj.Addition(subtractNum1,subtractNum2);
               break;
           case "3":
                System.out.println("Enter first number: ");
              int multiNum1 = scanner.nextInt();
               System.out.println("Enter second number: ");
               int multiNum2 = scanner.nextInt();
               
               obj.Addition(multiNum1,multiNum2);
               break;
           case "4":
               System.out.println("Enter first number: ");
              int diviNum1 = scanner.nextInt();
               System.out.println("Enter second number: ");
               int diviNum2 = scanner.nextInt();
               
               obj.Addition(diviNum1,diviNum2);
               break;
           case "5": 
                System.out.println("Enter first number: ");
              int moduleNum1 = scanner.nextInt();
               System.out.println("Enter second number: ");
               int moduleNum2 = scanner.nextInt();
               
               obj.Addition(moduleNum1,moduleNum2);
               break;
           case "6": 
               System.out.println("Enter number: ");
               double number = scanner.nextDouble();
              
               
               obj.SquareRoot(number);
               break;
           default: 
               System.out.println("INVALID INPUT!!!!");
       
       }
       
        System.out.println("Do you want to continue Y/N? ");
        char continueOption = scanner.next().charAt(0);
         
        if (continueOption != 'Y'){
        userInputAnswer = false;
        }
        }
            
        
      
    }
}
