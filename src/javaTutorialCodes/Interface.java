package javaTutorialCodes;


interface Num{
	//instance variable
	int num = 45;							// variable is always final and static, whatever you mention or not
	final static String place = "Delhi";
	
	//interface method only declare not defined
	public abstract void show();
	void config();							//no need to write public abstract, it's always there whatever you mention or not

}
interface Num1 extends Num{
	void run();
}

abstract class AdNum implements Num1,Num{
	
	public abstract void run(); 
	public abstract void config();			//if method is not define here then it becomes abstract class 
	
	public void show() {					//method can be define of declare bcz it's abstract class
		System.out.println("in show");
	}
}

class SupAdNum extends AdNum{
	public void config() {
		System.out.println("in config");
	}
	
	public void run() {
		System.out.println("in run");
	}
	
}



public class Interface {

	public static void main(String[] args) {
		
		
		Num obj = new SupAdNum();
		obj.show();
		obj.config();
		
		
//		obj.num = 75;			it will not allow to change bcz it is always final and static 
		
		System.out.println(Num.num);			// this can call by interface name because it is static 
		System.out.println(Num.place);
		
		
		Num1 obj1 = new SupAdNum();				//create another object bcz run() is in another interface
		obj1.run();
		
		
		
	}

}



//interface extends interface
//abstract implements interface
//class implements interface
//class extends class
//class extends abstract
//abstract extends abstract
