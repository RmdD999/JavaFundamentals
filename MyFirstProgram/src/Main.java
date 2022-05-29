
public class Main {

	public static void main(String[] args) {
		int swt = 1;
		if(swt==0) {
			System.out.println("I love Pizza!\n");
			System.out.println("\tIt's really good!");
			System.out.println("\"Hello World!\"");
			System.out.println("\\Hello World! Again?\\");
			
			//This is a comment
			/*
			 * This
			 * Is
			 * A
			 * COMMENT
			 */
			
			
			int x; //declaration
			x = 123; //assignment
			int y = 123; //initialization
			
			System.out.println(x);
			System.out.println(y);
			System.out.println("My number is:" + (x+y));
			
			long z = 1222323213213123L;
			float a =3.14f;
			double b = 3.14;
			boolean c = true;
			boolean d = false;
			char e = 'e';
			String name = "David";
		}
		
		SwapTwoVar();
	}
	
	//This function is going to swap two variables with values.
	public static void  SwapTwoVar() {
		String x = "Water";
		String y = "Coka Cola";
		String temp;
		
		temp = y;
		y = x;
		x = temp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);

	}
	

}
