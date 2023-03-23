package bean;

import java.sql.Connection;
import java.sql.DriverManager;

import static bean.Provider.*;

public class ConnectionProvider {
	public static Connection getCon(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudb","root","sapmysql");  
	    }
	    catch(Exception e){System.out.println(e);}  
	    return con;  
	}  
	
}
