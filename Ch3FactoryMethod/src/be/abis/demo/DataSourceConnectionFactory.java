package be.abis.demo;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DataSourceConnectionFactory extends ConnectionFactory {
	
	//LEUVEN
    private static String datasourceName="jdbc/oraDB";
	private static DataSourceConnectionFactory instance;

	private DataSourceConnectionFactory() {}

	public static DataSourceConnectionFactory getInstance() {
		if (instance == null) {
			instance = new DataSourceConnectionFactory();
		}
		return instance;
	}
	

	public static String getDatasourceName() {
		return datasourceName;
	}

	public static void setDatasourceName(String datasourceName) {
		DataSourceConnectionFactory.datasourceName = datasourceName;
	}

	@Override
	public Connection createConnection() throws SQLException {
		Connection conn = null;
		Context ctx;
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup(datasourceName);
			conn = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		}
        System.out.println("connection via data source");
		return conn;
	}

}
