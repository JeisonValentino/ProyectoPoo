/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion.Repositorio;


import Conexion.Conexion;
import Entidades.ReservarCitas;

import java.sql.ResultSet;
import java.sql.Statement;


public class ReservarCitas_Repositorio {
        Conexion con = new Conexion();
        Statement st;
        ResultSet rs = null;


    public void guardarcitas(ReservarCitas reservarCitas){
        try {
            st = con.conectar().createStatement();
            rs = st.executeQuery("INSET INTO reservaCita (HorarioReserva,AsignacionSala,ModalidadCitas)"
                    + " values ('"+reservarCitas.getAsignacionSala()+"' , '" +reservarCitas.getHorarioReserva()+"' ,'"+

                          reservarCitas.getModalidadCitas()+"'))");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }


    }
}
