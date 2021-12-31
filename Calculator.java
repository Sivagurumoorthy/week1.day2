package week1.day2;



public class Calculator {
	public int add(int num1, int num2) {
		return num1+num2;
	}	
		public int sub(int num1, int num2) {
			return num1-num2;
		
	}
		public int multiply(int num1, int num2) {
			return num1*num2;
		
	}		public int divide(int num1, int num2) {
		return num1/num2;
		
}
public static void main(String[] args) {
		Calculator calc = new Calculator();
		int add = calc.add(10,80);
		int sub = calc.sub(12,23);
		int multiply = calc.multiply(25,24);
		int divide = calc.divide(24,4);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(multiply);
		System.out.println(divide);
		
		

	}

}
