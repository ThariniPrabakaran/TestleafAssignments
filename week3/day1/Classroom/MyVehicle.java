package week3.day1.Classroom;

public class MyVehicle {

	public static void main(String[] args)
	
	{
	
Vehicle vehicle = new Vehicle();
vehicle.FourWheeler();
vehicle.Threewheeler();

Car car = new Car();
car.AirConditioner();
car.FourWheeler();// inheritance from Vehicle class

Auto auto = new Auto();
auto.Gas();
auto.Threewheeler(); // inheritance from Vehicle class

Audi audi = new Audi();
audi.ESeries();
audi.AirConditioner();// inheritance from Car class
audi.FourWheeler(); // inheritance from Vehicle class

BMW bmw = new BMW();
bmw.XClass();
bmw.AirConditioner();// inheritance from Car class
bmw.FourWheeler(); // inheritance from Vehicle class

Bajaj bajaj = new Bajaj();
bajaj.Electric();
bajaj.Gas();// inheritance from Auto class
bajaj.Threewheeler(); // inheritance from Vehicle class

	}

}
