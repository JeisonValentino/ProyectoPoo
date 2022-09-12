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
public class ReporteCitas {
    private int CitasRegistradas;
    private String Descripcion;
    private String EstadoCita;
    private String AsignacionProfesional;


    public ReporteCitas() {
        CitasRegistradas=Integer.parseInt(JOptionPane.showInputDialog(" Cuantas citas han sido registradas "));
        Descripcion = JOptionPane.showInputDialog("Descripcion del reporte");
        EstadoCita = JOptionPane.showInputDialog("En que estado se encuentra la cita");
        AsignacionProfesional = JOptionPane.showInputDialog("Que profesional se asigno en la cita");

    }
    public String datos(){
        String cadena = null ;


        cadena = cadena+"\nCitasRegistradas: "+CitasRegistradas;
        cadena = cadena+"\nDescripcion: "+Descripcion;
        cadena = cadena+"\nEstadoCita: "+EstadoCita;
        cadena = cadena+"\nAsignacionProfesional: "+AsignacionProfesional;
        return cadena;
    }

    public int getCitasRegistradas() {
        return CitasRegistradas;
    }

    public void setCitasRegistradas(int CitasRegistradas) {
        this.CitasRegistradas = CitasRegistradas;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getEstadoCita() {
        return EstadoCita;
    }

    public void setEstadoCita(String EstadoCita) {
        this.EstadoCita = EstadoCita;
    }

    public String getAsignacionProfesional() {
        return AsignacionProfesional;
    }

    public void setAsignacionProfesional(String AsignacionProfesional) {
        this.AsignacionProfesional = AsignacionProfesional;
    }

}
