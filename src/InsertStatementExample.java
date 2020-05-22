import java.sql.*;
/*
 *  Inserting value into database example
 *  
 *  for Insert statement(DML statement) we need a PreparedStatement interface
 * 
 * 
 * 
 */

public class InsertStatementExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/abc?autoReconnect=true&useSSL=false";
		String uname = "root";
		String password = "Mysql@123";
		int rollno=6;
		String name="Rock";
		String query="insert into student values(?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1,rollno);
		st.setString(2,name);
		int  count=st.executeUpdate();
		
		System.out.println(count + " " + "row/s affected");

		st.close();
		con.close();
	}

}
