package DSA.Algorithms.Bitwise;

import java.util.*;


public class Main {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [] {2,3,4,6,3,4,2,1,6};
        int unique = 0;
        
          for (int n: arr) {
              unique = unique ^ n;
          }
          
        System.out.println("Non repeated number:" + unique);
   
   
        }
        
        
   }
