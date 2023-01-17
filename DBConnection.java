


package Database;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;



public class DBConnection {



	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		try{ //To Create connection and to get the connection from DBconnection
			Connection conn= DBConnection.getConnection(); System.out.println(conn); 
			//Towrite a query of student details 
			String query ="select * from Management.Student"; 
			//To create a statement 
			Statement  stmt =conn.createStatement(); { 
				//To create a resultset in that we have execute a  script 
				ResultSet rs = stmt.executeQuery(query); 
				while (rs.next()) { 
					//To getthe name of the student 
					long id = rs.getLong(1); 
					//To get the university id
					String name = rs.getString(2); 
					long Grade =rs.getLong(3);
					long FeesPaid=rs.getLong(4);
					//long Salary =rs.getLong(3);//To get the Student id long uid =
					//To get the semester of the student

					//To print the data of the student 
				//	System.out.println(id + ", " + name +" , " +Salary); } }} catch (SQLException e) {

					

	//To print the data of the student 
	 System.out.println(id + ", " + name +", " + Grade+", " + FeesPaid); } }} catch (SQLException e) {

		} }

public static Connection getConnection() throws Exception {  
	//To create a resource bundle and get a bundle to oracle
	/*
	 * ResourceBundle rb = ResourceBundle.getBundle("oracle");
	 * System.out.println(rb); //To get a string String url =
	 * rb.getString("db.url"); //To set a username String username =
	 * rb.getString("db.username"); //To set a password String password =
	 * rb.getString("db.password");
	 */
	//To Create connection and to get the connection from DBconnection   
	File src= new File("C:\\Users\\sahil.deshkar\\eclipse-workspace\\School Management\\src\\oracle.properties");
	FileInputStream fis= new FileInputStream(src);
	Properties obj = new Properties();
	obj.load(fis);

	String url = obj.getProperty("db.url");
	System.out.println(url);
	String username = obj.getProperty("db.username");
	System.out.println(username);
	String password = obj.getProperty("db.password");
	System.out.println(password);
	Connection connection=DriverManager.getConnection(url,username,password);
	return connection;





}
}