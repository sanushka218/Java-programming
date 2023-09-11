import java.sql.*;
import java.util.*;
public class jdbcP3 {

	public static void main(String[] args) throws Exception{

		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
		PreparedStatement stm=con.prepareStatement("select * from stud where deptno=?");

		Scanner sc=new Scanner(System.in);
		int dn;
		System.out.println("enter the deptno");
		dn=sc.nextInt();
		
		stm.setInt(1, dn);
		ResultSet rs= stm.executeQuery();
		
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
		sc.close();
	}
}
