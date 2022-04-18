public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 4,3,5,2,7};
        bubbleSort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }
  
    private static void bubbleSort(int[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if(arr[j-1] > arr[j]) swap(arr, j-1, j);
            }
        }
    }
  
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
