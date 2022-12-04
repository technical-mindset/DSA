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
            }
            System.out.println();
        }
    }


    /* Pattern 7

        *
       ***
      *****
     *******
    *********

     */

    public static void pattern7(int n){
        // for total stars in each rows
        int totalStars = 1;
        
        // for how many rows
        for (int row = 0; row < n; row++) {
        
            // for how many spaces in each rows
            int totalSpaces = n - row;
            
            // Column spaces
            for (int colSpace = 0; colSpace < totalSpaces; colSpace++) {
                System.out.print(" ");
            }
            // Column starts
            for (int col = 0; col < totalStars; col++) {
                System.out.print("*");
            }
            totalStars=totalStars+2;
            System.out.println();
        }
    }




    /* Pattern 8

     *********
      *******
       *****
        ***
         *

     */

    public static void pattern8(int n){
        // for total stars in each rows
        int totalStars = (2*n)-1;

        // for how many rows
        for (int row = 0; row < n; row++) {

            // for how many spaces in each rows
            for (int colSpace = 0; colSpace < row; colSpace++) {
                System.out.print(" ");
            }
            // Column starts
            for (int col = 0; col < totalStars; col++) {
                System.out.print("*");
            }
            totalStars=totalStars-2;
            System.out.println();
        }
    }


    /* Pattern 9

         *
        * *
       * * *
      * * * *
     * * * * *

     */

    public static void pattern9(int n){
        // for how many rows
        for (int row = 0; row <= n; row++) {
            // for how many columns in each rows
            int totalSpaces = n - row;
            for (int col = 0; col <= n; col++) {
                if(totalSpaces > col){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }


    /* Pattern 10

     * * * * *
      * * * *
        * *
         *

     */

    public static void pattern10(int n){
        // for how many rows
        for (int row = 0; row <= n; row++) {

            // for how many spaces in each rows
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }

            // for how many stars in each rows
            for (int col = 0; col <= n-row; col++) {
                    System.out.print("* ");
            }

            System.out.println();
        }
    }



    /* Pattern 11

     *******
      *****
       ***
        *
        *
       ***
      *****
     *******

     */

    public static void pattern11(int n){
        int firstStars = (2*n)-1;
        int lastStars = 1;

        // for how many rows
        for (int row = 0; row < (2*n)-1; row++) {

            // for how many spaces in each rows
            int totalSpaces = (row < n ? row : (2*n-1) - row);
            
            for (int colSpace = 0; colSpace < totalSpaces; colSpace++) {
                System.out.print(" ");
            }

            // Column stars for first peramid
            for (int col = 0; col < firstStars; col++) {
                System.out.print("*");
            }
            firstStars = firstStars - 2;

            if (firstStars < -1) {

                // Column stars for last peramid
                for (int col = 0; col < lastStars; col++) {
                    System.out.print("*");
                }
                lastStars = lastStars +2;
            }
            System.out.println();
        }
    }



















