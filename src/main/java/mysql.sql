show databases;
use pobjetos_curso;
create table login(id int not null primary key , usuario varchar(20) not null
    ,contraseña varchar(20));

create table profesionales (IDprofesionales varchar(20) not null primary key
                           ,nombre varchar(20) not null , dni integer not null
                           , TipoDeProfesion varchar(20) not null,areaTrabajo varchar(20) not null
                           , CONSTRAINT idLogin FOREIGN KEY (IDprofesionales) REFERENCES login(id) );


