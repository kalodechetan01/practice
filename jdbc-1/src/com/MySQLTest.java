package com;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class MySQLTest {
public static void main(String[] args) {
	try {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		System.out.println("   Driver class loaded  ");
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
		System.out.println("Connection establish...");
	} catch (Exception e) {
		System.out.println("failed"+e);
	}
}
}
