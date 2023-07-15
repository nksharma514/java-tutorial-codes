package javaTutorialCodes;


abstract class Car{
	
	public abstract void fly();
	public abstract void swim();
	public void drive() {
		System.out.println("Car is Driving");
	}
}

abstract class Honda extends Car{
	
	public abstract void swim();
	public void fly() {
		System.out.println("Car is Flying");
	}
	
}
class FlyCar extends Honda{
	public void swim() {
		System.out.println("Car is Swimming");
	}
}


public class AbstractClass {

	public static void main(String[] args) {
		
		
		Car obj = new FlyCar();
		obj.drive();
		obj.fly();
		obj.swim();

	}

}
