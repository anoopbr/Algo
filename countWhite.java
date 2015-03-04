public class countWhite{
	public static void main(String[] args){
		String result = replaceWhite("hello world");
		System.out.println(result);
	}
	public static String replaceWhite(String s){
		char[] str = s.toCharArray();
		int length = s.length(), newLength, wCnt = 0;
		for(int i=0; i<length-1; i++){
			if(str[i] == ' '){
				wCnt ++;
			}
		}
		newLength = length + (2*wCnt);
		char[] newstr = new char[newLength];
		for (int i=length-1; i>=0 ;i--){
			if(str[i]== ' '){
				newstr[newLength-1] = '0';
				newstr[newLength-2] = '2';
				newstr[newLength-3] = '%';
				newLength = newLength - 3;
			}else{
				newstr[newLength-1] = str[i];
				newLength = newLength - 1;
			}
		}

		return new String(newstr);
	}
}