/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.time.LocalDateTime;

/**
 *
 * @author le0jx
 */
public class EditarReservaDto {
    private LocalDateTime fechaHoraApartado;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private String idAlumno;
    private String idComputadora;

    public EditarReservaDto(LocalDateTime fechaHoraApartado, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, String idAlumno, String idComputadora) {
        this.fechaHoraApartado = fechaHoraApartado;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.idAlumno = idAlumno;
        this.idComputadora = idComputadora;
    }

    public LocalDateTime getFechaHoraApartado() {
        return fechaHoraApartado;
    }

    public void setFechaHoraApartado(LocalDateTime fechaHoraApartado) {
        this.fechaHoraApartado = fechaHoraApartado;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(String idComputadora) {
        this.idComputadora = idComputadora;
    }
    
    
}
