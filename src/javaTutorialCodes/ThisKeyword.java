package javaTutorialCodes;


class Demo{
	int x = 10;
	
	public void num() {
		this.x = 20;
		
		System.out.println(x);
	}
	
	
}


public class ThisKeyword {

	public static void main(String[] args) {
		
		
		new Demo().num();

	}

}
