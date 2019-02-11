/*
 * KKSU-Studio &copy;
 */
package _ModelTest;
/**
 * Project: OcpStoreProject<br>
 * Time: 2018.12.19,PM 11:49:47<br><br>
 * 
 *	設置驅動類別(設定路徑)：到 .jar 檔找到 Driver.class >> 右鍵 "Copy Qualified Name" 複製該 class 路徑
 * public final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";						// MySQL
 * public final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";	// MSSQL
 * 
 *	設置資料庫連結位置： 使用本機(localhost)、IP位置 cmd\ipconfig
 * public final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/myproject?serverTimezone=UTC";	// MySQL
 * public final String JDBC_URL = "jdbc:sqlserver://localhost:1433?database=beginorderproject";	// MSSQL
 * <pre>
 * 3306: MySQL database 固定 port 號(除非安裝資料庫時有改)
 * 1433: MSSQL database
 * </pre>
 * 
 *	設置資料庫使用者： root是最高權限(盡量不要使用)，開發時應有其他權限帳號
 * public final String JDBC_USER="root";	// MySQL
 * public final String JDBC_USER="tirami";	// MSSQL
 * 
 *	設置資料庫使用者密碼
 * public final String JDBC_PASS="JavaOcpShow0116";	// MySQL
 * // MSSQL ??
 * 
 * @author: KKSU <br>
 * Email: canosu0116@gmail.com
 * @version: 1.0 v 
 * TODO
 * [Build Database info by sql]
 */
public class DatabasePortMyTest {

	public final String JDBC_DRIVER;
	public final String JDBC_URL;
	public final String JDBC_USER;
	public final String JDBC_PASS;

	public DatabasePortMyTest(String jDBC_DRIVER,
			String jDBC_URL, String jDBC_USER, String jDBC_PASS) {
		JDBC_DRIVER = jDBC_DRIVER;
		JDBC_URL = jDBC_URL;
		JDBC_USER = jDBC_USER;
		JDBC_PASS = jDBC_PASS;
	}
	
	public DatabasePortMyTest(String jDBC_DRIVER, String jDBC_URL) {
		JDBC_DRIVER = jDBC_DRIVER;
		JDBC_URL = jDBC_URL;
		JDBC_USER = null;
		JDBC_PASS = null;
	}

	public String getJDBC_DRIVER() {
		return JDBC_DRIVER;
	}

	public String getJDBC_URL() {
		return JDBC_URL;
	}

	public String getJDBC_USER() {
		return JDBC_USER;
	}

	public String getJDBC_PASS() {
		return JDBC_PASS;
	}
	
	

}
