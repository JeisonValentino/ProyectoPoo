package Conexion.Repositorio;

import Conexion.Conexion;
import Entidades.Paciente;
import Entidades.Profesionales;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Paciente_repositorio {


    public void registrar_paciente(Paciente paciente) throws SQLException {
        Conexion con = new Conexion();
        Statement st= con.conectar().createStatement();
        ResultSet consulta=null;



    }

}
