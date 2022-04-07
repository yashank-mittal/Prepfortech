class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes){
        int k = minutes;
        int maxCust = Integer.MIN_VALUE;
        int currentCust = 0;
        int n=customers.length;

        for(int i=0; i<=n-k; i++) {
            for(int j=0; j<n; j++) {
                if(grumpy[j] == 0) {
                    currentCust += customers[j];
                }
            }
            
            for(int j=i; j<i+k; j++) { // slide the window
                System.out.println(j);
                if(grumpy[j] == 1) {
                    currentCust += customers[j];
                }
            }

            maxCust = Math.max(maxCust, currentCust);
            currentCust=0;
        }

        return maxCust;
    }
}
