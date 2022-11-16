package DSA.Algorithms;

import DSA.Algorithms.Sorting.Sorting;

public class Main {

    public static void main(String[] args) {
	// write your code here
      
     Fibonacci(7);
// Output should be: 0, 1, 1, 2, 3, 5, 8    


    }
    public static void Fibonacci(int n){
        int prevNum = 0;
        int temp = 0;
        int nextNum = 1;

        System.out.println(prevNum+"\n"+nextNum);
        for (int i = 1; i < n-1; i++) {
            if (n < 2 && n >= 0){
                System.out.println(n);
                break;
            }
            else {
                temp = nextNum;
                nextNum = prevNum + nextNum;
                prevNum = temp;
                System.out.println(nextNum);
            }
        }
    }

}
