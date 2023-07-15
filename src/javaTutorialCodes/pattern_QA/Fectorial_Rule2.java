package javaTutorialCodes.pattern_QA;

public class Fectorial_Rule2 {

	public static void main(String[] args) {
		
		Fectorial f = new Fectorial();
		int r = f.fect(6);
		System.out.println(r);
	
	}

}

class Fectorial{
	public int fect(int n) {
		if(n == 1)
			return 1;
		else
			return n*fect(n-1);
	}
}
