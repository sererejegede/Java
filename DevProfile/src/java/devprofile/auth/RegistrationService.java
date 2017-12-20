package devprofile.auth;
import java.sql.*;

public class RegistrationService {
    private int register = 0;
    public int registerer(String fname, String lname, String userName, String password){
        try {
            Connection connection = devprofile.DBConnection.getConnection();
            Statement statement = devprofile.DBConnection.cStatement();
            
            String sql_check = "SELECT username FROM dev_credentials WHERE username = '" + userName + "'";
            ResultSet rs = statement.executeQuery(sql_check);
            
            if (rs.next()) {
                register = 0; //User already exists
            }else{
                String sql_add = "INSERT INTO dev_credentials (fname, lname, username, password) VALUES ('" + fname + "','" + lname + "','" + userName + "','" + password + "')";
                register = statement.executeUpdate(sql_add);
            }
            
        } catch (Exception e) {
        }
        
        return register;
    }
}
