//Check String Permutaion

import java.util.Arrays;

public class IsAnagram{
	
	public static void main(String[] args){

		String s1 = "anooplnlnlnlnlnl";
		String s2 = "poonajhvjkbkbkbkl";
		System.out.println("s1 -> "+s1);
		System.out.println("s2 -> "+s2);
		System.out.println(checkCharCounts(s1,s2));

	}

	public static boolean checkCharCounts(String s1, String s2){
		if(s1.length()!=s2.length()){
			return false;
		}

		int[] charset = new int[256];
		
		char[] s1_array = s1.toCharArray();

		for(char s : s1_array){
			charset[s]++;
		}

		for(int i=0;i<s2.length();i++){
			int c = (int) s2.charAt(i);
			if(--charset[c]<0){
				return false;
			}
		}
		return true;
	}
}