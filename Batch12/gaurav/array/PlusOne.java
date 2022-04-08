class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length - 1;

        while(n >= 0) {
            if(digits[n] == 9) {
                digits[n] = 0;
            } else {
                
                digits[n] = digits[n]+1;
                return digits;
            }
            n--;
        }

        int[] digits1 = new int[digits.length+1];
        for(int i=n; i>0; i--) {
            digits1[i+1] = digits[i]; 
        }

        digits1[0] = 1;
        digits1[1] = 0;
        return digits1;
    }
}
