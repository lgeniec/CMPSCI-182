/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */


public class SquareTable {
    public static void main(String[] args) {
        int counter = 0;
        int num = 1;
        
        while(counter < 5) {
            int sqrt1 = (int)(Math.pow(num, 2));
            counter++;
            System.out.println(num + " \t " + sqrt1);
            num++;
        }
    }
}
