import javax.swing.*;
import java.sql.*;
public class Secondactivity{

	public boolean checklogin(String username,String password)
	{
			try{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost/tenantmanager","root","");  
				//here sonoo is database name, root is username and password  
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from ownersdetail");  
				while(rs.next()) 
				{
					if(rs.getString(1).equals(username)&& rs.getString(3).equals(password))
						{
						con.close();
						return true;
						}
				}  
				  
				}catch(Exception e){ System.out.println(e);}
			return false;
	}
	
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost/tenantmanager","root","");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from ownersdetail");  
		while(rs.next())  
		System.out.println(rs.getString(1)+"  "+rs.getString(4));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
}
