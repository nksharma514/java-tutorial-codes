package javaTutorialCodes;


class Hi{
	
	int n;
	
	public void show() {
		System.out.println("in parent show");
	}
	
	class Hey{
		
		public void show1() {
			System.out.println("in inner show1");
		}
	}
	
	static class Hello{
		public void show2() {
			System.out.println("in inner static show2");
		}
	}
}


public class InnerClass {

	public static void main(String[] args) {
		
		
		Hi obj = new Hi();					//normal object creation
		obj.show();
		
		Hi.Hey obj1 = obj.new Hey();		//Hi obj is passing in ineer class if not static class
		obj1.show1();
		
		Hi.Hello obj2 = new Hi.Hello();		//if its static class then no need to pass obj of Hi class, just create obj with dots(fisrt parent class then inner static class with dots)	
		obj2.show2();

	}

}
