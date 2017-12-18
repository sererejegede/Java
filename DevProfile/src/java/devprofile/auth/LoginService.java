package devprofile.auth;

import java.sql.*;



public class LoginService {
    
    public boolean authenticate(String username, String password){
        try {
            Connection connection = devprofile.DBConnection.getConnection();
            Statement statement = devprofile.DBConnection.cStatement();
            
            String sql_check = "SELECT fname, username, password FROM dev_credentials WHERE username = '"+name+"'";
          
            
            ResultSet rs = statement.executeQuery(sql_check);

           if(rs.next()){
            String username = rs.getString("username");
            String pass = rs.getString("password");
            String firstName = rs.getString("fname");
            String passErr = "Incorrect Password";
           }
        } catch (Exception e) {
        }
    }
  }
}
