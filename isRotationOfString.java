//AssumeyouhaveamethodisSubstring whichchecksifonewordisasubstring ofanother.
//Giventwostrings,siands2,writecodetocheckIfs2isarotationofsi usingonlyonecalltoisSubstring 
//(e.g.,"waterbottLe"isarotationof"erbot- tLewat").

public class isRotationOfString{
	public static void main(String[] args){
		System.out.print(isRotation("water","erwat"));
		System.out.print(isRotation("anoop","poona"));
		System.out.print(isRotation("malayalam","malayalam"));
		System.out.print(isRotation("water","erat"));
	}
	static boolean isRotation(String s, String t){
		if(s.length()!=t.length()){
			return false;
		}
		String ss = s + s;
		return ss.contains(t);
	}
}