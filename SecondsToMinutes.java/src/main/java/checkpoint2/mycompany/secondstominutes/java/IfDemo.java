/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package checkpoint2.mycompany.secondstominutes.java;

import java.util.Scanner;
/**
 *
 * @author logangeniec
 */
public class IfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter an integer");
        int num1 = input.nextInt();
        if (num1 % 5 == 0) {
            System.out.println("HighFive");
        } 
        if (num1 % 2 == 0) {
            System.out.println("HiEven!");
        }
           
        }
        
    }

