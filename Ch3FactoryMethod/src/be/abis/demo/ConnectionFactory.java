package be.abis.demo;

import java.sql.Connection;
import java.sql.SQLException;


public abstract class ConnectionFactory {

	public static ConnectionFactory createFactory(ConnectionType ct) {
		switch (ct) {
		  default :
		  case BASIC:
			return BasicConnectionFactory.getInstance();
		  case DATASOURCE:
			return DataSourceConnectionFactory.getInstance();
		 
		}

	}

	public abstract Connection createConnection() throws SQLException;
	
	public void closeConnection(Connection connection) throws SQLException{
		if (connection!=null)connection.close();
	}
}
