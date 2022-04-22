/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculator;
import java.util.Scanner;

/**
 *
 * @author Mico
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String choice = "";
        String choiceb = "";
        String choicec = "";
        String firstNumber = "";
        String secondNumber = "";
        float x = 0;
        float y = 0;
        float ans = 0;
        
        System.out.println("Calculator\n");
        System.out.println("Choose an option: ");
        System.out.println("1.) New operation ");
        System.out.println("2.) Exit\n");
           
        while (!choice.equals("1") && !choice.equals("2")){
            System.out.print("Choice: ");
            choice = scanner.next();
            if(choice.equals("1") || choice.equals("2"))
                break;
            System.out.println("Invalid input.");
            }
        while(true){
            if (choice.equals("1")){
                System.out.println("Choose an operation:");
                System.out.println("1.) Addition");
                System.out.println("2.) Subtraction");
                System.out.println("3.) Multiplication");
                System.out.println("4.) Division");
                System.out.println("5.) Exponents");
                    while(true){
                        System.out.print("Choice: ");
                        choiceb = scanner.next();
                        if (choiceb.equals("1") || choiceb.equals("2") || choiceb.equals("3")|| choiceb.equals("4")|| choiceb.equals("5")){
                            break;
                        }
                        System.out.println("Ivalid input.");  
                    }
                   
                while(true){
                    System.out.print("Input 1st number: ");    
                    firstNumber = scanner.next();
                    Scanner scannerr = new Scanner(firstNumber);        
                    if (scannerr.hasNextFloat()){
                        break;
                    } else 
                        System.out.println("Invalid input");
                    }
                
                 while(true){
                    System.out.print("Input 2nd number: ");    
                    secondNumber = scanner.next();
                    Scanner scannerr = new Scanner(secondNumber);        
                    if (scannerr.hasNextFloat()){
                        break;
                    } else 
                        System.out.println("Invalid input");
                    }
                x = Float.parseFloat(firstNumber);
                y = Float.parseFloat(secondNumber);
                switch (choiceb){
                    case "1" : 
                        System.out.println("Addition : " + x + " + " + y);
                        System.out.println("Answer = " + (x + y));
                        break;
                    case "2" :
                        System.out.println("Subtraction : " + x + " - " + y);
                        System.out.println("Answer = " + (x - y));
                        break;
                    case "3" : 
                        System.out.println("Multiplication : " + x + " x " + y);
                        System.out.println("Answer = " + (x * y));
                        break;
                    case "4" :
                        System.out.println("Division : " + x + " // " + y);
                        System.out.println("Answer = " + (x / y));
                        break;
                    case "5" :
                        System.out.println("Exponents : " + x + " ^ " + y);
                        System.out.println("Answer = " + Math.pow(x , y));
                        break;
                }
                while(true){
                    System.out.print("Continue? Y/N: ");
                    choicec = scanner.next().toLowerCase();
                    if(choicec.equals("y") || choicec.equals("n"))
                        break;    
                    System.out.println("Invalid input.");
                }
                if (choicec.equals("n"))
                    break;
          
            } else 
                break;  
        }
        }  
}
