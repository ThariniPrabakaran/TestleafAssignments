package week1.day2;

public class car {
	
// print car brand method 
 public void printCarName()
{
	System.out.println("Nissan Rogue");
}

//Get car color

public String getCarColor()
{
return "grey";
}

//Get car engine number 

public int getCarEngineNumber()
{
	return 32432423;
	}
//Subtract two numbers 
	
public void calculations(int a, int b)
	{
		int c = a-b;
		int d = a*b;
		int f = a/b;
		System.out.println("Subtraction="+c);
		System.out.println("Mulitplication="+d);
		System.out.println("Division="+f);
	}
	
	
	public static void main(String[] args) {
		
		car obj = new car();
		obj.printCarName();
		
		//directly printing the value of the return
		System.out.println(obj.getCarColor());
		
		// assign the return value to a variable and then print 
		int EN=obj.getCarEngineNumber();
		System.out.println(EN);
	
		obj.calculations(2345, 342);
		
	}
	
	
}

