
public class main {

	public static void main(String[] args) {
		
		//2D Arrays -- an array of arrays.
		//Common way to have 2D Arrays
		
		String[][] cars = {{
			
		"Camaro","Corvette","Silverado"},{
			
		"Mustang","Ranger","F-150"},{
			
		"Ferrari","Lambo","Tesla"}};
		
		
	}
	
	public static void UseArray() {
		

		//array --  used to store multiple values in a single variable
		
		String[] cars = new String[3];
		cars[0] = "BMW";
		cars[1] = "Tesla";
		cars[2] = "Corvette";
		
//		System.out.println(cars[0]);
//		System.out.println(cars[1]);
//		System.out.println(cars[2]);
		
		for(int i =0; i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
	}

	
	public static void Formal2DArray() {
		//Formal ways to have the 2D arrays
				String[][] cars = new String[3][3];
				
				cars[0][0] = "Camaro";
				cars[0][1] = "Corvette";
				cars[0][2] = "Silverado";
				cars[1][0] = "Mustang";
				cars[1][1] = "Ranger";
				cars[1][2] = "F-150";
				cars[2][0] = "Ferrari";
				cars[2][1] = "Lambo";
				cars[2][2] = "Tesla";
				
				for(int i =0;i<cars.length;i++) {
					System.out.println();
					for(int j =0;j<cars[i].length;j++){
						System.out.println(cars[i][j]); 
					}
				}
	}
}
