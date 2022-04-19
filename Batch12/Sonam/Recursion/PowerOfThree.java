package recursion;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n==1 || n==3) return true;
        if(n<=0) return false ;
        return isPowerOfThree (n/3) && (n%3==0);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PowerOfThree.isPowerOfThree(27));
		System.out.println(PowerOfThree.isPowerOfThree(1));
	}

}
