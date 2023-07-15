package javaTutorialCodes.Practicle_Codes;

interface Computer {
	
	void code();
}

class Desktop implements Computer {
	public void code() {
		System.out.println("Coding, Compile, and Run... Using Dekstop");
	}
}

class Laptop implements Computer {
	public void code() {
		System.out.println("Coding, Compile, and Run... Using Laptop");
	}
}

class Developer{
	public void DevApp(Computer comp) {
		comp.code();
	}
}

public class Desktop_Laptop_in_Office {

	public static void main(String[] args) {

		
		Computer desk = new Desktop();
		Computer lap = new Laptop();

		Developer naren = new Developer();			//naren is not depending on Laptop or Desktop to work
		naren.DevApp(lap);							
		
		Developer naren1 = new Developer();
		naren1.DevApp(desk);

	}

}
