package Entidades;



public class Profesionales {

    private String IDProfesional;
    private String Nombre;
    private Integer Dni;
    private String TipoDeProfesion;
    private String AreaTrabajo;

    public Profesionales() {
    }

    public Profesionales(String IDProfesional, String Nombre, Integer Dni, String TipoDeProfesion, String AreaTrabajo) {
        this.IDProfesional = IDProfesional;
        this.Nombre = Nombre;
        this.Dni = Dni;
        this.TipoDeProfesion = TipoDeProfesion;
        this.AreaTrabajo = AreaTrabajo;
    }



    /**
     * @return the IDProfesional
     */
    public String getIDProfesional() {
        return IDProfesional;
    }

    /**
     * @param IDProfesional the IDProfesional to set
     */
    public void setIDProfesional(String IDProfesional) {
        this.IDProfesional = IDProfesional;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Dni
     */
    public Integer getDni() {
        return Dni;
    }

    /**
     * @param Dni the Dni to set
     */
    public void setDni(Integer Dni) {
        this.Dni = Dni;
    }

    /**
     * @return the TipoDeProfesion
     */
    public String getTipoDeProfesion() {
        return TipoDeProfesion;
    }

    /**
     * @param TipoDeProfesion the TipoDeProfesion to set
     */
    public void setTipoDeProfesion(String TipoDeProfesion) {
        this.TipoDeProfesion = TipoDeProfesion;
    }

    /**
     * @return the AreaTrabajo
     */
    public String getAreaTrabajo() {
        return AreaTrabajo;
    }

    /**
     * @param AreaTrabajo the AreaTrabajo to set
     */
    public void setAreaTrabajo(String AreaTrabajo) {
        this.AreaTrabajo = AreaTrabajo;
    }

 }

