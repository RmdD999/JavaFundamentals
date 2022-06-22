import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {
    JComboBox comboBox;
    Myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        Integer[] numbers = {1,3,4}; //use wrapper class for Intergers
        String[] animals ={"Dog","Cat","Tiger"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        comboBox.setEditable(true); // could edit on the options
        System.out.println(comboBox.getItemCount());
        comboBox.addItem("Horse");
        comboBox.removeItem("Cat");
        comboBox.removeItemAt(0);
        //comboBox.removeAllItems(); //remove all items
        comboBox.insertItemAt("Pig",0); //add at the beginning
        comboBox.setSelectedIndex(0); //first runs select index as 0

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
