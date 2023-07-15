package javaTutorialCodes;

class Student{
	
	int rollNo;
	String name;
	int marks;
}

public class StudentArray {

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		s1.rollNo = 101;
		s1.name = "Naren";
		s1.marks = 98;
		
		Student s2 = new Student();
		s2.rollNo = 102;
		s2.name = "Rahul";
		s2.marks = 86;
		
		Student s3 = new Student();
		s3.rollNo = 103;
		s3.name = "Ram";
		s3.marks = 75;
		
		
		Student student[] = new Student[3];
		student[0] = s1;
		student[1] = s2;
		student[2] = s3;
		
//		for(int i = 0; i<student.length; i++) {
//			System.out.println(student[i].rollNo + " " + student[i].name + " " + student[i].marks);
//		}
		
//		Enhanced For loop
		
		for(Student stud : student) {
			System.out.println(stud.rollNo + " " + stud.name + " " + stud.marks);
		}
		
	}

}
