// find first and last occurrence of a element in unsorted array
// input : arr = [1, -2, 0, 11, 0, 1, 100], target = 1
// output : [0, 5]

package recursion;

import java.util.Arrays;

public class FirstAndLastOccurrenceRecursive {
    public static void main(String[] args) {
        int[] arr1 = {1, -2, 0, 11, 0, 1, 100};
        int[] result = findFirstAndLast(arr1, 1);
        System.out.println("result = " + Arrays.toString(result));
    }

    private static int[] findFirstAndLast(int[] arr1, int target) {
        return new int[]{
                findFirst(arr1, target, 0),
                findLast(arr1, target, arr1.length - 1)
        };
    }

    private static int findFirst(int[] arr1, int target, int start) {
        if (start > arr1.length - 1) return -1;
        if (arr1[start] == target) return start;
        return findFirst(arr1, target, ++start);
    }

    private static int findLast(int[] arr1, int target, int end) {
        if (end < 0) return -1;
        if (arr1[end] == target) return end;
        return findLast(arr1, target, --end);
    }
}

