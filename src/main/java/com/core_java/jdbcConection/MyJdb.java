package com.core_java.jdbcConection;

import java.sql.*;

public class MyJdb {

    public static void main(String[] args)  {

        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_db",
                    "root",
                    "root"
            );

            Statement statement = connection.createStatement();

            PreparedStatement preparedStatement = connection.prepareStatement("select * from java_jdbc_master where first = ? and last= ?");
            preparedStatement.setString(1,"vikas");
            preparedStatement.setString(2,"patel");
            ResultSet resultSet1 = preparedStatement.executeQuery();


//            ResultSet resultSet = statement.executeQuery("select * from java_jdbc_master where first ='tekno'");

           while (resultSet1.next()){
               System.out.println("first:::"+resultSet1.getString("first"));
               System.out.println("last:::"+resultSet1.getString("last"));
               System.out.println("age:::"+resultSet1.getString("age"));
           }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
