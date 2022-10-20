package Vistas.CrudTrabajador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalTrabajador  extends JFrame {

    private JPanel panel1;
    private JButton trabajadorButton;
    private JButton citasButton;
    private JPanel Jmenu;
    private JPanel Responsive;

    public PrincipalTrabajador(){

        add(panel1 );//agregar el panel a la clase vista al iniciar
        setSize(900,500);//para las dimenciones de la ventanta
        setLocationRelativeTo(null); //para centrar el panel
        setTitle("Sistema de citas medicas ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        trabajadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Responsive.removeAll();
                Responsive.repaint();
                Responsive.revalidate();
                Responsive.setLayout(new BoxLayout(Responsive, BoxLayout.PAGE_AXIS));
                CrudTrabajador vistaGuardar=new CrudTrabajador();
                Responsive.add(vistaGuardar.getPanel1());
                Responsive.revalidate();
                Responsive.repaint();
            }
        });
        citasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Responsive.removeAll();
                Responsive.repaint();
                Responsive.revalidate();
                Responsive.setLayout(new BoxLayout(Responsive, BoxLayout.PAGE_AXIS));
             CitasCrud citasCrud=new CitasCrud();
                Responsive.add(citasCrud.getPanel1());
                Responsive.revalidate();
                Responsive.repaint();
            }
        });
    }



}
