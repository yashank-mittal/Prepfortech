import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSort(arr, arr.length);
        System.out.println("arr = " + Arrays.toString(arr));
    }
  
    private static void selectionSort(int[] arr, int n) {
        for (int i = n-1; i >=0; i--) {
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if(arr[j] > arr[maxIndex]) maxIndex = j;
            }
            swap(arr, i, maxIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
