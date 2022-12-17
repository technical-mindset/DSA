package DSA.Algorithms.Bitwise;

import java.util.*;


public class BitwiseOperator {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        oddEven(sc.nextInt());
        
        setBIT(1, 3); // 
        
        resetBIT(5, 22); // 22 = 10110 and the output becomes: 00110 = 6
   
        }
    
    
   
     // Q1.) Find the given number is Odd or Even ?
    
      public static void oddEven(int n){
        System.out.print("Enter a number to check \"Even\" or \"Odd\": ");
        
        // odd numbers have '1' in the last digit and even have '0'
        // so when you take AND between a number and '1' if it is even the it returns true
        // other wise returns false
        System.out.println((n & 1) == 0);
    }
   
    
    
    // Q2.) Set the i-th bit of n
      public static void setBIT(int i, int n){
        // taking '1' and apply left shift with i - 1;

        if (i > 0) {
            System.out.println(n & (1 << (i - 1)));
        }
        else {
            throw new RuntimeException("Left shift cant apply at: " + i + " position");
        }
    }
    
    
    
    // Q3.) Reset the i-th bit of n
    public static void resetBIT(int i, int n){
        // taking '1' and apply left shift with i - 1;

        if (i > 0) {
             // using ~ for 1's complement of a number
            System.out.println(n & ~(1 << (i - 1)));
        }
        else {
            throw new RuntimeException("Left shift cant apply at: " + i + " position");
        }
    }
        
        
   }
