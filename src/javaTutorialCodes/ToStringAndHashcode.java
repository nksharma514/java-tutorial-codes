package javaTutorialCodes;

import java.util.Objects;

class Laptop{
	
	String model;
	int price;
	
	
	@Override
	public String toString() {											//printing own message not the hashcode
		return "Laptop [model=" + model + ", price=" + price + "]";
	}


//	generating by going to source ang generate hashcode() and equals() to compare the both obj1 and obj2 are equals 
	
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
	
		
}

public class ToStringAndHashcode {

	public static void main(String[] args) {
		
		
		Laptop obj1 = new Laptop();
		obj1.model = "Lenovo yoga";
		obj1.price = 1000;
		
		Laptop obj2 = new Laptop();
		obj2.model = "Lenovo yoga";
		obj2.price = 1000;
		
		
		System.out.println(obj1.toString());				//printing Hashcode
		
//		boolean result = obj1 == obj2;
		boolean result = obj1.equals(obj2);				//comparing containt of both obj1 and obj2 data
		System.out.println(result);

	}

}
