package javaTutorialCodes.Practicle_Codes;

public class ArmstrongThreeDigits {

	public static void main(String[] args) {
		
		int num = 153, r, sum = 0;
		int temp = num;
		while(num > 0) {
			r = num % 10;
			num = num / 10;
			sum = (sum + (r*r*r));
		}
		if(sum == temp) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Numnber is not Arstrong");
		}

	}

}
