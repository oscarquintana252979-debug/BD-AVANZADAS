/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import dto.EditarSoftwareDto;
import dto.GuardarSoftwareDto;
import entidades.Software;
import java.util.List;

/**
 *
 * @author le0jx
 */
public interface ISoftwareDao {
    Software guardarSoftware(GuardarSoftwareDto registro) throws PersistenciaException;
    Software editarSoftware(String id, EditarSoftwareDto registro) throws PersistenciaException;
    Software eliminarSoftware(String id) throws PersistenciaException;
    Software BuscarPorID(String id) throws PersistenciaException;
    List<Software> listarSoftwares(String filtro) throws PersistenciaException;
}
