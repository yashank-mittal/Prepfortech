public class SortedUnsorted {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,5};
        int[] arr1 = {1,2,3,4,5};
        boolean sorted = sorted(arr, 0);
        System.out.println("sorted = " + sorted);
    }

    private static boolean sorted(int[] arr, int index) {
        if(index == arr.length - 1) return true;
        return (arr[index] < arr[index+1]) && sorted(arr,index+1);
    }
}
