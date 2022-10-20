package Vistas.CrudPaciente;

import Vistas.CrudTrabajador.CrudTrabajador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalPaciente extends JFrame {


    private JPanel panel1;
    private JButton solicitarTicketButton;

    public PrincipalPaciente() {
        add(panel1);//agregar el panel a la clase vista al iniciar
        setSize(900, 500);//para las dimenciones de la ventanta
        setLocationRelativeTo(null); //para centrar el panel
        setTitle("Sistema de citas medicas ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        solicitarTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.removeAll();
                panel1.repaint();
                panel1.revalidate();
                panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
                EscogerExistencia escogerExistencia=new EscogerExistencia();
                panel1.add(escogerExistencia.getPanel1());
                panel1.revalidate();
                panel1.repaint();
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
