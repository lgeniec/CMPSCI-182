/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;


/**
 *
 * @author logangeniec
 */
public class SecondsToMinutes {

    public static void main(String[] args) {
        System.out.println("Enter time in seconds");
        Scanner input = new Scanner(System.in);
        
        int seconds = input.nextInt();
        int minutes = seconds/60;
        int remainingSec = seconds % 60;
        
        System.out.println("This converts to " + minutes + " minutes and" + remainingSec  + " seconds!");
        
        
        
               
    }
}
