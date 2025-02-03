package electricity.billing.system;

import java.sql.*;

public class database {
    Connection connection;
    Statement statement;
    database(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill_system","root","Soundar@23");
            statement = connection.createStatement();
            System.out.println("Database connected successfully");
        }catch (Exception e){
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
    public static void main(String [] args){

    }
}


