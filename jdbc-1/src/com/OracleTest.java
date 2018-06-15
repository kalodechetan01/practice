package com;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class OracleTest {
public static void main(String[] args) {
	try {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		System.out.println("   Driver class loaded  ");
		java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		System.out.println("Connection establish...");
	} catch (Exception e) {
		System.out.println("failed"+e);
	}
}
}
