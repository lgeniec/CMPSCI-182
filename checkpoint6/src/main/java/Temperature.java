/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
public class Temperature {
    public static void main(String[] args) {
        System.out.println(temp(2.5));
    }
    public static double temp (double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }
}
