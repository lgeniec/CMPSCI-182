/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        int[] arr = new int[5];
        inputArray(arr);
        System.out.println(sumArray(arr));
        System.out.println(countOccurences(arr, 4));
       
    }

    public static void inputArray(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
           
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
            arr[i] = input.nextInt();
        }
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int countOccurences(int[] arr, int num) {
        int counter = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == num) {
                counter++;

            }
            
        }
        return counter;
    }
}


