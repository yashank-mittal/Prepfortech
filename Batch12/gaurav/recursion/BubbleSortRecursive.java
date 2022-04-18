public class BubbleSortRecursive {
    public static void main(String[] args) {
        int[] arr = {1,5,2,7,9,0,2};
        bubbleSortRecursive(arr, arr.length-1, 1);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

    private static void bubbleSortRecursive(int[] arr, int i, int j) {
        if( j <= i ) {
            System.out.print(" * ");
            if(arr[j-1] < arr[j]) swap(arr, j-1, j);
            bubbleSortRecursive(arr, i, ++j);
        } else {
            System.out.println();
            if(i >= 0) bubbleSortRecursive(arr, --i, 1);
        }
    }

    private static void swap(int[] arr, int c, int i) {
        int tmp = arr[c];
        arr[c] = arr[i];
        arr[i] = tmp;
    }
}
