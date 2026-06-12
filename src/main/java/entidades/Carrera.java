/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * Esta entidad define el tiempo límite diario que los alumnos de una carrera 
 * específica tienen permitido usar en los laboratorios de cómputo.
 * @author oscar
 */
@Entity
@Table(name = "carrera")
public class Carrera {

    /**
     * Identificador único de la carrera. Se genera automáticamente en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCarrera")
    private Integer idCarrera;
    
    /**
     * Nombre de la carrera.
     */
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    
    /**
     * Cantidad de minutos diarios que tienen permitidos los alumnos de esta carrera.
     */
    @Column(name = "limiteDiario", nullable = false)
    private Integer limiteDiario; 
    
    /**
     * Constructor por defecto requerido por JPA.
     */
    public Carrera() {
    }

    /**
     * Crea una nueva instancia de Carrera con los datos especificados.
     * * @param nombre El nombre oficial de la carrera.
     * @param limiteDiario El límite de tiempo en minutos permitidos por día.
     */
    public Carrera(String nombre, Integer limiteDiario) {
        this.nombre = nombre;
        this.limiteDiario = limiteDiario;
    }

    /**
     * Obtiene el identificador de la carrera.
     * * @return El ID de la carrera.
     */
    public Integer getIdCarrera() {
        return idCarrera;
    }

    /**
     * Establece el identificador de la carrera.
     * * @param idCarrera El nuevo ID de la carrera.
     */
    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    /**
     * Obtiene el nombre de la carrera.
     * * @return El nombre de la carrera.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la carrera.
     * * @param nombre El nuevo nombre de la carrera.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el límite de tiempo diario asignado a la carrera.
     * * @return Los minutos permitidos por día.
     */
    public Integer getLimiteDiario() {
        return limiteDiario;
    }

    /**
     * Establece el límite de tiempo diario para los alumnos de la carrera.
     * * @param limiteDiario La nueva cantidad de minutos permitidos.
     */
    public void setLimiteDiario(Integer limiteDiario) {
        this.limiteDiario = limiteDiario;
    }
}