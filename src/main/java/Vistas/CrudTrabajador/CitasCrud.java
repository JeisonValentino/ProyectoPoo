package Vistas.CrudTrabajador;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CitasCrud {
    private JPanel panel1;
    private JLabel laberl;
    private JTable TablaCita;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton crearButton;
    private JButton modificarButton;
    private JButton monstrarButton;
    private JButton editarButton;


    public JPanel getPanel1() {
        return panel1;
    }

    public CitasCrud(){

crearTable();
    }

    public void crearTable(){
        TablaCita.setModel(new DefaultTableModel(
                null,new String[]{"turnocita","areasalud","AsignacionPersonal","Modalidad","EstadoCita"}
        ));

    }
}
