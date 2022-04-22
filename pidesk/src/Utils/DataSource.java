/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * //http://127.0.0.1:8000//pidev
 *
 * @author malek
 */
public class DataSource {

  private static DataSource data;
    private Connection con;
    private static String url = "jdbc:mysql://localhost:3306/pi";
    private static String login = "root";
    private static String pwd = "";

    private DataSource() {
        try {
            con = DriverManager.getConnection(url, login, pwd);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public Connection getConnection() {
        return con;
    }

    public static DataSource getInstance() {
        if (data == null) {
            data = new DataSource();
        }
        return data;
    }
}
