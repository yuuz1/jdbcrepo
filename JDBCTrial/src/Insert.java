import java.sql.*;
public class Insert{
	public static void main(String[]arg) throws Exception {
		insertData();
	}
	
	public static void insertData()throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/namelist";
		String username="root";
		String password="123456789";
		String Query="insert into new_table values(?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1,1);
		pst.setString(2, "joe");
		pst.setString(3, "sample@gmail.com");
		pst.executeUpdate();
		con.close();
		}
	
}
