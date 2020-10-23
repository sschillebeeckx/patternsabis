package be.abis.demo;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnectionFactory {

	public static void main(String[] args) {

		ConnectionFactory cf = ConnectionFactory.createFactory(ConnectionType.BASIC);

		try {
			Connection conn = cf.createConnection();
			System.out.println("connection succeeded");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
