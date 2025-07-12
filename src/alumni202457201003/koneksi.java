/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumni202457201003;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Hype GLK
 */
public class koneksi {

    private static Connection mysqlconfig;

    public static Connection Konek() {

        try {
            String url = "jdbc:mysql://localhost:3306/alumni_202457201003";
            String user = "root";
            String pass = "";

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            return mysqlconfig;
        } catch (SQLException sQLException) {
            System.err.println(sQLException.getMessage());
            return null;
        }

    }
}
