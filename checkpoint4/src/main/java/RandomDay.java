/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
public class RandomDay {

    public static void main(String[] args) {
        int randomNum1 = (int) (Math.random() * 7);
        
        if (randomNum1 == 0) {
            System.out.println("Sunday");
        } else if (randomNum1 == 1) {
            System.out.println("Monday");
        } else if (randomNum1 == 2) {
            System.out.println("Tuesday");
        } else if (randomNum1 == 3) {
            System.out.println("Wednesday");
        } else if (randomNum1 == 4) {
            System.out.println("Thursday");
        } else if (randomNum1 == 5) {
            System.out.println("Friday");
        } else if (randomNum1 == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("This is not a day!");
        }
    }
}
