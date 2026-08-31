/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
public class increment {

    public static void main(String[] args) {
        int x = 0;
        int[] y = new int[5];
        System.out.println("Before increment x is " + x + " and y[0] is " + y[0]);
        increment(x, y);
        System.out.println("After increment x is " + x + " and y[0] is " + y[0]); //x is still zero (Pass by value)

        int[] list1 = {1, 2, 3, 4, 5, 6};
        int[] list2 = reverse(list1);
    }

    public static void increment(int n, int[] m) {
        n++;
        System.out.println("Inside method, n is " + n);
        m[0] = 999;
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++ , j--) {
        result[j] = list[i];
        }
        return result;
    }

}
