package BTR_Project_Using_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String url = "jdbc:mysql://localhost:3306/BTR";
    private static final String userName = "root";
    private static final String password = "1804";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,userName,password);
    }
}
