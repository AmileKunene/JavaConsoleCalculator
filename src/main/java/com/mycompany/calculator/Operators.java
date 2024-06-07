
package com.mycompany.calculator;
import java.lang.Math;

class Operators {
      private int num1,num2,result;
      private double number,results;
      
     
    
  public  Operators(){
    num1 = 6;
    num2 = 5;
    }
    
    public int getNum1(){
    return num1;
    }
    
    public void setNum1(int num){
    this.num1 = num;
    }
    public int getNum2(){
    return num2;
    }
    
    public void setNum2(int num2){
    this.num2 = num2;
    }
    
    public double getNumber(){
    return number;
    }
    
    public void setNumber(double number){
    this.number = number;
    }
    
    public int getResult(){
    return result;
    }
    
    public void setResult(int result){
    this.result = result;
    }
    
    public double getResults(){
    return results;
    }
    
    public void setResults(double results){
    this.results = results;
    }
    
    public void Addition(int num1, int num2){
    result = num1 + num2;
    System.out.println("Sum of two number is: " + result);
    }
    
    public void Subtraction(int num1, int num2){
    result = num1 + num2;
    System.out.println("Sum of two number is: " + result);
    }
    
    public void Multiplication(int num1, int num2){
     result = num1 + num2;
    System.out.println("Sum of two number is: " + result);
    }
    
    public void Division(int num1, int num2){
    result = num1 + num2;
    System.out.println("Sum of two number is: " + result);
    }
    
    public void Modulus(int num1, int num2){
    result = num1 + num2;
    System.out.println("Sum of two number is: " + result);
    }
    
    public void SquareRoot(double number){
        
        results = Math.sqrt(number);
        System.out.println("Square root of " + number + ": " + results);
      
     
    }
    
}
