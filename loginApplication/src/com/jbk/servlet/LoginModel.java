package com.jbk.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class LoginModel {
	ArrayList<Student> fetchAllEmployees() {
		ArrayList<Student> al = new ArrayList<>();
		try {
			System.out.println(1);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(2);
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			System.out.println(3);
			Statement statement = connection.createStatement();
			String sql = "select * from demo";
			System.out.println(4);
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println(5);
			while (resultSet.next()) {
				System.out.println(6);
				Student student = new Student();
				System.out.println(7);
				String sname = resultSet.getString(2);
				System.out.println(8);
				
				student.sname = sname;
				System.out.println(9);
				
				al.add(student);
				System.out.println(10);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}

}
