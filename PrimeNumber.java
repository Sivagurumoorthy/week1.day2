package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 41;
		boolean x = false;
		
		for(int i=2;i<=value/2;i++) {
			int n = value%i;
			if(n==0) {
				x = true;
				break;
			}	
			}
		
	if (x) {
		System.out.println(value +" is not a Prime number");
	}
	else {
		System.out.println(value +" is a Prime Number");
	}

	}

}
