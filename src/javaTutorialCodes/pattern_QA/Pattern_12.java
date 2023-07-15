package javaTutorialCodes.pattern_QA;

//1 
//12 
//123 
//1234

public class Pattern_12 {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}


	}

}
