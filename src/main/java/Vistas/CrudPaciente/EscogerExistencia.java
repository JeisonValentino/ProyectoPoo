package Vistas.CrudPaciente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscogerExistencia {
    private JPanel panel1;
    private JButton ingresarButton;
    private JButton registrarseButton;


    public EscogerExistencia() {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.removeAll();
                panel1.repaint();
                panel1.revalidate();
                panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
                CitasCrudPaciente citasCrudPaciente=new CitasCrudPaciente();
                panel1.add(citasCrudPaciente.getPanel1());
                panel1.revalidate();
                panel1.repaint();
            }
        });
        registrarseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.removeAll();
                panel1.repaint();
                panel1.revalidate();
                panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
                RegistrarPaciente registrarPaciente=new RegistrarPaciente();
                panel1.add(registrarPaciente.getPanel1());
                panel1.revalidate();
                panel1.repaint();
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
