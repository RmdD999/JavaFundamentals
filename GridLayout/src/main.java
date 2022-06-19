import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		
		
		// LayoutManager = Defines the natural layout for components within a container
		
		// GridLayout = places components in a grid of cells.
		//              Each component takes all the available space within its cell
		//              and each cell is the same size.
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(3,3,0,0)); //9 = rows, 3 = columns 0 for horizontal margins and vertical margins
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		frame.add(new JButton("10"));
		
		frame.setVisible(true);

	}

}
