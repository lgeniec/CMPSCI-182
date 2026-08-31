/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // System.out.println("Enter an integer");
     //   int i = input.nextInt(); //anything scanned before nextLine() will not work 
        System.out.println("Enter a character");
        String s2 = input.next();//there is no next string. Use next() for one word or nextLine() for a sentence
        char c = s2.charAt(0); //to convert to character from string
        System.out.println(s2);
    }
}
