package devprofile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

public interface Constants {
    String FIRST_NAME = "first";
    String DB_PASSWORD = "";
    String DB_USERNAME = "root";
    String DB_URL = "jdbc:mysql://localhost/registration";
    String DRIVER = "com.mysql.jdbc.Driver";
    
    
    
}

