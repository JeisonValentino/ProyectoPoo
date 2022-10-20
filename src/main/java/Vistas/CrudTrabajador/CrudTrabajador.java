package Vistas.CrudTrabajador;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CrudTrabajador {
    private JPanel panel1;
    private JButton crearButton;
    private JButton guardarButton;
    private JButton editarButton;
    private JButton monstrarButton;
    private JTextField textFieldNombre;
    private JTextField textFieldDni;
    private JTextField textFieldTipoProfesion;
    private JTextField textFieldAreaTrabajo;
    private JTable TablaTrabajadores;


    public JPanel getPanel1() {
        return panel1;
    }


public CrudTrabajador(){
        createTable();
}

public void createTable(){

    TablaTrabajadores.setModel(new DefaultTableModel(
            null,new String[]{"Nombre","Dni","IDProfesional","TipoDeProfesion","AreaTrabajo"}
    ));
}



}
