package com.student.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.student.entities.Address;
import com.student.entities.Student;
import java.sql.Statement;

public class StudentService {

    public String insertStudent(Student student) {
        int addressId = 0;
        String returnMsg = "Problem Occure During Inseting Recourd";
        String insertAddressQuery = "insert into address(area,landMark,pincode,city) values (?,?,?,?)";
        String insertStudentQuery = "insert into student(rollno, name,coursename,addressId) values(?,?,?,?)";
        try {
            Connection connection = getJDBCConnection();
            PreparedStatement statement = connection.prepareStatement(insertAddressQuery,
                    Statement.RETURN_GENERATED_KEYS);

            Address address = student.getAddress();

            statement.setString(1, address.getArea());
            statement.setString(2, address.getLandMark());
            statement.setInt(3, address.getPincode());
            statement.setString(4, address.getCity());
            statement.execute();
            ResultSet keys = statement.getGeneratedKeys();
            while (keys.next()) {
                addressId = keys.getInt(1);
            }

            PreparedStatement statement2 = connection.prepareStatement(insertStudentQuery);
            statement2.setInt(1, student.getRollNO());
            statement2.setString(2, student.getName());
            statement2.setString(3, student.getCourseName());
            if (addressId > 0) {
                statement2.setInt(4, addressId);
            } else {
                statement2.setString(4, null);
            }

            if (statement2.executeUpdate() > 0) {
                returnMsg = "Successfully Inserted Data";
            }

            connection.close();

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return returnMsg;
    }

    public String deleteStudent(int id) {
        String returnMsg= "Problem Occure during Deletation";
        String selectQuery= "select * from student where id = ?";
        String deleteAddresQuery = "delete from address where id = ?";
        String deleterStudentQuery = "delete from student where id = ?";
        int addressId =0;
        try (
            Connection connection = getJDBCConnection();
        ) {
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                addressId = result.getInt(5);
            }

            PreparedStatement statement1 = connection.prepareStatement(deleterStudentQuery);
            statement1.setInt(1, id);
            statement1.execute();

            PreparedStatement statement2 = connection.prepareStatement(deleteAddresQuery);
            statement2.setInt(1, addressId);
            if (statement2.executeUpdate() >0) {
                returnMsg = "Deletion is Successfully";
            }
           
        } catch (Exception e) {
            // TODO: handle exception
        }

        return returnMsg;
    }

    public String updateStudent(Student student, int id) {
        return null;
    }

    public Student selectStudent(int id) {
        Student student = null;
        String selectQuery = "select  rollno, name, coursename, address.id, address.area, address.landmark, address.pincode,address.city from student  join address on addressId = address.id where student.id = ?";
        try {
            Connection connection = getJDBCConnection();
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Address address = new Address(result.getString(5),result.getString(6),result.getInt(7),result.getString(8));

                student = new Student(result.getInt(1),result.getString(2),result.getString(3),address);

            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return student;
    }

    public List<Student> selectAllStudent() {
        List<Student> studentList = new ArrayList<>();
        Student student = null;
        String selectQuery = "select  rollno, name, coursename, address.id, address.area, address.landmark, address.pincode,address.city from student  join address on addressId = address.id";
        try {
            Connection connection = getJDBCConnection();
            PreparedStatement statement = connection.prepareStatement(selectQuery);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Address address = new Address(result.getString(5),result.getString(6),result.getInt(7),result.getString(8));

                student = new Student(result.getInt(1),result.getString(2),result.getString(3),address);

                studentList.add(student);

            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return studentList;
    }

    private Connection getJDBCConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection("jdbc:mysql://localhost:3306/rohitdb", "root", "Rohit@1983");

    }
}
