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
import java.time.LocalDateTime;
/**
 * Esta clase sirve para registrar los castigos cuando un alumno hace mal uso del laboratorio.
 * @author oscar
 */
@Entity
@Table(name = "bloqueo")
public class Bloqueo {

    /**
     * El número de folio del castigo generado automáticamente.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBloqueo")
    private Integer idBloqueo;

    /**
     * La razón por la que bloquearon al alumno (ej. "Estaba jugando Minecraft").
     * Le pusimos TEXT para que el encargado pueda escribir todo sin límite de letras.
     */
    @Column(name = "motivo", nullable = false, columnDefinition = "TEXT")
    private String motivo;

    /**
     * Fecha y hora exacta en la que le aplicaron el castigo.
     */
    @Column(name = "fechaHoraInicio", nullable = false)
    private LocalDateTime fechaHoraInicio;

    /**
     * Fecha y hora en la que se le levanta el castigo. Si está vacío, es indefinido.
     */
    @Column(name = "fechaHoraFin")
    private LocalDateTime fechaHoraFin;

    /**
     * El alumno al que le cayó el bloqueo.
     */
    @ManyToOne
    @JoinColumn(name = "idAlumno", nullable = false)
    private Alumno alumno;

    /**
     * El encargado del laboratorio que aplicó la sanción.
     */
    @ManyToOne
    @JoinColumn(name = "idEncargado", nullable = false)
    private EncargadoLaboratorio encargadoLaboratorio;

    /**
     * Constructor vacío para que JPA no truene.
     */
    public Bloqueo() {
    }

    /**
     * Crea un registro de bloqueo nuevo.
     * * @param motivo Por qué lo bloquearon.
     * @param fechaHoraInicio Cuándo empezó.
     * @param fechaHoraFin Cuándo termina.
     * @param alumno A quién bloquearon.
     * @param encargadoLaboratorio Quién lo bloqueó.
     */
    public Bloqueo(String motivo, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, Alumno alumno, EncargadoLaboratorio encargadoLaboratorio) {
        this.motivo = motivo;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.alumno = alumno;
        this.encargadoLaboratorio = encargadoLaboratorio;
    }
    
    /** @return El ID del bloqueo */
    public Integer getIdBloqueo() {
        return idBloqueo;
    }

    /** @param idBloqueo Nuevo ID */
    public void setIdBloqueo(Integer idBloqueo) {
        this.idBloqueo = idBloqueo;
    }

    /** @return El motivo del castigo */
    public String getMotivo() {
        return motivo;
    }

    /** @param motivo Nuevo motivo */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /** @return Cuándo inició el castigo */
    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    /** @param fechaHoraInicio Nueva fecha de inicio */
    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    /** @return Cuándo se acaba el castigo */
    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    /** @param fechaHoraFin Nueva fecha final */
    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    /** @return El alumno bloqueado */
    public Alumno getAlumno() {
        return alumno;
    }

    /** @param alumno Nuevo alumno */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    /** @return El encargado que lo aplicó */
    public EncargadoLaboratorio getEncargadoLaboratorio() {
        return encargadoLaboratorio;
    }

    /** @param encargadoLaboratorio Nuevo encargado */
    public void setEncargadoLaboratorio(EncargadoLaboratorio encargadoLaboratorio) {
        this.encargadoLaboratorio = encargadoLaboratorio;
    }
}