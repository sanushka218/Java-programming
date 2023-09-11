//dml using jdbc
import java.sql.*;
import java.util.*;
public class jdbcP4 {

	public static void main(String[] args)throws Exception
	{
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
		//Statement stm=con.createStatement();
		//stm.executeUpdate("delete from dept where deptno=70");
		//stm.executeUpdate("update dept set dname='Prod' where deptno=50");
		System.out.println("enter the details of new student");
		int rn,dn;
		String name,city;
		Scanner sc=new Scanner(System.in);
		System.out.print("Roll no: ");rn=sc.nextInt();
		System.out.print("Name: ");name=sc.next();
		System.out.print("City: ");city=sc.next();
		System.out.print("Dept No: ");dn=sc.nextInt();

		PreparedStatement stm=con.prepareStatement("insert into stud values (?,?,?,?)");
		stm.setInt(1, rn);
		stm.setString(2,name);
		stm.setString(3, city);
		stm.setInt(4, dn);
		
		stm.executeUpdate();
		
		sc.close();
		stm.close();
		con.close();

	}

}
