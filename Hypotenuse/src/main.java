import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		//right angled triangle
		z = Math.sqrt((x*x) +(y*y));
		System.out.println("The hypotenuse is: " + z);
		
		scanner.close();
	}

}
