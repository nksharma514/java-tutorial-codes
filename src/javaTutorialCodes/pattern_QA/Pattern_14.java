package javaTutorialCodes.pattern_QA;

//         1  
//      1  2  3  
//   1  2  3  4  5  
//1  2  3  4  5  6  7 

public class Pattern_14 {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			for(int j=4; j>i; j--) {
				System.out.print("   ");
			}
			for(int k=1; k<=(i*2)-1; k++) {
				System.out.print(" " + k + " ");
			}
			System.out.println(" ");
		}

	}

}
