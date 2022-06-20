import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		// JOptionPane = pop up a standard dialog that prompts users for a value
		//               or informs them of something.
		
//		JOptionPane.showMessageDialog(null, "This is some useless info.","title",JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Here is more useless info.","title",JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info.","title",JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info.","title",JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is some useless info.","title",JOptionPane.ERROR_MESSAGE);

		
		
		//int answer = JOptionPane.showConfirmDialog(null,"bro do you even code?","this is my title",JOptionPane.YES_NO_CANCEL_OPTION);
	
//		String name = JOptionPane.showInputDialog("What is your name? ");
//		System.out.println(name);
		
		String[] responses = {"No, you're awesome!","Thank you!","blush"};
		ImageIcon icon = new ImageIcon("icons8-apple-logo-100.png");
		
		JOptionPane.showOptionDialog(null, 
				"You are awesome", 
				"secret message", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses, 
				2);
	}

}
