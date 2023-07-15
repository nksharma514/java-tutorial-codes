package javaTutorialCodes;

// if Exception is happen and i want to print some data 

public class Exception2 {

	public static void main(String[] args) {
		
		int i = 20;
		int j = 0;
		
		try 
		{
			j = 18/i;
			if(j == 0)
				throw new ArithmeticException(" this line will print by e in arithmetic exception ");
				//throw keyword is use to throw the exception
		}
		catch(ArithmeticException e)
		{
			j = 18/1;
			System.out.println("that's the dafault output " + e);
		}
		catch(Exception e)
		{
			System.out.println(" Something went wrong " + e);
		}
		
		System.out.println(j);
		System.out.println("bye");

	}

}
