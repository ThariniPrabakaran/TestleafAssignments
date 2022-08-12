package week1.day2;

public class MyCaluclator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculator obj = new Calculator ();
    System.out.println(obj.addition(4, 5, 6));  

    obj.subtraction(343543, 2323);

    obj.multiplication(324.34423, 3423.3434); 
    System.out.println("Division of two float numbers" + obj.divide(234234234.3423F, 324233242334234.234234324F));
	}

}
