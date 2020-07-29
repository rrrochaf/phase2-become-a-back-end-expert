package com.simplilearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteEmployeeDetails {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sampledb?useTimezone=true&serverTimezone=UTC", "root", "1234");
			Statement stmt = conn.createStatement();
			int rows = stmt.executeUpdate("DELETE FROM employee WHERE EmpId = 102");
			System.out.println(rows + " deleted successfully");
			conn.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}
}
