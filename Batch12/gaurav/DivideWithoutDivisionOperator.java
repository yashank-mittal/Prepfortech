class Solution{        

    public int divide(int dividend, int divisor) {
        int counter = 0;
        int sign = 1;

        if( dividend < 0 ) {
            sign = -1;
        }
        
        if(divisor < 0 ) {
            sign = sign * -1;
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        System.out.println(Math.abs(-2147483648));
        System.out.println(sign);
        
        if(divisor == 1) return dividend * sign;
        
        while (dividend >=divisor ) {
         dividend = dividend - divisor;
         counter++;
        }
        
        return counter * sign;
    }
}
