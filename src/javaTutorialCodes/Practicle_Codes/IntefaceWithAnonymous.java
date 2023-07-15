package javaTutorialCodes.Practicle_Codes;


interface Aa{
	
	void add(int i, int j);
	void sub(int i, int j);
}


public class IntefaceWithAnonymous {

	public static void main(String[] args) {
		
		Aa obj = new Aa()
				{
					public void add(int i, int j)
					{
						System.out.println(i+j);					
					}
					
					public void sub(int i, int j)
					{
						System.out.println(i-j);					
					}
				};
				obj.add(5,4);
				obj.sub(9,4);
			

	}

}
