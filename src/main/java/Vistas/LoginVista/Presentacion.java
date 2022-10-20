package Vistas.LoginVista;

import Vistas.CrudPaciente.PrincipalPaciente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presentacion extends JFrame {
    private JButton BtnIngresarLogin;
    private JPanel panel1;
    private JButton BtnIngresarCliente;


    public Presentacion(){
        add(panel1);//agregar el panel a la clase vista al iniciar
        setSize(900,500);//para las dimenciones de la ventanta
        setLocationRelativeTo(null); //para centrar el panel
        setTitle("Sistema de citas medicas ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        BtnIngresarLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Login login = new Login();
                login.setVisible(true);
            }
        });

        BtnIngresarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
                PrincipalPaciente principalPaciente=new PrincipalPaciente();
                principalPaciente.setVisible(true);
            }
        });
    }

}
