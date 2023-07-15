package javaTutorialCodes.pattern_QA;

public class Demo {

	public static void main(String[] args) {


		String str = "MADAM";
		String result = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			result += str.charAt(i);
			System.out.println(result);
		}
		
	}

}
