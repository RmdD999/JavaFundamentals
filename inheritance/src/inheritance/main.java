package inheritance;

public class main {

	public static void main(String[] args) {
		
		// inheritance = the process where one class acquires
		//               the attributes and methods of another
		
		Car car = new Car();
		car.go();
		car.stop();
		
		Bicycle bicycle = new Bicycle();
		bicycle.go();
		bicycle.stop();
		
		System.out.println(car.wheels);
		System.out.println(car.doors);
		
		System.out.println(bicycle.wheels);
		System.out.println(bicycle.pedals);

	}

}
