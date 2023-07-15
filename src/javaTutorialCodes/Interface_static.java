package javaTutorialCodes;


interface sta
{
	static void show()
	{
		System.out.println("Static interface");
	}
}


public class Interface_static {

	public static void main(String[] args) {
		
//		sta obj = new sta();		// not work bcz interface does't allow to create object
//		obj.show();
		
		sta.show();					//directly can be call by interface name bcz of static keyword
		
		

	}

}
