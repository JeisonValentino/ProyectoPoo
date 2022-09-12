package Servicios;

import Autentificacion.login;
import Entidades.Horarios;
import Entidades.Profesionales;
import Entidades.RegistroCitas;
import Entidades.ReservarCitas;

import java.util.List;
import java.util.Optional;

public interface inteInterface_Login {


    public Optional<login> loginVerificacion(String palabraBuscar);
    public List<Profesionales> obtenerListaUsuarios();
    public void RegistroP(Profesionales profesionales);
    public void Editar(Profesionales profesionales);
    public List<Horarios> MostrarH();
    public void MostrarHCita ();
    public void MostrarHProfesionales();
    public void GuardarReservarCita(ReservarCitas citas);
    public void GuardarRegistroCita(RegistroCitas rcitas);
    public void AsignarSala(Integer IDregistrocitas);

    public RegistroCitas mostrarareasaludyprofesionales(Integer ID);
    public ReservarCitas mostrarhoradereserva(Integer ID);


}
