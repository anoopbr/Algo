//Determine whether an integer is a palindrome. Do this without extra space.

class IsNumberPalindrome{
	public static void main(String[] args){

		System.out.println("5345345"+isPalindrome(5345345));
		System.out.println("1234"+ isPalindrome(1234));
		System.out.println("1234321"+isPalindrome(1234321));
		System.out.println("12344321"+isPalindrome(12344321));
		System.out.println("11111"+isPalindrome(11111));
		System.out.println("12221"+isPalindrome(11221));

	}

	static boolean isPalindrome(int x){

		 if (x<=0) return false;

		 int div = 1, num = x;

		 while(x/div>=10){
		 	div *= 10;
		 }

		 System.out.println(div);

		 while(x!=0){
		 	int l = x / div;
		 	int r = x % 10;
		 	if(l!=r) return false;
		 	x = (x % div) / 10;
		 	div /= 100;
		 }

		 return true;
	}
}