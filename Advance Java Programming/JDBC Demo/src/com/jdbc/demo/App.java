package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App {

    public static void main(String[] args) throws Exception {
        // int id = 2;
        // String name = "Kunal";
        // int age = 22;

        // Class.forName("com.mysql.cj.jdbc.Driver");
        // System.out.println("Driver loaded successfully");

        // Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohitdb", "root",
        //         "Rohit@1983");
        // System.out.println("Connected Successfully");

        // PreparedStatement statement =connection.prepareStatement
        // // ("Insert into demo values("+id+",'"+name+"',"+age+")");
        // ("insert into demo values(?,?,?)");
        // statement.setInt(1, id);
        // statement.setString(2, name);
        // statement.setInt(3, age);
        // statement.execute();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager .getConnection("jdbc:mysql://localhost:3306/rohitdb", "root", "Rohit@1983");

        PreparedStatement statement = connection.prepareStatement("select * from demo");
        ResultSet result = statement.executeQuery();
        while (result.next()) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("id :" + result.getInt(1)+" | name :"+ result.getString(2)+" | Age :"+result.getInt(3));

        }
        

    }
}
