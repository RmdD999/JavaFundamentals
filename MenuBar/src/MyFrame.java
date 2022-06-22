import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;



    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        //Icon
//        loadIcon = new ImageIcon("MenuBar/icons8-folder-100.png");
//        saveIcon = new ImageIcon("MenuBar/icons8-save-100.png");
//        exitIcon = new ImageIcon("MenuBar/icons8-close-window-100.png");

        loadIcon = new ImageIcon("MenuBar/src/icons8-folder-100.png");
        saveIcon = new ImageIcon("MenuBar/src/icons8-save-100.png");
        exitIcon = new ImageIcon("MenuBar/src/icons8-close-window-100.png");

        //init on Menubar
        menuBar= new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for file menu
        editMenu.setMnemonic(KeyEvent.VK_M); // Alt + M for edit menu
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for help menu
        loadItem.setMnemonic(KeyEvent.VK_L); // L for load
        saveItem.setMnemonic(KeyEvent.VK_S); // S for save
        exitItem.setMnemonic(KeyEvent.VK_E); // E for exit


        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem){
            System.out.println("*beep boop you loaded a file*");
        }
        if(e.getSource() == saveItem){
            System.out.println("*beep boop you saved a file*");
        }
        if(e.getSource() == exitItem){
            System.exit(0);
        }
    }
}
