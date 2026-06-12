/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author le0jx
 */
public class GuardarCarreraDto {
    private String nombre;
    private Integer limiteDiario;

    public GuardarCarreraDto(String nombre, Integer limiteDiario) {
        this.nombre = nombre;
        this.limiteDiario = limiteDiario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLimiteDiario() {
        return limiteDiario;
    }

    public void setLimiteDiario(Integer limiteDiario) {
        this.limiteDiario = limiteDiario;
    }
    
    
}
