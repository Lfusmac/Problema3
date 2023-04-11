/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Pipe_
 */
public class ExportacionDTO {

    int id;
    int Productos_id;
    String TipoEnvio;
    int Paises_id;
    int Ciudades_id;
    String MetodoPago;
    Date FechaEnvio;
    Date  FechaEstimadaEntrega;
    int Empleados_id;
    int Funcionarios_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductos_id() {
        return Productos_id;
    }

    public void setProductos_id(int Productos_id) {
        this.Productos_id = Productos_id;
    }

    public String getTipoEnvio() {
        return TipoEnvio;
    }

    public void setTipoEnvio(String TipoEnvio) {
        this.TipoEnvio = TipoEnvio;
    }

    public int getPaises_id() {
        return Paises_id;
    }

    public void setPaises_id(int Paises_id) {
        this.Paises_id = Paises_id;
    }

    public int getCiudades_id() {
        return Ciudades_id;
    }

    public void setCiudades_id(int Ciudades_id) {
        this.Ciudades_id = Ciudades_id;
    }

    public String getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(String MetodoPago) {
        this.MetodoPago = MetodoPago;
    }

    public Date getFechaEnvio() {
        return FechaEnvio;
    }

    public void setFechaEnvio(Date FechaEnvio) {
        this.FechaEnvio = FechaEnvio;
    }

    public Date getFechaEstimadaEntrega() {
        return FechaEstimadaEntrega;
    }

    public void setFechaEstimadaEntrega(Date FechaEstimadaEntrega) {
        this.FechaEstimadaEntrega = FechaEstimadaEntrega;
    }

    public int getEmpleados_id() {
        return Empleados_id;
    }

    public void setEmpleados_id(int Empleados_id) {
        this.Empleados_id = Empleados_id;
    }

    public int getFuncionarios_id() {
        return Funcionarios_id;
    }

    public void setFuncionarios_id(int Funcionarios_id) {
        this.Funcionarios_id = Funcionarios_id;
    }

    
    

}
