package javaTutorialCodes;

public class TypeConversionAndCasting {
	
	public static void main(String args[]) {
	
	
	byte b = 127;
	
	int a = 12;
	
//	b = a;  it will show error
	
//	a = b; 				// Conversion
	
	byte k = (byte)a;		// Casting
	
	System.out.println(k);
	

	float f = 5.4f;
	int x = (int)f;				//it will lost some value
	
	System.out.println(x);
	
	
	}
}
