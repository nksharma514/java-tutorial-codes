package javaTutorialCodes;


// marker interface is used to give permission to show or do something

interface Mark
{
	
}

class Marker implements Mark
{
	public void show()
	{
		System.out.println("Permission granted");
	}
}

public class Marker_Interface {

	public static void main(String[] args) {
		
		
		Marker obj = new Marker();
		if(obj instanceof Mark)				// giving permission
		{
			obj.show();
		}
		else
		{
			System.out.println("Not Permission");
		}
		
		
	}

}
