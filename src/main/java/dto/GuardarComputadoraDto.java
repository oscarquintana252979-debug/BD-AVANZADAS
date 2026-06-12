/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import entidades.CentroLaboratorio;
import entidades.Software;
import java.util.List;

/**
 *
 * @author le0jx
 */
public class GuardarComputadoraDto {
    private int numeroMaquina;
    private String direccionIP;
    private String estatus; 
    private String tipo; 
    private String idCentroLaboratorio;

    public GuardarComputadoraDto(int numeroMaquina, String direccionIP, String estatus, String tipo, String idCentroLaboratorio) {
        this.numeroMaquina = numeroMaquina;
        this.direccionIP = direccionIP;
        this.estatus = estatus;
        this.tipo = tipo;
        this.idCentroLaboratorio = idCentroLaboratorio;
    }

    public int getNumeroMaquina() {
        return numeroMaquina;
    }

    public void setNumeroMaquina(int numeroMaquina) {
        this.numeroMaquina = numeroMaquina;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdCentroLaboratorio() {
        return idCentroLaboratorio;
    }

    public void setIdCentroLaboratorio(String idCentroLaboratorio) {
        this.idCentroLaboratorio = idCentroLaboratorio;
    }
    
    
    
}
