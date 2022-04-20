// find first and last occurrence of a element in unsorted array
// input : arr = [1, -2, 0, 11, 0, 1, 100], target = 1
// output : [0, 5]

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr1 = {1, -2, 0, 11, 0, 1, 100};
        int[] result = findFirstAndLast(arr1, 1, 0, arr1.length - 1);
        System.out.println("result = " + Arrays.toString(result));
    }

    private static int[] findFirstAndLast(int[] arr1, int target, int start, int end) {
        int first = findFirst(arr1, target, start, end);
        int last = findLast(arr1, target, start, end);
        return new int[]{first, last};
    }
    
    private static int findFirst(int[] arr1, int target, int start,  int end) {
        if(start > end) return -1;
        if(arr1[start] == target) return start;
        return findFirst(arr1, target, ++start, end);
    }

    private static int findLast(int[] arr1, int target, int start,  int end) {
        if(end < start) return -1;
        if(arr1[end] == target) return end;
        return findLast(arr1, target, start, --end);
    }
}
