package Entidades;


public class ReservarCitas {
    String HorarioReserva;
    String AsignacionSala;
    String ModalidadCitas;

public ReservarCitas(String HorarioReserva, String AsignacionSala) {
        this.HorarioReserva = HorarioReserva;
        this.AsignacionSala = AsignacionSala;
    }
 public String getHorarioReserva() {
        return HorarioReserva;
    }

    public void setHorarioReserva(String HorarioReserva) {
        this.HorarioReserva = HorarioReserva;
    }

    public String getAsignacionSala() {
        return AsignacionSala;
    }

    public void setAsignacionSala(String AsignacionSala) {
        this.AsignacionSala = AsignacionSala;
    }
    public String getModalidadCitas() {
        return ModalidadCitas;
    }

    public void setModalidadCitas(String ModalidadCitas) {
        this.ModalidadCitas = ModalidadCitas;
    }

}

