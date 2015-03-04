//Given a string, find the length of the longest substring without repeating characters. 
//For example, the longest substring without repeating letters for “abcabcbb” is “abc”, 
//which the length is 3. For “bbbbb” the longest substring is “b”, with the length of 1.

import java.lang.Math;

class LengthofLongestSubstring{
	public static void main(String[] args){

		System.out.println(lnegthofLongestSubstring("abcadedacde"));
		System.out.println(lnegthofLongestSubstring("bbbbbbb"));
		System.out.println(lnegthofLongestSubstring("adadadad"));

	}

	static int lnegthofLongestSubstring(String s){
		int n = s.length();
		int i=0,j=0;
		int maxLen = 0;
		boolean[] check = new boolean[256];

		while(i<n){
			if(check[s.charAt(i)]){
				maxLen = Math.max(maxLen,i-j);
				while(s.charAt(i)!=s.charAt(j)){
					check[s.charAt(j)]=false;
					j++;
				}
				i++;
				j++;
			}else{
				check[s.charAt(i)]=true;
				i++;
			}
		}

		return maxLen;

	}
}