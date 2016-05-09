/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.app.bean.ParqueaderoBean;
import com.app.bean.TarifasBean;
import com.app.coreDB.DriverManagerDb;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Servidor
 */
public class TarifasDBController {
    
    private static DriverManagerDb conn;
    
    public static TarifasBean getTarifa() {
        TarifasBean obj = null;
        try {

            conn = new DriverManagerDb();
            ResultSet rs = conn.dbSelect("select * from tb_sys_tarifas");

            if (rs.first()) {
                obj = new TarifasBean(
                        rs.getInt("tarifa_id"),
                        rs.getString("costo_min"),
                        rs.getString("costo_max_hora"));

            }

            conn.CerrarConexion();

        } catch (SQLException e) {
            System.out.println("Error de MySQL: " + e.getMessage());
        }

        return obj;    

    }
    
    public static boolean createTarifa(TarifasBean obj) {
        boolean resp = true;
        try {
            conn = new DriverManagerDb();
            conn.dbOperaciones("INSERT INTO tb_sys_tarifas ("
                    + "costo_min,"
                    + "costo_max_hora) VALUES("
                    + "'" + Double.valueOf(obj.getCosto_min()) + "',"
                    + "'" + Double.valueOf(obj.getCosto_max_hora())+ "')");
            conn.CerrarConexion();
        } catch (SQLException e) {
            resp = false;
            System.out.println("Error de MySQL: " + e.getMessage());
        }

        return resp;
    }  
    
    public static boolean setTarifas(TarifasBean obj) {
        boolean resp = true;
        try {
            conn = new DriverManagerDb();
            conn.dbOperaciones("UPDATE tb_sys_tarifas SET "
                    + " costo_min='" + Double.valueOf(obj.getCosto_min()) + "', "
                    + " costo_max_hora='" + Double.valueOf(obj.getCosto_max_hora()) + "' WHERE tarifa_id='" + obj.getId() + "'");
            conn.CerrarConexion();
        } catch (SQLException e) {
            resp = false;
            System.out.println("Error de MySQL: " + e.getMessage());
        }

        return resp;
    }
}
