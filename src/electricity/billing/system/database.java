package electricity.billing.system;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class database {
    Connection connection;
    Statement statement;
    database(){
        try {
            connection = getConnection("jdbc:mysql://localhost:3306/?user=root");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


