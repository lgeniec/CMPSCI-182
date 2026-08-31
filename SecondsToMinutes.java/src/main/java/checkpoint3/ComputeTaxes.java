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
public class ComputeTaxes {

    public static void main(String[] args) {
        // tell them what status they are, then tell them to enter income and then return the taxes
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "What is your status? Type 0 for Single, 1 for Married Filing Together, 2 for Married filing seperately, and 3 for Head of Household. Type in -1 to finish.");
            int status = input.nextInt();
            while (status > 3 || status < -1) {
                System.out.println("This answer isn't an option!");
                status = input.nextInt();
            }
            if (status == -1) {
                System.out.println("Thanks for filing your taxes");
                break;

            }

            System.out.println("What is your annual income?");
            int income = input.nextInt();

            if (status == 0) {
                if (income >= 0 && income <= 8350) {
                    System.out.println("You are poor, pay 10% tax rate");
                } else if (income >= 8351 && income <= 33950) {
                    System.out.println("pay 15% tax rate");
                } else if (income >= 33951 && income <= 82250) {
                    System.out.println("pay 25% tax rate");
                } else if (income >= 82251 && income <= 171550) {
                    System.out.println("pay 28% tax rate");
                } else if (income >= 171551 && income <= 372950) {
                    System.out.println("pay 33% tax rate");
                } else {
                    System.out.println("pay 35% tax rate");
                }

            } else if (status == 1) {

                if (income >= 0 && income <= 16700) {
                    System.out.println("You are poor, pay 10% tax rate");
                } else if (income >= 16700 && income <= 67900) {
                    System.out.println("pay 15% tax rate");
                } else if (income >= 67901 && income <= 137050) {
                    System.out.println("pay 25% tax rate");
                } else if (income >= 137051 && income <= 208850) {
                    System.out.println("pay 28% tax rate");
                } else if (income >= 208851 && income <= 372950) {
                    System.out.println("pay 33% tax rate");
                } else {
                    System.out.println("pay 35% tax rate");
                }

            } else if (status == 2) {

                if (income >= 0 && income <= 8350) {
                    System.out.println("You are poor, pay 10% tax rate");
                } else if (income >= 8351 && income <= 33950) {
                    System.out.println("pay 15% tax rate");
                } else if (income >= 33951 && income <= 68525) {
                    System.out.println("pay 25% tax rate");
                } else if (income >= 68526 && income <= 104425) {
                    System.out.println("pay 28% tax rate");
                } else if (income >= 104426 && income <= 186475) {
                    System.out.println("pay 33% tax rate");
                } else {
                    System.out.println("pay 35% tax rate");
                }

            } else if (status == 3) {

                if (income >= 0 && income <= 11950) {
                    System.out.println("You are poor, pay 10% tax rate");
                } else if (income >= 11951 && income <= 45500) {
                    System.out.println("pay 15% tax rate");
                } else if (income >= 45501 && income <= 117450) {
                    System.out.println("pay 25% tax rate");
                } else if (income >= 117451 && income <= 190200) {
                    System.out.println("pay 28% tax rate");
                } else if (income >= 190201 && income <= 372950) {
                    System.out.println("pay 33% tax rate");
                } else {
                    System.out.println("pay 35% tax rate");
                }

            } else {
                System.out.println("This answer isn't an option!");

            }

        }
    }
}
