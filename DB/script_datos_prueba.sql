USE control_laboratorios_itson;

-- 1. PLANTEL (1 Plantel Nainari)
INSERT INTO unidadacademica (nombre) VALUES ('Campus Nainari');

-- 2. LABORATORIOS (2 ligados a Nainari)
INSERT INTO centrolaboratorio (nombre, horaInicio, horaCierre, contraseñaMaestra, idUnidad) VALUES 
('Laboratorio CISCO', '07:00:00', '21:00:00', 'admincisco', 1),
('Laboratorio Biblioteca', '08:00:00', '20:00:00', 'adminbiblio', 1);

-- Insertamos a los encargados de esos laboratorios
INSERT INTO encargadolaboratorio (nombre, idLaboratorio) VALUES 
('Velia Bojorquez', 1),
('Andrei Alvarez', 2);

-- 3. CARRERAS (5 Carreras)
INSERT INTO carrera (nombre, limiteDiario) VALUES 
('Ingeniería en Software', 120),
('Ingeniería Industrial y de Sistemas', 90),
('Ingeniería en Mecatrónica', 120),
('Licenciatura en Administración', 60),
('Licenciatura en Diseño Gráfico', 180);


-- 4. ALUMNOS (50 Alumnos, 10 por carrera)
-- Carrera 1: Ing. en Software
INSERT INTO alumno (idAlumno, nombres, apellidoPaterno, apellidoMaterno, contraseña, esInscrito, idCarrera) VALUES
('220001', 'Julian', 'Aguirre', 'Salazar', 'pass123', true, 1),
('220002', 'Oscar', 'Quintana', 'Morales', 'pass123', true, 1),
('220003', 'Edgar', 'Verdugo', 'Flores', 'pass123', true, 1),
('220004', 'Christian', 'Valenzuela', 'Gomez', 'pass123', true, 1),
('220005', 'Mario', 'Bros', 'Nintendo', 'pass123', true, 1),
('220006', 'Luis', 'Perez', 'Lopez', 'pass123', true, 1),
('220007', 'Ana', 'Garcia', 'Ruiz', 'pass123', true, 1),
('220008', 'Maria', 'Soto', 'Valdez', 'pass123', true, 1),
('220009', 'Jorge', 'Ramos', 'Silva', 'pass123', true, 1),
('220010', 'Diana', 'Vega', 'Cruz', 'pass123', true, 1);

-- Carrera 2: Ing. Industrial
INSERT INTO alumno (idAlumno, nombres, apellidoPaterno, apellidoMaterno, contraseña, esInscrito, idCarrera) VALUES
('220011', 'Carlos', 'Ruiz', 'Mendez', 'pass123', true, 2),
('220012', 'Fernanda', 'Lugo', 'Cortes', 'pass123', true, 2),
('220013', 'Pedro', 'Gomez', 'Vargas', 'pass123', true, 2),
('220014', 'Lucia', 'Molina', 'Rios', 'pass123', true, 2),
('220015', 'Raul', 'Castro', 'Peña', 'pass123', true, 2),
('220016', 'Sofia', 'Ortiz', 'Luna', 'pass123', true, 2),
('220017', 'Diego', 'Navarro', 'Rojas', 'pass123', true, 2),
('220018', 'Valeria', 'Guerrero', 'Sosa', 'pass123', true, 2),
('220019', 'Andres', 'Campos', 'Vega', 'pass123', true, 2),
('220020', 'Paula', 'Delgado', 'Mora', 'pass123', true, 2);

-- Carrera 3: Ing. en Mecatrónica
INSERT INTO alumno (idAlumno, nombres, apellidoPaterno, apellidoMaterno, contraseña, esInscrito, idCarrera) VALUES
('220021', 'Roberto', 'Rojas', 'Salinas', 'pass123', true, 3),
('220022', 'Elena', 'Paredes', 'Guzman', 'pass123', true, 3),
('220023', 'Hugo', 'Suarez', 'Cano', 'pass123', true, 3),
('220024', 'Carmen', 'Ibarra', 'Rios', 'pass123', true, 3),
('220025', 'Javier', 'Macias', 'Vera', 'pass123', true, 3),
('220026', 'Patricia', 'Escobar', 'Lara', 'pass123', true, 3),
('220027', 'Ricardo', 'Galvan', 'Moya', 'pass123', true, 3),
('220028', 'Teresa', 'Aguilar', 'Pinto', 'pass123', true, 3),
('220029', 'Fernando', 'Solis', 'Mejia', 'pass123', true, 3),
('220030', 'Gloria', 'Orozco', 'Bautista', 'pass123', true, 3);

-- Carrera 4: Lic. en Administración
INSERT INTO alumno (idAlumno, nombres, apellidoPaterno, apellidoMaterno, contraseña, esInscrito, idCarrera) VALUES
('220031', 'Arturo', 'Franco', 'Leal', 'pass123', true, 4),
('220032', 'Silvia', 'Bravo', 'Cabrera', 'pass123', true, 4),
('220033', 'Eduardo', 'Maldonado', 'Pacheco', 'pass123', true, 4),
('220034', 'Rosa', 'Velasco', 'Padilla', 'pass123', true, 4),
('220035', 'Sergio', 'Cordova', 'Rangel', 'pass123', true, 4),
('220036', 'Monica', 'Salas', 'Zavala', 'pass123', true, 4),
('220037', 'Victor', 'Bermudez', 'Ochoa', 'pass123', true, 4),
('220038', 'Laura', 'Palacios', 'Ayala', 'pass123', true, 4),
('220039', 'Manuel', 'Rosas', 'Guevara', 'pass123', true, 4),
('220040', 'Alicia', 'Espinoza', 'Navarro', 'pass123', true, 4);

-- Carrera 5: Lic. en Diseño Gráfico
INSERT INTO alumno (idAlumno, nombres, apellidoPaterno, apellidoMaterno, contraseña, esInscrito, idCarrera) VALUES
('220041', 'Oscar', 'Miranda', 'Beltran', 'pass123', true, 5),
('220042', 'Gabriela', 'Cervantes', 'Sarmiento', 'pass123', true, 5),
('220043', 'Armando', 'Tapia', 'Galindo', 'pass123', true, 5),
('220044', 'Beatriz', 'Arellano', 'Castañeda', 'pass123', true, 5),
('220045', 'Martin', 'Ponce', 'Vallejo', 'pass123', true, 5),
('220046', 'Lorena', 'Huerta', 'Rivas', 'pass123', true, 5),
('220047', 'Gerardo', 'Arce', 'Montes', 'pass123', true, 5),
('220048', 'Daniela', 'Peralta', 'Trejo', 'pass123', true, 5),
('220049', 'Enrique', 'Paz', 'Cisneros', 'pass123', true, 5),
('220050', 'Margarita', 'Lozano', 'Fuentes', 'pass123', true, 5);


-- 5. SOFTWARE (30 Software Random)
INSERT INTO software (nombre, version) VALUES 
('Windows 11', '23H2'), ('Office 365', '2024'), ('Google Chrome', '125'), 
('Mozilla Firefox', '120'), ('VS Code', '1.85'), ('NetBeans', '20'), 
('Eclipse IDE', '2023'), ('IntelliJ IDEA', '2023.3'), ('MySQL Workbench', '8.0.34'), 
('XAMPP', '8.2'), ('Cisco Packet Tracer', '8.2'), ('AutoCAD', '2024'), 
('SolidWorks', '2023'), ('MATLAB', 'R2023b'), ('Adobe Photoshop', '2024'), 
('Adobe Illustrator', '2024'), ('Adobe Premiere Pro', '2024'), ('Blender', '4.0'), 
('Unity Hub', '3.6'), ('Unreal Engine', '5.3'), ('Postman', '10.20'), 
('Git', '2.43'), ('Docker Desktop', '4.25'), ('VirtualBox', '7.0'), 
('Wireshark', '4.2'), ('Android Studio', 'Iguana'), ('Figma Desktop', '116.1'), 
('Notepad++', '8.5'), ('WinRAR', '6.24'), ('VLC Media Player', '3.0');

-- 6. COMPUTADORAS (11 por Lab: 1 Admin, 10 Alumnos)
-- Lab 1 (CISCO)
INSERT INTO computadora (numeroMaquina, direccionIP, estatus, tipo, idLaboratorio) VALUES
(0, '192.168.1.100', 'Habilitada', 'Administrador', 1),
(1, '192.168.1.101', 'Disponible', 'Alumno', 1),
(2, '192.168.1.102', 'Disponible', 'Alumno', 1),
(3, '192.168.1.103', 'Disponible', 'Alumno', 1),
(4, '192.168.1.104', 'Disponible', 'Alumno', 1),
(5, '192.168.1.105', 'Disponible', 'Alumno', 1),
(6, '192.168.1.106', 'Disponible', 'Alumno', 1),
(7, '192.168.1.107', 'Disponible', 'Alumno', 1),
(8, '192.168.1.108', 'Disponible', 'Alumno', 1),
(9, '192.168.1.109', 'Disponible', 'Alumno', 1),
(10, '192.168.1.110', 'Disponible', 'Alumno', 1);

-- Lab 2 (Biblioteca)
INSERT INTO computadora (numeroMaquina, direccionIP, estatus, tipo, idLaboratorio) VALUES
(0, '192.168.2.100', 'Habilitada', 'Administrador', 2),
(1, '192.168.2.101', 'Disponible', 'Alumno', 2),
(2, '192.168.2.102', 'Disponible', 'Alumno', 2),
(3, '192.168.2.103', 'Disponible', 'Alumno', 2),
(4, '192.168.2.104', 'Disponible', 'Alumno', 2),
(5, '192.168.2.105', 'Disponible', 'Alumno', 2),
(6, '192.168.2.106', 'Disponible', 'Alumno', 2),
(7, '192.168.2.107', 'Disponible', 'Alumno', 2),
(8, '192.168.2.108', 'Disponible', 'Alumno', 2),
(9, '192.168.2.109', 'Disponible', 'Alumno', 2),
(10, '192.168.2.110', 'Disponible', 'Alumno', 2);

-- 7. LIGAR SOFTWARE A EQUIPOS DE ALUMNO (10 por equipo)
-- Relacionamos 10 programas a las PCs del Lab Cisco (IDs de PC del 2 al 11)
INSERT INTO computadora_software (idComputadora, idSoftware)
SELECT c.idComputadora, s.idSoftware
FROM computadora c
JOIN software s ON s.idSoftware <= 10
WHERE c.tipo = 'Alumno' AND c.idLaboratorio = 1;

-- Relacionamos 10 programas distintos a las PCs del Lab Biblioteca (IDs de PC del 13 al 22)
INSERT INTO computadora_software (idComputadora, idSoftware)
SELECT c.idComputadora, s.idSoftware
FROM computadora c
JOIN software s ON s.idSoftware BETWEEN 11 AND 20
WHERE c.tipo = 'Alumno' AND c.idLaboratorio = 2;
