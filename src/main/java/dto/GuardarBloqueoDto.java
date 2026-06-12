/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import entidades.Alumno;
import entidades.EncargadoLaboratorio;
import java.time.LocalDateTime;

/**
 *
 * @author le0jx
 */
public class GuardarBloqueoDto {
    private String motivo;
    private LocalDateTime fechaHoraInicio;
    private String idAlumno;
    private String idEncargadoLaboratorio;

    public GuardarBloqueoDto(String motivo, LocalDateTime fechaHoraInicio, String idAlumno, String idEncargadoLaboratorio) {
        this.motivo = motivo;
        this.fechaHoraInicio = fechaHoraInicio;
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
