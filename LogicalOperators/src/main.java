import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit.");
		String response = scanner.next();
		
		if(!response.equals("q")&&(!response.equals("Q"))) {
			System.out.println("You are still playing the game pew pew!");
			
		}
		else {
			System.out.println("You are quiting the game bro!");
		}
		
		
		if(response.equals("q")||response.equals("Q")) {
			
			System.out.println("You are quiting the game bro!");
		}
		else {
			
			System.out.println("You are still playing the game pew pew!");
		}

	}

}