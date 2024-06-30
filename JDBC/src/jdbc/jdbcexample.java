package jdbc;
import java.sql.*;
import javax.sql.*;

public class jdbcexample {
	public static final String username="root";
	public static final  String password="Uttam3012";
	public static final  String url = "jdbc:mysql://localhost:3306/student";
	
	public static void getConnection(){
		
	}
		public static void main(String[] ar) {
		  Connection cn;	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			cn = DriverManager.getConnection(url,username,password);
			System.out.println(cn);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
			
		}
	}