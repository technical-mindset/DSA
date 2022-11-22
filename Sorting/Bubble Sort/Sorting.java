package DSA.Algorithms.Sorting;

public class Sorting {
    public static void BubbleSort(int[] arr){
        // 8,2,6,4,1,9,10,15
        int flag = 0;
        int temp = -1;
        while(flag < arr.length-1){
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag++;
        }
    }
}
