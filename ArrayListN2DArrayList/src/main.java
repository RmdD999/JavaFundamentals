import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		
		//2D Arraylist = a dynamic list of lists
		//You can change the size of these lists during runtime
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatos");
		produceList.add("zuchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList.get(0).get(0)); //first element of the the first ArrayList
		System.out.println(groceryList.get(2).get(1)); //first element of the the first ArrayList
		
	}
	
	
	public static void arrayListUse() {
		
		//ArrayList =  a resizable array.
		//             Elements can be added and removed after compilation phase
		//  	       store reference data types
				
				ArrayList<String> food = new ArrayList<String>();
				
				food.add("pizza");
				food.add("hamberger");
				food.add("hotdog");
				
				food.set(0, "Sushi");
				food.remove(1);
				food.clear();
				
				
				for(int i =0;i<food.size();i++) {
					System.out.println(food.get(i));
				}
	}

}
