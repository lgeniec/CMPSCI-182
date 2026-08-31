/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */


public class LargestElement {

    public static void main(String[] args) {
        double[] array1 = {1, 21.2, 500, 213.3, 19};

        //Arrays.sort(array1);
        System.out.println(indexOfLargestElement(array1));
        
    }

    public static int indexOfLargestElement(double[] array1) {
        //checks to see if array has anything at all
        if (array1 == null || array1.length == 0) {
            return -1;
        }
        
        int largestIndex = 0;
        double largest = array1[0]; //assuming largest is at array1[0] first
        
        //started at i = 1 to reduce redundancy as array1[0] is assumed to be largest and is already initialized
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > largest) {
                largest = array1[i];
                largestIndex = i;
            }
        }
        return largestIndex;
    }

}

