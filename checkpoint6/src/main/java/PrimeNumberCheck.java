/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }
    
    public static boolean isPrime(int n1) {
        for (int i = 2; i < n1; i++) { //2 also works as 2 is not less than 2, so its true!
            if (n1 % i == 0) {
                return false;
            }
        }
        return true;
    }
}
