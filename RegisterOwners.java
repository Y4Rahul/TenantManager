import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegisterOwners {
	
	public boolean status(String data)
	{
		if(data.equals("rahul"))
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
