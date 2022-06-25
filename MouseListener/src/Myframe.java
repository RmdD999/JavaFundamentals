import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Myframe extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon angryIcon = new ImageIcon("MouseListener/icons8-angry-48.png");
    ImageIcon happyIcon = new ImageIcon("MouseListener/icons8-comedy-48.png");
    ImageIcon quietIcon = new ImageIcon("MouseListener/icons8-face-without-mouth-48.png");
    ImageIcon sadIcon = new ImageIcon("MouseListener/icons8-sad-64.png");
    Myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.setBounds(0,0,100,100);
        //label.setBackground(Color.red);
        label.setIcon(happyIcon);
        label.setOpaque(true);
        this.addMouseListener(this);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        System.out.println("You clicked the mouse!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        System.out.println("You pressed the mouse!");
//        label.setBackground(Color.yellow);
        label.setIcon(angryIcon);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //Invoked when a mouse button has been released on a component
        System.out.println("You released the mouse!");
//        label.setBackground(Color.green);
        label.setIcon(quietIcon);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when the mouse enters a component
        System.out.println("You entered the component!");
        label.setIcon(sadIcon);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        System.out.println("You exited the component!");
//        label.setBackground(Color.red);
        label.setIcon(happyIcon);
    }
}
