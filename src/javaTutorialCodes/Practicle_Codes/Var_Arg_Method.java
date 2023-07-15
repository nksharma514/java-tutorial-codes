package javaTutorialCodes.Practicle_Codes;

public class Var_Arg_Method {	
	
	public static void main(String[] args) {
		
		
		Var obj = new Var();	
		obj.arg();
		obj.arg(10);
		obj.arg(10,60);
		obj.arg(20,50,40);
		
	}

}

class Var{
	public void arg(int... x) {
		
		int r = 0;
		for(int x1 : x) {
			r = r + x1;			
		}
		System.out.println(r);
		
	}
}
