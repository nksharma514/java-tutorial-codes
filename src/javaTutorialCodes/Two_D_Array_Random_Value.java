package javaTutorialCodes;

public class Two_D_Array_Random_Value {

	public static void main(String[] args) {

		int num[][] = new int[3][4];

		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				num[i][j] = (int)(Math.random()*100);
			}

		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(num[i][j] + " ");
			}
		System.out.println(" ");
		}

		
//		Enhanced For Loop
		
		
//		for(int n[] : num) {
//			for(int m : n) {
//				m = (int)(Math.random() *100);
//				System.out.print(m + " ");
//			}
//			System.out.println(" ");
//		}
		
		
		
		
	}

}
