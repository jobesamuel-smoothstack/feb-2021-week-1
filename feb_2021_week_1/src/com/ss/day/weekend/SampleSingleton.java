package com.ss.day.weekend;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleSingleton {

	private static Connection conn = null;

	private static SampleSingleton instance = null;

	private SampleSingleton() {
	}

	public static SampleSingleton getInstance() {
		if (instance == null) {
			instance = new SampleSingleton();
		}
		return instance;
	}

	public static void databaseQuery(BigDecimal input) {
		try {
			conn = DriverManager.getConnection("url of database");

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select id from table");
			
			int x = 0;
			// get value from first column or id
			while (rs.next()) {
				// multiply id by input value;
				x = rs.getInt(1) * input.intValue();
				System.out.println(x);
			}
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
