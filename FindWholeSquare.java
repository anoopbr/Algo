public class FindWholeSquare{
	static int solution(int A, int B){
		int count = 0;
		if(A<1)
			A=1;

		for(int i=A; i<=B;i++){
			if(checkSquare(i)){
				System.out.println(i);
				count++;
			}

			if(Math.abs(i%10)==6||Math.abs(i%10)==1){
				i = i + 2;
			}
		}

		System.out.println(count);
		return count;
	}

	static boolean checkSquare(int i){
		long root = (long) Math.sqrt(i);
		root = Math.abs(root);
		return i == root * root;
	}

	public static void main(String[] args){
		solution(-5,50);
	}
}