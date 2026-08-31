/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author logangeniec
 */
public class practice3 {
    public static void main(String[] args) {
        System.out.println("Enter the price of the item that you purchased");
        Scanner a = new Scanner(System.in);
        double amount = a.nextDouble();
        
        double tax = amount * 0.095;
        tax = (int)(tax * 100)/100.0; //makes 3.32405 to 3.32
        
        
        System.out.println("The final price after tax is " + tax);
            
    }
}
