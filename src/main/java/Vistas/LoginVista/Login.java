package Vistas.LoginVista;

import Autentificacion.login;
import Servicios.Servicio_Login;
import Vistas.CrudTrabajador.PrincipalTrabajador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

public class Login extends JFrame{
    private JButton ingresarButton;
    private JTextField textFieldUser;
    private JPasswordField passwordFieldContraseña;
    private JPanel panel1;
    private JLabel imgenUser;
    private JLabel Cabecera;
    private JLabel UsuarioText;
    private JLabel ContraseñaText;

    public Login(){

        add(panel1 );//agregar el panel a la clase vista al iniciar
        setSize(400,400);//para las dimenciones de la ventanta
        setLocationRelativeTo(null); //para centrar el panel
        setTitle("Sistema de citas medicas ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Boolean validacion=false;

                String usuario = textFieldUser.getText();
                String contraseña = String.valueOf(passwordFieldContraseña.getPassword());

                Servicio_Login servicio_login = new Servicio_Login();
                Optional<login> loginEntity = servicio_login.loginVerificacion(usuario);


                if(usuario.equals("")||contraseña.equals("")){
                    validacion=true;
                    JOptionPane.showMessageDialog(Login.this, "Tus datos no pueden ser vacios", "Datos Vacios",
                            JOptionPane.ERROR_MESSAGE
                    );
                }else
                    if (!usuario.equals(loginEntity.get().getUsuario())) {
                        validacion=true;
                        JOptionPane.showMessageDialog(Login.this, "Tus datos no existen", "verifica de nuevo tu identidad",
                            JOptionPane.ERROR_MESSAGE
                    );
                } else if (!contraseña.equals(loginEntity.get().getContraseña())) {
                        validacion=true;
                    JOptionPane.showMessageDialog(Login.this, "Tu contraseña no existe", "verifica los datos de tu contraseña",
                            JOptionPane.ERROR_MESSAGE
                    );


                }


                   if(!validacion){

                       setVisible(false);
                       PrincipalTrabajador principalTrabajador=new PrincipalTrabajador();
                       principalTrabajador.setVisible(true);
                   }


            }
        });
    }


}
