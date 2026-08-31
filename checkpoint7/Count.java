/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write out a line. It could be numbers and letters included in it");
        String s = input.nextLine();
        System.out.println(countLetters(s));
    }

    public static int countLetters(String s) {
        int letterCount = 0;
        String sentence = s.toLowerCase();
        // int space = s.charAt(' ');
        for (int i = 0; i < s.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            }
        }
        return letterCount;

    }
}

