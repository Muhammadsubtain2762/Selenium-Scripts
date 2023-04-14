package co.edureka.pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SPTesting {
	static Connection con = null;
    private static Statement stmt;
    
    public static String DB_URL= "jdbc:mysql://localhost/classicmodels";
    public static String DB_USER = "root";
	public static String DB_PASSWORD = "Wazir@2762";
	
	@BeforeTest
	public void setUp() throws Exception{
		try {
		String dbClass = "com.mysql.cj.jdbc.Driver";
		Class.forName(dbClass).newInstance();
		
		Connection con= DriverManager.getConnection(DB_URL, DB_USER,DB_PASSWORD);
		
		stmt=con.createStatement();
		} catch(Exception e){
			e.printStackTrace();
			
		}
	}
	@Test
	public void test() {
		try {
			String query = "select * from customers";
			
			ResultSet res =stmt.executeQuery(query);
			while(res.next()) {
				System.out.print(res.getString(1));
				System.out.print("\t"+ res.getString(2));
				System.out.print("\t" +res.getString(3));
	    		
	    		System.out.println("\t" +res.getString(4));
			}

	    		System.out.println("Your Store procedure is" +res);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
		}
		}
	@AfterTest
	public void tearDown()throws Exception{
		if(con!=null) {
			con.close();
	}

	}

}
