import javax.swing.*;
import java.sql.*;
public class Secondactivity{

	public boolean checklogin(String username,String password)
	{
		if(username.equals("rahul") && password.equals("rahul"))
		{
			return true;
		}
		else
			return false;
	}
	
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost/tenantmanager","root","");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from users");  
		while(rs.next())  
		System.out.println(rs.getString(1)+"  "+rs.getString(2));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
}
