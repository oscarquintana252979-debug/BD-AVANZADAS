/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itson.control.entidades;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalTime;
/**
 * Representa la sala física llena de computadoras (como el Lab Cisco o el de Biblioteca).
 * @author oscar
 */
@Entity
@Table(name = "centroLaboratorio")
public class CentroLaboratorio {

    /**
     * El número de identificación de la sala.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLaboratorio")
    private Integer idLaboratorio;

    /**
     * Cómo le dicen a la sala (ej. "Laboratorio Cisco").
     */
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    /**
     * A qué hora abren la puerta en la mañana.
     */
    @Column(name = "horaInicio", nullable = false)
    private LocalTime horaInicio;

    /**
     * A qué hora cierran en la noche.
     */
    @Column(name = "horaCierre", nullable = false)
    private LocalTime horaCierre;

    /**
     * La clave maestra que usa el encargado para la compu de administración.
     */
    @Column(name = "contraseñaMaestra", nullable = false, length = 255)
    private String contraseñaMaestra;

    /**
     * El campus donde se encuentra este laboratorio.
     */
    @ManyToOne
    @JoinColumn(name = "idUnidad", nullable = false)
    private UnidadAcademica unidadAcademica;

    /**
     * Constructor obligatorio por defecto.
     */
    public CentroLaboratorio() {
    }

    /**
     * Da de alta un laboratorio nuevo.
     * * @param nombre Nombre de la sala.
     * @param horaInicio Horario de apertura.
     * @param horaCierre Horario de cierre.
     * @param contraseñaMaestra La clave del admin.
     * @param unidadAcademica El campus al que pertenece.
     */
    public CentroLaboratorio(String nombre, LocalTime horaInicio, LocalTime horaCierre, String contraseñaMaestra, UnidadAcademica unidadAcademica) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaCierre = horaCierre;
        this.contraseñaMaestra = contraseñaMaestra;
        this.unidadAcademica = unidadAcademica;
    }

    /** @return El ID de la sala */
    public Integer getIdLaboratorio() {
        return idLaboratorio;
    }

    /** @param idLaboratorio Nuevo ID */
    public void setIdLaboratorio(Integer idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    /** @return Nombre de la sala */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre Nuevo nombre */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /** @return Hora en la que abren */
    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    /** @param horaInicio Nueva hora de apertura */
    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    /** @return Hora en la que cierran */
    public LocalTime getHoraCierre() {
        return horaCierre;
    }

    /** @param horaCierre Nueva hora de cierre */
    public void setHoraCierre(LocalTime horaCierre) {
        this.horaCierre = horaCierre;
    }

    /** @return La clave de administrador */
    public String getContraseñaMaestra() {
        return contraseñaMaestra;
    }

    /** @param contraseñaMaestra Nueva clave */
    public void setContraseñaMaestra(String contraseñaMaestra) {
        this.contraseñaMaestra = contraseñaMaestra;
    }

    /** @return El campus al que pertenece */
    public UnidadAcademica getUnidadAcademica() {
        return unidadAcademica;
    }

    /** @param unidadAcademica Nuevo campus */
    public void setUnidadAcademica(UnidadAcademica unidadAcademica) {
        this.unidadAcademica = unidadAcademica;
    }
    
}