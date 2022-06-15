import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// polymorphism = many shapes/forms
		// dynamic = after compilation (during runtime)
		
		// ex. A corvette is a: corvette, and a car, and a vehicle, and an object
		
		
		Animal animal;//Dw whether it is a dog or cat
		Scanner scanner = new Scanner(System.in);
		System.out.println("What animal do you want?");
		System.out.println("(1 = dog) or (2 = cat): ");
		
		int choice= scanner.nextInt();
		
		if(choice == 1) {
			animal = new Dog();
			animal.speak();
		}
		else if(choice == 2) {
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			animal.speak();
			System.out.println("That choice was invalid");
		}
		
		
	}

}
