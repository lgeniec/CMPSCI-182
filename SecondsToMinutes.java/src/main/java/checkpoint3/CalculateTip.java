package checkpoint3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author logangeniec
 */
public class CalculateTip {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total amount for the food you have to pay");
        double total = input.nextDouble();
        
        System.out.println("Enter a tip % you want to pay");
        double tip = input.nextDouble();
        tip = 1 + (tip / 100);
        
        tip = total * tip;
        tip = (int)(tip * 100)/100.0;
       // double totalRound = total / 100;
       // double tipPer = tip / 100;
        double totalCost = tip;
        
        
        
        //answe is 70.74
      
        System.out.println("Your total for your food after the tip is " + totalCost);
    }
}
/*double amount = a.nextDouble();
        
        double tax = amount * 0.095;
        tax = (int)(tax * 100)/100.0
 int minutes = seconds/60;
        int remainingSec = seconds % 60;

*/
/*
 public static void main(String[] args) {
        //get total amount from the user
        Scanner a = new Scanner(System.in);
        System.out.println("What is your purchase price?");
        double amount = a.nextDouble();
        //calculate sales tax
        double tax = amount * 0.095;
        tax = (int)(tax * 100)/100.0;
        //display tax with two digits after decimal place
        System.out.println(tax);
    }
*/