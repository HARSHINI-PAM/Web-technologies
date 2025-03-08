package com.MvcJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  
public class MysqlCon
{  
public static void main(String args[])
{  
	try
	{  
	   // step1 -> driver download
	   Class.forName("com.mysql.cj.jdbc.Driver");  
	  
	   // step2 -> connection road
	   Connection con=DriverManager.getConnection(  
			   "jdbc:mysql://localhost:3306/yourDatabaseName", "hr", "hr");  
	  
	  // step3 -> car connection object
	    Statement stmt=con.createStatement();  
	  
	    ResultSet rs=stmt.executeQuery("select * from Employee");  
	     while(rs.next())  
	    System.out.println(rs.getInt(3)+"  "+rs.getInt(4)+"  "+rs.getString(1)
		  +"  "+rs.getString(2));  
	
	    con.close();
	} 
	
	catch(Exception e)
	{ 
		System.out.println(e);  
	}
}
}


