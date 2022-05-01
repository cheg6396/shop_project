package shop.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.codegen.MultiCatchExceptionLabel;

public class ShopConnection {
	//상수
	//1. 변하지 않는 변수
	//2. 공유되는 정보
	static Connection conn=null;
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	static String url="jdbc:mysql://localhost:3306/spring_shop";
	static String user="root"; 
	static String pw="mysql";
	static String driver="com.mysql.cj.jdbc.Driver";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		conn=DriverManager.getConnection(url,user,pw);
		return conn;
	}
	public static void main(String[] args) {
		try {
			System.out.println(ShopConnection.getConnection());			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
