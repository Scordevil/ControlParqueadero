/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.coreDB;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Servidor
 */
public class TestingDb {

    public TestingDb() {
        DriverManagerDb conn = new DriverManagerDb();

        try {

            ResultSet rs = conn.dbSelect("select * from sys_user");
            
            while (rs.next()) {
                System.out.println("idUser:" + rs.getString("iduser") + "  " + "Pass:" + rs.getString("userpass"));
            }

            conn.CerrarConexion();

        } catch (SQLException e) {
            System.out.println("Error de MySQL: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        new TestingDb();
    }
}
