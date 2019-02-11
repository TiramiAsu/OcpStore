/*
 * KKSU.Studio &copy;
 */
package dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Project: OcpStoreProject.jdbc<br>
 * Time: 2019.1.16, AM 12:32:09<br><br>
 * 
 *	可使用設定方法有三種：<br>
 * 		(1)	.properties<br>
 * 		(2)	直接設定於程式碼中(現在方式)<br>
 * 		(3)	XML方式<br>
 * 
 * Using JDBC
 * 	1.	設置驅動類別(設定路徑)：到 .jar 檔找到 Driver.class >> 右鍵 "Copy Qualified Name" 複製該 class 路徑
 *	2.	設置資料庫連結位置： 使用本機(localhost)、IP位置 cmd\ipconfig 查看
 * 			3306: MySQL database 固定 port 號(除非安裝資料庫時有改)
 * 			1433: MSSQL database
 *	3.	設置資料庫使用者： root是最高權限(盡量不要使用)，開發時應有其他權限帳號
 *	4.	設置資料庫使用者密碼
 *
 *
 * 
 * 
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class DatabaseManager {
	/* [reference]
	 * 	連線資訊	http://www.hosp.ncku.edu.tw/java/jdbc1.htm
	 *	接口		https://hk.saowen.com/a/8749caea938ad8233350c75f4d82c9944a8ae95e6c3b7e1b32bee0f74e60c80a
	 */
	
	// MySQL
	public final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//	public final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	public final String JDBC_URL    = "jdbc:mysql://127.0.0.1:3306/OcpStore?serverTimezone=UTC";
//	public final String JDBC_URL   = "jdbc:sqlserver://localhost:1433;databaseName=OcpStore;integratedSecurity=true;";
	
	public final String JDBC_USER   = "root";
//	public final String JDBC_USER   = "tirami";
	
	public final String JDBC_PASS   = "1234567";
//	public final String JDBC_PASS   = "1234";

	//	單例設計模式: 直接建構好
	private static DatabaseManager driver = new DatabaseManager();
	
	// constructor
	private DatabaseManager(){}
	
	//	使用 "單例設計模式" 提供資料庫連接
	public static DatabaseManager getInstance() {
		return driver;
	}
	
// Connection
	/**
	 * 取得連接資料庫
	 * @return							連接資料庫
	 * @throws ClassNotFoundException	無此驅動(失敗)
	 * @throws SQLException				sql 語法錯誤
	 */
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		//	using Connection (import java.sql.Connection;)
		Connection conn = null;
		
		//	join Driver Class
		Class.forName(JDBC_DRIVER); //	throws ClassNotFoundException 
		
		//	Connection
		conn = DriverManager.getConnection(
				JDBC_URL, JDBC_USER, JDBC_PASS); //	throws SQLException
		
		//	回傳連接後連線串流
		return conn;
	}
	
	/**
	 *	關閉資料庫連接
	 * @param conn
	 * @throws SQLException
	 */
	public void close(Connection conn) throws SQLException {
		if(conn != null) {
			conn.close();
		}
	}
	
	/**
	 *	關閉 sql 語法傳送
	 * @param st
	 * @throws SQLException
	 */
	public void close(Statement st) throws SQLException {
		if(st != null) {
			st.close();
		}
	}
	
	/**
	 *	關閉 sql 語法傳送
	 * @param ps
	 * @throws SQLException
	 */
	public void close(PreparedStatement ps) throws SQLException {
		if(ps != null) {
			ps.close();
		}
	}

	/**
	 *	關閉回傳數據
	 * @param rs
	 * @throws SQLException
	 */
	public void close(ResultSet rs) throws SQLException {
		if(rs != null) {
			rs.close();
		}
	}
}




