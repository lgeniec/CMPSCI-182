/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test2.mycompany.javalab2;

/**
 *
 * @author logangeniec
 */

import java.util.Scanner;
public class Temperature {

    public static void main(String[] args) {
        double celcius;
        double farenheit;
        System.out.println("Enter the celcius number to convert to farenheit: ");
        Scanner test2 = new Scanner(System.in);
        celcius = test2.nextDouble();
        farenheit = (9/5.0) * celcius + 32;
        System.out.println("The farenheit of the celius" + celcius + " is " + farenheit);
        
        
               
                
    }
}
