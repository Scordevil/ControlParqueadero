/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bean;

import java.sql.Date;

/**
 *
 * @author Servidor
 */
public class GestionBean {

    private int registro_id;
    private String auto_placa;
    private String auto_marca;
    private String auto_modelo;
    private String auto_color;
    private String descripcion;
    private String fecha_reg_entrada;
    private String fecha_reg_salida;
    private int total_hora;
    private int total_minuto;
    private Double pago_total;
    private int status;

    public GestionBean(int registro_id, String auto_placa, String auto_marca, String auto_modelo, String auto_color, String descripcion, String fecha_reg_entrada, String fecha_reg_salida, int total_hora, int total_minuto, Double pago_total, int status) {
        this.registro_id = registro_id;
        this.auto_placa = auto_placa;
        this.auto_marca = auto_marca;
        this.auto_modelo = auto_modelo;
        this.auto_color = auto_color;
        this.descripcion = descripcion;
        this.fecha_reg_entrada = fecha_reg_entrada;
        this.fecha_reg_salida = fecha_reg_salida;
        this.total_hora = total_hora;
        this.total_minuto = total_minuto;
        this.pago_total = pago_total;
        this.status = status;
    }

    public GestionBean(String auto_placa, String auto_marca, String auto_modelo, String auto_color, String descripcion, String fecha_reg_entrada, int status) {
        this.auto_placa = auto_placa;
        this.auto_marca = auto_marca;
        this.auto_modelo = auto_modelo;
        this.auto_color = auto_color;
        this.descripcion = descripcion;
        this.fecha_reg_entrada = fecha_reg_entrada;
        this.status = status;
    }

    public GestionBean(int registro_id,String fecha_reg_salida, int total_hora, int total_minuto, Double pago_total, int status) {
        this.registro_id=registro_id;
        this.fecha_reg_salida = fecha_reg_salida;
        this.total_hora = total_hora;
        this.total_minuto = total_minuto;
        this.pago_total = pago_total;
        this.status = status;
    }
    
    

    public int getRegistro_id() {
        return registro_id;
    }

    public void setRegistro_id(int registro_id) {
        this.registro_id = registro_id;
    }

    public String getAuto_placa() {
        return auto_placa;
    }

    public void setAuto_placa(String auto_placa) {
        this.auto_placa = auto_placa;
    }

    public String getAuto_marca() {
        return auto_marca;
    }

    public void setAuto_marca(String auto_marca) {
        this.auto_marca = auto_marca;
    }

    public String getAuto_modelo() {
        return auto_modelo;
    }

    public void setAuto_modelo(String auto_modelo) {
        this.auto_modelo = auto_modelo;
    }

    public String getAuto_color() {
        return auto_color;
    }

    public void setAuto_color(String auto_color) {
        this.auto_color = auto_color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_reg_entrada() {
        return fecha_reg_entrada;
    }

    public void setFecha_reg_entrada(String fecha_reg_entrada) {
        this.fecha_reg_entrada = fecha_reg_entrada;
    }

    public String getFecha_reg_salida() {
        return fecha_reg_salida;
    }

    public void setFecha_reg_salida(String fecha_reg_salida) {
        this.fecha_reg_salida = fecha_reg_salida;
    }

    public int getTotal_hora() {
        return total_hora;
    }

    public void setTotal_hora(int total_hora) {
        this.total_hora = total_hora;
    }

    public int getTotal_minuto() {
        return total_minuto;
    }

    public void setTotal_minuto(int total_minuto) {
        this.total_minuto = total_minuto;
    }

    public Double getPago_total() {
        return pago_total;
    }

    public void setPago_total(Double pago_total) {
        this.pago_total = pago_total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GestionBean{" + "registro_id=" + registro_id + ", auto_placa=" + auto_placa + ", auto_marca=" + auto_marca + ", auto_modelo=" + auto_modelo + ", auto_color=" + auto_color + ", descripcion=" + descripcion + ", fecha_reg_entrada=" + fecha_reg_entrada + ", fecha_reg_salida=" + fecha_reg_salida + ", total_hora=" + total_hora + ", total_minuto=" + total_minuto + ", pago_total=" + pago_total + ", status=" + status + '}';
    }

    
    
    

   
}
