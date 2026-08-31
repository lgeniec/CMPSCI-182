/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Arrays;

public class ArrayBinarySearch { //study this for array library classes! 
    public static void main(String[] args) {
        int[] a = {4, 5, 3, 2, 6};
        Arrays.sort(a); //sorts array then you can do binarySearch (also for doubles and char)
        System.out.println(Arrays.toString(a)); //display array for you
        System.out.println(Arrays.binarySearch(a, 1)); //built in binarySearch to search for an array
    }
}
