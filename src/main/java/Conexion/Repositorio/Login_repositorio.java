package Conexion.Repositorio;

import Autentificacion.login;
import Conexion.consultas.consultaDatabase;

import java.sql.ResultSet;
import java.util.Optional;

public class Login_repositorio {

    consultaDatabase d=new consultaDatabase();

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
