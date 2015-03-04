/*
* Find the GCD of two numbers.
*/

public class GCD{
	
	public static void main(String[] args){
		System.out.println(gcd(15,3));
	}

	static int gcd(int a, int b){
		int r ;

		while(b!=0){
			r = a % b;
			a = b ;
			b = r;
		}

		return a;
	}
}