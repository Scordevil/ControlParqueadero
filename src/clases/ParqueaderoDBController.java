/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.app.bean.ParqueaderoBean;
import com.app.coreDB.DriverManagerDb;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Servidor
 */
public class ParqueaderoDBController {

    private static DriverManagerDb conn;

    public static ParqueaderoBean getParqueadero() {
        ParqueaderoBean obj = null;
        try {

            conn = new DriverManagerDb();
            ResultSet rs = conn.dbSelect("select * from tb_sys_local");

            if (rs.first()) {
                obj = new ParqueaderoBean(
                        rs.getInt("id_local"),
                        rs.getString("local_name"),
                        rs.getString("local_identificacion"),
                        rs.getString("local_direccion"),
                        rs.getString("local_telefono"),
                        rs.getInt("local_cupos"),
                        rs.getString("local_moneda_simb"),
                        rs.getString("local_nombre_documento"),
                        rs.getString("ticke_header_in"),
                        rs.getString("ticke_header_out"),
                        rs.getString("ticke_footer_in"),
                        rs.getString("ticke_footer_out"));

            }

            conn.CerrarConexion();

        } catch (SQLException e) {
            System.out.println("Error de MySQL: " + e.getMessage());
        }

        return obj;    

    }
    
    public static boolean createParqueadero(ParqueaderoBean obj) {
        boolean resp = true;
        try {
            conn = new DriverManagerDb();
            conn.dbOperaciones("INSERT INTO tb_sys_local ("
                    + "local_name,"
                    + "local_identificacion,"
                    + "local_direccion,"
                    + "local_telefono,"
                    + "local_cupos,"
                    + "local_moneda_simb,"
                    + "local_nombre_documento,"
                    + "ticke_header_in,"
                    + "ticke_header_out,"
                    + "ticke_footer_in,"
                    + "ticke_footer_out) VALUES("
                    + "'" + obj.getName() + "',"
                    + "'" + obj.getIdentificacion()+ "',"
                    + "'" + obj.getDireccion() + "',"
                    + "'" + obj.getTelefono() + "',"
                    + "'" + obj.getCupos() + "',"
                    + "'" + obj.getSimMoneda() + "',"
                    + "'" + obj.getNombreDocumento() + "',"
                    + "'" + obj.getHeader_ticket_in() + "',"
                    + "'" + obj.getHeader_ticket_out() + "',"
                    + "'" + obj.getFooter_ticket_in() + "',"
                    + "'" + obj.getFooter_ticket_out() + "')");
            conn.CerrarConexion();
        } catch (SQLException e) {
            resp = false;
            System.out.println("Error de MySQL: " + e.getMessage());
        }

        return resp;
    }
    
    public static boolean setParqueadero(ParqueaderoBean obj) {
        boolean resp = true;
        try {
            conn = new DriverManagerDb();
            conn.dbOperaciones("UPDATE tb_sys_local SET "
                    + " local_name='" + obj.getName() + "', "
                    + " local_identificacion='" + obj.getIdentificacion() + "', "
                    + " local_direccion='" + obj.getDireccion()+ "', "
                    + " local_telefono='" + obj.getTelefono() + "', "
                    + " local_cupos='" + obj.getCupos() + "', "
                    + " local_moneda_simb='" + obj.getSimMoneda() + "', "
                    + " local_nombre_documento='" + obj.getNombreDocumento() + "', "
                    + " ticke_header_in='" + obj.getHeader_ticket_in() + "', "
                    + " ticke_header_out='" + obj.getHeader_ticket_out() + "', "
                    + " ticke_footer_in='" + obj.getFooter_ticket_in() + "', "
                    + " ticke_footer_out='" + obj.getFooter_ticket_out() + "' WHERE id_local='" + obj.getId() + "'");
            conn.CerrarConexion();
        } catch (SQLException e) {
            resp = false;
            System.out.println("Error de MySQL: " + e.getMessage());
        }

        return resp;
    }

}
