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


    /* Pattern 23

             1
           1   2   
         1   2   3   
       1   2   3   4   
     1   2   3   4   5   
       
     */

    public static void pattern23(int n){
        // total columns spaces before the numbers
        int colSpaces = (2*n)-2;
        for (int row = 0; row < n; row++) {
            
            for (int space = 0; space < colSpaces ; space++) {
                System.out.print(' ');
            }
            
            for (int col = 0; col <= row; col++) {
                System.out.print((col+1));
            
                // column spaces after numbers
                for (int colSpace = 0; colSpace < 3; colSpace++) {
                    
                    if (row != 0) {
                        System.out.print(" ");
                    }
                }
            }
            
            colSpaces = colSpaces - 2;
            System.out.println();
        }
    }




    /* Pattern 24

         1
        212
       32123
      4321234
       32123
        212
         1

     */

    public static void pattern24(int n){
        // total columns spaces before the numbers
        int colSpaces = n/2;
        
        // total numbers print in each columnsR 
        int totalCol = 1;
        
        int printNum = 1;
        for (int row = 0; row < (n%2 == 0 ? n+1 :n); row++) {

            for (int space = 0; space < colSpaces ; space++) {
                System.out.print(' ');
            }

            for (int col = 0; col < totalCol; col++) {
                System.out.print(printNum);
                
                // inc. and dec. in each column
                printNum = (totalCol / 2 <= col ? printNum + 1 : printNum - 1);
            }

             // col spaces inc. & dec. by 1 while totalCol start with 1 so
            // it inc. & dec. by 2 for keep the elements in each row will be odd sequence
            colSpaces = (row < n/2 ? colSpaces - 1 : colSpaces + 1);
            totalCol = (row < n/2 ? totalCol + 2 : totalCol - 2);
            
            // after row > n/2 dec. in number in each row 
            printNum = (row >= n/2 ? printNum - 2: printNum);
            
            System.out.println();
        }
    }




    /* Pattern 25

            1 
          2 1 2
        3 2 1 2 3 
      4 3 2 1 2 3 4 
        3 2 1 2 3
          2 1 2 
            1

     */

    public static void pattern25(int n){
        // total columns spaces before the numbers
        // starts with 'n' because numbers have spaces between them
        int colSpaces = n;
        
        // total numbers print in each columnsR 
        int totalCol = 1;

        int printNum = 1;
        for (int row = 0; row < (n%2 == 0 ? n+1 :n); row++) {

            for (int space = 0; space < colSpaces ; space++) {
                System.out.print(' ');
            }

            for (int col = 0; col < totalCol; col++) {
                System.out.print(printNum + " ");
                
                // inc. and dec. in each column
                printNum = (totalCol / 2 <= col ? printNum + 1 : printNum - 1);
            }

             // col spaces inc. & dec. by 2 while totalCol start with 1 so
            // it inc. & dec. by 2 for keep the elements in each row will be odd sequence
            colSpaces = (row < (n/2) ? colSpaces - 2 : colSpaces + 2);
            totalCol = (row < n/2 ? totalCol + 2 : totalCol - 2);
            
            // after row > n/2 dec. in number in each row 
            printNum = (row >= n/2 ? printNum - 2: printNum);
            
            System.out.println();
        }
    }


    /* Pattern 26

     1
     0 1
     1 0 1
     0 1 0 1
     1 0 1 0 1
     0 1 0 1 0 1
     1 0 1 0 1 0 1
     0 1 0 1 0 1 0 1


     */

    public static void pattern26(int n){
        // for how many rows
        int biNum = 1;
        for (int row = 0; row < n; row++) {
            // for how many columns in each rows
            for (int col = 0; col <= row ; col++) {

                System.out.print(biNum + " ");

                // for changing the value
                biNum = (biNum == 1 ? 0 : 1);

            }
            // in each odd row start with '1' and even rows start with '0'
            // every odd row (row starts with '0' to 'n-1')
            biNum = (row % 2 != 0 ? 1 : 0);
            System.out.println();
        }
    }


    /* Pattern 27

      1 2 3 4  20 19 18 17
        5 6 7  16 15 14
          8 9  13 12
            10 11

     */

    public static void pattern27(int n){
        int totalSpace, totalELem, numStart, numEnd, print;
        totalSpace = 0; totalELem = (n*2); numStart = 1; numEnd = n*5;
        
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < totalSpace ; space++) {
                System.out.print(' ');
            }
            for (int col = 0; col < totalELem; col++) { 
                print = (col < totalELem/2 ? numStart : numEnd);
                System.out.print(print + " ");
                
                if (col < totalELem/2 ) {
                       numStart++;
                }
                else {
                    numEnd--;
                }
                
                if (row != n-1 && totalELem / 2 == col + 1) {
                    System.out.print(' ');
                }
            }
            
            totalELem = totalELem - 2;
            totalSpace = totalSpace +2;
            
            System.out.println();
        }
    }



    /* Pattern 28

       *      *
       **    **
       ***  ***
       ********

     */

    public static void pattern28(int n){
        int startNum, endNum, startSpace, endSpace;
        startNum = 0; startSpace = 0; endSpace = (n * 2) - 1; endNum = n*2 - 1;

        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= (n * 2) ; col++) {

                if (col > startSpace && col <= endSpace){
                    System.out.print(' ');

                }
                else {
                    startNum++;
//                   int s = (col <= startSpace ? startNum : (col >= startSpace ? endNum - 1: endNum));
                   System.out.print("*");


                }

            }

//            startNum = 0;
//            endNum = row+1;
            startSpace = startSpace + 1;
            endSpace = endSpace - 1;
            System.out.println();

        }
    }



    /* Pattern 29

         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4

     */

    public static void pattern29(int n){
        int totalN = (n <= 4 ? n : n * 2);

        for (int row = 0; row <= totalN; row++) {
            for (int col = 0; col <= totalN; col++) {
                
                // for finding the number at particular position
                int printNum = ( 
                        n <= 4 ?
                        Math.max(Math.max(row, col), Math.max(totalN-row, totalN-col)) - 1:
                        Math.max(Math.max(row, col), Math.max(totalN-row, totalN-col)) - n);

                System.out.print(printNum + " ");
            }
            
            System.out.println();
        }
    }


    /* Pattern 29

       1             1
       1 2         2 1 
       1 2 3     3 2 1
       1 2 3 4 4 3 2 1

     */

    public static void pattern29(int n){
        int startSpace, endSpace, totalNum = n * 2 - 1;
        startSpace = 0; endSpace = (n * 2) - 1;

        for (int row = 0; row <= n - 1; row++) {
            for (int col = 0; col < (n * 2) ; col++) {

                if (col > startSpace && col < endSpace){
                    System.out.print(' ');

                }
                else { 
                    // find the min number for particular position
                    // from right=(totalNum-col), left=col, top=row, bottom=(totalNum-row) and then add 1
                  int printNum = (Math.min(Math.min(row, col), Math.min(totalNum - row, totalNum - col)) + 1);
                   System.out.print(printNum);


                }

            }
            
            // space variables for right and left space
            startSpace = startSpace + 1;
            endSpace = endSpace - 1;
            
            System.out.println();

        }
    }




    /* Pattern 30

       E
       D E
       C D E
       B C D E
       A B C D E


     */

    public static void pattern30(int n){
        char [] letterArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G' ,'H', 'I', 'J', 'K', 'L' ,'M',
                           'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {
                System.out.print(letterArr[(n - 1) - col] + " ");
            }
            System.out.println();
        }
    }




    /* Pattern 31

       E
       D E
       C D E
       B C D E
       A B C D E


     */

    public static void pattern31(int n){
        char [] letterArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G' ,'H', 'I', 'J', 'K', 'L' ,'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int letterNum = n;
        
        for (int row = 0; row < n; row++) {
        
         int temp = letterNum - 1;
        
            for (int col = 0; col <= row; col++) {
                System.out.print(letterArr[temp++] + " ");
            }
            
            letterNum--;
            System.out.println();
        }
    }



    /* Pattern 32

       a
       B c
       D e F
       g H i J
       k L m N o


     */

    public static void pattern32(int n){
        char [] letterArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G' ,'H', 'I', 'J', 'K', 'L' ,'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        
        char letterNum = letterArr[0];
        int index = 0;

        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {
                
                // for converting every next character upper or lower
                letterNum = (Character.isUpperCase(letterNum) ?
                        Character.toLowerCase(letterArr[index++]) :
                        Character.toUpperCase(letterArr[index++]));

                System.out.print(letterNum + " ");
            }
            System.out.println();
        }
    }




