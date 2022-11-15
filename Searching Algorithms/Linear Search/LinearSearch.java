package DSA.Algorithms.Searching;

import java.util.Scanner;

public class LinearSearch {
    private static Scanner scanner = new Scanner(System.in);
    private static int input;
    private static boolean flag = false;

    public static void search(int[] arr){
        System.out.print("Enter value for search: ");
        input = scanner.nextInt();

        for (int i = 0; i < arr.length-1 ; i++) {

            if (input == arr[i]) {
                System.out.println("Element found at position: "+(i+1));
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Not exist");
        }
    }
}
