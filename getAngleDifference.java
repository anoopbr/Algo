import java.lang.Math;

class getAngleDifference{
	
	public static void main(String[] args){
		System.out.println(getAngle("10:10"));
		System.out.println(getAngle("12:00"));
		System.out.println(getAngle("6:00"));
		System.out.println(getAngle("11:59"));
	}

	static double getAngle(String t){
		String[] time = t.split(":");

		int min = Integer.parseInt(time[1]);
		int hour = Integer.parseInt(time[0]);

		if(hour>12||hour<1||min>59||min<0)
			return -1;

		double m = 6*min;
		double h = 30*hour + 0.5*min;

		double dif = Math.abs(m-h);
		if(dif>180){
			dif = 360 - dif;
		}

		return dif;

	}
}