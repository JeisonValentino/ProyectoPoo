package Conexion.consultas;

import Conexion.Conexion;

import java.sql.ResultSet;
import java.sql.Statement;

public class consultaDatabase {







    public ResultSet  consultarTablaTodo(String NombreTabla ) {
        Conexion con = new Conexion();
        Statement st;
        ResultSet rs = null;
        try {
            st = con.conectar().createStatement();
            rs = st.executeQuery("select * from ".concat(NombreTabla));
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return rs;
    }


}
