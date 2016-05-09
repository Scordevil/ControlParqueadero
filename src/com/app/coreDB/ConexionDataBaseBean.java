/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.coreDB;

/**
 *
 * @author Servidor
 */
public class ConexionDataBaseBean {

	private String login = "root";
       // private String password = "";
	private String password = "parking";
	private String url = "jdbc:mysql://localhost:3306";
	private String db = "/parking";

	/*
	 * private String login = "csytec"; private String password = "2009";
	 * private String url = "jdbc:mysql://192.168.0.102:3306"; private String db
	 * = "/csytec_sgpi";
	 */

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
