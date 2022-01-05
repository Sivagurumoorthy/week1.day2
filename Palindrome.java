package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 121;
		int n = x;
		int l = 0;
		while(x>0) {
			int condition = x%10;
			x = x/10;
			l = (l*10)+ condition;
			
		}
		if (n==l) {
			System.out.println(n +" is a palindrome number");
		}else {
			System.out.println(n +" is not a palindrome number");
		}
		
	}

	}


