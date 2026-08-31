/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Create a new java main class, and call it 'SeparateDigits'. This program prompts the user to enter a two digit number. 
//The program then separates the digits and stores them in two variables called firstDigit and secondDigit. Display the digits.
/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class SeperateDigits {
    public static void main(String[] args) {
        System.out.println("Enter a 2 digit number");
        Scanner input1 = new Scanner(System.in);
        int value = input1.nextInt();
        int firstDigit = value / 10;
        int secondDigit = value % 10;
        
       
        
        System.out.println("The first digit is " + firstDigit + " and the second digit is " + secondDigit);
        
       
        
        
        
        
    }
}
