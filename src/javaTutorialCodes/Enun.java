package javaTutorialCodes;


enum Status{
	Running, Failed, Pending, Success;				//Constant object
} 

public class Enun {

	public static void main(String[] args) {
		
		Status stas = Status.Running;
		System.out.println(stas);
		
		Status stas1 = Status.Pending;
		System.out.println(stas1.ordinal());			//giving index value
		
		Status[] stas2 = Status.values();
		System.out.println(stas2[1]);					//calling from index value
		
		System.out.println(" ");
		System.out.println("printing all status");
		
		Status[] stas3 = Status.values();
		for(Status s : stas3) {
			System.out.println(s);
		}
		
		System.out.println(" ");
		System.out.println("printing all status with index value");
		
		Status[] stas4 = Status.values();
		for(Status s : stas4) {
			System.out.println(s + " " + s.ordinal());
		}
		
		System.out.println(" ");
//		if else case
		
		Status obj = Status.Pending;
		
		if(obj == Status.Running)
			System.out.println("All Good");
		else if(obj == Status.Failed)
			System.out.println("Try again");
		else if(obj == Status.Pending)
			System.out.println("Please Wait");
		else
			System.out.println("All Done");
	
//		switch case
		
		
		switch(obj) {
		case Running : System.out.println("All Good"); 
					   break;
		case Failed  : System.out.println("Try again"); 
					   break;
		case Pending : System.out.println("Please wait"); 
					   break;
		default		 : System.out.println("All Done"); 
		 			   break;
		}
		
		
		
		

	}

}
