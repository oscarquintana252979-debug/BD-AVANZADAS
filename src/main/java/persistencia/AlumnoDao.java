/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import dto.EditarAlumnoDto;
import dto.GuardarAlumnoDto;
import entidades.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author le0jx
 */
public class AlumnoDao implements IAlumnoDao {
    
    private IConexionBD conexion;
    private Connection conexionTransaccion;
    private CarreraDao carreras;
    
    public AlumnoDao(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public Alumno guardarAlumno(GuardarAlumnoDto registro) throws PersistenciaException {
        try{
            this.conexionTransaccion = this.conexion.crearConexion();
            this.conexionTransaccion.setAutoCommit(false);
            String idGenerado = this.guardar(registro)+"";
            this.conexionTransaccion.commit();
            
            return BuscarPorID(idGenerado);

        }catch(Exception e){
            if (this.conexionTransaccion != null) {
                try {
                    this.conexionTransaccion.rollback();
                } catch (SQLException ex) {
                    throw new PersistenciaException("Error: " + ex.getMessage());
                }
            }
            throw new PersistenciaException("operacion abortada: " + e.getMessage());
        }finally{
            if (this.conexionTransaccion != null) {
                try {
                    this.conexionTransaccion.close();
                } catch (SQLException ex) {
                    throw new PersistenciaException("Error: " + ex.getMessage());
                }
            }
            this.conexionTransaccion = null;
        }
    }
    
    private int guardar(GuardarAlumnoDto registro) throws PersistenciaException{
        try{
        String sentenciaSQL = """
                                  INSERT INTO alumnos (nombres,
                                                       apellidoPaterno,
                                                       apellidoMaterno, 
                                                       contraseña,
                                                       idCarrera) 
                                  VALUES (?,?,?,?,?);
                                  """;
        PreparedStatement comando = this.conexionTransaccion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);
        comando.setString(1, registro.getNombres());
        comando.setString(2, registro.getApellidoPaterno());
        comando.setString(3, registro.getApellidoMaterno());
            comando.setString(4, registro.getContraseña());
            comando.setString(5, registro.getIdCarrera());
        comando.executeUpdate();
        
        ResultSet llavesGeneradas = comando.getGeneratedKeys();
        if (llavesGeneradas.next()) {
            return llavesGeneradas.getInt(1);
        }
        throw new PersistenciaException("No se pudo obtener el ID del alumno generado.");
        }catch(Exception e){
            throw new PersistenciaException("Error al insertar alumno: " + e.getMessage());
        }
    }

    @Override
    public Alumno editarAlumno(String id, EditarAlumnoDto registro) throws PersistenciaException {
        try{
        Connection conexion = this.conexion.crearConexion();
        String sentenciaSQL = """
                                  UPDATE alumno
                                  SET nombres = ?,
                                      apellidoPaterno = ?,
                                      contraseña = ?,
                                      esInscrito = ?,
                                      idCarrera = ? 
                                  WHERE id = ? 
                                  """;
        PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);
        comando.setString(1, registro.getNombres());
        comando.setString(2, registro.getApellidoPaterno());
        comando.setString(3, registro.getApellidoMaterno());
        comando.setString(4, registro.getContraseña());
        comando.setString(5, registro.getIdCarrera());
        
        comando.setString(6, id);
        
        int filasAfectadas = comando.executeUpdate();
        if (filasAfectadas > 0) {
                return BuscarPorID(id);
            }
        return null;
        
        }catch(Exception e){
        throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public Alumno eliminarAlumno(String id) throws PersistenciaException {
        Alumno alumnoEliminado = BuscarPorID(id);
        if (alumnoEliminado == null) {
            throw new PersistenciaException("No se puede eliminar: el alumno con id " + id + " no existe");
        }
        try{
        Connection conexion = this.conexion.crearConexion();
        String sentenciaSQL = "DELETE FROM alumno WHERE id = ?;";
        PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);
        comando.setString(1, id);
        comando.executeUpdate();
        
        return alumnoEliminado;
        }catch(Exception e){
            throw new PersistenciaException(e.getMessage());
        }
        
    }

    @Override
    public Alumno BuscarPorID(String id) throws PersistenciaException {
        try{
        Connection conexion = this.conexion.crearConexion();
        String sentenciaSQL = """
                                  SELECT 
                                    idAlumno,
                                    nombres,
                                    apellidoPaterno,
                                    apellidoMaterno,
                                    contraseña,
                                    esInscrito,
                                    idCarrera
                                  FROM alumno
                                  WHERE id = ?
                                  """;
        PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);
        comando.setString(1, id);
        ResultSet rs = comando.executeQuery();
        if (rs.next()) {
            
                return new Alumno(
                        rs.getString("id"),
                        rs.getString("nombres"),
                        rs.getString("apellidoPaterno"),
                        rs.getString("apellidoMaterno"),
                        rs.getString("contraseña"),
                        rs.getBoolean("esInscrito"),
                        carreras.BuscarPorID(rs.getString("idCarrera"))      
                );
            }
            return null;
        }catch(Exception e){
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public List<Alumno> listarAlumnos(String filtro) throws PersistenciaException {
        List<Alumno> listaAlumnos = new ArrayList<>();
        try{
        Connection conexion = this.conexion.crearConexion();
        String sentenciaSQL = """
                                  SELECT
                                      a.idAlumno,
                                      a.nombres,
                                      a.apellidoPaterno,
                                      a.apellidoMaterno,
                                      a.contraseña,
                                      a.esInscrito,
                                      c.nombre AS carrera
                                  FROM alumno a
                                  INNER JOIN carrera c
                                      ON a.idCarrera = c.idCarrera
                                  WHERE (
                                      a.nombres LIKE ?
                                      OR a.apellidoPaterno LIKE ?
                                      OR a.apellidoMaterno LIKE ?
                                      OR c.nombre LIKE ?
                                  );
                                  """;
        PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);
        
        String comodinBusqueda = "%" + filtro + "%";
        comando.setString(1, comodinBusqueda);
        comando.setString(2, comodinBusqueda);
        comando.setString(3, comodinBusqueda);
        comando.setString(4, comodinBusqueda);
        
        ResultSet rs = comando.executeQuery();
        while (rs.next()) {
                listaAlumnos.add(new Alumno(
                        rs.getString("id"),
                        rs.getString("nombres"),
                        rs.getString("apellidoPaterno"),
                        rs.getString("apellidoMaterno"),
                        rs.getString("contraseña"),
                        rs.getBoolean("esInscrito"),
                        carreras.BuscarPorID(rs.getString("idCarrera"))
                ));
            }
            return listaAlumnos;
        }catch(Exception e){
        throw new PersistenciaException(e.getMessage());
        }
    }
    
}
