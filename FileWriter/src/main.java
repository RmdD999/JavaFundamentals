import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		
		try {
			
			FileWriter writer= new FileWriter("poem.txt");
			writer.write("Roses are red. \nViolets are blue.\nBooty booty booty booty.");
			writer.append("\n(A poem by Rmd)");
			writer.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}


	}

}
