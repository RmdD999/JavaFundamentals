import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		
		nestedLoop();
		

	}
	
	
	public static void whileLoop() {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) {
			System.out.print("Please enter your name: ");
			name = scanner.nextLine();
		}
		
		
		do { //this will perform the block of the code once and check the conditions.
			System.out.print("Please enter your name: ");
			name = scanner.nextLine();
			
		}while(name.isBlank());
		
		System.out.println("You name is: " + name);
	}


	public static void forLoop() {
		
		for(int i =10;i>=0;i--) {
			System.out.println("Happy New Year!" + i );
		}
		
		
		for(int i =10;i>=0;i-=2) { // 10 8 6 4 2 0 
			System.out.println("Happy New Year!" + i );
		}
	}
	
	public static void nestedLoop() {
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol="";
		
		System.out.println("Please enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Please enter # of columns: ");
		columns = scanner.nextInt();
		System.out.println("Please enter the symbol:");
		symbol = scanner.next();
		
		
		for(int i =1; i<=rows; i++) {
			System.out.println();
			
			for(int j=1;j<=columns;j++) {
				System.out.print(symbol);
			}
		}
		
		
	}

}
