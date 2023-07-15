package javaTutorialCodes.Practicle_Codes;

public class PalindromeOfNumber {

	public static void main(String[] args) {
		
		int num = 123, r, sum = 0;
		
		int temp = num;
		
		while(num>0) {			
			r = num % 10;
			num = num / 10;
			sum = (sum*10) + r;
		}		
		if(sum==temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
