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
 * Aquí se guardan los apartados que hacen los alumnos en el sistema.
 * Sirve para llevar el control de a qué hora empezaron a usar la computadora y a qué hora terminaron.
 * @author oscar
 */
@Entity
@Table(name = "reserva")
public class Reserva {

    /**
     * El ID del apartado en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReserva")
    private Integer idReserva;

    /**
     * La hora exacta en la que el alumno dio clic en "Apartar" desde el sistema.
     */
    @Column(name = "fechaHoraApartado", nullable = false)
    private LocalDateTime fechaHoraApartado;

    /**
     * La hora en la que el alumno se sentó y metió su contraseña para desbloquear la computadora.
     */
    @Column(name = "fechaHoraInicio")
    private LocalDateTime fechaHoraInicio;

    /**
     * La hora en la que liberaron la máquina o se les acabó el tiempo.
     */
    @Column(name = "fechaHoraFin")
    private LocalDateTime fechaHoraFin;

    /**
     * El alumno que hizo el apartado.
     */
    @ManyToOne
    @JoinColumn(name = "idAlumno", nullable = false)
    private Alumno alumno;

    /**
     * La computadora que apartaron.
     */
    @ManyToOne
    @JoinColumn(name = "idComputadora", nullable = false)
    private Computadora computadora;

    /**
     * Constructor vacío requerido por JPA.
     */
    public Reserva() {
    }

    /**
     * Crea un apartado nuevo con las horas y los datos necesarios.
     * * @param fechaHoraApartado Cuándo se apartó.
     * @param fechaHoraInicio Cuándo empezó a usarse.
     * @param fechaHoraFin Cuándo se liberó.
     * @param alumno Quién apartó.
     * @param computadora Qué compu apartó.
     */
    public Reserva(LocalDateTime fechaHoraApartado, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, Alumno alumno, Computadora computadora) {
        this.fechaHoraApartado = fechaHoraApartado;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.alumno = alumno;
        this.computadora = computadora;
    }

    /** @return El ID de la reserva */
    public Integer getIdReserva() {
        return idReserva;
    }

    /** @param idReserva Nuevo ID */
    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    /** @return Hora en que se apartó */
    public LocalDateTime getFechaHoraApartado() {
        return fechaHoraApartado;
    }

    /** @param fechaHoraApartado Nueva hora de apartado */
    public void setFechaHoraApartado(LocalDateTime fechaHoraApartado) {
        this.fechaHoraApartado = fechaHoraApartado;
    }

    /** @return Hora en que se empezó a usar */
    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    /** @param fechaHoraInicio Nueva hora de inicio */
    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    /** @return Hora en que se terminó de usar */
    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    /** @param fechaHoraFin Nueva hora de fin */
    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    /** @return El alumno de la reserva */
    public Alumno getAlumno() {
        return alumno;
    }

    /** @param alumno Nuevo alumno */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    /** @return La computadora apartada */
    public Computadora getComputadora() {
        return computadora;
    }

    /** @param computadora Nueva computadora */
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}