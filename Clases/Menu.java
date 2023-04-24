package Clases;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame{
    private JMenuBar menuBar=new JMenuBar();
    private JMenu menu_01=new JMenu("Menu Principal");
    private JMenu menu_02=new JMenu("Ayuda");    
    private JMenuItem item_01=new JMenuItem("Busqueda");
    private JMenuItem item_02=new JMenuItem("Estadistica");
    private JMenuItem item_03=new JMenuItem("Cerrar");
    private JMenuItem item_04=new JMenuItem("Acerca de");
    public Menu(){
        setJMenuBar(menuBar);
        menuBar.add(menu_01);
        menuBar.add(menu_02);
        menu_01.add(item_01);
        menu_01.add(item_02);
        menu_01.add(item_03);
        menu_02.add(item_04);

        item_03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Proyecto();
                dispose();
            }
        });

        
        
        setLocationRelativeTo(null);
        setTitle("Menu Principal");
        setSize(800, 600); 
        setResizable(false); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
        if(this.getDefaultCloseOperation()==JFrame.EXIT_ON_CLOSE){
            super.getContentPane().setVisible(true);            
        }        
    }
}
