package DSA.Algorithms.Searching;

import java.util.Scanner;

public class BinarySearch {
    private static Scanner scanner = new Scanner(System.in);
    private static int input;
    private static boolean flag = false;

    public static void search(int[] arr){
        int high = (arr.length-1) , mid , low = 0;

        System.out.print("Enter value for search: ");
        input = scanner.nextInt();

        while(!flag) {
            mid = (low+high)/2;

            if (arr[mid] == input) {
                System.out.println("Element found at position: "+(mid+1));
                flag = true;
            }
            else if (arr[mid] < input) {
                low = mid;
            }
            else if (arr[mid] > input) {
                high = mid;
            }
            else {
                System.out.println("Does not exist");
            }

        }
    }
}
