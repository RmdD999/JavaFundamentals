import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {
    JComboBox comboBox;
    Myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals ={"Dog","Cat","Tiger"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
