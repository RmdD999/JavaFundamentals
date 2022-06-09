
public class main {

	public static void main(String[] args) {

		//find the max/min value between two.
		double x = 3.14;
		double y = 10;
		
		double res = Math.max(x, y);
		double resMin = Math.min(y, x);
		
		System.out.println("The greater value is: " + res);
		System.out.println("The lesser value is: " + resMin);
		
		//absolute value
		double absValuey = Math.abs(y);
		double absValuex = Math.abs(x);
		
		System.out.println("The absolute value of x is: "+absValuex);
		System.out.println("The absolute value of y is: "+absValuey);
		
		//Square root
		
		double sqrResY = Math.sqrt(y);
		double sqrResX = Math.sqrt(x);
		
		System.out.println("The square root of x is: "+ sqrResX);
		System.out.println("The square root of y is: "+ sqrResY);
		
		//round
		double roundResX = Math.round(x);
		double roundResY = Math.round(y);
		
		System.out.println("The round of x is: "+ roundResX);
		System.out.println("The round of y is: "+ roundResY);
		
		//ceil
		
		double ceilResX = Math.ceil(x);
		double ceilResY = Math.ceil(y);
		
		System.out.println("The ceil of x is: "+ ceilResX);
		System.out.println("The ceil of y is: "+ ceilResY);
		
		//floor always run down
		
		double floorResX = Math.floor(x);
		double floorResY = Math.floor(y);
		
		System.out.println("The floor of x is: "+ floorResX);
		System.out.println("The floor of y is: "+ floorResY);
	}

}
