/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class Pass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in the score or -1 to exit");
        int x = input.nextInt();
        while (x != -1) {

            if (x >= 60) {
                System.out.println("You pass the exam");
            } else {
                System.out.println("You don't pass the exam");

            }
            System.out.println("Enter your score");
            x = input.nextInt();
        }

    }
}
