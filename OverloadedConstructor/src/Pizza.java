
public class Pizza {
	
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	Pizza(String bread, String sauce, String cheese, String topping){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
		
	}
	
	//Pizza without toppings
	Pizza(String bread, String sauce, String cheese){
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	//Pizza only with bread and sauce
	Pizza(String bread, String sauce){
		this.bread = bread;
		this.sauce = sauce;

	}
	//Pizza only with bread
	Pizza(String bread){
		this.bread = bread;

	}
	
	//only pure Pizza lol!
	Pizza(){
		
	}

}
