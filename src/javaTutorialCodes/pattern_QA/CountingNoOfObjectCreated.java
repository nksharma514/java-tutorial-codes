package javaTutorialCodes.pattern_QA;

public class CountingNoOfObjectCreated {

	public static void main(String[] args) throws Exception {
	
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		
		c3.counting();
		
	}

}
class Count{
	static int i;
	public Count() {
		i++;
	}
	public void counting() {
		System.out.println(i);
	}
}