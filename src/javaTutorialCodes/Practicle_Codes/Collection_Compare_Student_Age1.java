package javaTutorialCodes.Practicle_Codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Students implements Comparable<Students>
{
	int age;
	String name;
	
	
	public Students(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
	
	@Override
	public int compareTo(Students that) {
		if(this.age > that.age)
			return 1;
		else
			return -1;
	}
	
}




public class Collection_Compare_Student_Age1 {

	public static void main(String[] args) {
		
		
//		Comparator<Students> comp = new Comparator<Students>() 
//		{
//			public int compare(Students s1, Students s2)
//			{
//				if(s1.age > s2.age)
//					return 1;
//				else
//					return -1;
//			}
//		};
		
		
		
		List<Students> stud = new ArrayList<Students>();
		stud.add(new Students(29, "Raju"));
		stud.add(new Students(45, "Naren"));
		stud.add(new Students(32, "Kiran"));
		stud.add(new Students(15, "Saroj"));
		stud.add(new Students(21, "Manoj"));
		
		
		Collections.sort(stud);
		
		
		for(Students s : stud) 
		{
			System.out.println(s);
		}
		
		
		

	}

}
