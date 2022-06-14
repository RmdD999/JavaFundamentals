package Package1;
import Package2.*;

public class A {

	protected String protectedMessage = "This is protected";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Asub asub = new Asub();
		System.out.println(asub.protectedMessage);
		
		B b = new B();
		System.out.println(b.privateMessage);

	}


}
