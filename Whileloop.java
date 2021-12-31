package week1.day2;

public class Whileloop {
public static void main(String[] args) {
	int input = 128;
	int sum = 0;
	int actual;
	actual=input;
	while(input > 0) {
		int rem = input % 10;
		sum = sum + rem;
		input = input / 10;
		}
	    System.out.println(sum);
		if (actual % sum == 0) {
			System.out.println("divisible");		
		} else {
			System.out.println("not divisible");
		}
} 

}

