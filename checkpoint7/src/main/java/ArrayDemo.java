/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = new int[10]; //have array size 10, but index of 0 - 9//
       // System.out.println(a[0]); //gives default value of 0 if nothing is put inside the index, just printing a is the address of the index
        System.out.println(a.length); //no parenthesis/ or a.length-1
      //  System.out.println(a);
        a[0] = 1;
        a[1] = 13;
        a[2] = 20;
        a[3] = 30;
        a[4] = 12;
        a[5] = 10;
        a[6] = 0;
        a[7] = 1;
        a[8] = 0;
        a[9] = 1; //cannot do a[10] cause its a runtime error
     //   int[] a = {1, 2, 3, 4, 5};

        int[] b = new int[5]; //size 5, index 0-4//
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter 5 values");
        //double[] myList = {1.0, 3.2, 3.1, 40.2, 12.9};
        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextInt(); //(int)(Math.random() * 100) to generate random array numbers
            
        }
        //display array
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        //total array sum
        int total = 0;
        for (int i = 0; i < b.length; i++) {
            total = total + b[i];
        }
        System.out.println("The total is: " + total);
        
        //find the largest number in array
        int max = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        System.out.println("The largest number is " + max);
        
        //shifting elements leftwards
        int temp = b[0]; // temporarily store b[0] in temp so you dont lose the value
        // temp = b[b.length -1] for rightwards shift
        for (int i = 1; i < b.length; i++) {
            b[i-1] = b[i];
            
        }
        b[b.length - 1] = temp; //store last index of array as the first one which was stored in temp
        //b.length + 1 for shifting1 right
        //display array again
        for (int value: b) { //for each loop. Can only start at index 0. Works for reiterating through entire array index 
            System.out.println(value + " ");
        }
        System.out.println();
        
        //copy b to a
      /*  for (int i = 0; i < a.length; i++) {
            a[i] = b[i];      
  
       
        }
*/
        int[] list1 = {1, 2, 3, 4};
        int[] list2 = {3, 4, 5, 6};
        System.out.println("Before Copy");
        printArray(list1);
        printArray(list2);
    
        System.arraycopy(b, 0, a, 0, b.length); //same as copying an array
        
        System.out.println("After Copy");
        printArray(list1);
        printArray(list2);
        
        //displaying array (without printArray Method)
      /*  for (int value: a) { //for each loop. Can only start at index 0. Works for reiterating through entire array index 
            System.out.println(value + " ");
        }
        
        
        System.out.println();
        
        for (int value: b) { //for each loop. Can only start at index 0. Works for reiterating through entire array index 
            System.out.println(value + " ");
        }
        System.out.println();
    }
    
    */
    }
   // array method
    public static void printArray(int[] x) { //or public static int[] printArray(int[] x) to tell compiler that you can return a function in printArray
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
        }
        System.out.println();
    }
    
}
