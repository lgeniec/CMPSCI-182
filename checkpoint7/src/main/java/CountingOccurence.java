/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */

public class CountingOccurence {

    public static void main(String[] args) {
        char[] array1 = new char[100]; //new array of 100 empty array slots
        
        //generates random lowercase letters and stores them in the array
        for(int i = 0; i < array1.length; i++) {   
            array1[i] = RandomCharacter();
        }
        
        //count occurences of each letter
        int[] counts = new int[26];
        
        for (int i = 0; i < array1.length; i++) {
            char ch = array1[i];
            int index = ch - 'a';
            
            if (index >= 0 && index < 26) { //checks to see if index is within valid range of 0 to 25 (alphabet range)
                counts[index]++;
            }
        }
        
        //print the results. goes through each iteration to calculate corresponding letter (char)('a' + i)) and prints letter and count
        for (int i = 0; i < counts.length; i++) {
            char letter = (char)('a' + i); //converts indexs to chars in array
            System.out.println(letter + " occurs " + counts[i] + " times");
        }
        
    }

    public static char RandomCharacter() {
        //prints out random char from a to z
        return (char) ('a' + Math.random() * ('z' - 'a' + 1));
    }
    
    
}
