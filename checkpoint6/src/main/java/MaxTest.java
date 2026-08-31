/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author logangeniec
 */
public class MaxTest {

    static int n = 0; //n value going to shared in every method within class (global variable)
    
    
    public static void main(String[] args) {
        int k = max(2, 3);
        System.out.println(k);
        System.out.println(SumOfInts.sum(10, 45));
        System.out.println(max(200, 300, 400));
        System.out.println(n);
        n++;
        System.out.println(SumOfInts.sum(10, 45)); //calling sum method from SumOfInts
    }
    public static int max(int n1, int n2) {
        System.out.println(n);
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
    public static double max(double n1, double n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    
    
    public static double max(double n1, double n2, double n3) {
        return max(max(n1, n2), n3);
    }
}
        
        /* 
        or do: 
        int result;
        if (n1 > n2) {
            result = n1;
        } else {
            result = n1;
        }
        return result;
        
    }
}*/