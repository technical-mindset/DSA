package DSA.Algorithms.Bitwise;

import java.util.*;


public class Main {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check \"Even\" or \"Odd\": ");
        
        // odd numbers have '1' in the last digit and even have '0'
        // so when you take AND between a number and '1' if it is even the it returns true
        // other wise returns false
        System.out.println((sc.nextInt() & 1) == 0);
   
   
        }
        
        
   }
