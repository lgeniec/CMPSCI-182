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
public class AdditionClass {
    public static void main(String[] args) {
        
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is " + num1 + " + " + num2);
        int answer = input.nextInt();
        if (answer == num1 + num2) {
            System.out.println("Good job");
        } else {
            System.out.println("Bad job");
        }
    }
}
