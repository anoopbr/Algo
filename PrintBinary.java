class PrintBinary{
	
	public static void main(String[] args){

		System.out.println(printBinary(0.7));

	}

	static String printBinary(double num){

		if( num>=1 | num<=0 )
			return "ERROR";

		StringBuilder bin = new StringBuilder();

		bin.append(".");

		while(num>0){

			if(bin.length()>=32){
				return "ERROR LENGTH";
			}

			double r = 2 * num;
			System.out.println(num);
			System.out.println(r);

			if(r>=1){
				bin.append("1");
				System.out.println(bin);
				num = r - 1;
				System.out.println(r);
			}else{
				bin.append("0");
				num = r;
				System.out.println(bin);
			}

		}

		return bin.toString();

	}
}