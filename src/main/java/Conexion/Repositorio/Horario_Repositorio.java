
package Conexion.Repositorio;


import Conexion.consultas.consultaDatabase;
import Entidades.Horarios;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Horario_Repositorio {
    consultaDatabase d=new consultaDatabase();
     public List<Horarios> RetornarHorarios(){


        ResultSet re= d.consultarTablaTodo("Horarios");

        List<Horarios> userEntityList = new ArrayList<>();
        try {
            while (re.next()) {
                Horarios HorariosEntity=new  Horarios();
                HorariosEntity.setHAtencion(re.getString(""));
                HorariosEntity.setHCita(re.getString(""));
                HorariosEntity.setHProfesionales(re.getString(""));
                userEntityList.add(HorariosEntity);
            }
        }catch (Exception ex){
            System.out.println(ex);
        }


        return userEntityList;
    }



}
