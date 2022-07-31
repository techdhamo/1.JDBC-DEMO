package me.dhamo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class Main {
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
//Class.forName(Driver.class.getName());
java.sql.Driver driverObj=new com.mysql.cj.jdbc.Driver();
DriverManager.registerDriver(driverObj);
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?user=root&password=&createDatabaseIfNotExist=true");
//String query= "create table product(pid int primary key,pname varchar(30));";
//String productQuery="insert into product values(1,'Nokia C6')";
String selectProduct="select * from product";
Statement st =con.createStatement();

ResultSet rs=st.executeQuery(selectProduct);
//rs.first();
 while(rs.next()) {
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
 }
}
}