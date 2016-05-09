/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bean;

/**
 *
 * @author Gustavo
 */
public class UsuarioBean {
    
    private int id;
    private int perfil;
    private String idUsuario;
    private String nombres;
    private String apellidos;
    private String clave;
    private int user_status;
    

    public UsuarioBean() {
    }

    public UsuarioBean(int id, String idUsuario, String clave) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.clave = clave;
    }

    
    public UsuarioBean(int id, int perfil, String idUsuario, String nombres, String apellidos, String clave,int user_status) {
        this.id = id;
        this.perfil = perfil;
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.clave = clave;
        this.user_status=user_status;
    }

    public UsuarioBean(int perfil,String idUsuario, String nombres, String apellidos, String clave,int user_status ) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.clave = clave;
        this.perfil = perfil;
        this.user_status=user_status;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_status() {
        return user_status;
    }

    public void setUser_status(int user_status) {
        this.user_status = user_status;
    }
    
    
        
    
}
