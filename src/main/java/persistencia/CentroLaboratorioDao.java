/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class CentroLaboratorioDao implements ICentroLaboratorioDao{

    @Override
    public CentroLaboratorio guardarCentroLaboratorio(GuardarCentroLaboratorioDto registro) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CentroLaboratorio editarCentroLaboratorio(String id, EditarCentroLaboratorioDto registro) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CentroLaboratorio eliminarCentroLaboratorio(String id) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CentroLaboratorio BuscarPorID(String id) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<CentroLaboratorio> listarCentroLaboratorios(String filtro) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
