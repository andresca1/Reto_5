-- ---------------------- - Para la base de Datos --------------------------------------------

CREATE DATABASE RETO_5db;
USE RETO_5db;


-- --------------------------Para Pelicula --------------------------------------------------------

CREATE TABLE IF NOT EXISTS pelicula(
	id_pelicula INT AUTO_INCREMENT,
    titulo VARCHAR(50) NOT NULL,
    resumen VARCHAR(500) NOT NULL,
    anio YEAR NOT NULL,
    nombre_director CHAR(50) NOT NULL,
	PRIMARY KEY(id_pelicula)
);

INSERT INTO pelicula (titulo, resumen, anio, nombre_director)
VALUES
("Los Vengadores", "Pelicula de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra.", "1990", "Joss Whedon"),

("Interestelar", "Pelicula de ciencia ficción, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajan a traves de un agujero de gusano en busca de un nuevo hogar.", "2014", "Christopher Nolan"),

("El viaje de Chihiro", "Pelicula de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.", "2001", "Hayo Miyazaki"),

("Parasitos", "Pelicula de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano.", "2019", "Bong Joon-ho"),

("Mas alla de los sueños", "Pelicula de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.", "1998", "Vincent Ward");


-- -------------------------------- Para serie -------------------------------------------------------

CREATE TABLE IF NOT EXISTS serie(
	id_serie INT AUTO_INCREMENT,
    titulo VARCHAR(50) NOT NULL,
    num_episodios INT NOT NULL,
    num_temporadas INT NOT NULL,
    PRIMARY KEY(id_serie)
);

INSERT INTO serie(titulo, num_episodios, num_temporadas)
VALUES
("The walking dead", 153, 11),
("Viaje a las estrellas: la serie original", 80, 3),
("Glow", 30 , 3),
("La casa de papel", 31, 4),
("Friends", 236, 10),
("Arrow", 170, 8),
("The big bang theory", 279, 12),
("Vikingos", 79, 6);

-- -------------------------- Para Director --------------------------------------------------------

CREATE TABLE IF NOT EXISTS director(
	id_director INT,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    nacionalidad VARCHAR(50) NOT NULL,
    PRIMARY KEY(id_director)
);

INSERT INTO director
VALUES
(101, "Hayo","Miyazaki", "japones"),
(102, "Joss", "Whedon", "estadounidense"),
(103, "Christopher", "Nolan", "estadounidense"),
(104, "Bong", "Joon-ho", "coreano"),
(105, "Vincent", "Ward", "neozelandes");

-- -------------------------  Usiario ------------------------------------------------------------

CREATE TABLE IF NOT EXISTS usuario(
	id_username VARCHAR(20),
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    celular VARCHAR(10) NOT NULL,
    contrasenia VARCHAR(20) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    PRIMARY KEY(id_username)
);
INSERT INTO usuario
VALUES
("lucky", "Pedro", "Perez", "pepe@gmail.com", "3124567895", "pepe312", "2000-01-01"),
("malopez", "Maria", "Lopez", "malo@gmail.com", "3154875429", "malo312", "2000-02-02"),
("diva", "Ana", "Diaz", "andi@gmail.com", "3145147845", "andi312", "2000-03-05"),
("dreamer", "Luis", "Rojas", "luro@gmail.com", "3178459685", "luro312", "1993-05-01"),
("ninja", "Andres", "Cruz", "ancrgmail.com", "3158558796", "ancr312", "1998-07-09"),
("neon", "Nelson", "Ruiz", "neru@gmail.com", "3102365895", "neru312", "2002-10-11"),
("rose", "Claudia", "Mendez", "clme@gmail.com", "3185474569", "clme312", "1985-08-10"),
("green", "Jorge", "Rodriguez", "joro@gmail.com", "3145874693", "joro312", "1999-12-12");


-- ------------------------ Para Transmision ------------------------------------------------------

CREATE TABLE IF NOT EXISTS transmision(
	id_transmision INT AUTO_INCREMENT,
    id_username VARCHAR(50) NOT NULL,
    contenido VARCHAR(50) NOT NULL,
    fecha_visualizacion DATETIME NOT NULL,
    PRIMARY KEY(id_transmision),
    FOREIGN KEY (id_username) REFERENCES usuario(id_username)
);

-- ALTER TABLE Transmision ADD FOREIGN KEY (id_username) REFERENCES Usuario(id_username);

INSERT INTO transmision(id_username, contenido, fecha_visualizacion)
VALUES
("lucky", "Los Vengadores", '2017-10-25 20:00:00'),
("lucky", "Parasitos", '2019-03-15 18:30:00'),
("lucky", "La casa de papel", '2019-05-20 20:30:00'),
("malopez", "Los Vengadores", '2018-05-20 20:30:00'),
("malopez", "La casa de papel", '2020-01-20 20:30:00'),
("diva", "Interestelar", '2019-05-20 20:30:00'),
("diva", "El viaje de Chihiro", '2018-06-22 21:30:00'),
("diva", "The walking dead", '2020-03-17 15:30:20'),
("dreamer", "The walking dead", '2020-03-17 15:30:20'),
("dreamer", "Viaje a las estrellas: la serie original", '2020-04-10 18:30:20'),
("ninja", "Glow", '2020-02-17 20:30:20'),
("ninja", "La casa de papel", '2020-02-20 16:30:20'),
("ninja", "Arrow", '2020-03-27 18:30:20'),
("rose", "Friends", '2020-03-20 21:30:20'),
("green", "Interestelar", '2020-01-10 17:30:20'),
("green", "Parasitos",  '2020-02-15 20:30:20'),
("green", "Mas alla de los sueños", '2020-03-17 18:30:20');