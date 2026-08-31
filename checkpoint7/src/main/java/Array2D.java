/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; //array sizes cannot be shortened or lengthened
        System.out.println(arr.length); //length of the rows (horizontal)
        System.out.println(arr[0].length); //length of the columns //zero for zero column (vertical)
      //  arr[0][0] = 11;
      //  arr[0][1] = 12;
        
        int[][] b = {{11, 12, 13}, 
                     {14, 15, 16}};
        
        Scanner input = new Scanner(System.in);
        for (int r = 0; r < arr.length; r++) { //counting rows
            for (int c = 0; c < arr[0].length; c++) { //counting columns
                arr[r][c] = input.nextInt(); //user input for rows and columns
                //arr[r][c] = (int)(Math.random() * 100);
                
                
            }
        }
        //Print 2D array
      /*  for (int r = 0; r < arr.length; r++) { //can reuse r and c 
            for (int c = 0; c < arr[0].length; c++) { 
                System.out.print(arr[r][c] + " "); 
                
            }
            System.out.println(); //make new line to make new readable "column"
        }
*/
         print2DArray(arr); //giving arr to print2DArray to print
        
           //find sum of all elements in 2D array
         int total = 0;
         for (int r = 0; r < arr.length; r++) { //counting rows
            for (int c = 0; c < arr[0].length; c++) { //counting columns
                total = total + arr[r][c];
            }
        }
         System.out.println("The total is " + total);
    }
    
    public static void print2DArray(int[][] x) { //x is the new "arr". Example of pass by reference value
        for (int r = 0; r < x.length; r++) { //can reuse r and c 
            for (int c = 0; c < x[0].length; c++) { 
                System.out.print(x[r][c] + " "); 
                
            }
            System.out.println(); //make new line to make new readable "column"
        }
    }
}
