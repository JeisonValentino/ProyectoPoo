package Entidades;

import java.util.Optional;

public class Usuario {


    Integer UsuCod ;
    String UsuNom;
    String UsuUser;
    String UsuPass;
    String UsuAct;
    Integer UsuEdad;
    String UsuDni;
    Integer Paicod;

    public Usuario(){

    }
    public Usuario(Integer usuCod, String usuNom, String usuUser, String usuPass, String usuAct, Integer usuEdad, String usuDni, Integer paicod) {
        UsuCod = usuCod;
        UsuNom = usuNom;
        UsuUser = usuUser;
        UsuPass = usuPass;
        UsuAct = usuAct;
        UsuEdad = usuEdad;
        UsuDni = usuDni;
        Paicod = paicod;
    }

    public Integer getUsuCod() {
        return UsuCod;
    }

    public void setUsuCod(Integer usuCod) {
        UsuCod = usuCod;
    }

    public String getUsuNom() {
        return UsuNom;
    }

    public void setUsuNom(String usuNom) {
        UsuNom = usuNom;
    }

    public String getUsuUser() {
        return UsuUser;
    }

    public void setUsuUser(String usuUser) {
        UsuUser = usuUser;
    }

    public String getUsuPass() {
        return UsuPass;
    }

    public void setUsuPass(String usuPass) {
        UsuPass = usuPass;
    }

    public String getUsuAct() {
        return UsuAct;
    }

    public void setUsuAct(String usuAct) {
        UsuAct = usuAct;
    }

    public Integer getUsuEdad() {
        return UsuEdad;
    }

    public void setUsuEdad(Integer usuEdad) {
        UsuEdad = usuEdad;
    }

    public String getUsuDni() {
        return UsuDni;
    }

    public void setUsuDni(String usuDni) {
        UsuDni = usuDni;
    }

    public Integer getPaicod() {
        return Paicod;
    }

    public void setPaicod(Integer paicod) {
        Paicod = paicod;
    }
}
