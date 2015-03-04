//Code to check if the String is unique.
//Checks for character set in ASCII format

public class IsStringUnique{
	
	public static void main(String[] args){
		String str = "adfrssvgth";
		boolean result = isUnique(str);
		System.out.println(result);
	}

	public static boolean isUnique(String word){
		int len = word.length();
		if(len>256){
			return false;
		}
		boolean[] charset =  new boolean[256];
		for(int i = 0; i <len ; i++){
			int val = word.charAt(i);
			if(charset[val]){
				return false;
			}else{
				charset[val]=true;
			}
		}
		return true;
	}
}