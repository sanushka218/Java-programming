import java.sql.*;
public class jdbcP5 {

	public static void main(String[] args)throws Exception
	{
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
		Statement stm=con.createStatement();
		//stm.executeUpdate("create table temp(a integer, b float)");
		stm.executeUpdate("drop table temp");
	}
}
