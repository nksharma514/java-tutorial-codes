package javaTutorialCodes.Practicle_Codes;

@FunctionalInterface
interface Demo{
	
	int show(int i, int j);
}

public class Functional_interface2 {

	public static void main(String[] args) {
		
//		Demo obj = new Demo()
//				{
//					public int show(int i, int j) 
//					{
//						return i+j;
//					}
//				};
//				int result = obj.show(4,5);
//				System.out.println(result);
		
//		lambda expression
		
//		Demo obj = (i,j) -> 
//				{
//					return i+j;							//if it is return type then return is not mandatory to write
//				};		
//				int result = obj.show(4,5);
//				System.out.println(result);
		
		
//		lambda expression code more reduces
		
		Demo obj = (i,j) -> i+j;
			
				int result = obj.show(4,5);
				System.out.println(result);
		

	}

}
