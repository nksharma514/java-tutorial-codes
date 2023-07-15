package javaTutorialCodes;

class NarenException extends Exception       // created Exception will extends Parent Exception
{
	public NarenException(String string)	// because NarenException is accepting String in Para
	{
		super(string);						// for showing message which is written is NarenException
	}
}

public class Exception3_CreateOwnException {

	public static void main(String[] args) {
		
		
		int i = 20;
		int j = 0;
		
		try 
		{
			j = 18/i;
			if(j == 0)
				throw new NarenException(" this line will print by e in Create by Own exception that is NarenException ");
				//throw keyword is use to throw the exception
		}
		catch(NarenException e)
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
