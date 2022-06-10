
public class main {

	public static void main(String[] args) {
		
		//String = a reference data type that can store one or more characters
		//         reference data types have access to useful methods.
		
		String name = "Bro           ";
		boolean result = name.equalsIgnoreCase("bro");
		int resInt = name.length();
		char resChar = name.charAt(1);
		int resIndex = name.indexOf("B");
		int resIndex2 = name.indexOf("c");
		boolean resEmpty = name.isEmpty();
		String resUpper = name.toUpperCase();
		String resLower = name.toLowerCase();
		String resTrim = name.trim();
		String resReplace = name.replace("o", "ah");
		
		System.out.println(result);
		System.out.println(resInt);
		System.out.println(resChar);
		System.out.println(resIndex);
		System.out.println(resIndex2);
		System.out.println(resEmpty);
		System.out.println(resUpper);
		System.out.println(resLower);
		System.out.println(resTrim);
		System.out.println(resReplace);

	}

}
