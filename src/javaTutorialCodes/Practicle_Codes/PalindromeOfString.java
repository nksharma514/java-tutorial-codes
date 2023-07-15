package javaTutorialCodes.Practicle_Codes;

public class PalindromeOfString {

	public static void main(String[] args) {
		
		String original= "MADAM", reverse = "";
		
		int length = original.length();
		
		for(int i = length-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(reverse.equals(original)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
