show databases;
use pobjetos_curso;
create table login(id int not null primary key , usuario varchar(20) not null
    ,contraseña varchar(20));
create table profesionales (IDprofesionales varchar(20) not null primary key
    ,nombre varchar(20) not null , dni integer not null
    , TipoDeProfesion varchar(20) not null,areaTrabajo varchar(20) not null,idLogin int
    , CONSTRAINT FK_idLogin FOREIGN KEY (idLogin) REFERENCES login(id) );

create table Paciente(IdPaciente varchar(20) not null primary key ,nombre varchar(20) not null
                     ,apellidos varchar(20) not null, genero varchar(20) not null , NombreCompleto varchar(20) not null
                     ,genero varchar(20) not null , Dirrecion varchar(20) not null ,NumeroTelefono varchar(20)
                     not null , edad int not null
                     );


create table horarios (IDhorarios varchar(20) not null primary key , HorarioProfesioanl date not null
                      ,idProfesional varchar(20) not null
                      ,CONSTRAINT fk_idProfesional
                          FOREIGN KEY( idProfesional )
                      references Profesionales(IDprofesionales)
                      );

create table Registro_cita(idCita varchar(20) not null primary key , turnoCita date not null
                          , area_Salud varchar(20) not null,modalidad varchar(20) not null
                          , asignacion_fk_idhorarios_id varchar(20) not null,
                          asignacion_Paciente_id varchar(20) not null ,
                           CONSTRAINT fk_idhorarios FOREIGN KEY (asignacion_fk_idhorarios_id) REFERENCES horarios(IDhorarios),
                           CONSTRAINT fk_idPaciente FOREIGN KEY (asignacion_Paciente_id) REFERENCES Paciente(IdPaciente)
                           );
