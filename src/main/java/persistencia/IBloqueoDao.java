/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import dto.EditarBloqueoDto;
import dto.GuardarBloqueoDto;
import entidades.Bloqueo;
import java.util.List;

/**
 *
 * @author le0jx
 */
public interface IBloqueoDao {
    Bloqueo guardarBloqueo(GuardarBloqueoDto registro) throws PersistenciaException;
    Bloqueo editarBloqueo(String id, EditarBloqueoDto registro) throws PersistenciaException;
    Bloqueo eliminarBloqueo(String id) throws PersistenciaException;
    Bloqueo BuscarPorID(String id) throws PersistenciaException;
    List<Bloqueo> listarBloqueos(String filtro) throws PersistenciaException;
}
