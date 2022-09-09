package Servicios;

import Autentificacion.login;
import Entidades.Usuario;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface inteInterface_Login {


    public Optional<login> loginVerificacion();

    public List<Usuario> obtenerListaUsuarios();
}
