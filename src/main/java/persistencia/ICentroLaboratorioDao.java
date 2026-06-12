/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import dto.EditarCentroLaboratorioDto;
import dto.GuardarCentroLaboratorioDto;
import entidades.CentroLaboratorio;
import java.util.List;

/**
 *
 * @author le0jx
 */
public interface ICentroLaboratorioDao {
    CentroLaboratorio guardarCentroLaboratorio(GuardarCentroLaboratorioDto registro) throws PersistenciaException;
    CentroLaboratorio editarCentroLaboratorio(String id, EditarCentroLaboratorioDto registro) throws PersistenciaException;
    CentroLaboratorio eliminarCentroLaboratorio(String id) throws PersistenciaException;
    CentroLaboratorio BuscarPorID(String id) throws PersistenciaException;
    List<CentroLaboratorio> listarCentroLaboratorios(String filtro) throws PersistenciaException;
}
