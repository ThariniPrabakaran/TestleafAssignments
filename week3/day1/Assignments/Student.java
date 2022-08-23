package week3.day1.Assignments;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student name is Sridevi");
	}
	public void studentDept()
	{
		System.out.println("Sridevi belongs to Mathematics");
	}
	public void studentId()
	{
		System.out.println("Student ID is 4567");
	}
	
	
	public static void main(String[] args) {
		//declaring a varibable
		Student student= new Student();
		
		//Calling from the same class
		student.studentName();
		student.studentDept();		
		student.studentDept();
		
		//calling from inherited department 
		student.deptName();
		
		//calling form multilevel inheritance CollegeName class
		student.collegeCode();
		student.collegeName();
		student.collegeRank();

	}
}

