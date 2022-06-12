
public class main {

	public static void main(String[] args) {

		//constructor =  special method that is called when an object is instantiated (created)

		Human human1 = new Human("Rick",65,70);
		Human human2 = new Human("Lusan",25,50);
		
		System.out.println(human1.name);
		System.out.println(human1.age);
		System.out.println(human1.weight);
		human1.eat();
		human1.drink();
		
		System.out.println(human2.name);
		System.out.println(human2.age);
		System.out.println(human2.weight);
		human2.eat();
		human2.drink();
		
		
	}

}
