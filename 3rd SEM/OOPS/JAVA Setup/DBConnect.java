
/*Program :Design following using JDBC
Pre-requisites:- 
Jdk version 8,  mysql-connector-java-5.1.49 (any version above 4)
*/
import java.sql.*;

class DBConnect
{
	Statement s;
	Connection c;
	DBConnect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3036/dbtest","root","root");  //test1 is dbname,   root is dbusername and dbpassword
			s=c.createStatement();
			s.execute("create table JavaLab(name text(16),surname text(6),city text(6))");
			System.out.println("Table created");
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String args[])
	{
		DBConnect x=new DBConnect();
	}
}

