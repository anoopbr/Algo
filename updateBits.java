import java.lang.Math;

class updateBits{
	
	public static void main(String[] args){

		System.out.println(updateBits(10000000,1011,2,4));

	}

	static int updateBits(int m, int n, int i, int j){
		
		// gives 11111
		int allOne = 1;
		System.out.println(allOne);

		// gives 11110000
		int leftMask = allOne << (j+1);
		System.out.println(leftMask);

		int rightMask = (allOne << i) - 1;
		System.out.println(rightMask);

		int mask = leftMask | rightMask;
		System.out.println(mask);

		int n_cleared = n & mask;
		System.out.println(n_cleared);

		int m_cleared = m << i;
		System.out.println(m_cleared);

		return n_cleared | m_cleared;

	}
}