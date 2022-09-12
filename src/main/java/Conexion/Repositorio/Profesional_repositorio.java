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

         consulta =st.executeQuery("insert into profesionales (IDprofesionales , nombre,dni,TipoDeProfesion,areaTrabajo ,idLogin) " +
                 "values ('"+profesionales.getIDProfesional()+"','"+profesionales.getNombre()+"','"+profesionales.getDni()+"','"+profesionales.getTipoDeProfesion()+"','"+profesionales.getAreaTrabajo()+"','"+profesionales.getIdLogin()+"')");


    }
    public List<Profesionales> RetornarProfesionales(){


        ResultSet re= d.consultarTablaTodo("Profesionales");

        List<Profesionales> userEntityList = new ArrayList<>();
        try {
            while (re.next()) {
                Profesionales profesionalesEntity=new  Profesionales();
                profesionalesEntity.setAreaTrabajo(re.getString("areaTrabajo"));
                profesionalesEntity.setDni(re.getInt("dni"));
                profesionalesEntity.setIDProfesional(re.getString("IDprofesionales"));
                profesionalesEntity.setNombre(re.getString("nombre"));
                profesionalesEntity.setTipoDeProfesion(re.getString("TipoDeProfesion"));
                profesionalesEntity.setIdLogin(re.getInt("idLogin"));
                userEntityList.add(profesionalesEntity);
            }
        }catch (Exception ex){
            System.out.println(ex);
        }


        return userEntityList;
    }
}
