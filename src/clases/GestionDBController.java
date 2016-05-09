/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.app.bean.GestionBean;
import com.app.bean.ParqueaderoBean;
import com.app.bean.UsuarioBean;
import com.app.coreDB.DriverManagerDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Servidor
 */
public class GestionDBController {

    private static DriverManagerDb conn;

    public static boolean createMovimiento(GestionBean obj) {
        boolean resp = true;
        try {
            conn = new DriverManagerDb();
            conn.dbOperaciones("INSERT INTO tb_sys_movimiento ("
                    + "auto_placa,"
                    + "auto_marca,"
                    + "auto_modelo,"
                    + "auto_color,"
                    + "descripcion,"
                    + "fecha_reg_entrada,"
                    + "fecha_reg_salida,"
                    + "total_horas,"
                    + "total_minutos,"
                    + "pago_total,"
                    + "status) VALUES("
                    + "'" + obj.getAuto_placa() + "',"
                    + "'" + obj.getAuto_marca() + "',"
                    + "'" + obj.getAuto_modelo() + "',"
                    + "'" + obj.getAuto_color() + "',"
                    + "'" + obj.getDescripcion() + "',"
                    + "'" + obj.getFecha_reg_entrada() + "',"
                    + "'" + obj.getFecha_reg_salida()+ "',"
                    + "'" + Integer.valueOf("0")+ "',"
                    + "'" + Integer.valueOf("0")+ "',"
                    + "'" + Double.valueOf("0") + "',"
                    + "'" + obj.getStatus() + "')");
            conn.CerrarConexion();
        } catch (SQLException e) {
            resp = false;
            System.out.println("Error de MySQL: " + e.getMessage());
        }

        return resp;

    }

    public static List<GestionBean> getAllReg( int status) {
        List<GestionBean> obj = new ArrayList<GestionBean>();
        try {

            conn = new DriverManagerDb();
            ResultSet rs = conn.dbSelect("select * from tb_sys_movimiento WHERE status='" + status + "'");

            while (rs.next()) {
                obj.add(new GestionBean(
                        rs.getInt("registro_id"),
                        rs.getString("auto_placa"),
                        rs.getString("auto_marca"),
                        rs.getString("auto_modelo"),
                        rs.getString("auto_color"),
                        rs.getString("descripcion"),
                        rs.getString("fecha_reg_entrada"),
                        rs.getString("fecha_reg_salida"),
                        rs.getInt("total_horas"),
                        rs.getInt("total_minutos"),
                        rs.getDouble("pago_total"),
                        rs.getInt("status")));

            }

            conn.CerrarConexion();

        } catch (SQLException e) {
            System.out.println("Error de MySQL: " + e.getMessage());
        }
        return obj;
    }
    
    public static boolean setGestion(GestionBean obj) {
        boolean resp = true;
        try {
            conn = new DriverManagerDb();
            conn.dbOperaciones("UPDATE tb_sys_movimiento SET "
                    + " fecha_reg_salida='" + obj.getFecha_reg_salida() + "', "
                    + " total_horas='" + obj.getTotal_hora()+ "', "
                    + " total_minutos='" + obj.getTotal_minuto()+ "', "
                    + " pago_total='" + obj.getPago_total()+ "', "
                    + " status='" + obj.getStatus()+ "' WHERE registro_id='" + obj.getRegistro_id() + "'");
            conn.CerrarConexion();
        } catch (SQLException e) {
            resp = false;
            System.out.println("Error de MySQL: " + e.getMessage());
        }

        return resp;
    }

}
