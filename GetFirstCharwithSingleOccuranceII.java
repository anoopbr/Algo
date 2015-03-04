import java.util.*;

class GetFirstCharwithSingleOccuranceII{
	
	public static void main(String[] args){

		System.out.println(getFirst(args[0]));

	}

	static char getFirst(String s){

		Hashtable<Character,Boolean> singles = new Hashtable<Character,Boolean>();
		Hashtable<Character,Boolean> repeated = new Hashtable<Character,Boolean>();

		char[] str = s.toCharArray();

		int len = s.length();

		for(int i=0; i<len; i++){
			if(singles.contains(str[i])){
				singles.remove(str[i]);
				repeated.put(str[i],true);

			}else{
				if(!repeated.contains(str[i])){
					singles.put(str[i],true);
				}
			}
		}
		while(singles.hasNext()){
			return singles.getKey();
		}

		return '\u0000';
	}
}