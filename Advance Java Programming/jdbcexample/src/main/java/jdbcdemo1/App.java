package jdbcdemo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/rohitdb";
        String username = "root";
        String password = "Rohit@1983";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Successfull");

        PreparedStatement statement = connection.prepareStatement("select * from demo where id = ?");
        statement.setInt(1, 2);
        ResultSet result = statement.executeQuery();

        while (result.next()) {
            System.out.println("Id :" + result.getInt(1) + " | Name :" + result.getString(2) + " | Age :" + result.getInt(3));
        }

        connection.close();


    }
}
