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
 * El plantel físico de la escuela (ej. Campus Nainari o Centro).
 * @author oscar
 */
@Entity
@Table(name = "unidadAcademica")
public class UnidadAcademica {
    
    /** El número del plantel. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUnidad")
    private Integer idUnidad;

    /** El nombre con el que todos conocen al plantel. */
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    public UnidadAcademica() {}

    
    public UnidadAcademica(String nombre) {
        this.nombre = nombre;
    }

    /** @return ID de la unidad */
    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    /** @return Nombre del campus */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}