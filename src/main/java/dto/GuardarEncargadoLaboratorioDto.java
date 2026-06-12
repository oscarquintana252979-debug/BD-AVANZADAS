/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author le0jx
 */
public class GuardarEncargadoLaboratorioDto {
    private String nombre;
    private String idCentroLaboratorio;

    public GuardarEncargadoLaboratorioDto(String nombre, String idCentroLaboratorio) {
        this.nombre = nombre;
        this.idCentroLaboratorio = idCentroLaboratorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCentroLaboratorio() {
        return idCentroLaboratorio;
    }

    public void setIdCentroLaboratorio(String idCentroLaboratorio) {
        this.idCentroLaboratorio = idCentroLaboratorio;
    }
    
    
}
