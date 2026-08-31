/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class CountChar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write out a sentence");
        String s1 = input.nextLine();

        System.out.println(count(s1));
    }

    public static int count(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'e') {
                counter++;
            }
            if (ch == 'E') {
                counter++;
            }

        }
        return counter;
    }
}
