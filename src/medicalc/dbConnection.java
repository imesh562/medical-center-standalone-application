package medicalc;
//This classs is used for establish a connection with the database.

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class dbConnection
{
        public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/login_info", "root", "imesh562");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
}
