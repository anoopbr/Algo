//You are given a list of n-1 integers and these integers are in the range of 1 to n. 
//There are no duplicates in list. One of the integers is missing in the list. 
//Write an efficient code to find the missing integer.

 // 1) XOR all the array elements, let the result of XOR be X1.
 // 2) XOR all numbers from 1 to n, let XOR be X2.
 // 3) XOR of X1 and X2 gives the missing number.

class FindMissingNumber{
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,8,9,10};
		int n = a.length;
		System.out.println(getMissingNo(a,n));
	}

	static int getMissingNo(int[] a, int n){

		int x1 = a[0];
		int x2 = 1;

		for(int i=1;i<=n-1;i++){
			x1 = x1^a[i];
		}

		for(int i=2;i<=n+1;i++){
			x2 = x2^i;
		}

		return x1^x2;
	}
}