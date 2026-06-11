/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itson.control.entidades;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
/**
 *Clase para guardar la información de los alumnos que van a usar las computadoras en los laboratorios.
 * @author oscar
 */
@Entity
@Table(name = "alumno")
public class Alumno {
    
    /**
     * Es la matrícula del alumno (funciona como nuestra llave primaria).
     */
    @Id
    @Column(name = "idAlumno", length = 20)
    private String idAlumno;

    /**
     * Nombres del alumno.
     */
    @Column(name = "nombres", nullable = false, length = 100)
    private String nombres;

    /**
     * Apellido paterno del alumno.
     */
    @Column(name = "apellidoPaterno", nullable = false, length = 100)
    private String apellidoPaterno;

    /**
     * Apellido materno del alumno.
     */
    @Column(name = "apellidoMaterno", length = 100)
    private String apellidoMaterno;

    /**
     * Contraseña para que el alumno pueda desbloquear la computadora en el Kiosco.
     */
    @Column(name = "contraseña", nullable = false, length = 255)
    private String contraseña;

    /**
     * Sirve para saber si el alumno está activo en el semestre actual (true = sí, false = no).
     */
    @Column(name = "esInscrito", nullable = false)
    private Boolean esInscrito;

    /**
     * La carrera que estudia el alumno (para saber cuánto tiempo tiene disponible).
     */
    @ManyToOne
    @JoinColumn(name = "idCarrera", nullable = false)
    private Carrera carrera;
    
    /**
     * Constructor vacío que nos pide JPA para no marcar error.
     */
    public Alumno() {
    }

    /**
     * Crea un alumno nuevo con todos sus datos.
     * * @param idAlumno La matrícula.
     * @param nombres Los nombres.
     * @param apellidoPaterno El primer apellido.
     * @param apellidoMaterno El segundo apellido.
     * @param contraseña La clave de acceso.
     * @param esInscrito Si está inscrito o no.
     * @param carrera La carrera a la que pertenece.
     */
    public Alumno(String idAlumno, String nombres, String apellidoPaterno, String apellidoMaterno, String contraseña, Boolean esInscrito, Carrera carrera) {
        this.idAlumno = idAlumno;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.contraseña = contraseña;
        this.esInscrito = esInscrito;
        this.carrera = carrera;
    }

    /** @return La matrícula del alumno */
    public String getIdAlumno() {
        return idAlumno;
    }

    /** @param idAlumno La nueva matrícula */
    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    /** @return Los nombres del alumno */
    public String getNombres() {
        return nombres;
    }

    /** @param nombres Los nuevos nombres */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /** @return El apellido paterno */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /** @param apellidoPaterno El nuevo apellido paterno */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /** @return El apellido materno */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /** @param apellidoMaterno El nuevo apellido materno */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /** @return La contraseña (encriptada) */
    public String getContraseña() {
        return contraseña;
    }

    /** @param contraseña La nueva contraseña */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /** @return true si está inscrito, false si no */
    public Boolean getEsInscrito() {
        return esInscrito;
    }

    /** @param esInscrito El nuevo estado de inscripción */
    public void setEsInscrito(Boolean esInscrito) {
        this.esInscrito = esInscrito;
    }

    /** @return La carrera del alumno */
    public Carrera getCarrera() {
        return carrera;
    }

    /** @param carrera La nueva carrera */
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}