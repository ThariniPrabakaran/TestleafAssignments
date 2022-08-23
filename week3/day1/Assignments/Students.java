package week3.day1.Assignments;

public class Students {
	//passing only one argument
	public void getStudentInfo(int id)
	{
		System.out.println("Student ID is:" + id);
	}
	//passing two argument

	public void getStudentInfo(int id,String Name)
	{
		System.out.println("Student ID is:" + id);
		System.out.println("Student name is:"+Name);
	}
	
	//passing email and phone number 
	public void getStudentInfo(String email,long number )
	{
		System.out.println("Student Email is:" + email);
		System.out.println("Student number is:"+ number );
	}
	

	public static void main(String[] args) {

		Students student = new Students();
		student.getStudentInfo(45);
		student.getStudentInfo(55, "Tharini");
		student.getStudentInfo("abc@gmail.com", 9878987656L);
	}

}
