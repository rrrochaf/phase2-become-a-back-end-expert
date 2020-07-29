package com.simplilearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateEmployeeDetails {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sampledb?useTimezone=true&serverTimezone=UTC", "root", "1234");
			Statement stmt = conn.createStatement();
			int row = stmt.executeUpdate("UPDATE employee SET EmpName = 'Felipe Jose' WHERE EmpId = '103'");

			System.out.println(row + " updated successfully");

			conn.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
