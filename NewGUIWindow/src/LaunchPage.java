import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{

	JFrame frame = new JFrame();
	JButton button = new JButton("Click Me!");
	
	LaunchPage(){
		
		button.setBounds(100,160,200,40);
		button.setFocusable(false);
		button.addActionListener((ActionListener) this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.add(button);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==button) {
			
			frame.dispose();
			NewWindow myWindow = new NewWindow();
		}
	}
}