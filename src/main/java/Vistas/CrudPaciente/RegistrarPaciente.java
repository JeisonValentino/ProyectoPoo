package Vistas.CrudPaciente;

import Entidades.Paciente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarPaciente {
    private JPanel panel1;
    private JButton crearPacienteButton;
    private JTextField textFieldNombre;
    private JTextField textFieldApellidos;
    private JTextField textFieldGenero;
    private JTextField textFieldDirrecion;
    private JTextField textFieldNumeroTelefono;
    private JTextField textFieldEdad;
    private JTextField textFieldDni;

    public RegistrarPaciente() {
        crearPacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
Paciente paciente =new Paciente();


            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
