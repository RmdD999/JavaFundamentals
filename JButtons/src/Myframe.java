import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Myframe extends JFrame implements ActionListener{

	
	JButton button;
	JLabel label;
	
	Myframe(){
		
		ImageIcon icon2 = new ImageIcon("icons8-finn-200.png");
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150,250,150,150);
		label.setVisible(false);
		
		ImageIcon icon = new ImageIcon("icons8-joe-pineapples-16.png");
		button = new JButton();
		button.setBounds(100,100,250,50);
		button.addActionListener(this);
		button.setText("I'm a button.");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM); 
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-10);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setEnabled(false); // disable a button
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			System.out.println("Poo!");
			label.setVisible(true);
		}
		
	}

	
}
