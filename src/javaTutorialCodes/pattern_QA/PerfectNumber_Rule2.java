package javaTutorialCodes.pattern_QA;

public class PerfectNumber_Rule2 {

	public static void main(String[] args) {
		
		Perfect p = new Perfect();
		int n = 28;
		boolean b = p.isPerfect(n);
		
		if(b)
			System.out.println("perfect number");
		else
			System.out.println("not perfect number");
	}

}
class Perfect{
	
	int sum = 0;
	public boolean isPerfect(int n) {
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
}
