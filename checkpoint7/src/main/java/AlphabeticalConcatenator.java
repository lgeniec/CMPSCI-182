/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class AlphabeticalConcatenator {

    public static String concatenateAlphabetically(String s) {
        String letters = "";
        String digits = "";
        String others = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                letters += ch;
            } else if (Character.isDigit(ch)) {
                digits += ch;
            } else {
                others += ch;
            }
        }

        // Sort the letters and digits strings
        letters = sortString(letters);
        digits = sortString(digits);

        return letters + digits + others;
    }

    // Helper method to sort a string alphabetically
    private static String sortString(String str) {
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write out a line. It could be numbers and letters included in it:");
        String s = input.nextLine();
        System.out.println(concatenateAlphabetically(s));
    }
}
/* //Using just methods, not arrays//
public static String concatenateAlphabetically(String s) {
        String letters = "";
        String digits = "";
        String others = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                letters = insertAlphabetically(letters, ch);
            } else if (Character.isDigit(ch)) {
                digits = insertAlphabetically(digits, ch);
            } else {
                others += ch;
            }
        }

        return letters + digits + others;
    }

    // Helper method to insert a character alphabetically into a string
    private static String insertAlphabetically(String str, char ch) {
        if (str.isEmpty()) {
            return String.valueOf(ch);
        }

        int i = 0;
        while (i < str.length() && ch > str.charAt(i)) {
            i++;
        }
        return str.substring(0, i) + ch + str.substring(i);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write out a line. It could be numbers and letters included in it:");
        String s = input.nextLine();
        System.out.println(concatenateAlphabetically(s));
    }
*/