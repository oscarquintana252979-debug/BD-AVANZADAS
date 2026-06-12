CREATE DATABASE IF NOT EXISTS control_laboratorios_itson;
USE control_laboratorios_itson;

CREATE TABLE unidadAcademica (
    idUnidad INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);

CREATE TABLE carrera (
    idCarrera INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    limiteDiario INT NOT NULL
);

CREATE TABLE centroLaboratorio (
    idLaboratorio INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    horaInicio TIME NOT NULL,
    horaCierre TIME NOT NULL,
    contraseñaMaestra VARCHAR(255) NOT NULL,
    idUnidad INT NOT NULL,
    FOREIGN KEY (idUnidad) REFERENCES unidadAcademica(idUnidad)
);

CREATE TABLE encargadoLaboratorio (
    idEncargado INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    idLaboratorio INT NOT NULL,
    FOREIGN KEY (idLaboratorio) REFERENCES centroLaboratorio(idLaboratorio)
);

CREATE TABLE computadora (
    idComputadora INT AUTO_INCREMENT PRIMARY KEY,
    numeroMaquina INT NOT NULL,
    direccionIP VARCHAR(45) UNIQUE NOT NULL,
    estatus VARCHAR(20) NOT NULL,
    tipo VARCHAR(50),
    idLaboratorio INT NOT NULL,
    FOREIGN KEY (idLaboratorio) REFERENCES centroLaboratorio(idLaboratorio)
);

CREATE TABLE software (
    idSoftware INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    version VARCHAR(50)
);

CREATE TABLE alumno (
    idAlumno VARCHAR(20) PRIMARY KEY,
    nombres VARCHAR(100) NOT NULL,
    apellidoPaterno VARCHAR(100) NOT NULL,
    apellidoMaterno VARCHAR(100),
    contraseña VARCHAR(255) NOT NULL,
    esInscrito BOOLEAN NOT NULL,
    idCarrera INT NOT NULL,
    FOREIGN KEY (idCarrera) REFERENCES carrera(idCarrera)
);

CREATE TABLE computadora_software (
    idComputadora INT NOT NULL,
    idSoftware INT NOT NULL,
    PRIMARY KEY (idComputadora, idSoftware),
    FOREIGN KEY (idComputadora) REFERENCES computadora(idComputadora),
    FOREIGN KEY (idSoftware) REFERENCES software(idSoftware)
);

CREATE TABLE reserva (
    idReserva INT AUTO_INCREMENT PRIMARY KEY,
    fechaHoraApartado DATETIME NOT NULL,
    fechaHoraInicio DATETIME,
    fechaHoraFin DATETIME,
    idAlumno VARCHAR(20) NOT NULL,
    idComputadora INT NOT NULL,
    FOREIGN KEY (idAlumno) REFERENCES alumno(idAlumno),
    FOREIGN KEY (idComputadora) REFERENCES computadora(idComputadora)
);

CREATE TABLE bloqueo (
    idBloqueo INT AUTO_INCREMENT PRIMARY KEY,
    motivo TEXT NOT NULL,
    fechaHoraInicio DATETIME NOT NULL,
    fechaHoraFin DATETIME,
    idAlumno VARCHAR(20) NOT NULL,
    idEncargado INT NOT NULL,
    FOREIGN KEY (idAlumno) REFERENCES alumno(idAlumno),
    FOREIGN KEY (idEncargado) REFERENCES encargadoLaboratorio(idEncargado)
);