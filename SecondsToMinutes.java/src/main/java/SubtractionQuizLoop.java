/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class SubtractionQuizLoop {

    public static void main(String[] args) {

       
        int score = 0;
        for(int counter = 0; counter < 5; counter++) {
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * num1);

            Scanner input = new Scanner(System.in);
            System.out.println("What is " + num1 + " - " + num2 + "?");
            int answer = input.nextInt();
            if (answer == num1 - num2) {
                score++;
            }
            
        }
        System.out.println("Your score is " + score + "/5");
        
    }
}
