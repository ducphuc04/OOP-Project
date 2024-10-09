package App;

import javafx.application.Application;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    private final static String url = "jdbc:mysql://localhost:3306/employee";
    private final static String username = "root";
    private final static String password = "12345678";
    public static Connection connectDB(){
        try{
            Connection connect = DriverManager.getConnection(url, username, password);
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
}
