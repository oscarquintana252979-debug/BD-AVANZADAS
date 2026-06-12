/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.time.LocalTime;

/**
 *
 * @author le0jx
 */
public class EditarCentroLaboratorioDto {
    private String nombre;
    private LocalTime horaInicio;
    private LocalTime horaCierre; 
    private String contraseñaMaestra; 
    private String idUnidadAcademica;

    public EditarCentroLaboratorioDto(String nombre, LocalTime horaInicio, LocalTime horaCierre, String contraseñaMaestra, String idUnidadAcademica) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaCierre = horaCierre;
        this.contraseñaMaestra = contraseñaMaestra;
        this.idUnidadAcademica = idUnidadAcademica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(LocalTime horaCierre) {
        this.horaCierre = horaCierre;
    }

    public String getContraseñaMaestra() {
        return contraseñaMaestra;
    }

    public void setContraseñaMaestra(String contraseñaMaestra) {
        this.contraseñaMaestra = contraseñaMaestra;
    }

    public String getIdUnidadAcademica() {
        return idUnidadAcademica;
    }

    public void setIdUnidadAcademica(String idUnidadAcademica) {
        this.idUnidadAcademica = idUnidadAcademica;
    }
    
    
}
