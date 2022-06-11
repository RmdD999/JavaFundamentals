package printf;

public class main {

	public static void main(String[] args) {
		
		//printf() = an optional method to control, format, and display text to the console window
		//           two arguments = format string + (object/variable/value)
		//           % [flags] [precision] [width] [conversion-character]
		
		System.out.printf("This is a format string %d", 123);
		System.out.printf("This is %d a format string ", 123);
		System.out.println();
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50; //d for decimal --> integers
		double myDouble = 1000; //f -->double
		
		
		//[conversion-character]
		System.out.printf("%b",myBoolean);
		System.out.printf("%c",myChar);
		System.out.printf("%s",myString);
		System.out.printf("%d",myInt);
		System.out.printf("%f",myDouble);
		System.out.println();
		
		//[width]
		//minimum number of characters to be written as output
		System.out.printf("Hello %10s",myString); //ten characters spaces are displayed between Hello and the variable
		System.out.println();
		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		// result --> You have this much money 1000.00
		System.out.printf("You have this much money %.2f", myDouble);
		System.out.println();
		
		// [flag]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		System.out.printf("You have this much money %20f", myDouble);
		System.out.println();
		System.out.printf("You have this much money %+f", myDouble);
		System.out.println();
		System.out.printf("You have this much money %020f", myDouble);
		System.out.println();
		System.out.printf("You have this much money %,f", myDouble);
		
	}

}
