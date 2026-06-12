/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import dto.EditarUnidadAcademicaDto;
import dto.GuardarUnidadAcademicaDto;
import entidades.UnidadAcademica;
import java.util.List;

/**
 *
 * @author le0jx
 */
public interface IUnidadAcademicaDao {
    UnidadAcademica guardarUnidadAcademica(GuardarUnidadAcademicaDto registro) throws PersistenciaException;
    UnidadAcademica editarUnidadAcademica(String id, EditarUnidadAcademicaDto registro) throws PersistenciaException;
    UnidadAcademica eliminarUnidadAcademica(String id) throws PersistenciaException;
    UnidadAcademica BuscarPorID(String id) throws PersistenciaException;
    List<UnidadAcademica> listarUnidadAcademicas(String filtro) throws PersistenciaException;
}
