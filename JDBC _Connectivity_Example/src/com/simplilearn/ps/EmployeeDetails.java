package com.simplilearn.ps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDetails {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sampledb?useTimezone=true&serverTimezone=UTC", "root", "1234");
			PreparedStatement stmt = conn.prepareStatement("SELECT * from employee WHERE EmpId = ?");

			stmt.setInt(1, 102);

			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				System.out.println(result.getInt(1) + " : " + result.getString(2));

			}

			conn.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

}
