class sewArray{
	public static void main(String[] args){
		int[] a = {1,1,1,1,2,2,2,2};
		rearrange(a);
	}

	static void rearrange(int[] a){
	   int count=0,start=1,i=start,temp=a[start],N=a.length-1,inter;
	   boolean notBreak=true;
	   while(notBreak){
	      inter = temp;
	      temp = a[(2*i)%N];
	      a[(2*i)%N] = inter;

	      i=(2*i)%N;
	      count++;
	      if(start==i){
	         if(count==N-1)
	            notBreak=false;
	         start+=2;
	         temp=a[start];
	         i=start;
	      }
	   }

		for(int j=0;j<=N;j++)
			System.out.println(a[j]);
	}
}