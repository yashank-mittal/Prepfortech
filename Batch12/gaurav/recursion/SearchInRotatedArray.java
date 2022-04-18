class SearchRotatedArray {
    public boolean solution(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end ) {
            int mid = ( start + end ) / 2;
            if(nums[mid] == target) return true;
            if(nums[mid] > target) end=mid;
            if(nums[mid] < target) start=mid;
        }

        return false;
    }

    public static void main(String[] args) {
		int[] elements = new int[] {1,4,3,5,2};
		boolean result = new SearchRotatedArray().solution(elements, 3);
		System.out.println(result);
	}
}
