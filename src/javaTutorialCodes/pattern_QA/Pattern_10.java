package javaTutorialCodes.pattern_QA;

//1  
//0  1  
//1  0  1  
//0  1  0  1  
//1  0  1  0  1  


public class Pattern_10 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				
				int k = i+j-1;
				
				if(k%2 == 0) {
					System.out.print(" " + 0 + " ");
				}else {
					System.out.print(" " + 1 + " ");
				}				
			}
			System.out.println(" ");
		}

	}

}
