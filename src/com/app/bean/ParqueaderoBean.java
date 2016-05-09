/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bean;

/**
 *
 * @author Servidor
 */
public class ParqueaderoBean {
    private int id;
    private String name;
    private String identificacion;
    private String direccion;
    private String telefono;
    private int cupos;
    private String simMoneda;
    private String nombreDocumento;
    private String header_ticket_in;
    private String header_ticket_out;
    private String footer_ticket_in;
    private String footer_ticket_out;

    public ParqueaderoBean() {
    }

    
    public ParqueaderoBean(int id, String name, String identificacion, String direccion, String telefono, int cupos, String simMoneda, String nombreDocumento, String header_ticket_in, String header_ticket_out, String footer_ticket_in, String footer_ticket_out) {
        this.id = id;
        this.name = name;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cupos = cupos;
        this.simMoneda = simMoneda;
        this.nombreDocumento = nombreDocumento;
        this.header_ticket_in = header_ticket_in;
        this.header_ticket_out = header_ticket_out;
        this.footer_ticket_in = footer_ticket_in;
        this.footer_ticket_out = footer_ticket_out;
    }

    
    public ParqueaderoBean(String name, String identificacion, String direccion, String telefono, int cupos, String simMoneda, String nombreDocumento, String header_ticket_in, String header_ticket_out, String footer_ticket_in, String footer_ticket_out) {
        this.name = name;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cupos = cupos;
        this.simMoneda = simMoneda;
        this.nombreDocumento = nombreDocumento;
        this.header_ticket_in = header_ticket_in;
        this.header_ticket_out = header_ticket_out;
        this.footer_ticket_in = footer_ticket_in;
        this.footer_ticket_out = footer_ticket_out;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public String getSimMoneda() {
        return simMoneda;
    }

    public void setSimMoneda(String simMoneda) {
        this.simMoneda = simMoneda;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getHeader_ticket_in() {
        return header_ticket_in;
    }

    public void setHeader_ticket_in(String header_ticket_in) {
        this.header_ticket_in = header_ticket_in;
    }

    public String getHeader_ticket_out() {
        return header_ticket_out;
    }

    public void setHeader_ticket_out(String header_ticket_out) {
        this.header_ticket_out = header_ticket_out;
    }

    public String getFooter_ticket_in() {
        return footer_ticket_in;
    }

    public void setFooter_ticket_in(String footer_ticket_in) {
        this.footer_ticket_in = footer_ticket_in;
    }

    public String getFooter_ticket_out() {
        return footer_ticket_out;
    }

    public void setFooter_ticket_out(String footer_ticket_out) {
        this.footer_ticket_out = footer_ticket_out;
    }

    @Override
    public String toString() {
        return "ParqueaderoBean{" + "name=" + name + ", identificacion=" + identificacion + ", direccion=" + direccion + ", telefono=" + telefono + ", cupos=" + cupos + ", simMoneda=" + simMoneda + ", nombreDocumento=" + nombreDocumento + ", header_ticket_in=" + header_ticket_in + ", header_ticket_out=" + header_ticket_out + ", footer_ticket_in=" + footer_ticket_in + ", footer_ticket_out=" + footer_ticket_out + '}';
    }
    
    
    
}
