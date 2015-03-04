class setTime{
	public static void main(String[] args){

		setAngles(10,10);
		setAngles(12,0);
		setAngles(11,59);
		setAngles(6,0);
		setAngles(12,59);
	}

	static void setAngles(int h, int m){
		if(h<0 || h>12) return;
		if(m<0 || m>60) return;

		if(h==12) h=0;
		if(m==60) m=0;

		double min = m*6;

		double hr = 0.5*(60*h + m);

		System.out.println(hr + " "+min);

	}
}