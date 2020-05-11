package com.mastek.bankapp.dao;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.SQLException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DBConnectionTest {

	// Expected to fail
	@Disabled
	@Test
	void testGetConnectionNull() {
		try {
			assertNull(DBConnection.getConnection(), "Expected null Value");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Below test must always successfull
	@Test
	void testGetConnection() {
		try {
			assertNotNull(DBConnection.getConnection(), "Expected not null Value");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
