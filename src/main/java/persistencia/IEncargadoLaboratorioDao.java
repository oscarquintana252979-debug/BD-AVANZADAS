/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import dto.EditarEncargadoLaboratorioDto;
import dto.GuardarEncargadoLaboratorioDto;
import entidades.EncargadoLaboratorio;
import java.util.List;

/**
 *
 * @author le0jx
 */
public interface IEncargadoLaboratorioDao {
    EncargadoLaboratorio guardarEncargadoLaboratorio(GuardarEncargadoLaboratorioDto registro) throws PersistenciaException;
    EncargadoLaboratorio editarEncargadoLaboratorio(String id, EditarEncargadoLaboratorioDto registro) throws PersistenciaException;
    EncargadoLaboratorio eliminarEncargadoLaboratorio(String id) throws PersistenciaException;
    EncargadoLaboratorio BuscarPorID(String id) throws PersistenciaException;
    List<EncargadoLaboratorio> listarEncargadoLaboratorios(String filtro) throws PersistenciaException;
}
