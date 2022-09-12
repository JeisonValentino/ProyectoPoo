package Entidades;


import javax.swing.JOptionPane;


public class RegistroCitas {
    //ATRIBUTOS
    String turnocita;
    String areasalud;
    String AsignacionPersonal;
    String Modalidad;
    //METODO

    public RegistroCitas() {
    }


    public RegistroCitas(String turnocita, String areasalud, String AsignacionPersonal, String Modalidad) {
        this.turnocita = turnocita;
        this.areasalud = areasalud;
        this.AsignacionPersonal = AsignacionPersonal;
        this.Modalidad = Modalidad;
    }

    public String getTurnocita() {
        return turnocita;
    }

    public void setTurnocita(String turnocita) {
        this.turnocita = turnocita;
    }

    public String getAreasalud() {
        return areasalud;
    }

    public void setAreasalud(String areasalud) {
        this.areasalud = areasalud;
    }

    public String getAsignacionPersonal() {
        return AsignacionPersonal;
    }

    public void setAsignacionPersonal(String AsignacionPersonal) {
        this.AsignacionPersonal = AsignacionPersonal;
    }

    public String getModalidad() {
        return Modalidad;
    }

    public void setModalidad(String Modalidad) {
        this.Modalidad = Modalidad;
    }


    }

