/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package checkpoint3;

import java.util.Scanner;

/**
 *
 * @author logangeniec
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current year");
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }
}
