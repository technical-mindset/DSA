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




    /* Pattern 12

         *
        * *
       *   *
      *     *
     *       *
    ***********

     */

    public static void pattern12(int n){
        // for stars and between spaces
        int totalStars = 0;

        for (int row = 0; row < n; row++) {

            // for space before stars
            for (int spaces = 0; spaces < (n-row); spaces++) {
                System.out.print(" ");
            }
            // for stars and spaces between the stars in each row at particular column
            for (int col = 0; col <= totalStars; col++) {

                // col == 0 || col == totalStars for all the stars with spaces and row == n-1 for last line of stars
                if (col == 0 || col == totalStars || row == n-1){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            totalStars = totalStars +2;
            System.out.println();

        }
    }



    /* Pattern 13

     *
     ***********
      *       *
       *     *
        *   *
         * *
          *
     */

    public static void pattern13(int n){
        // for stars and between spaces
        int totalStars = (2*n)-2;

        for (int row = 0; row < n; row++) {

            // for space before stars
            for (int spaces = 0; spaces < (row); spaces++) {
                System.out.print(" ");
            }
            // for stars and spaces between the stars in each row at particular column
            for (int col = 0; col <= totalStars; col++) {

                // col == 0 || col == totalStars for all the stars with spaces and row == n-1 for last line of stars
                if (col == 0 || col == totalStars || row == 0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            totalStars = totalStars - 2;
            System.out.println();

        }
    }



    /* Pattern 14

         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *

     */

    public static void pattern14(int n){
        int totalCol = 0;

        // for how many rows
        for (int row = 0; row < ( n % 2 == 0 ? n+1 : n); row++) {

            // for total spaces from corner to before the star's
            int totalSpaces = (n/2 >= row ? (n/2)-row  : row-(n/2));
            // print spaces in each row
            for (int spaces = 0; spaces < totalSpaces ; spaces++) {
                System.out.print(" ");
            }
              // for how many columns in each row  ( loop run in odd positions)
            for (int col = 0; col <= totalCol ; col++){
                //  print star when loop starts and in the last iteration
                if (col == 0 || col == totalCol) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
                // increasing in top to mid and decreasing mid to bottom
                totalCol = (n/2 > row ? totalCol +2 : totalCol - 2);
                System.out.println();

        }
    }


    /* Pattern 15

       ****
       *  *
       *  *
       *  *
       ****

     */

    public static void pattern15(int n){
        // if 'n' is even then forRow set to 'n' otherwise set to 'n-1'
       int forRow = (n % 2 == 0 ? n : n-1);
        for (int rows = 0; rows <= n; rows++) {

            for (int col = 0; col < n; col++) {
                
                    // forRow is for last line of stars
                    if (rows == 0 || rows == forRow || col == 0 || col == n-1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
    }


    /* Pattern 16

          *****
         *   *
        *   *
       *   *
      *****

     */

    public static void pattern16(int n){
        // if 'n' is even then forRow set to 'n' otherwise set to 'n-1'
        int forRow = (n % 2 == 0 ? n : n-1);
        for (int rows = 0; rows <= n; rows++) {

            // for spaces starting from corner
            for (int space = 0; space < n-rows; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col < n; col++) {

                // forRow is for last line of stars
                if (rows == 0 || rows == forRow || col == 0 || col == n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }




    /* Pattern 17

         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

     */

    public static void pattern17(int n){
        int totalCol = 0;

        // for how many rows
        for (int row = 0; row < ( n % 2 == 0 ? n+1 : n); row++) {

            // for total spaces from corner to before the star's
            int totalSpaces = (n/2 >= row ? (n/2)-row  : row-(n/2));
            // print spaces in each row
            for (int spaces = 0; spaces < totalSpaces ; spaces++) {
                System.out.print(" ");
            }
            // for how many columns in each row  
            for (int col = 0; col <= totalCol ; col++){
                  System.out.print("* ");

            }
            // increasing in top to mid and decreasing mid to bottom
            totalCol = (n/2 > row ? totalCol + 1 : totalCol - 1);
            System.out.println();

        }
    }


    /* Pattern 18

     *********
     **** ****
     ***   ***
     **     **
     *       *
     **     **
     ***   ***
     **** ****
     *********



     */

    public static void pattern18(int n){
        // for how many row (for even number have n+1 rows and odd have n )
       int forRow = (n % 2 == 0 ? n+1 : n);
       
       // space split into 2 parts right and left respectively which contains n/2
       int rightColSpace = (n/2);
       int leftColSpace = (n/2);

        for (int rows = 0; rows <= forRow; rows++) {
              
            // there are n columns in each row
            for (int col = 0; col < n; col++) {
                
                if (rows == 0 || rows == forRow){
                    System.out.print('*');
                   }
                // define range to put spaces from leftColSpace value to rightColSpace value
                else if(col >= leftColSpace && col <= rightColSpace){
                    System.out.print(' ');
                }
                else {
                    System.out.print('*');
                }
            }
            // for calculate the position for space it starts from row+1 to row-1
            // ( nested condition for deciding the whether it would be inc. or dec. in both spaces)
            rightColSpace = (rows > 1 ? (rows >= n/2+1 ? rightColSpace-1 : rightColSpace+1) : rightColSpace);
            leftColSpace = (rows > 1 ? (rows >= n/2+1 ? leftColSpace+1 : leftColSpace-1) : leftColSpace);
            
            System.out.println();
        }
    }

    /* Pattern 19

       *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *

     */

    public static void pattern19(int n){
        // for how many row (for even number have n rows and odd have n-1 )
        int forRow = (n % 2 == 0 ? n : n-1);

        // space split into 2 parts right and left respectively
        // from 'n' to n/2
        int rightColSpace = n;

        // from 1 to n/2
        int leftColSpace = 1;

        for (int rows = 0; rows <= forRow; rows++) {
            for (int col = 0; col <= n; col++) {

                // from left column space to right column space
                if (col >= leftColSpace && col < rightColSpace) {
                    System.out.print(' ');
                }
                else {
                    System.out.print('*');
                }
            }

            // for calculating the position for space (after row == n/2 left space dec. and right space inc.)
            leftColSpace = (rows < (n/2) ? leftColSpace + 1 : leftColSpace - 1);
            rightColSpace = (rows < (n/2) ? rightColSpace - 1 : rightColSpace + 1);
            System.out.println();
        }
    }

    /* Pattern 20

       *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *

    ---- INCOMPLETE -----

    


   /* Pattern 21

           *      *
         *   *  *   *
       *      *      *

       ---- INCOMPLETE -----

     */



    /* Pattern 22

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

     */

    public static void pattern22(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(col+1+" ");
            }
            System.out.println();
        }
    }


















