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
public class GuardarReservaDto {
    private LocalDateTime fechaHoraApartado;
    private String idAlumno;
    private String idComputadora;

    public GuardarReservaDto(LocalDateTime fechaHoraApartado, String idAlumno, String idComputadora) {
        this.fechaHoraApartado = fechaHoraApartado;
        this.idAlumno = idAlumno;
        this.idComputadora = idComputadora;
    }

    public LocalDateTime getFechaHoraApartado() {
        return fechaHoraApartado;
    }

    public void setFechaHoraApartado(LocalDateTime fechaHoraApartado) {
        this.fechaHoraApartado = fechaHoraApartado;
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
