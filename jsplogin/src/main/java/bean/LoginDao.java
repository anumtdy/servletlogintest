package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	public static boolean validate(LoginBean bean){  
		System.out.println("hi");
		
		boolean status=true;  
		try{  
		Connection con=ConnectionProvider.getCon();  
		              
		
		
		  PreparedStatement ps=con.prepareStatement(
		  "select name from userregistration where id='"+1+"'");
		  
		 // ps.setString(1,bean.getEmail()); ps.setString(2, bean.getPass());
		 
		  
		 
		              
		ResultSet rs=ps.executeQuery();  
		status=rs.next();
		String i=rs.getString(2);
		
		System.out.println(i);
		              
		}catch(Exception e){}  
		  
		return status;  
		  
		}  
	

}
