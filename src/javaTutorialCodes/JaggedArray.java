package javaTutorialCodes;

public class JaggedArray {

	public static void main(String[] args) {

		int num[][] = new int[3][];				//jagged Array
		
		num[0] = new int[4];
		num[1] = new int[2];
		num[2] = new int[5];

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = (int) (Math.random() * 100);
			}

		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
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
