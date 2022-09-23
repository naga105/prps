package DAO;

import Model.UserDetail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toten
 */
public class DBContext {
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber +";databaseName=" + dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        return DriverManager.getConnection(url, userID, password);
    }
//jdbc:sqlserver://localhost:1433;database=hotel
    private final String serverName = "localhost";
    private final String dbName = "bookify";
    private final String portNumber = "1433";
    private final String userID = "guest";
    private final String password = "123";

    public static void main(String[] args) {
        try {
            Connection connection = new DBContext().getConnection();

            if(connection!=null) {
                DAO dao= new DAO();
                UserDetail user=dao.viewProfile("sa");
                System.out.println(user);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDateTime now = LocalDateTime.now();
                System.out.println(dtf.format(now));


            } else {
                System.out.println("Connect failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
