import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/*
 * 
 * To retrieve all the records 
 * 
 * 
 * 
 */

public class SelectStatementExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/abc?autoReconnect=true&useSSL=false";
		String uname = "root";
		String password = "Mysql@123";
		String query="select * from student";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
		String userData = rs.getInt(1) + ":" + rs.getString(2); 
		System.out.println(userData);
		}

		st.close();
		con.close();
	}

}
