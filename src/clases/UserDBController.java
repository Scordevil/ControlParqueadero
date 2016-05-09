/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.app.bean.GlobalBeans;
import com.app.bean.UsuarioBean;
import com.app.coreDB.DriverManagerDb;
import formularios.frmPrincipal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Gustavo
 */
public class UserDBController {

    private static DriverManagerDb conn;

    public boolean validarUsuario(String usuario, String clave) {
        boolean resp = false;
        try {
            conn = new DriverManagerDb();
            ResultSet rs = conn.dbSelect("select * from tb_sys_user where login_user='" + usuario + "' and password='" + clave + "'");

            if (rs.first()) {

                frmPrincipal.setPerfil_id(rs.getInt("perfil_id"));
                GlobalBeans.id_user=rs.getInt("id_user");
                GlobalBeans.user=usuario;
                resp = true;

            }

            conn.CerrarConexion();

        } catch (SQLException e) {
            System.out.println("Error de MySQL: " + e.getMessage());
        }
        return resp;
    }

    public static boolean createUser(UsuarioBean user) {
        boolean resp = true;
        try {
            conn = new DriverManagerDb();
            conn.dbOperaciones("INSERT INTO tb_sys_user (perfil_id,login_user,full_name,full_last_name,password) VALUES('" + user.getPerfil() + "','" + user.getNombres() + "','" + user.getApellidos() + "','" + user.getIdUsuario() + "','" + user.getClave() + "','" + user.getUser_status() + "')");
            conn.CerrarConexion();
        } catch (SQLException e) {
            resp = false;
            System.out.println("Error de MySQL: " + e.getMessage());
        }

        return resp;
    }

    public static boolean setUser(UsuarioBean user) {
        boolean resp = true;
        try {
            conn = new DriverManagerDb();
            conn.dbOperaciones("UPDATE tb_sys_user SET "
                    + " perfil_id='" + user.getPerfil() + "', "
                    + " login_user='" + user.getIdUsuario() + "', "
                    + " full_name='" + user.getNombres() + "', "
                    + " full_last_name='" + user.getApellidos() + "', "
                    + " password='" + user.getClave() + "', "
                    + " user_status='" + user.getUser_status() + "'"
                    + " WHERE id_user='" + user.getId() + "'");
            conn.CerrarConexion();
        } catch (SQLException e) {
            resp = false;
            System.out.println("Error de MySQL: " + e.getMessage());
        }

        return resp;
    }
    
    public static boolean setPassword(UsuarioBean user) {
        boolean resp = true;
        try {
            conn = new DriverManagerDb();
            conn.dbOperaciones("UPDATE tb_sys_user SET "
                    + " password='" + user.getClave() + "' "                   
                    + " WHERE id_user='" + user.getId() + "'");
            conn.CerrarConexion();
        } catch (SQLException e) {
            resp = false;
            System.out.println("Error de MySQL: " + e.getMessage());
        }

        return resp;
    }

    public static UsuarioBean getUser(String user) {
        UsuarioBean obj = null;
        try {

            conn = new DriverManagerDb();
            ResultSet rs = conn.dbSelect("select * from tb_sys_user where login_user='" + user + "' ");

            if (rs.first()) {
                obj = new UsuarioBean(
                        rs.getInt("id_user"),
                        rs.getInt("perfil_id"),
                        rs.getString("login_user"),
                        rs.getString("full_name"),
                        rs.getString("full_last_name"),
                        rs.getString("password"),
                        rs.getInt("user_status"));

            }

            conn.CerrarConexion();

        } catch (SQLException e) {
            System.out.println("Error de MySQL: " + e.getMessage());
        }

        return obj;
    }

    public static List<UsuarioBean> getAllusers() {
        List<UsuarioBean> obj = new ArrayList<UsuarioBean>();
        try {

            conn = new DriverManagerDb();
            ResultSet rs = conn.dbSelect("select * from tb_sys_user ");

            while (rs.next()) {
                obj.add(new UsuarioBean(
                        rs.getInt("id_user"),
                        rs.getInt("perfil_id"),
                        rs.getString("login_user"),
                        rs.getString("full_name"),
                        rs.getString("full_last_name"),
                        rs.getString("password"),
                        rs.getInt("user_status")));

            }

            conn.CerrarConexion();

        } catch (SQLException e) {
            System.out.println("Error de MySQL: " + e.getMessage());
        }
        return obj;
    }

}
