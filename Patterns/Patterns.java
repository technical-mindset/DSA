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

}
