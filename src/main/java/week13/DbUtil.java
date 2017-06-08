package week13;

/**
 * Created by Tivadar Bocz on 2017.06.07..
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * There are 5 steps to connect any java application with the database in java using JDBC. They are as follows:
 * 1) Register the driver class
 * 2) Creating connection
 * 3) Creating statement
 * 4) Executing queries
 * 5) Closing connection
 */
public class DbUtil {
    /*private static final String DB_URL = "jdbc:postgresql://localhost:5432/helixlab";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "admin";
    private static final String POSTGRE_DRIVER_NAME = "org.postgresql.Driver";
*/
    public static Connection getConnection() {

        Connection connection = null;
        Properties p = getProperties();
        try {
            //1) Register the driver class
            Class.forName(p.getProperty("POSTGRE_DRIVER_NAME"));
            //2) Creating connection
            connection = DriverManager.getConnection(p.getProperty("DB_URL"), p.getProperty("DB_USER"), p.getProperty("DB_PASSWORD"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static Properties getProperties() {
        Properties p = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\Admin\\workspace\\lanoga\\helixlab_education\\src\\main\\resources\\db.properties");
            p.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return p;
    }
}
