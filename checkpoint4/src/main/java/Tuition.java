/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
public class Tuition {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;
        
        while(tuition < 20000) {
            tuition *= 1.07;
            year++;
        }
        System.out.println("The tuition doubles in " + year + " years");
    }
}
