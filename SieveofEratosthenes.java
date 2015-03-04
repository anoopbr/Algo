class SieveofEratosthenes{

	public static void main(String args[]){

	System.out.println("100 ->"+getNumberOfPrimes(100));
	System.out.println("1000 ->"+getNumberOfPrimes(1000));
			
	}
    static int getNumberOfPrimes(int upperBound) {
  
	    int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
	    boolean[] isComposite = new boolean[upperBound + 1];
	    int count = 0;
	    for (int m = 2; m <= upperBoundSquareRoot; m++) {
	        if (!isComposite[m]) {
	            count++;
	            System.out.print(m + " ");
	            for (int k = m * m; k <= upperBound; k += m)
	                isComposite[k] = true;
	        }
	    }
	    
	    for (int m = upperBoundSquareRoot; m <= upperBound; m++)
	        if (!isComposite[m]){
	            count++;
	            System.out.print(m + " ");
	        
	    }
    return count;
    }
}