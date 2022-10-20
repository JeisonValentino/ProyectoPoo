package Conexion.Repositorio;

import Conexion.consultas.consultaDatabase;
import Entidades.RegistroCitas;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RegistroRepositorio{
    consultaDatabase d =new consultaDatabase();

    public void CrearCita(RegistroCitas registroCitas){

    }


    public RegistroCitas ObtenerCita(String idPaciente){




        return null;
    }
    public List<RegistroCitas> ObtenerListaCitas(){

        ResultSet rs =d.consultarTablaTodo("Registro_cita");
List<RegistroCitas> registroCitasList=new ArrayList<>();
        try {
            while (rs.next()) {
RegistroCitas registroCitas=new RegistroCitas();
registroCitas.setAreasalud(rs.getString(""));
                registroCitas.setAsignacionPersonal(rs.getString(""));
                registroCitas.setModalidad(rs.getString(""));
                registroCitas.setTurnocita(rs.getString(""));
                registroCitasList.add(registroCitas)  ;


            }
        }catch (Exception ex ){

        }

return  registroCitasList;


    }




        }
