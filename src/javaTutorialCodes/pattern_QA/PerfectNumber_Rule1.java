package javaTutorialCodes.pattern_QA;

public class PerfectNumber_Rule1 {
	
	public static boolean isPerfect(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				sum = sum + i;
			}			
		}
		if(n == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		int n = 28;
		boolean b = isPerfect(n);
		
		if(b)
			System.out.println("Perfect number");
		else
			System.out.println("not perfect number");
	}

}
