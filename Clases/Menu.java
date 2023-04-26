package Clases;

import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame{
    private JMenuBar menuBar=new JMenuBar();
    private JMenu menu_01=new JMenu("Menu Principal");
    private JMenu menu_02=new JMenu("Ayuda");    
    private JMenuItem item_01=new JMenuItem("Busqueda");
    private JMenuItem item_02=new JMenuItem("Estadistica");
    private JMenuItem item_03=new JMenuItem("Cerrar");
    private JMenuItem item_04=new JMenuItem("Acerca de");

    //private JFrame frameBusqueda;
    //private JFrame frameEstadistica=new JFrame("Estadistica");
    private JDesktopPane desktopPane=new JDesktopPane();
    private JInternalFrame jinternal_busqueda;
    private JInternalFrame jinternal_estadistica=new JInternalFrame("Internal Estadistica");

    public Menu(){
        this.getContentPane().add(desktopPane);
        setJMenuBar(menuBar);
        menuBar.add(menu_01);
        menuBar.add(menu_02);
        menu_01.add(item_01);
        menu_01.add(item_02);
        menu_01.add(item_03);
        menu_02.add(item_04);

        item_01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                //frameBusqueda=new JFrame("Busqueda");
                //frameBusqueda.getContentPane().add(desktopPane);
                jinternal_busqueda=new JInternalFrame("Internal Principal");
                jinternal_busqueda.pack();
                jinternal_busqueda.setResizable(true);
                jinternal_busqueda.setClosable(true);
                jinternal_busqueda.setVisible(true);
                desktopPane.add(jinternal_busqueda);
                //frameBusqueda.setSize(500, 500);
                //frameBusqueda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frameBusqueda.setVisible(true);
            }
        });
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
