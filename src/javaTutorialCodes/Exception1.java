package javaTutorialCodes;

//if normal Exception is happen

public class Exception1 {

	public static void main(String[] args) {
		
		
		int i = 2;
		int j = 0;
		
		int num[] = new int[5];
		
		String str = null;
		
		try 
		{
			j = 18/i;
			
			System.out.println(num[1]);
			System.out.println(num[5]);
			
			System.out.println(str.length());
			
		}
		catch(ArithmeticException e) 
		{
			System.out.println("can't divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("stay in limits");
		}
		catch(Exception e) 
		{
			System.out.println("Something went wrong");
		}
		
		System.out.println(j);
		
		System.out.println("Bye");
		

	}

}
