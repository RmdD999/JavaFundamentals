import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = random.nextInt(6)+1; //random integer between 1 to 6
		
		System.out.println(x);
		
		double y = random.nextDouble(3.14)+0.5; //random double between 0.5 to 3.14
		
		System.out.println(y);
		
		boolean z = random.nextBoolean();
		
		System.out.println(z);

	}

}
