/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package checkpoint2.mycompany.checkpoint7;

/**
 *
 * @author logangeniec
 */

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        double[] num = new double[5];
        double total = 0;
        for(int i = 0; i < 5; i++) {
             num[i] = input.nextInt();
             total = total + num[i];
        }
             
        double average = total/5.0;
        System.out.println("Average is " + (average));
        
        
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            if (num[i] > average) {
                counter++;
            }
        }
        System.out.println("Numbers above average: " + counter);
    }
}
