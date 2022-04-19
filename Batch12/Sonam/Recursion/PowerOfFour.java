package recursion;

public class PowerOfFour {

    public static boolean isPowerOfFour(int n) {
	    if(n==1 || n==4) return true;
	    if(n<=0) return false ;
	         return isPowerOfFour (n/4) && (n%4==0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PowerOfFour.isPowerOfFour(64));
		System.out.println(PowerOfFour.isPowerOfFour(1));
	}

}
