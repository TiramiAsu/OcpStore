/*
 * KKSU.Studio &copy;
 */
package _ModelTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Project: OcpStoreProject._ModelTest<br>
 * Time: 2019年1月19日, 下午11:09:21<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class mssqlConnectionTest {

	public static void main(String[] args) {
		
		String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String JDBC_USER = "abcd";
		String JDBC_PASSWORD = "1234";
        String JDBC_URL = "jdbc:sqlserver://localhost:1433;databaseName=mssqltest;"
        		+ "user="+JDBC_USER+";password="+JDBC_PASSWORD;

		/*
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 10 * FROM Person.Contact";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
        */
        
		Connection conn = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			// 進行連接
			conn=DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
			System.out.println("Connection success.");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}finally {	//	回收資源
			try {
				if(conn!=null) {
					conn.close();	//	中斷與 database 連線
				}
			}catch(Exception ep) {
				ep.printStackTrace();
			}
			conn=null;	//	把物件資源釋放
		}
		

	}

}
