package recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = {1, -2, 0, 11, 3, 7, 100};
        mergeSort(arr1, 0, arr1.length - 1);
        System.out.println("sorted = " + Arrays.toString(arr1));
    }

    private static void mergeSort(int[] arr1, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr1, start, mid);
            mergeSort(arr1, mid + 1, end);
            mergeSorted(arr1, start, mid, end);
        }
    }


    private static void mergeSorted(int[] arr1, int start, int mid, int end) {
        int firstSortedArrIndex = start;
        int secondSortedArrIndex = mid + 1;

        int[] temp = new int[arr1.length];
        int tempIndex = start;
        while (firstSortedArrIndex <= mid && secondSortedArrIndex <= end && tempIndex <= end) {
            if (arr1[firstSortedArrIndex] <= arr1[secondSortedArrIndex]) {
                temp[tempIndex] = arr1[firstSortedArrIndex];
                firstSortedArrIndex++;
            } else {
                temp[tempIndex] = arr1[secondSortedArrIndex];
                secondSortedArrIndex++;
            }
            tempIndex++;
        }

        while (firstSortedArrIndex <= mid && tempIndex <= end) {
            temp[tempIndex] = arr1[firstSortedArrIndex];
            firstSortedArrIndex++;
            tempIndex++;
        }

        while (secondSortedArrIndex <= end && tempIndex <= end) {
            temp[tempIndex] = arr1[secondSortedArrIndex];
            secondSortedArrIndex++;
            tempIndex++;
        }

        for (int i = start; i <= end; i++) {
            arr1[i] = temp[i];
        }
    }
}
