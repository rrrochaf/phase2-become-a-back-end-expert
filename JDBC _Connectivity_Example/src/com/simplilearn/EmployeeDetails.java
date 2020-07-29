package com.simplilearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDetails {

	public static void main(String[] args) {

		try {

			// 1. Register the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Create the connection
			// jdbc:mysql://localhost:port/bd_name?useTimezone=true&serverTimezone=UTC
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sampledb?useTimezone=true&serverTimezone=UTC", "root", "1234");

			// 3. Create the statement
			Statement stmt = conn.createStatement();

			// 4. Execute the query
			ResultSet result = stmt.executeQuery("SELECT * from employee");

			while (result.next()) {
				System.out.println(result.getInt(1) + " : " + result.getString(2));

			}

			// 5. Close the connection
			conn.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}
}
