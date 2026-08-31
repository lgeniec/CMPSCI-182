/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
public class StringConcatenator {
    public static String concatenateAlphabetically(String str1, String str2) {
        if (str1.compareToIgnoreCase(str2) <= 0) {
            return str1 + str2;
        } else {
            return str2 + str1;
        }
    }

    public static void main(String[] args) {
        String result1 = concatenateAlphabetically("apple", "banana");
        System.out.println(result1); // Output: applebanana

        String result2 = concatenateAlphabetically("Zebra", "apple");
        System.out.println(result2); // Output: appleZebra
    }
}
