create database programa_base_coches;

create table usuarios(
nombre varchar(20),
contraseña varchar(20),
constraint usu_nom_pk primary key (nombre)
);

create table coches(
marca varchar(20),
modelo varchar(20),
anyo varchar(4),
constraint coc_mod_pk primary key (modelo)
);

insert into usuarios(nombre, contraseña) values
('bobesponja','burgercangreburger'),
('vivavegetta','pmwqhac'),
('joseantonio','aeffyja'),
('knuckles','douknowtheway'),
('willsmith','youtuberewind'),
('gabenewell','steamsales'),
('vegetta888','123willyrex'),
('sanic','gottagofast'),
('ironman','cheesburger'),
('espiderman','comodijoeltioben');

insert into coches(marca, modelo, anyo) values
('Nissan','GTR-34','1999'),
('Nissan','GTR-35','2012'),
('Ford','GT','2005'),
('Ford','Crown Victoria','2002'),
('BMW','M3','2006'),
('BMW','M4','2014'),	
('Ferrari','F40 C','1992'),
('Ferrari','288 GTO','1984'),
('Mclaren','Senna','2018'),
('Aston Martin','Vulcan','2015');
