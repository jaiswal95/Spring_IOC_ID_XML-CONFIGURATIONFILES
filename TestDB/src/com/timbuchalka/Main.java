package com.timbuchalka;

import java.sql.Connection;
import java.sql.*;

public class Main {

	public static void main(String[] args) {

		try {
			Class.forName("org.sqlite.JDBC");

			Connection con = DriverManager
					.getConnection("jdbc:sqlite:/Users/Pankaj jaiswal/Desktop/JDBC/TestDB/testjava.db");
			// con.setAutoCommit(false);
			Statement stmt = con.createStatement();

			stmt.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT,phone INTEGER,email TEXT)");

			stmt.execute("Select * from contacts");
			ResultSet rs = stmt.getResultSet();
			
			// ResultSet rs=stmt.executeQuery("Select * from contacts"); We can do also Like this.

			while (rs.next()) {
				System.out.println(rs.getString("name") + " " + rs.getInt(2) + " " + rs.getString("email"));
			}

			/*
			 * stmt.execute("INSERT INTO
			 * contacts(name,phone,email)"+"VALUES('Maa',8447396816,'r1975@gmail.com')");
			 */

			 //stmt.execute("UPDATE contacts SET phone=844739681 WHERE name='Maa'");

			// stmt.execute("DELETE FROM contacts WHERE name='Soumen'");

			// con.commit();
			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException | ClassNotFoundException e) {
			// e.printStackTrace();

			System.out.println("Something went Wrong: " + e.getMessage());
		}

	}

}
