package javaTutorialCodes.Practicle_Codes;

public class ArmstrongOfNDigits {

	public static void main(String[] args) {
		
		int num = 1634, r, n = 0, sum = 0;
		
		int temp = num;
		for(; temp>0; temp/=10) {
			
			n = n+1;			
		}
		temp = num;
		for(; temp>0; temp/=10) {
			r = temp % 10;
			sum += Math.pow(r,n);
		}
		if(sum == num) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}

}
