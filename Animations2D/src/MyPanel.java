import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundImg;
    Timer timer;
    int xVelocity = 10 ;
    int yVelocity = 5;
    int x = 0;
    int y = 0;
    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy = new ImageIcon("Animations2D/icons8-hamburger-100.png").getImage();
        backgroundImg = new ImageIcon("Animations2D/pexels-eberhard-grossgasteiger-844297.jpg").getImage();
        timer = new Timer(10,this);
        timer.start();
    }

    public void paint(Graphics g){

        super.paint(g); // paint background

        Graphics g2D = (Graphics) g;
        g2D.drawImage(backgroundImg,0,0,null);
        g2D.drawImage(enemy,x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + xVelocity; // run first
        y = y + yVelocity;
        if((x >= (PANEL_WIDTH-enemy.getWidth(null))||x <0)){
            xVelocity = -1 * xVelocity;
        }

        if((y >= PANEL_HEIGHT - (enemy.getHeight(null))|| y < 0)){
            yVelocity = -1 * yVelocity;
        }

        repaint();
    }
}
