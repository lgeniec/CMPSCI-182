/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
public class LinearSearch { //very inefficient, goes one by one

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 67, 45, 33};
        System.out.println(search(a, 33));
    }

    public static int search(int[] list, int item) { //int item is the key value your looking for in the array
        for (int i = 0; i < list.length; i++) {
            if(list[i] == item) {
                //found the key value
                return i;
            }
            
        }
        //not found the key value
        return -1;
    }
}
