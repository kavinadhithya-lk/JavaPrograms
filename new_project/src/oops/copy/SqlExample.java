package oops.copy;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SqlExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fita_schema","root","KAVIN123#");
			Scanner scan  = new Scanner(System.in);
			System.out.println("Enter name");
			String name = scan.nextLine();
			System.out.println("Enter age");
			String age = scan.nextLine();
			Statement stmt1= con.createStatement();
			stmt1.executeUpdate(
					"INSERT INTO fita_schema.student_table (id, Name, Age) VALUES ('2', '"+name+"', '"+age+" ');");
			
			
			Statement stmt= con.createStatement();
			ResultSet rs= stmt.executeQuery("select * from student_table");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			con.close();
		}catch(Exception e) {System.out.println(e);

	}

 }
}
