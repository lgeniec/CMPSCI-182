/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Arrays;

public class EliminateDupValues {

    public static void main(String[] args) {
        int[] list = {2, 9, 10, 200, 200, 19};
        int[] result = eliminateDuplicates(list);
        System.out.println(Arrays.toString(result));
    }

    public static int[] eliminateDuplicates(int[] list) {
        if (list == null || list.length == 0) {
            return list; //to check if array is empty
        }

        int uniqueCount = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    //if duplicate value, then the loop breaks and the next int is essentially overwritting the duplicate value
                    isDuplicate = true;
                    break;
                }
            }
            //only works if numbers are not duplicated and will be shifted to fit the correct new index of array
            if (!isDuplicate) {
                list[uniqueCount] = list[i];
                uniqueCount++;
            }

        }
        //using copyOf creates an entire new array after going through uniqueCount to remove spacing and copying the updated elements from the original array into a new one. 
        //ising copyOf is efficient to create a new array and copy elements without doing a for loop
        int[] result = Arrays.copyOf(list, uniqueCount);
        return result;
        
    }
}
