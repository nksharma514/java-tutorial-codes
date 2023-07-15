package javaTutorialCodes;

interface Def
{
	 default void abc()
	{
		System.out.println("dafault show");
	}
}

public class Interface_Default {

	public static void main(String[] args) {


		Def obj = new Def()
				{
					public void abc()
					{
						System.out.println("override");
					}
			
				};
				obj.abc();
		

	}

}
