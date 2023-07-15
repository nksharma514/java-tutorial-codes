package javaTutorialCodes;

// Functional Interface means a interface has only one method
// Lambda expression is only working with functional interface
// it's also called SAM(Single Abstract method interface)

@FunctionalInterface		// this annotation used for not allow to create more then one method
interface Fun {
	
	void show();
	
}

//class B implements A{
//	public void show() {
//		System.out.println("in show");
//	}
//}

public class Functional_Interface {

	public static void main(String[] args) {

		Fun obj = new Fun() 
			{
			public void show() {
				System.out.println("in show");
			}

		};

		obj.show();
		
//		using lambda expression, extra code can be reduced

		Fun obj1 = () -> System.out.println("in show");

		obj1.show();

	}

}
