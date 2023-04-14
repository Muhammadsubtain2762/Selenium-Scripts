package co.edureka.pages;

import java.sql.Connection;
import java.sql.Statement;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

@Test
public class SeleniumDatabaseTesting {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL= "jdbc:mysql://localhost/emp";
	//database credentials
	static final String USER = "root";
	static final String PASS = "Wazir@2762";
	
	    public static void main(String[]args) {
	    Connection conn = null;
	    Statement stmt = null;
	    
	    try {
	    	//Register JDBC driver
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	//open connection
	    	System.out.println("Connecting to Database .....");
	    	conn= DriverManager.getConnection(DB_URL, "root","Wazir@2762");
	    	
	    	//execute query
	    	System.out.println("Creating statement");
	    	stmt = conn.createStatement();
	    	String sql;
	    	sql ="SELECT id,first,last, age FROM Employees where age > 29";
	    	ResultSet rs = stmt.executeQuery(sql);
	    	
	    	while(rs.next()) {
	    		int id = rs.getInt("id");
	    		int age = rs.getInt("age");
	    		String first= rs.getString("first");
	    		String last = rs.getString("last");
	    		
	    		System.out.print("ID: " +id);
	    		System.out.print(", age: " +age);
	    		System.out.print(", first: " +first);
	    		
	    		System.out.println(", Last: " + last);
	    	}
	    		
	    		rs.close();
	    		stmt.close();
	    		conn.close();
	    }catch(SQLException se) {
	    		se.printStackTrace();
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}finally {
	    		try {
	    		if(stmt!=null)
	    			stmt.close();
	    		} catch(Exception se2) {
	    			
	    	}
	    		try {
	    			if(conn!=null)
	    				conn.close();
	    		}catch(SQLException se) {
	    			se.printStackTrace();
	    		}
	    		}
	    	System.out.println("Good Bye.....");
	    	}
	    }
	    	
	     
	    
	    
	    
	    
	    


