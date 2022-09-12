package Servicios;
import Autentificacion.login;
import Conexion.Repositorio.Login_repositorio;
import Entidades.Horarios;
import Conexion.Repositorio.Profesional_repositorio;
import Entidades.Profesionales;
import Entidades.RegistroCitas;
import Entidades.ReservarCitas;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class Servicio_Login implements inteInterface_Login {

 Profesional_repositorio profesionales_repositorio = new Profesional_repositorio();
Login_repositorio login_repositorio=new Login_repositorio();




    @Override
    public Optional<login> loginVerificacion(String palabraBuscar) {

        login loginEntity= login_repositorio.ObtenerUsuario("usuario",palabraBuscar);

        Optional<login> loginOptional =Optional.ofNullable(loginEntity);

        return loginOptional;
    }

    @Override
    public List<Profesionales> obtenerListaUsuarios() {

        List<Profesionales> user = profesionales_repositorio.RetornarProfesionales();
        return user;
    }

    @Override
    public void RegistroP(Profesionales profesionales) {
        try {
            profesionales_repositorio.registrar_profesionales(profesionales);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void Editar(Profesionales profesionales) {
        try {
            profesionales_repositorio.registrar_profesionales(profesionales);
        } catch (SQLException ex) {
           System.out.println(ex);
        }
    }


    @Override
    public List<Horarios> MostrarH() {
        return null;
    }

    @Override
    public void MostrarHCita() {

    }

    @Override
    public void MostrarHProfesionales() {

    }

    @Override
    public void GuardarReservarCita(ReservarCitas citas) {

    }

    @Override
    public void GuardarRegistroCita(RegistroCitas rcitas) {

    }

    @Override
    public void AsignarSala(Integer IDregistrocitas) {

    }

    @Override
    public RegistroCitas mostrarareasaludyprofesionales(Integer ID) {
        return null;
    }

    @Override
    public ReservarCitas mostrarhoradereserva(Integer ID) {
        return null;
    }


}
