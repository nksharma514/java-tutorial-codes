package javaTutorialCodes.Practicle_Codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
	int age;
	String name;
	
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
}




public class Collection_Compare_Student_Age {

	public static void main(String[] args) {
		
		
		Comparator<Student> comp = new Comparator<Student>() 
		{
			public int compare(Student s1, Student s2)
			{
				if(s1.age > s2.age)
					return 1;
				else
					return -1;
			}
		};
		
//		with lambda expression
		
//		Comparator<Student> comp = (Student s1, Student s2) ->
//			{
//				return s1.age > s2.age ? 1 : -1;
//			};
			
//			or further reducing codes
			
//			Comparator<Student> comp = (Student s1, Student s2) -> s1.age > s2.age ? 1 : -1;
		
		
		
		
		List<Student> stud = new ArrayList<Student>();
		stud.add(new Student(29, "Raju"));
		stud.add(new Student(45, "Naren"));
		stud.add(new Student(32, "Kiran"));
		stud.add(new Student(15, "Saroj"));
		stud.add(new Student(21, "Manoj"));
		
		
		Collections.sort(stud,comp);
		
		
		for(Student s : stud) 
		{
			System.out.println(s);
		}
		
		
		

	}

}
