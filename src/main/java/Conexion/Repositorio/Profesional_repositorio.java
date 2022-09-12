package Conexion.Repositorio;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Conexion.Conexion;
import Conexion.consultas.consultaDatabase;
import Entidades.Profesionales;

public class Profesional_repositorio {

    consultaDatabase d=new consultaDatabase();
    public void registrar_profesionales(Profesionales profesionales) throws SQLException {
        Conexion con = new Conexion();
        Statement st= con.conectar().createStatement();
        ResultSet consulta=null;

         consulta =st.executeQuery("insert into profesionales ()values ('"+profesionales.getNombre()+"','"+profesionales.getAreaTrabajo()+"','"+profesionales.getIDProfesional()+"','"+profesionales.getTipoDeProfesion()+"')");


    }
    public List<Profesionales> RetornarProfesionales(){


        ResultSet re= d.consultarTablaTodo("Profesionales");

        List<Profesionales> userEntityList = new ArrayList<>();
        try {
            while (re.next()) {
                Profesionales profesionalesEntity=new  Profesionales();
                profesionalesEntity.setAreaTrabajo(re.getString(""));
                profesionalesEntity.setDni(re.getInt(""));
                profesionalesEntity.setIDProfesional(re.getString(""));
                profesionalesEntity.setNombre(re.getString(""));
                profesionalesEntity.setTipoDeProfesion(re.getString(""));
                userEntityList.add(profesionalesEntity);
            }
        }catch (Exception ex){
            System.out.println(ex);
        }


        return userEntityList;
    }
}
