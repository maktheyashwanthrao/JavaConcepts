package Constractor;

public class Student {
	
	String name;
	int rollno;
	
	Student(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Rao", 101);
		Student s2 = new Student("Yash", 102);
		
		System.out.println(s1.name + "--------------------" +s1.rollno);
		System.out.println(s2.name + "--------------------" +s2.rollno);
		
		
		

	}

}
