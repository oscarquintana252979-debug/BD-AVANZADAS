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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.List;
/**
 *Esta clase maneja las computadoras físicas que están dentro de los laboratorios.
 * @author oscar
 */
@Entity
@Table(name = "computadora")
public class Computadora {

    /**
     * El ID autogenerado de la computadora en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idComputadora")
    private String idComputadora;

    /**
     * El número de máquina que tiene pegado el monitor (ej. Máquina 1, Máquina 2).
     */
    @Column(name = "numeroMaquina", nullable = false)
    private int numeroMaquina;

    /**
     * La dirección IP del equipo. Tiene que ser única para saber exactamente de qué computadora nos hablan.
     */
    @Column(name = "direccionIP", nullable = false, unique = true, length = 45)
    private String direccionIP;

    /**
     * Nos dice si la computadora está Habilitada, Deshabilitada o Disponible para los alumnos.
     */
    @Column(name = "estatus", nullable = false, length = 20)
    private String estatus;

    /**
     * Define si es una computadora para 'Alumno' o para el 'Administrador'.
     */
    @Column(name = "tipo", length = 50)
    private String tipo;

    /**
     * El laboratorio en el que se encuentra físicamente esta computadora.
     */
    @ManyToOne
    @JoinColumn(name = "idLaboratorio", nullable = false)
    private CentroLaboratorio centroLaboratorio;

    /**
     * Lista de los programas (software) que tiene instalados esta máquina.
     */
    @ManyToMany
    @JoinTable(
        name = "computadora_software",
        joinColumns = @JoinColumn(name = "idComputadora"),
        inverseJoinColumns = @JoinColumn(name = "idSoftware")
    )
    private List<Software> listaSoftware;

    /**
     * Constructor vacío requerido por JPA.
     */
    public Computadora() {
    }

    /**
     * Crea una computadora nueva con su información básica y programas.
     * @param numeroMaquina El número de equipo.
     * @param direccionIP La IP de la máquina.
     * @param estatus Su estado actual.
     * @param tipo El tipo de usuario de la máquina.
     * @param centroLaboratorio El laboratorio donde está.
     * @param listaSoftware Los programas que tiene instalados.
     */
    public Computadora(String idComputadora, int numeroMaquina, String direccionIP, String estatus, String tipo, CentroLaboratorio centroLaboratorio, List<Software> listaSoftware) {
        this.idComputadora = idComputadora;
        this.numeroMaquina = numeroMaquina;
        this.direccionIP = direccionIP;
        this.estatus = estatus;
        this.tipo = tipo;
        this.centroLaboratorio = centroLaboratorio;
        this.listaSoftware = listaSoftware;
    }

    /** @return El ID interno de la computadora */
    public String getIdComputadora() {
        return idComputadora;
    }

    /** @param idComputadora Nuevo ID */
    public void setIdComputadora() {
        this.idComputadora = idComputadora;
    }

    /** @return El número de la máquina */
    public int getNumeroMaquina() {
        return numeroMaquina;
    }

    /** @param numeroMaquina Nuevo número de máquina */
    public void setNumeroMaquina(int numeroMaquina) {
        this.numeroMaquina = numeroMaquina;
    }

    /** @return La IP del equipo */
    public String getDireccionIP() {
        return direccionIP;
    }

    /** @param direccionIP Nueva IP */
    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    /** @return El estatus actual */
    public String getEstatus() {
        return estatus;
    }

    /** @param estatus Nuevo estatus */
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    /** @return El tipo de computadora */
    public String getTipo() {
        return tipo;
    }

    /** @param tipo Nuevo tipo */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /** @return El laboratorio donde se ubica */
    public CentroLaboratorio getCentroLaboratorio() {
        return centroLaboratorio;
    }

    /** @param centroLaboratorio Nuevo laboratorio */
    public void setCentroLaboratorio(CentroLaboratorio centroLaboratorio) {
        this.centroLaboratorio = centroLaboratorio;
    }

    /** @return Lista de programas instalados */
    public List<Software> getListaSoftware() {
        return listaSoftware;
    }

    /** @param listaSoftware Nueva lista de programas */
    public void setListaSoftware(List<Software> listaSoftware) {
        this.listaSoftware = listaSoftware;
    }
}