/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rand1 = (int) (Math.random() * 101);
        System.out.println("Guess a number between 0 and 100 or enter -1 to quit");
        int guess = input.nextInt();
        int attempts = 1;
        int low = 0;
        int high = 0;

        while (guess != rand1) {
            if (guess == -1) {
                System.out.println("You quit!");
                break;
            }
            if (guess < rand1) {
                System.out.println("Too low, guess higher");
                low++;
            } else {
                System.out.println("Too high, guess lower");
                high++;
            }
            attempts++;
            guess = input.nextInt();

        }
        if (guess == -1) {
            System.out.println("You quit!");
        } else {
            System.out.println("Low guesses: " + low);
            System.out.println("High guesses: " + high);
            System.out.println("You got in " + attempts + " attempts");
        }

    }
}
