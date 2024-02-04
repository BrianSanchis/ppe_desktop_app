package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBSingleton {
	
	private static Connection connection;
    private static DBSingleton instance;
    
    private DBSingleton() throws SQLException {
        
    	String url = "jdbc:mariadb://127.0.0.1:3306/desktop_app_db?user=ppe_user_desktop&password=123+aze";
        connection = DriverManager.getConnection(url);
    }
    public static DBSingleton getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBSingleton();
        }
        return instance;
    }
    public Connection getConnection() {
        return connection;
    }
    public void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
