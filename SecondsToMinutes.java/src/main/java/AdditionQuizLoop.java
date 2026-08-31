/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class AdditionQuizLoop {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + num1 + " + " + num2 + "?");
        int answer = input.nextInt();
        
        int counter = 1;
        
        while (answer != num1 + num2 && counter < 5) {
              System.out.println("Try again!");
              answer = input.nextInt();
              counter++;
        }
        
        if (answer == num1+num2) {
        System.out.println("Well done");
        } else {
            System.out.println("Nah fool, you dumb");
        }
    }
}
