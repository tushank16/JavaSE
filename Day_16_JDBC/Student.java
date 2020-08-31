package jdbc;
import java.sql.*;
/**
 * create a table "Student"

	rollno,name,age

write a java program to accept rollno,name,age from user and insert a row.

after inserting that row try to view using a query.
 *
 * 
 * @author tushank
 *
 */
public class Student {
	public static void main(String args[])
	{
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
			System.out.println("Implementation class is\t"+con.getClass()); 
			Statement st=con.createStatement();
			st.executeUpdate("create table student(rollno int(6), name varchar(30), age int(6))");
			st.executeUpdate("insert into student values(1,'shriraj',24)");
			st.executeUpdate("insert into student values(1,'ojas',50)");
			st.executeUpdate("insert into student values(1,'tushank',23)");

			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				int no=rs.getInt("rollno");
				String name=rs.getString("name");
				int age =rs.getInt("age");
				System.out.println(no+"\t"+name+"\t"+age);

			}
			
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}
/*
output:
Implementation class is	class com.mysql.cj.jdbc.ConnectionImpl
1	shriraj	24
1	ojas	50
1	tushank	23
*/
