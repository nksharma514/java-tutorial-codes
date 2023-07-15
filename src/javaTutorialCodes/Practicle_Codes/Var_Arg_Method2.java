package javaTutorialCodes.Practicle_Codes;

public class Var_Arg_Method2 {
	
	
	public static void test(int x) {
		System.out.println("General method");
	}
	public static void test(int... x) {
		System.out.println("var-arg method");
	}

	
	public static void main(String[] args) {
		
		test();
		test(10,20);
		test(10);
		test(30,40,60);		
		
		
	}

}
