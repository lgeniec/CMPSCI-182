/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class SubstringCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        
        if (s1.indexOf(s2) > 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
       
      
        
    }
}
