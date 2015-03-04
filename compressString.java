//Implement a method to perform basic string compression using the 
//counts of repeated characters. For example, the string aabcccccaaa 
//would become a2blc5a3. If the "compressed" string would not become 
//smaller than the original string, your method should return the original string.

public class compressString{
	public static void main(String[] args){
		System.out.println(compress("aabbccaaabdddeffffff"));
		System.out.println(compress("abcdefgh"));
		System.out.println(compress("aaaaaaaaaaaaaaaaa"));
		System.out.println(compress("a"));
	}

	static String compress(String str){
		int length =  str.length(), cnt = 1;
		char last = str.charAt(0);
		char[] charset = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<length; i++){
			if(last==charset[i]){
				cnt++;
			}else{
				sb.append(last);
				sb.append(cnt);
				last = charset[i];
				cnt = 1;
			}
		}
		sb.append(last);
		sb.append(cnt);
		if(length<sb.toString().length()){
			return str;
		}
		return sb.toString();

	}
}