/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
public class TestRandomCharacter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;
        
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = RandomCharacter();
            if ((i + 1) % CHARS_PER_LINE == 0) {
                System.out.println(ch); 
            } else {
                System.out.print(ch);
            }
        }
    }
    
    public static char RandomCharacter() {
        return (char)('a' + Math.random() * ('z' - 'a' + 1));
    }
}
