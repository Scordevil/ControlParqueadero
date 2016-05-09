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
public class TarifasBean {
    
    private int id;
    private String costo_min;
    private String costo_max_hora;

    public TarifasBean() {
    }

    public TarifasBean(int id, String costo_min, String costo_max_hora) {
        this.id = id;
        this.costo_min = costo_min;
        this.costo_max_hora = costo_max_hora;
    }

    public TarifasBean(String costo_min, String costo_max_hora) {
        this.costo_min = costo_min;
        this.costo_max_hora = costo_max_hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCosto_min() {
        return costo_min;
    }

    public void setCosto_min(String costo_min) {
        this.costo_min = costo_min;
    }

    public String getCosto_max_hora() {
        return costo_max_hora;
    }

    public void setCosto_max_hora(String costo_max_hora) {
        this.costo_max_hora = costo_max_hora;
    }

    @Override
    public String toString() {
        return "TarifasBean{" + "id=" + id + ", costo_min=" + costo_min + ", costo_max_hora=" + costo_max_hora + '}';
    }
    
    
}
