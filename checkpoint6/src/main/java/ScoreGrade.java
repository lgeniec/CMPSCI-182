/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */

//using void methods and calling them
public class ScoreGrade {
    public static void main(String[] args) {
        printGrade(95.5);
    }
    public static void printGrade(double s) {
        if (s >= 90) {
            System.out.println("A");
        } else if (s >= 80) {
            System.out.println("B");
        } else if (s >= 70) {
            System.out.println("C");
        } else if (s >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
