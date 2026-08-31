/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;


public class Compare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers");
        int[] num1 = new int[10];
        
        for (int i = 0; i < 10; i++) {
            num1[i] = input.nextInt();
           
        }
        for (int j = 0; j < 10; j++) {
         if (num1[j] < num1[9]) {
                System.out.println(num1[j] + " is less than " + num1[9]);
            } else if (num1[j] > num1[9]) {
                System.out.println(num1[j] + " is greater than " + num1[9]);
            } else {
                System.out.println(num1[j] + " is equal to " + num1[9]);
            }
       
        }
         
    }
}

   