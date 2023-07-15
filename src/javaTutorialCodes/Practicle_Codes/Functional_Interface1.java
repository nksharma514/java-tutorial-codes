package javaTutorialCodes.Practicle_Codes;

@FunctionalInterface
interface A{
	void show(int i);
}

//class B implements A{
//	public void show(int i) {
//		System.out.println(" in show " + i);
//	}
//}

public class Functional_Interface1 {

	public static void main(String[] args) {
		
//		A obj = new B();
//		obj.show(5);
		
//		using anonymous class
		
//		A obj = new A() 
//				{
//					public void show(int i) 
//					{
//						System.out.println(" in show " + i);
//					}
//				};
//				obj.show(6);
		
//		using lambda expression
		
//		A obj = (int i) -> 
//			{
//				System.out.println(" in show " + i);
//			}
//		;
//		obj.show(6);
		
		
//		using lambda expression reducing the number of lines
//		
//		A obj = (int i) -> System.out.println(" in show " + i);
//		obj.show(6);
		
		
//		using lambda expression further reducing the number of lines
		
//		A obj = (i) -> System.out.println(" in show " + i);
//		obj.show(6);
		
		
//		using lambda expression further reducing the number of lines
		
		A obj = i -> System.out.println(" in show " + i);
		obj.show(6);
		

	}

}
