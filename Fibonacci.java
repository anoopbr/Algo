//Fibonacci Series


public class Fibonacci {

	public static void main(String[] arg){
		long n = fib(20);
		System.out.println("Recurssion -> "+n);
		n = fibIteration(20);
		System.out.println("Iteration -> "+n);
		n = fibArray(20);
		System.out.println("Using Array -> "+n);
	}

	//Using recurssion
	//Time Complexity O(2^n)
	public static int fib(int n){
		if(n<2){
			return n;
		}else{
			return fib(n-1)+fib(n-2);
		}
	}



	//Using iteration
	public static int fibIteration(int n){
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i=0;i<n;i++){
			c = a;
			a = b;
			b = c + a;
		}
		return a;
	}

	//Using Array
	public static int fibArray(int n){
		long[] fib = new long[n];
		fib[0] = 0;
		fib[1] = 1;
		for(int i =2; i<n ; i++){
			fib[i] = fib[i-1]+fib[i-2];
		}
		return fib(n);
	}

}

