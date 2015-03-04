class CountBitDifference{
	
	public static void main(String[] args){

		int a = 57;
		int b = 54;

		int c = a ^ b;

		int tmp, count = 0;

		while(c!=0){
			if((c&0x01)==1){
				count++;
			}
			c >>= 1;
		}

		System.out.println(count);
	}
}