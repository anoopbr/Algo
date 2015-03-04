class GetAdjacentBinary{
	
	public static void main(String[] args){

		System.out.println(54);
		System.out.println(getNext(54));
		System.out.println(getPrev(54));

		System.out.println(100);
		System.out.println(getNext(100));
		System.out.println(getPrev(100));

		System.out.println(27);
		System.out.println(getNext(27));
		System.out.println(getPrev(27));

		System.out.println(240);
		System.out.println(getNext(240));
		System.out.println(getPrev(240));
	}

	static int getNext(int num){

		int c1 = 0;
		int c0 = 0;

		int c = num;
		int next = num;

		while(((c&1)==0) && (c!=0)){
			c0++;
			c>>=1;
		}

		while ((c&1)==1){
			c1++;
			c>>=1;
		}

		int p = c0 +c1;

		if(p==31|p==0){
			return(-1);
		}

		//System.out.println(num);

		next |= (1<<p); // flip rightmost non trailing zero
		//a = 1<<p  //all zeroes except one at position p
		//b = a-1  //all zeroes followed by p ones
		//b = ~b //all ones followed by p zeroes
		next &= ~((1<<p)-1); //clear all bits to right of p
		next |= (1<<(c1-1))-1; //insert (c1-1) ones to the right

		//System.out.println(next);
		//System.out.println(c0);
		//System.out.println(c1);

		return(next);
	}

	static int getPrev(int num){

		int c1 = 0;
		int c0 = 0;

		int c = num;
		int prev = num;

		while((c&1)==1){
			c1++;
			c>>=1;
		}

		if(c==0){
			return(-1);
		}

		while(((c&1)==0) && c!=0){
			c0++;
			c>>=1;
		}

		int p = c0 +c1;

		if(p==31|p==0){
			return(-1);
		}

		//System.out.println(num);

		prev &= ((~0)<<(p+1));

		int mask = ((1<<(c1+1))-1);
		mask <<= (c0-1);

		prev |= mask;

		//System.out.println(prev);
		//System.out.println(c0);
		//System.out.println(c1);

		return(prev);
		
	}
}