package week3.day1.Classroom;

public class Myhouse {

	public static void main(String[] args) {
//	Plan is added to restrict the object land only to the methods defined in the interface. If i want the additional buildGarden method to get
//	implemented then we need to use the regular expression Land land = new Land();
		
	Plan land = new Land();
	land.buildBalcony();
	land.buildBedrooms(5);
	land.buildParking();
	//land.buildGarden();
	}

}
