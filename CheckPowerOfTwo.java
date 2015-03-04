//Fast algorithm to check if a positive number is a power of two

class CheckPowerOfTwo{
	
	public static void main(String[] args){

		System.out.println(checkPower(-1));
		System.out.println(checkPower(0));
		System.out.println(checkPower(1));
		System.out.println(checkPower(2));
		System.out.println(checkPower(3));
		System.out.println(checkPower(4));
		System.out.println(checkPower(5));
		System.out.println(checkPower(6));

	}

	static boolean checkPower(int n){

		return ((n>0) && ((n & (n-1))==0));
	}
}