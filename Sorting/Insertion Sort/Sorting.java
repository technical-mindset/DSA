package DSA.Algorithms.Sorting;

public class Sorting {
   
    public static void InsertionSort(int[] arr) {
        int temp = -1;
        for (int i = 1; i < arr.length ; i++) {
            for (int j = 0; j < i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
