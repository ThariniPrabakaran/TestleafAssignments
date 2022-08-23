package week3.day1.Assignments;

//Desktop inhertits Computer
public class Desktop extends Computer {

	// creating a method called desktop size
	public void desktopSize() {
		
		System.out.println("Size of the laptop is 17 inches");
		
	}
	
	//main method
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
	}
		
		
	}
