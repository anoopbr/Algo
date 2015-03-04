/*
* How do you shift a String given a String 
* For instance the following string abcdef and given an index 3, 
* how would you make this in to defabc. So basically the index at a 
* given point must be moved to the front and the rest of the string shifted to the right. 
*/

public class ShiftString{
	
	public static void main(String[] args){
		System.out.println(shift("anooop",3));
	}

	static String shift(String n, int x){
		int len = n.length();
		char[] str = n.toCharArray();
		for(int i=0;i<x;i++){
			for(int j=0;j<len-1;j++){
				char temp = str[j];
				str[j] = str[j+1];
				str[j+1] = temp;
			}
		}

		return new String(str);
	}
}