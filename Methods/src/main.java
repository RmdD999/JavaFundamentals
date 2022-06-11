
public class main {

	public static void main(String[] args) {
		
		//method = a block of code that is executed whenever it is called upon
		
		String name = "Bro";
		int age = 21;
		
		hello(name,age);
		
		
		//-----------------------------------
		int x = 3;
		int y = 4;
		int result = add(x,y);
		System.out.println(result);
		
	}
	
	static void hello(String str,int a) {
		System.out.println("hello!" + str+", and you are "+a+" year(s) old.");
	}
	
	static int add(int a, int b) {
		return a+b;
	}

}
