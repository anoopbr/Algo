import java.util.Arrays;
import java.lang.Math;

class FindLargestGap{

	public static void main(String[] args){
		int N = 8 ;
		int[] A = {10,0,8,2,-1,12,11,3};
		solution(A,N);
	}

	static int solution(int[] A, int N){
		int[] B = A;
		Arrays.sort(B);
		System.out.println(Arrays.toString(B));

		int gap = 0;
		int max_gap = 0;
		int result = 0;

		for(int i=0; i<N-2; i++){
			gap = Math.abs(B[i]-B[i+1]);
			if(gap>max_gap){
				max_gap = gap;
				System.out.println(max_gap);
				result = B[i] + Math.abs(gap/2);
				System.out.println(result);
			}
		}

		System.out.println(result);
		return result;
	}
}