package javaTutorialCodes;


class Calculator{
	
	int num = 5;									//instance variable
	
	public int add(int n1, int n2) {
		return n1 + n2;		
	}
}


public class InstanceVariable {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int r = cal.add(7,8);
		
		System.out.println(r);
		
		Calculator cal1 = new Calculator();
		
		cal.num = 4;
		
		System.out.println(cal.num);
		System.out.println(cal1.num);
	}

}
