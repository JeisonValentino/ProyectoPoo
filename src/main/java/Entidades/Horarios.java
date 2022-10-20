package Entidades;



public class Horarios {
private String IDhorarios;

    private String HProfesionales;
private String idProfesional;
    public Horarios() {
    }

    public Horarios( String HProfesionales ,String IDhorarios) {

        this.IDhorarios=IDhorarios;
        this.HProfesionales = HProfesionales;
    }

    public String getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(String idProfesional) {
        this.idProfesional = idProfesional;
    }

    public String getIDhorarios() {
        return IDhorarios;
    }

    public void setIDhorarios(String IDhorarios) {
        this.IDhorarios = IDhorarios;
    }

    /**
     * @return the HAtencion
     */

    /**
     * @return the HProfesionales
     */
    public String getHProfesionales() {
        return HProfesionales;
    }

    /**
     * @param HProfesionales the HProfesionales to set
     */
    public void setHProfesionales(String HProfesionales) {
        this.HProfesionales = HProfesionales;
    }
}
