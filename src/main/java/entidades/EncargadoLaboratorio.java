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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
/**
 * Es la persona que cuida el laboratorio y aplica los bloqueos a los alumnos.
 * @author oscar
 */
@Entity
@Table(name = "encargadoLaboratorio")
public class EncargadoLaboratorio {

    /** ID generado para identificar al encargado. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEncargado")
    private String idEncargado;

    /** Nombre completo del encargado. */
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    /** El laboratorio a cuidar. */
    @ManyToOne
    @JoinColumn(name = "idLaboratorio", nullable = false)
    private CentroLaboratorio centroLaboratorio;

    public EncargadoLaboratorio() {}

    
    public EncargadoLaboratorio(String idEncargado, String nombre, CentroLaboratorio centroLaboratorio) {
        this.idEncargado = idEncargado;
        this.nombre = nombre;
        this.centroLaboratorio = centroLaboratorio;
    }
    
    /** @return El ID del encargado */
    public String getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(String idEncargado) {
        this.idEncargado = idEncargado;
    }
    
    /** @return El nombre del encargado */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /** @return El laboratorio que cuida */
    public CentroLaboratorio getCentroLaboratorio() {
        return centroLaboratorio;
    }

    public void setCentroLaboratorio(CentroLaboratorio centroLaboratorio) {
        this.centroLaboratorio = centroLaboratorio;
    }
}