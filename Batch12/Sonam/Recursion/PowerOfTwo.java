package recursion;

public class PowerOfTwo {
    
    public static boolean isPowerOfTwo(int n) {
        if(n==1 || n==2) return true;
        if(n<=0) return false ;
        return isPowerOfTwo (n/2) && (n%2==0);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PowerOfTwo.isPowerOfTwo(14));
		System.out.println(PowerOfTwo.isPowerOfTwo(1));
	}
}
