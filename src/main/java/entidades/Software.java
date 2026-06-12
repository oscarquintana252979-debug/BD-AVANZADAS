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
 * Guarda el catálogo de programas que se pueden instalar en las compus (Word, AutoCAD, NetBeans, etc.).
 * @author oscar
 */
@Entity
@Table(name = "software")
public class Software {

    /** El folio del programa en la base de datos. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSoftware")
    private String idSoftware;

    /** Cómo se llama el programa. */
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    /** Qué versión es (ej. 2024, v8.2). */
    @Column(name = "version", length = 50)
    private String version;

    public Software() {}

    public Software(String idSoftware, String nombre, String version) {
        this.idSoftware = idSoftware;
        this.nombre = nombre;
        this.version = version;
    }
    
    /** @return ID del software */
    public String getIdSoftware() {
        return idSoftware;
    }

    public void setIdSoftware(String idSoftware) {
        this.idSoftware = idSoftware;
    }

    /** @return Nombre del programa */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return La versión instalada */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
}