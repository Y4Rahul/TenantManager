import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class RegisterOwners {
	
	public boolean status(String username,String name,char[] password,String rooms,String address,String rent1,String rent2,String rent3,String rent4,String roomwidth,String roomheight)
	{
		int check=0;
		try{  
			Connection con= DatabaseConnection.getConnection();    
			statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from ownersdetail");
			while(rs.next())
			{
				if(rs.getString(2).equals(username))
					return false;
			}
			String pass = String.copyValueOf(password);
			PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into ownersdetail(username,name,password,rooms,address,roomrent1,roomrent2,roomrent3,roomrent4,roomwidth,roomheight) values(?,?,?,?,?,?,?,?,?,?,?)");  
		 
			ps.setString(1,username);  
			ps.setString(2,name);
			ps.setString(3,pass);
			ps.setString(4,rooms);
			ps.setString(5,address);
			ps.setString(6,rent1);
			ps.setString(7,rent2);
			ps.setString(8,rent3);
			ps.setString(9,rent4);
			ps.setString(10,roomwidth);
			ps.setString(11,roomheight);
			check=ps.executeUpdate();  
			con.close();
		}catch(Exception e){System.out.println(e);}
		if(check>0)
			return true;
		else
			return false;
		
	}
	public static void main(String[] args){
	try{  
		Connection con= DatabaseConnection.getConnection();    
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from users");  
		while(rs.next())  
		System.out.println(rs.getString(1)+"  "+rs.getString(2));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}
}
