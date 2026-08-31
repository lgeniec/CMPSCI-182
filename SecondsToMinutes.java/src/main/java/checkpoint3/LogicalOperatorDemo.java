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
public class LogicalOperatorDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");
        int num = input.nextInt();

        //divisible by 2 and 3
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Divisible by 2 and 3");
        }

        //divisible by 2 or 3
        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("Divisible by 2 and 3");
        }

        //divisible by 2 or 3 both not both
        if (num % 2 == 0 ^ num % 3 == 0) {
            System.out.println("Divisible by 2 or 3, but not both");
        }

    }
}
