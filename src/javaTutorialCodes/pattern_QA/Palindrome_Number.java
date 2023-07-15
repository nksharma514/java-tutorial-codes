package javaTutorialCodes.pattern_QA;

public class Palindrome_Number {

	public static void main(String[] args) {

		int n = 121, r, s = 0;
		int t = n;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			s = (s * 10) + r;
		}
		if (s == t) {
			System.out.println("Number is palindrom");
		} else {
			System.out.println("Number is not palindrome");
		}

	}

}
