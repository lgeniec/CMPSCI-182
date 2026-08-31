/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
public class RandomCharacter {
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
        
    }
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
    
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
    
    public static void main(String[] args) {
        System.out.println("Random lowercase letter: " + getRandomLowerCaseLetter());
        System.out.println("Random digit character: " + getRandomDigitCharacter());
        System.out.println("Random uppercase letter: " + getRandomUpperCaseLetter());
        System.out.println("Random character: " + getRandomCharacter());
    }
}
