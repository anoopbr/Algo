//program to reverse a String

public class ReverseString{
	
	public static void main(String[] args){

		String str =  "hello world anoop";
		str = reverse(str);
		System.out.println(str);

	}

	public static String reverse(String str){
		int len = str.length()-1;
		StringBuffer newString = new StringBuffer();
		for(int i=len; i>=0; i--){
			newString.append(str.charAt(i));
		}

		return newString.toString();

	}
}