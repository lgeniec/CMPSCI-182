/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class Chapter5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int total = 0;
       
        do {
            total += num;
            System.out.println("Enter an integer or a zero to exit");
            num = input.nextInt();
        } while (num != 0);
        System.out.println("The total is " + total);

    }
}
