import java.util.List;
import java.util.ArrayList;

class GetFirstCharwithSingleOccurance{
	
	public static void main(String[] args){

		System.out.println(getFirst(args[0]));

	}

	static String getFirst(String s){

		String x;

		int len = s.length();

		ArrayList<String> singles = new ArrayList<String>();
		ArrayList<String> repeated = new ArrayList<String>();

		for(int i=0; i<len; i++){
			x = String.valueOf(s.charAt(i));
			if(singles.contains(x)){
				if(!repeated.contains(x)){
					repeated.add(x);
				}
				singles.remove(x);
			}else{
				if(!repeated.contains(x)){
					singles.add(x);
				}
			}
		}

		if(singles.size()==0){
			return null;
		}

		return singles.get(0);

	}
}