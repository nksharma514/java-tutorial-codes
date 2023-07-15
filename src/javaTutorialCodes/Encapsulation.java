package javaTutorialCodes;



class Human{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age, Human obj) {	// accepting obj from object
		Human obj1 = obj;						// putting obj to human not creating new object, its using here instead of this keyword
		obj1.age = age;							// now age is assigning to obj1
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}


public class Encapsulation {

	public static void main(String[] args) {
		
		Human obj = new Human();
		obj.setAge(35, obj);			//object is passing itself here
		obj.setName("man");
		
		System.out.println(obj.getName() + " : " + obj.getAge());

	}

}
