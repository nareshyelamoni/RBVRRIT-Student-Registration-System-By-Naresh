import java.sql.*;

public class JdbcUtil {
	private static  Connection connect;
	static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	 public static Connection getConnection() {
		 String url="jdbc:mysql://localhost:3306/telusko_db";
		 String userName="root";
		 String password="Naresh@123";
		try {
			connect = DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return connect;
	 }
}
