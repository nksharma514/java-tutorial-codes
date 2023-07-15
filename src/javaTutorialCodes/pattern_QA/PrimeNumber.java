package javaTutorialCodes.pattern_QA;

//Prime number means a number is divisible by itself and 1 only

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 11;
		
		boolean isPrime = true;
		
		for(int i = 2; i<n; i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime number");
		}
		
	}

}
