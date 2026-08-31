/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class ScoreCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] scores = new int[5];
        int neg = 0;
        int pos = 0;
        double average = 0;
        int equalTo = 0;
        int count = 0; //to keep track of the actual number of scores entered
        
        
        System.out.println("Enter a score. If you want to end, write -1");
    
      //puts all scores into array
        for (int i = 0; i < scores.length; i++) {
            int score = input.nextInt();
            if (score == -1) {
                break;
            } else {
            scores[i] = score;
            count++;
            }
        }
        //calculate the sum of the entered scores
        int sum = 0;
        for (int j = 0; j < count; j++) { //how many scores are actually typed in is for the index for count
            sum += scores[j];
        }
        //calculate the average based on the number of scores entered
        if (count > 0) {
             average = (double)sum / count;
        }
       
        //compare scores to average
        for (int k = 0; k < count; k++) {
            
            if (scores[k] < average) {
                neg++;
            } else if (scores[k] > average) {
                pos++;
            } else {
                equalTo++;
            }
        }
        
        System.out.println("The scores came in and there are " + neg + " scores, " + pos + " pos scores, and " + equalTo + " scores equal to the average");
        System.out.println("The average score is: " + average);
    }
}
