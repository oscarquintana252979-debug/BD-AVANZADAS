/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import dto.EditarAlumnoDto;
import dto.GuardarAlumnoDto;
import entidades.Alumno;
import java.util.List;

/**
 *
 * @author le0jx
 */
public interface IAlumnoDao {
    Alumno guardarAlumno(GuardarAlumnoDto registro) throws PersistenciaException;
    Alumno editarAlumno(String id, EditarAlumnoDto registro) throws PersistenciaException;
    Alumno eliminarAlumno(String id) throws PersistenciaException;
    Alumno BuscarPorID(String id) throws PersistenciaException;
    List<Alumno> listarAlumnos(String filtro) throws PersistenciaException;
}
