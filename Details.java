package flight;
import java.sql.*;
import java.util.Scanner;

public class Details {
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/";

	   //  Database credentials
	   static final String USER = "username";
	   static final String PASS = "password";
	private Scanner sc;
	
	public void createDatabase() {
		sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		try{
		      //Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //Open a connection
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);

		      //Execute a query

		      stmt = conn.createStatement();
		      
		      String sql = "CREATE DATABASE AIRLINES";
		      stmt.executeUpdate(sql);
		      
		    //Create a Table
		      stmt = conn.createStatement();
		      
		      sql = "CREATE TABLE Flight " +
		                   "(flightNo INTEGER not NULL, " +
		                   " airlineName VARCHAR(20), " + 
		                   " destination VARCHAR(20), " +
		                   " source	 VARCHAR(20), " +
		                   " deptDate VARCHAR(20), " +
		                   " deptTime VARCHAR(20), " +
		                   " arrivalDate VARCHAR(20), " +
		                   " arrivalTime VARCHAR(20), " +
		                   " price INTEGER, " + 
		                   " PRIMARY KEY ( id ))"; 

		      stmt.executeUpdate(sql);
		  
	      int flightNo = sc.nextInt();
	      Flight.setFlightNo(flightNo);
	      String airlineName = sc.nextLine();
	      Flight.setAirlineName(airlineName);
	      String destination = sc.nextLine();
	      Flight.setDestination(destination);
	      String source = sc.nextLine();
	      Flight.setSource(source);
	      String deptDate = sc.nextLine();
	      Flight.setDeptDate(deptDate);
	      String deptTime = sc.nextLine();
	      Flight.setDeptTime(deptTime);
	      String arrivalDate = sc.nextLine();
	      Flight.setArrivalDate(arrivalDate);
	      String arrivalTime = sc.nextLine();
	      Flight.setArrivalTime(arrivalTime);
		  long price = sc.nextInt();
		  Flight.setPrice(price);
		  
		  sql = "INSERT INTO Registration " +
                  "VALUES (flightNo, airlineName, destination, source, deptDate, deptTime, arrivalDate, arrivalTime, price)";
		  stmt.executeUpdate(sql);
     
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
	
		
	}

}
