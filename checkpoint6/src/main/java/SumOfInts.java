/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class SumOfInts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sp");
        int x = input.nextInt();
        System.out.println("Enter your ep");
        int y = input.nextInt();
        System.out.println(sum(x, y));
        System.out.println(sum(20, 30));
        
        
    }
    public static int sum(int sp, int ep) {
        int sum = 0;
        for (int i = sp; i <= ep; i++) {
            sum += i;
        }
        return sum;
    }
}
