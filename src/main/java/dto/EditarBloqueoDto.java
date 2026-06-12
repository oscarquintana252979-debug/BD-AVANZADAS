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
public class EditarBloqueoDto {
    private String motivo;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private String idAlumno;
    private String idEncargadoLaboratorio;

    public EditarBloqueoDto(String motivo, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, String idAlumno, String idEncargadoLaboratorio) {
        this.motivo = motivo;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.idAlumno = idAlumno;
        this.idEncargadoLaboratorio = idEncargadoLaboratorio;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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

    public String getIdEncargadoLaboratorio() {
        return idEncargadoLaboratorio;
    }

    public void setIdEncargadoLaboratorio(String idEncargadoLaboratorio) {
        this.idEncargadoLaboratorio = idEncargadoLaboratorio;
    }
    
    
}
