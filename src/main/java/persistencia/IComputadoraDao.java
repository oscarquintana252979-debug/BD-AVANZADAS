/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import dto.EditarComputadoraDto;
import dto.GuardarComputadoraDto;
import entidades.Computadora;
import java.util.List;

/**
 *
 * @author le0jx
 */
public interface IComputadoraDao {
    Computadora guardarComputadora(GuardarComputadoraDto registro) throws PersistenciaException;
    Computadora editarComputadora(String id, EditarComputadoraDto registro) throws PersistenciaException;
    Computadora eliminarComputadora(String id) throws PersistenciaException;
    Computadora BuscarPorID(String id) throws PersistenciaException;
    List<Computadora> listarComputadoras(String filtro) throws PersistenciaException;
}
