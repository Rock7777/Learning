import java.sql.*;

/// Java db connectivity
/*
 * 1.import -----> java.sql
 * 2.load and register driver -> com.mysql.jdbc.Driver
 * 3.Create connection ---> Connection Interface
 * 4.Create a statement ---> Statement Interface
 * 5.execute the query
 * 6.process the  results
 * 7.close
 * 
 * 
 * 
 * 
 * 
 * 
 */



public class DemoClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/abc?autoReconnect=true&useSSL=false";
		String uname = "root";
		String password = "Mysql@123";
		String query="select * from student where rollno=2 ";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String a = rs.getString("name"); 
		System.out.println(a);

		st.close();
		con.close();
	}

}
