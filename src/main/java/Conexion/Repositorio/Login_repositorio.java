package Conexion.Repositorio;

import Autentificacion.login;
import Conexion.Conexion;
import Conexion.consultas.consultaDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

public class Login_repositorio {

    consultaDatabase d=new consultaDatabase();


    public void CrearUsuario(login loginEntity)throws SQLException {
        Conexion con = new Conexion();
        Statement st= con.conectar().createStatement();
        ResultSet consulta=null;

        consulta =st.executeQuery("insert into login (usuario, contraseña) values('"+ loginEntity.getUsuario()+ "' , '"+ loginEntity.getContraseña()+ "')");

    }

    public login ObtenerUsuario(String variableBd,String PalabraBuscar){


        ResultSet re= d.busquedaSimple("login",variableBd,PalabraBuscar);
        login loginEntity =new login();


            try {


    while (re.next()) {

        loginEntity.setUsuario(re.getString("usuario"));
        loginEntity.setContraseña(re.getString("contraseña"));
    }


            } catch (Exception ex) {
                System.out.println(ex);
            }


        return loginEntity;
    }

}
