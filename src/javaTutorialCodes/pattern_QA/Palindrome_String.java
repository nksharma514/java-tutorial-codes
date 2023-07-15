package javaTutorialCodes.pattern_QA;

public class Palindrome_String {

	public static void main(String[] args) {
		
		String original = "MADAM", reverse="";
		
		int length = original.length();
		
		for(int i = length - 1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(reverse.equals(original)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}

	}

}
