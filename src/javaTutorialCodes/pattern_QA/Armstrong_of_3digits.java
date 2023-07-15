package javaTutorialCodes.pattern_QA;

public class Armstrong_of_3digits {

	public static void main(String[] args) {

		int n = 153, r;
		double s = 0;
			
		int t = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
//			s = s + (r * r * r);
//			or
			double d = Math.pow(r, 3);
			s = s + d;

		}
		if (s == t) {
			System.out.println("number is armstrong");
		} else {
			System.out.println("number is not armstrong");
		}

	}

}
