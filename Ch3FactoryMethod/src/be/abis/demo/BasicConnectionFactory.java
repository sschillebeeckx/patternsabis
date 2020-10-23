package be.abis.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BasicConnectionFactory extends ConnectionFactory{
	
	private static String userId="tu00040";
	private static String passwd="tu00040";
	private static String url="jdbc:oracle:thin:@delphi:1521/tst12"; 

	private static BasicConnectionFactory instance;
	
	private BasicConnectionFactory(){
    	
    }
    
    public static BasicConnectionFactory getInstance(){
		if (instance==null){
			instance=new BasicConnectionFactory();
		}
		return instance;
	}
	
    public static String getUserId() {
		return userId;
	}

	public static void setUserId(String userId) {
		BasicConnectionFactory.userId = userId;
	}

	public static String getPasswd() {
		return passwd;
	}

	public static void setPasswd(String passwd) {
		BasicConnectionFactory.passwd = passwd;
	}

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		BasicConnectionFactory.url = url;
	}


    
	@Override
	public Connection createConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, userId, passwd);
		System.out.println("connection via DriverManager");
		return conn;
	}

	

}
