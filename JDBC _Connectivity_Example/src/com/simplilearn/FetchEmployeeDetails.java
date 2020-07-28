package com.simplilearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchEmployeeDetails {
	
	public static void main(String[] args) {
		
		
		try {

			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?useTimezone=true&serverTimezone=UTC", "root", "1234");
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * from employee WHERE EmpId = '101'");
			
			//result.absolute(1);
			
			while (result.next()) {
				System.out.println(result.getInt(1) + " : " + result.getString(2));

			}

			
			conn.close();

		} catch (Exception e) {
			
			System.out.println(e.getMessage());

		}

		
	}

}
