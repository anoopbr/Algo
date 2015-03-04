//Write a function int solution(int A[], int N) that returns largest possbible gap size

import java.util.Arrays;

class GetLargestGap{
		
	public static void main(String[] arg){

		
		int N = 8 ;
		int[] A = {10,0,8,2,-1,12,11,3};

		System.out.println(solution(A,N));

	}

	static int solution(int[] A, int N){

		//Sort Array
		int[] B = A;
		Arrays.sort(B);
		System.out.println(Arrays.toString(B));
		// int smallest = B[0];
		// System.out.println(smallest);
		// int largest = B[N-1];
		// System.out.println(largest);

		int max_gap = 0;
		int gap = 0;
		int result = 0;

		for(int i=0;i<=N-2;i++){
			// for(int j=B[i];j<=B[i+1];j++){
			// 	int min = Math.min(j-B[i],B[i+1]-j);
			// 	System.out.println("min "+min);
			// 	System.out.println("j "+j);
			// 	if(min>gap){
			// 		gap = min;
			// 	}
			// }
			gap = Math.abs(B[i]-B[i+1]);
			if(gap>max_gap){
				// System.out.println("----");
				// System.out.println(B[i]);
				// System.out.println(B[i+1]);
				System.out.println(Math.abs(gap/2));
				int Y = Math.min(B[i],B[i+1])+Math.abs(gap/2);
				// System.out.println(Y);
				// System.out.println("----");
				max_gap = gap;
				result = Math.abs(gap/2);
			}
				
		}

		return result;

	}
}