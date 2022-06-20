import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Myframe extends JFrame implements ActionListener{

	JButton button;
	JTextField textField;
	
	Myframe(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(200,40));
		textField.setFont(new Font("Consolas",Font.BOLD,30));
		textField.setForeground(new Color(0x00ff00));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);
		textField.setText("username");
		//textField.setEditable(false); //no one could modify this text field.
		
		
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button) {
			String text = textField.getText();
			if(!text.equals("username")) {
				button.enable(false);
				textField.setEditable(false);
			}
			
			System.out.println(text);
		}
	}
	
	

}
