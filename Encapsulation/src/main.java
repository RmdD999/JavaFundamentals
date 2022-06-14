
public class main {

	public static void main(String[] args) {
		
		// encapsulation  = attributes of a class will be hidden or private
		//                  can be accessed only through methods (getters& setters)
		//                  You should make attributes private if you don't have a reason to make them public/protected
		
		
		Car car = new Car("Chevrolet","Camaro",2021);
		Car car2 = new Car("Benz","g500",2022);
		
	
		
		car.setMake("Tesla");
		System.out.println(car.getMake());
		System.out.println(car2.getMake());

	}

}
