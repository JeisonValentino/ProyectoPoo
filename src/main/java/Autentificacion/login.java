package Autentificacion;

import java.util.Objects;

public class login {

    String usuario;

    String Contraseña;

    public login(){

    }
    public login(String usuario, String contraseña) {
        this.usuario = usuario;
        Contraseña = contraseña;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        login login = (login) o;
        return usuario.equals(login.usuario) && Contraseña.equals(login.Contraseña);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, Contraseña);
    }

    public String getUsuario() {

        if(this.usuario==null){
            return null;
        }else{


        return usuario;
    }}

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}
