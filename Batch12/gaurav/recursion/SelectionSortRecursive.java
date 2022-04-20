public class SelectionSortRecursive {
    public static void main(String[] args) {
        int[] arr = {9,5,1,2,8,0,3};
        selectionSortRecursive(arr, arr.length-1, 0, 0);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

    private static void selectionSortRecursive(int[] arr, int i, int j, int max) {
        if( j <= i ) {
            if(arr[j] > arr[max]) {
                max = j;
            }
            selectionSortRecursive(arr, i, ++j, max);
        } else {
            swap(arr, max, i);
            if(i > 0) selectionSortRecursive(arr, --i, 0, 0);
        }
    }

    private static void swap(int[] arr, int max, int i) {
        int temp = arr[max];
        arr[max] = arr[i];
        arr[i] = temp;
    }
}
