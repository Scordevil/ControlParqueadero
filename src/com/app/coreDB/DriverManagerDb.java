/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.coreDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Servidor
 */
public class DriverManagerDb {

    public String driver, url, ip, bd, usr, pass;
    public Connection conexion;
    private Statement stm;
    private ConexionDataBaseBean obj = new ConexionDataBaseBean();

    public DriverManagerDb() {

        bd = obj.getDb();
        ip = obj.getUrl();
        usr = obj.getLogin();
        pass = obj.getPassword();
        url = new String(ip +  bd);
        driver = "com.mysql.jdbc.Driver";
      

            try {
                Class.forName(driver).newInstance();
                conexion = DriverManager.getConnection(url, usr, pass);
                stm = conexion.createStatement();
            } catch (Exception exc) {
                System.out.println("Error al tratar de abrir la base de Datos" + "  " + bd + " : " + exc);
            }
        }

   

    public Connection getConexion() {
        return conexion;
    }

    private Statement getStatement() {
        return this.stm;
    }

    public ResultSet dbSelect(String sentencia) {
        ResultSet rs = null;
        try {
            rs = this.getStatement().executeQuery(sentencia);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public boolean dbOperaciones(String sentencia) {
        boolean rs = false;
        try {
            rs = this.getStatement().execute(sentencia);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }

    public int numFilas(String sentencia) {
        ResultSet rs = null;
        int numero = 0;
        try {
            rs = this.getStatement().executeQuery(sentencia);
            while (rs.next()) {
                numero++;
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return numero;
    }

    public Connection CerrarConexion() throws SQLException {

        conexion.close();
        conexion = null;
        return conexion;

    }

}
