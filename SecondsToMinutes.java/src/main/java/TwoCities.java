/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class TwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two cities");
        String c1 = input.nextLine();
        String c2 = input.nextLine();
        
        if (c1.compareToIgnoreCase(c2) > 0) {
            System.out.println(c2 + "\n" + c1);
        } else {
            System.out.println(c1 + "\n" + c2);
        }
        
        
        String x = "Hello how are you";
        System.out.println(x.substring(6, 10)); 
                
    }
}
