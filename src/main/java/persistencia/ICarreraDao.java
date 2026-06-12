/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import dto.EditarCarreraDto;
import dto.GuardarCarreraDto;
import entidades.Carrera;
import java.util.List;

/**
 *
 * @author le0jx
 */
public interface ICarreraDao {
    Carrera guardarCarrera(GuardarCarreraDto registro) throws PersistenciaException;
    Carrera editarCarrera(String id, EditarCarreraDto registro) throws PersistenciaException;
    Carrera eliminarCarrera(String id) throws PersistenciaException;
    Carrera BuscarPorID(String id) throws PersistenciaException;
    List<Carrera> listarCarreras(String filtro) throws PersistenciaException;
}
