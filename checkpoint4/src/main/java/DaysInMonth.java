/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("Enter the month and year number");
        int year = input.nextInt();
        String month = "";
        */
        System.out.println("Enter the month number");
        int month = input.nextInt();
        month--;
        System.out.println("Enter the year number");
        int year = input.nextInt();
        
        switch (month % 12) {
            case 0: 
               // month = "January";
                System.out.println("January " + year + " has 31 days");
                break;
            case 1:
              //  month = "February";
                if (year % 4 == 0 && year % 100 == 0) {
                    System.out.println("February " + year + " has 28 days");
                } else {
                    System.out.println("February " + year + " has 29 days");
                }
                break;
            case 2: 
              //  month = "March";
                System.out.println("March " + year + " has 31 days");
                break;
            case 3: 
             //   month = "April";
                System.out.println("April " + year + " has 30 days");
                break;
            case 4: 
            //    month = "May";
                System.out.println("May " + year + " has 31 days");
                break;
            case 5:
              //  month = "June";
                System.out.println("June " + year + " has 30 days");
                break;
            case 6: 
             //   month = "July";
                System.out.println("July " + year + " has 31 days");
                break;
            case 7: 
              //  month = "August";
                System.out.println("August " + year + " has 31 days");
                break;
            case 8: 
             //   month = "September";
                System.out.println("September " + year + " has 30 days");
                break;
            case 9: 
           //     month = "October";
                System.out.println("October " + year + " has 31 days");
                break;
            case 10: 
              //  month = "November";
                System.out.println("November " + year + " has 30 days");
                break;
            case 11:
             //   month = "December";
                System.out.println("December " + year + " has 31 days");
                break;
            default:
                System.out.println("This is not a year or month number!");
                break;
        }
    }
}
