
public class main {

	public static void main(String[] args) {
		
		// polymorphism = greek word for poly - "many", morph - "form"
		//                The ability of an object to identify as more than one type 
		
		Car car = new Car();
		Bicycle  bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bicycle,boat};
		
		//Work with the same functions
		//Object[] racers = {car,bicycle,boat};
		
		for(Vehicle v : racers) {
			v.go();
		}
	}

}
