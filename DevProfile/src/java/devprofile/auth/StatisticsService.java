package devprofile.auth;

import java.sql.*;

public class StatisticsService {
    private int count;
    private String[] languages;
    
    public int counter(String language){
        try {
            Connection connection = devprofile.DBConnection.getConnection();
            Statement statement = devprofile.DBConnection.cStatement();
            
            String sql_count = "SELECT COUNT(*) AS 'count' FROM dev_credentials WHERE firstLang = '"+language+"'";
            ResultSet result = statement.executeQuery(sql_count);
            result.next();
            count = result.getInt("count");
            
        result.close();
        statement.close();
        connection.close();    
        } catch (Exception e) {
        }
        
     return count;   
    }
    
 
}
