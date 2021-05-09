-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2021-05-09 19:01:43.307

-- tables
-- Table: Empleados
CREATE TABLE Empleados (
    nro_legajo int NOT NULL,
    dni varchar(11) NOT NULL,
    apellido varchar(30) NOT NULL,
    nombre varchar(40) NOT NULL,
    fecha_nac date NOT NULL,
    fecha_incorporacion date NOT NULL,
    cargo varchar(20) NOT NULL,
    sueldo_neto double(6,2) NOT NULL,
    departamentos_id_depto int NOT NULL,
    CONSTRAINT Empleados_pk PRIMARY KEY (nro_legajo)
);

-- Table: departamentos
CREATE TABLE departamentos (
    id_depto int NOT NULL,
    nombre_depto varchar(20) NOT NULL,
    direccion_depto varchar(30) NOT NULL,
    CONSTRAINT departamentos_pk PRIMARY KEY (id_depto)
);

-- foreign keys
-- Reference: Empleados_departamentos (table: Empleados)
ALTER TABLE Empleados ADD CONSTRAINT Empleados_departamentos FOREIGN KEY Empleados_departamentos (departamentos_id_depto)
    REFERENCES departamentos (id_depto);

-- End of file.

