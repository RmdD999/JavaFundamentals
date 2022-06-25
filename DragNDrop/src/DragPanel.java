import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;

public class DragPanel extends JPanel {

    ImageIcon icon = new ImageIcon("D:\\Rmd\\GithubTest\\DragNDrop\\icons8-comedy-48.png");
    final int WIDTH = icon.getIconWidth();
    final int HEIGHT = icon.getIconHeight();
    Point imageCorner;
    Point prePt;

    DragPanel(){
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        icon.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter{

        @Override
        public void mousePressed(MouseEvent e){
            prePt = e.getPoint();
            System.out.println(prePt);
        }
    }

    private class DragListener extends MouseMotionAdapter{

        @Override
        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();
            imageCorner.translate(
                    (int)(currentPt.getX() - prePt.getX()),
                    (int)(currentPt.getY() - prePt.getY())
            );
            prePt = currentPt;
            repaint();
        }
    }
}
