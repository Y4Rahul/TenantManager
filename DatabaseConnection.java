

import java.sql.*;
public class DatabaseConnection implements Provider {
		private static Connection con=null;  
		static{  
		try{
		Class.forName(DRIVER);  
		con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
		}catch(Exception e){}  
		}
		  
		public static Connection getConnection(){  
		    return con;  
		}  
	}
