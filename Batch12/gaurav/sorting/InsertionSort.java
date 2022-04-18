public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 4,3,5,2,7};
        insertionSort(arr, arr.length);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 1; j--) {
                if(arr[j] < arr[j-1])   {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
