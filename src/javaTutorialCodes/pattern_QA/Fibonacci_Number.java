package javaTutorialCodes.pattern_QA;

//fibonacci number 1 1 2 3 5 8 13 21 34 55

public class Fibonacci_Number {

	public static void main(String[] args) {
		
		int a = 1, b = 1, n = 0;
		
		System.out.print(" 1 1");
		
		while(n <= 50) {
			n = a + b;
		
			System.out.print(" " + n + " ");
			
			a = b;
			b = n;
		}

	}

}
