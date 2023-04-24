package Clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Proyecto extends JFrame {
    private JFrame frame = new JFrame("Acceso al Sistema");
    private Panel panel = new Panel();
    private JLabel lblusuario=new JLabel("Usuario: ");
    private JLabel lblpassword=new JLabel("Clave");
    private JTextField txtUsuario=new JTextField(15);
    private JTextField txtPassword=new JTextField(15);
    private JButton btnAceptar=new JButton("Aceptar");
    private JButton btnCancelar = new JButton("Salir");
    public static void main(String[] args) {
        new Proyecto();
        // principal.show();
    }

    public Proyecto() {
        panel.setLayout(null);
        lblusuario.setBounds(30,40,80,25);
        panel.add(lblusuario);
        txtUsuario.setBounds(120, 40, 160, 25);
        panel.add(txtUsuario);
        lblpassword.setBounds(30, 70, 80, 25);
        panel.add(lblpassword);
        txtPassword.setBounds(120, 70, 160, 25);
        panel.add(txtPassword);
        btnAceptar.setBounds(150,120,80,25);
        panel.add(btnAceptar);
        btnCancelar.setBounds(240, 120, 80, 25);
        panel.add(btnCancelar);        
        frame.setSize(350, 200);      
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){                
                new Menu();
                //frame.setVisible(false);                
                frame.dispose();
            }
        });
        
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });        
        frame.add(panel,BorderLayout.CENTER);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        frame.setVisible(true);
    }
}