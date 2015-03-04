public class CheckGrayCode{
	
	public static void main(String[] args){

		int a = 5;
		int b = 3;

		int xor = a ^ b;

		int temp, count = 0;

		while (xor!=0){

			temp = xor & 0x01;
			if(temp!=0){
				count++;
			}
			xor = xor >>1;

		}

		if(count==1)
			System.out.println("True");
		else
			System.out.println("False");


	}
}