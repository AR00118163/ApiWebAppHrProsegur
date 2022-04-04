DROP TABLE IF EXISTS APP_VW_PERSONA;

CREATE TABLE APP_VW_PERSONA (
  id_pais VARCHAR(4),
  id_persona VARCHAR(10) PRIMARY KEY,
  apellido VARCHAR(250) NOT NULL,
  nombres VARCHAR(250) DEFAULT NULL
);

DROP TABLE IF EXISTS APP_VW_FAMILIARES;

CREATE TABLE APP_VW_FAMILIARES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);