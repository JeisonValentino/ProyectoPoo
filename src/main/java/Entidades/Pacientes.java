/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Pacientes extends Paciente {
    private String IdPaciente;
    private String ConsultarCita;
    public Pacientes() {
        ConsultarCita=JOptionPane.showInputDialog(" Hay Cita para este paciente? ");
    }
    public void generar(){
        IdPaciente="C"+getEdad()+getGenero()+"()"+getApellidos();
    }
     public String datos(){
        String cadena;
        generar();
        cadena =info()+"\nInformacion del Paciente";
        cadena = cadena+"\nIdPaciente: "+IdPaciente;
        cadena = cadena+"\nConsultarCita: "+ConsultarCita;
        return cadena;
    }

    public String getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(String IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    public String getConsultarCita() {
        return ConsultarCita;
    }

    public void setConsultarCita(String ConsultarCita) {
        this.ConsultarCita = ConsultarCita;
    }

}
