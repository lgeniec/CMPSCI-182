/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class NumberCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
        int zero = 0;
        int x;
        
        while (true) {

            System.out.println("Would you like to continue?");
            String y = input.next();
            
            if (y.equalsIgnoreCase("yes")) {

               System.out.println("Type in an integer");
                    x = input.nextInt();
                    if (x > 0) {
                        
                        pos++;

                    } else if (x < 0) {
                     
                        neg++;

                    } else if (x == 0) {
                       
                        zero++;

                    }
                
            } else {
                if (y.equalsIgnoreCase("no")) {
                    System.out.println("You made " + pos + " positive numbers," + neg + " negative numbers, and " + zero + " zero numbers");
                    break;
                }
            }
        }
    }
}
