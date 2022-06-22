import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    ProgressBarDemo(){

        //create  JProgressBar
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true); //add percentage
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);


        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }


    public void fill(){
        int counter = 0;
        while (counter>=counter){
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            counter += 1;
        }

        bar.setString("Done :)");



    }
}
