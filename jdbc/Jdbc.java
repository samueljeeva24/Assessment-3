package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	public static void main(String[] args) {
	//	insert();
		/*
		 Modify(); delete(); 
		 */
		//Modify();
		 // update();
		  droprecord();
	}
public static void insert() {
		System.out.println("Connecting to Database");
		String url = "jdbc:mysql://localhost:3306/gla";
		String username = "root";
		String password = "2401";
		String query = "insert into employee values(1,'Vishnu','vishnu@gl.com',1236549871)";
		String query2 = "insert into employee values(2,'sridhar','sridhar@gl.com',1236549541)";
		String query3 = "insert into employee values(3,'SK','sk@gl.com',1566549871)";
		String query4 = "insert into employee values(4,'sam','sam@gl.com',456549871)";
		String query5 = "insert into employee values(5,'sudhaker','sudhaker.gl.com',1546549871)";
try {
			Connection con = DriverManager.getConnection(url,username,password);
			Statement st = con.createStatement();
			int rows = st.executeUpdate(query);
			int row2 = st.executeUpdate(query2);
			int row3 = st.executeUpdate(query3);
			int row4 = st.executeUpdate(query4);
			int row5 = st.executeUpdate(query5);
			System.out.println("No of Rows Get Affected : " + (rows + row2 + row3 + row4 + row5));
			System.out.println("Excecuted Success Fully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
public static void Modify() {
		System.out.println("connection to database");
		String url = "jdbc:mysql://localhost:3306/gla";
		String username = "root";
		String password = "2401";

		String querry = "alter table employee modify Email_Id varchar(50) not null";

		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			int row = st.executeUpdate(querry);
			System.out.println("no of table change" + row);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
public static void update() {
// Update the name of employee Id 3 to Karthik and phone number to 1234567890.
		String url = "jdbc:mysql://localhost:3306/gla";
		String username = "root";
		String password = "2401";

		String querry = "update employee set Name='Karthik' where Id=3";
		String querry2 = "update employee set Email_Id='Karthik@gl' where Id=3";
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			int row = st.executeUpdate(querry);
			int row1 = st.executeUpdate(querry2);
			System.out.println("Rename Has Been Done for thr table " + (row + row1));
			con.close();
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
public static void delete() {
		String url = "jdbc:mysql://localhost:3306/gla";
		String username = "root";
		String password = "2401";
		String query = "delete from employee where Id=3";
		String query1 = "delete from employee where Id=4";
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			int rows = st.executeUpdate(query);
			int row1 = st.executeUpdate(query1);
			System.out.println("No Of Rows Get Affected : " + (rows + row1));

		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void droprecord() {
		String url = "jdbc:mysql://localhost:3306/gla";
		String username = "root";
		String password = "2401";
		String query = "truncate employee";
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			int rows = st.executeUpdate(query);
			System.out.println("Rows get Affected : " + rows);
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
