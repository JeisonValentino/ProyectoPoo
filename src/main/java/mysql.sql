show databases;
use pobjetos_curso;
drop table Registro_cita;
drop table horarios;
drop table profesionales ;
drop table login ;
drop table paciente;


create table login(id int not null primary key auto_increment  , usuario varchar(20) not null
    ,contraseña varchar(20));

insert into login (id, usuario, contraseña) VALUES (1,"jeison","soypoderoso");
create table profesionales (IDprofesionales varchar(20) not null primary key
    ,nombre varchar(20) not null , dni integer not null
    , TipoDeProfesion varchar(20) not null,areaTrabajo varchar(20) not null,idLogin int
    , CONSTRAINT FK_idLogin FOREIGN KEY (idLogin) REFERENCES login(id) );

create table Paciente(IdPaciente varchar(20) not null primary key ,nombre varchar(20) not null
                     ,apellidos varchar(20) not null, genero varchar(20) not null , NombreCompleto varchar(20) not null
                      , Dirrecion varchar(20) not null ,NumeroTelefono varchar(20)
                     not null , edad int not null
                     );


create table horarios (IDhorarios varchar(20) not null primary key
                      , HorarioProfesional date not null
                      ,idProfesional varchar(20) not null
                      ,CONSTRAINT fk_idProfesional
                          FOREIGN KEY( idProfesional )
                      references Profesionales(IDprofesionales)
                      );

create table Registro_cita(idCita varchar(20) not null primary key , turnoCita DATE not null
                          , area_Salud varchar(20) not null,modalidad varchar(20) not null
                          , asignacion_fk_idprofesional_id varchar(20) not null,
                          asignacion_Paciente_id varchar(20) not null ,
                           CONSTRAINT fk_profesional FOREIGN KEY (asignacion_fk_idprofesional_id) REFERENCES profesionales(IDprofesionales),
                           CONSTRAINT fk_idPaciente FOREIGN KEY (asignacion_Paciente_id) REFERENCES Paciente(IdPaciente)
                           );
