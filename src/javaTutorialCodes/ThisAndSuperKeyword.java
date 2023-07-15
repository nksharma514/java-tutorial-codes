package javaTutorialCodes;



class A{						//super class
	
	public A() {
		super();
		System.out.println("in A cons");
	}
	public A(int n) {
		super();
		System.out.println("in A int");
	}
}
class B extends A{						//sub class
	
	
	public B() {
		super(5);							//call the constructor of super class
		System.out.println("in B const");
	}
	
	public B(int n) {
		this();								//this() this will execute the constructor of same class
		System.out.println("in B int");
	}
	
}

public class ThisAndSuperKeyword {

	public static void main(String[] args) {
		

		A obj = new B(5);
		
		
		
		
	}

}
