package javaTutorialCodes.Practicle_Codes;

public class Var_Arg_Method1 {
	
	public static void main(String[] args) {
		
		Var();
		Var(10);
		Var(10,20);
		Var(10,20,30);
		Var(50,60,70,90);
		
	}
	
	public static void Var(int... x) {
		int result = 0;
		
		for(int x1 : x) {
			result = result + x1;
		}
		System.out.println(result);
	}

}
