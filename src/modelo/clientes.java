/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author user
 */
public class clientes {
    //atributos de clase
    private Integer idCliente;         // PK
    private String apellidos;
    private String nombres;
    private String cedula_ruc;
    private String correo;
    private String telefono;
    private String direccion;
    private Date fechaRegistro;
    //Contructores

    public clientes(Integer idCliente, String apellidos, String nombres, String cedula_ruc, String correo, String telefono, String direccion, Date fechaRegistro) {
        this.idCliente = idCliente;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.cedula_ruc = cedula_ruc;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
    }

    public clientes(String apellidos, String nombres, String cedula_ruc, String correo, String telefono, String direccion, Date fechaRegistro) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.cedula_ruc = cedula_ruc;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
    }

    public clientes() {
    }
    
    //Setters y Getters

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCedula_ruc() {
        return cedula_ruc;
    }

    public void setCedula_ruc(String cedula_ruc) {
        this.cedula_ruc = cedula_ruc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    //Métodos tipo

    @Override
    public String toString() {
        return "clientes{" + "idCliente=" + idCliente + ", apellidos=" + apellidos + ", nombres=" + nombres + ", cedula_ruc=" + cedula_ruc + ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + ", fechaRegistro=" + fechaRegistro + '}';
    }
    
    
}
