/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import dto.EditarReservaDto;
import dto.GuardarReservaDto;
import entidades.Reserva;
import java.util.List;

/**
 *
 * @author le0jx
 */
public interface IReservaDao {
    Reserva guardarReserva(GuardarReservaDto registro) throws PersistenciaException;
    Reserva editarReserva(String id, EditarReservaDto registro) throws PersistenciaException;
    Reserva eliminarReserva(String id) throws PersistenciaException;
    Reserva BuscarPorID(String id) throws PersistenciaException;
    List<Reserva> listarReservas(String filtro) throws PersistenciaException;
}
