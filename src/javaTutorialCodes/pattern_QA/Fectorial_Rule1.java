package javaTutorialCodes.pattern_QA;

public class Fectorial_Rule1 {

	public static int fect(int n) {
		if(n==1)
			return 1;
		else
			return n * fect(n - 1);
	}
	
	public static void main(String[] args) {

		System.out.println(fect(5));
		
	}

}
