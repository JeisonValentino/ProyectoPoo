package Autentificacion;

public class login {

    String usuario;

    String Contraseña;


    public login(String usuario, String contraseña) {
        this.usuario = usuario;
        Contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

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
