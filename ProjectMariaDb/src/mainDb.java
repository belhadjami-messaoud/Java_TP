import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class mainDb {

	public static void main(String[] args) {
		
		// connection string
			String url = "jdbc:mariadb://localhost:3306/myDb";
			String username = "root";
			String passwaord = "";
			
		try {
			
			//this for connect to database
			Connection con = DriverManager.getConnection(url,username,passwaord);
			//for create statement query
			Statement stm = con.createStatement();
			//this are query
			String queryForGetAll = "select * from users";
			String queryGetById = "select * from users where id =" + 2 ;
			//for execute query
			ResultSet resultSet = stm.executeQuery(queryGetById);
			
			while (resultSet.next() == true) {
				System.out.print(" " + resultSet.getInt(1)+ " ");
				System.out.print(" " + resultSet.getString(2)+" ");
				System.out.print(" " +resultSet.getInt(3)+" ");
				System.out.println();
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	
		
		
		try {
			Connection con = DriverManager.getConnection(url,username,passwaord);
			String query ="select * from users where id = ?";
			PreparedStatement preparedStm = con.prepareStatement(query);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//connection string for SqlServer
		String url = "jdbc:sqlserver://DESKTOP-L7L2S0D\\SQLEXPRESS01:1433;databaseName=testDb;encrypt=false;trustServerCertificate=true";
	    String user = "sa";
	    String password = "sa";
	      
	      try {
	            //Class.forName("org.mariadb.jdbc.Driver");
	    	  //for normal query
	    	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	            
	    	  Connection con = DriverManager.getConnection(url, user, password);
	    	 
	    	  Statement stmtStatement = con.createStatement();
	    	  
	    	  
	    	  /*
	    	  String requetSqlString = "Select * from users";
	    	  
	    	  ResultSet resultset = stmtStatement.executeQuery(requetSqlString);
	    	  
	    	  while (resultset.next() == true ) {
					
					System.out.print(resultset.getInt(1));
					System.out.print(resultset.getString(2));
					System.out.print(resultset.getString(3));
					System.out.println();

				}
	    	  
	    	 
	    	  
	    	  System.out.println("-----------------------welcom in prepared statement-----------------------");
	    	  
	    	  //for prepared statment
	    	  String requetSqlPreString = "Select * from users where name = ? ";
	    	  
	    	  String nom ="ahmed";
	    	  PreparedStatement preparedStatement = con.prepareStatement(requetSqlPreString);
	    	  preparedStatement.setString(1,nom);
	    	  
	    	  ResultSet resultsetPreparedStatement = preparedStatement.executeQuery();
	    	  
	    	  while (resultsetPreparedStatement.next() == true ) {
				
				System.out.print(resultsetPreparedStatement.getInt(1));
				System.out.print(resultsetPreparedStatement.getString(2));
				System.out.print(resultsetPreparedStatement.getString(3));
				System.out.println();
			}*/
	    	  
	    	  /*
	    	  System.out.println("-----------------------welcom in prepared statement Update-----------------------");
	    	  //query for update 
	    	  String age ="36";

	    	  String geuryUpdate = "update users set age= ?  where id = ?";
	    	  PreparedStatement preparedStatementUpdate = con.prepareStatement(geuryUpdate);
	    	  preparedStatementUpdate.setString(1, age);
	    	  preparedStatementUpdate.setInt(2, 1);
	    	  int rowsUpdated= preparedStatementUpdate.executeUpdate();
	    	  System.out.println(rowsUpdated + " row(s) updated.");
	    	  
	    	  
	    	  
	    	  
	    	  System.out.println("-----------------------welcom in prepared statement RollBack -----------------------");
	    	   
	    	  


		} 
	      catch (Exception e) {	
	    	  System.out.println(" Connect failed " + e);
	      }
	      */
}
	
}
