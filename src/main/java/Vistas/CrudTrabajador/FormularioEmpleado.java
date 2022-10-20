package Vistas.CrudTrabajador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioEmpleado extends JPanel {


    private JPanel panel1;
    private JButton button1;

    public FormularioEmpleado() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("vista Guardar responsivo");
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
