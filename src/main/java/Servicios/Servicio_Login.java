package Servicios;

import Autentificacion.login;
import Entidades.Usuario;
import Repositorio.Usuario_repositorio;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.sql.ResultSet;
public class Servicio_Login implements inteInterface_Login {

 Usuario_repositorio usuario_repositorio = new Usuario_repositorio();

    @Override
    public Optional<login> loginVerificacion() {
        return Optional.empty();
    }

    @Override
    public List<Usuario> obtenerListaUsuarios() {
        System.out.println("paso lista user ");
        List<Usuario> user = usuario_repositorio.obtenerListaUsuario();
        return user;
    }




}
