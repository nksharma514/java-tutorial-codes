package javaTutorialCodes;


class Abc{
	
	public void show() {
		System.out.println("in A show");
	}
}
class Xyz extends Abc{
	
	public void show1() {
		System.out.println("in B Show");
	}
}


public class UpCastingAndDownCasting {

	public static void main(String[] args) {
		
		
		Abc obj = new Xyz();			//Up casting
		obj.show();
		
		Xyz obj1 = (Xyz)obj;			//Down casting
		obj1.show1();
		
		
	}

}
