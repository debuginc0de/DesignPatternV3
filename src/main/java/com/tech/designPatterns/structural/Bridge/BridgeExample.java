package com.tech.designPatterns.structural.Bridge;


import java.sql.*;

/** The Bridge Pattern decouples abstraction from its implementation,
allowing both to vary independently **/

//The DriverManager acts as a bridge between the client code and the database drivers.

public class BridgeExample {
    public static void main(String[] args) {
        String url="jdbc:h2:mem:testdb";
        String user="sa";
        String password="";

        try(Connection con= DriverManager.getConnection(url,user,password)) {
            Statement statement=con.createStatement();
            statement.execute("CREATE TABLE example(id INT PRIMARY KEY,name VARCHAR(255))");
            statement.execute("INSERT INTO example VALUES(1,'Bridge Pattern')");

            ResultSet resultSet=statement.executeQuery("SELECT * FROM example");
            while (resultSet.next()){
                System.out.println(
                        "ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
