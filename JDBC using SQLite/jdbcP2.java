import java.sql.*;
public class jdbcP2 {

	public static void main(String[] args)throws Exception
	{
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
		Statement stm=con.createStatement();
		ResultSet rs= stm.executeQuery("select * from stud");
		
		int rn;
		String name;
		String city;
		int deptno;
		while(rs.next())
		{
			rn=rs.getInt(1);
			name=rs.getString(2);
			city=rs.getString(3);
			deptno=rs.getInt(4);
			System.out.println(rn+" "+name+" "+city+" "+deptno);
			
		}

	}

}
