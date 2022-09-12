package Entidades;



public class Horarios {

    private String HAtencion;
    private String HCita;
    private String HProfesionales;

    public Horarios() {
    }

    public Horarios(String HAtencion, String HCita, String HProfesionales) {
        this.HAtencion = HAtencion;
        this.HCita = HCita;
        this.HProfesionales = HProfesionales;
    }






    /**
     * @return the HAtencion
     */
    public String getHAtencion() {
        return HAtencion;
    }

    /**
     * @param HAtencion the HAtencion to set
     */
    public void setHAtencion(String HAtencion) {
        this.HAtencion = HAtencion;
    }

    /**
     * @return the HCita
     */
    public String getHCita() {
        return HCita;
    }

    /**
     * @param HCita the HCita to set
     */
    public void setHCita(String HCita) {
        this.HCita = HCita;
    }

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
