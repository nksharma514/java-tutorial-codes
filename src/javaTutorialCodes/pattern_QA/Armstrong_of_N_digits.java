package javaTutorialCodes.pattern_QA;

public class Armstrong_of_N_digits {

	public static void main(String[] args) {
		
		int num = 1634, base, sum = 0, exp = 0;
		
		int temp = num;
		for(; temp>0; temp/=10) {
			exp = exp + 1;
		}
		temp = num;
		for(; temp>0; temp/=10) {
			base = temp % 10;
			sum += Math.pow(base, exp);
		}
		if(sum==num) {
			System.out.println("number is armstrong");
		}else {
			System.out.println("number is not armstrong");
		}
	}

}
