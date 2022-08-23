package week3.day1.Assignments;

public class AxisBank extends BankInfo{

	public void deposit()
	{
		System.out.println("Depositing 20lks -Child");
	}
	public void OverRide() {
	
	//calls the parent deposit method
		System.out.println("Bankinfo - parent class");
    	super.deposit();
    //calls the current child deposit method
		System.out.println("Axis bank - child class");
		this.deposit();

	}

	
	
	public static void main(String[] args) {
		
		AxisBank axisbank = new AxisBank();
		axisbank.deposit();
		axisbank.OverRide();
		axisbank.saving();
		axisbank.fixed();
	}
}

