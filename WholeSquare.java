//Find whole squares between A and B

import java.lang.Math;

public class WholeSquare{
	
	public static void main(String[] args){

		long startTime = System.currentTimeMillis();

		int count = printWholeSquares(-2147483648,2147483600);

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime);
		System.out.println(count);

	}

	public static int printWholeSquares(int A, int B){

		if(A<1)
			A=1;

		int last;
		int count = 0;

		for(int i=A; i<=B ; ++i){
			if(checkPerfectSquare(i)){
				System.out.println(i);
				count++;
			}

			last = (int)Math.abs(i)%10;
			if(last==1||last==6){
				i=i+2;
			}
		}

		return count;

	}

	public static boolean checkPerfectSquare(int A){

		long B = (long) Math.sqrt(A);
		B = Math.abs(B);
		return A == B * B;
	}
}