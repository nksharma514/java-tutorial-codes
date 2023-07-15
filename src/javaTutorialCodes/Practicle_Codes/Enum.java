package javaTutorialCodes.Practicle_Codes;


enum Laptop1{
	Mackbook(2000), XPS(22000), Surface, Thinkpad(1800);
	
	private int price;
	
	private Laptop1() {
		price = 800;
	}
	
	private Laptop1(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

public class Enum {

	public static void main(String[] args) {
		
		Laptop1 lap = Laptop1.Mackbook;
		System.out.println(lap + " : " + lap.getPrice());
		
//		by enhaced for loop
		
//		method 1
//		Laptop1[] lap1 = Laptop1.values();
//		for(Laptop1 ll : lap1) {
//			System.out.println(ll + " : " + ll.getPrice());
//		}
		
		
//		method 2
		for(Laptop1 lap1 : Laptop1.values()) {
			System.out.println(lap1 + " : " + lap1.getPrice());
		}
		

	}

}
