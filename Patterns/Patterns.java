package DSA.Algorithms.Patterns;

public class Patterns {

    /* Pattern 1
    
        *****
        *****
        *****
        
    */

    public static void pattern1(int n){
        // for how many rows
        for (int row = 0; row < n; row++) {
            // for how many columns
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /* Pattern 2
    
     *
     **
     ***
     ****

     */

    public static void pattern2(int n){
        // for how many rows
        for (int row = 0; row < n; row++) {
            // for how many columns in each rows
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    
    /* Pattern 3

     ****
     ***
     **
     *

     */

    public static void pattern3(int n){
        // for how many rows
        for (int row = 0; row < n; row++) {
            // for how many columns in each rows (total - row)
            for (int col = 0; col < (n-row); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    
    /* Pattern 4

     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *

     */

    public static void pattern4(int n){
        // for how many rows
        for (int row = 0; row < (2*n); row++) {
            // for how many columns in each rows (total - row)
            int totalColInRow = (row > n ? (2*n) - row : row);
            
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

}

/* Pattern 5

         *
        **
       ***
      ****
     *****

     */

    public static void pattern5(int n){
        // for how many rows
        for (int row = 0; row < n; row++) {
            // for how many columns in each rows
            int i = n - row;
            for (int col = 0; col <= n; col++) {
                if(i > col){
                   System.out.print(" ");
               }
               else {
                   System.out.print("*");
               }
            }

            System.out.println();
        }
    }


    /* Pattern 6

     *****
     ****
     **
     *

     */

    public static void pattern6(int n){
        // for how many rows
        for (int row = 0; row < n; row++) {
            // for how many columns in each rows
            int totalStars = n - row;
            for (int col = 0; col <= n; col++) {
                if(totalStars > col){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


