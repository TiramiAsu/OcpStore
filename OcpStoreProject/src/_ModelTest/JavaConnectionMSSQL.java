/*
 * KKSU-Studio &copy;
 */
package _ModelTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

/**
 * Project: tw.com.pcshool.troubleReadMe.BeginOrderProject
 * Time: 下午9:20:04
 * @author: KKSU <br>
 * Email: canosu0116@gmail.com
 * @version: 1.0 v 
 * TODO
 */
public class JavaConnectionMSSQL {
	/**
	 * 2018.12.17(一) JavaOcpClass-No.19
	 * Time: PM 9:20:04
	 * @author: KKSU <br>
	 * Email: canosu0116@gmail.com
	 * 
	 * 
	 * Title: Java 連接 MSSQL 問題
	 * 
	 * Trouble1. SQLException: 連接到主機 localhost (連接埠 1433) 的 TCP/IP 連接已經失敗。錯誤: "Connection refused: connect。
	 * 			確認連接屬性。確認 SQL Server 執行個體是否在主機上執行並接受在通訊埠的 TCP/IP 連接。確認防火牆未封鎖通訊埠的 TCP 連接。"。
	 * 
	 * 		[Explain] 檢查 1433 port 是否有啟用
	 * 
	 * 		[Solution] 利用 Sql Server Configuration Manager 檢查 TCP/IP
	 * 			1.	到左欄 SQL Server 網路組態\ MSSQLSERVER 的通訊協定\ 右欄 TCP/IP
	 * 			2.	IP位置\ 最下面IPAll 要有1433\ Apply
	 * 			3.	到左欄 SQL Server 網路服務\ 選SQL Server (SQLEXPRESS)\ 點上方 "重新啟動服務"
	 * 			4.	再去嘗試連線 MSSQL
	 * 
	 * 		[Reference]
	 * 			http://zhi-bin1985.blogspot.com/2014/07/sql-server-tcpip.html
	 * 			http://meguminoken.blogspot.com/2013/11/java-eclipse-sql-server.html
	 * 			http://crazyinf.blogspot.com/2012/07/java-ms-sql-server-1433.html
	 * 
	 * 
	 * Trouble2. SQLException: Login failed for user ''. ClientConnectionId:9a6c7838-5d3e-4c64-9429-2c3c753810a3
	 * 
	 * 		[Explain] 無法登入資料庫
	 * 
	 * 		[Solution] 在 database名稱後面加上 integratedSecurity=true;
	 * 		修改→ "jdbc:sqlserver://localhost:1433;databaseName=beginorderproject;integratedSecurity=true;"
	 * 
	 * 		[Reference] https://social.msdn.microsoft.com/Forums/sqlserver/en-US/20ed6868-05b9-4724-a488-f251c30dd2a2/commicrosoftsqlserverjdbcsqlserverexception-login-failed-for-user-admin-clientconnectionid?forum=sqlgetstarted
	 * 
	 * 
	 * Trouble3. SQLException: Cannot open database "beginorderproject" requested by the login. The login failed.
	 * 			ClientConnectionId:01081f74-d2b6-4d3b-b54e-f3e9fe7f4fc2
	 * 
	 * 		[explain]
	 * 
	 * 		[Solution]
	 * 
	 * 		[Reference]
	 * 
	 * 
	 * Trouble4. SQLException: Cannot open database "beginorderproject" requested by the login. The login failed.
	 * 			ClientConnectionId:01081f74-d2b6-4d3b-b54e-f3e9fe7f4fc2
	 * 
	 * 		[explain]
	 * 
	 * 		[Solution]
	 * 
	 * 		[Reference]
	 * 
	 * 
	 * 
	 */
// Attribute
	//	移到外面：在另一個方法內也能關
	Connection conn = null;
	
	@Test
	public void mainTes() {
		System.out.println("=== Test Connection MSSQL ===");
		
		try {
		// Loading MySQL Driver
			//	調用 Class.forName() 方法加載驅動程序
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			System.out.println("Load MSSQL Driver Success!!");
			
		// Connection Database
			conn = DriverManager.getConnection(
					"jdbc:sqlserver://127.0.0.1:1433;databaseName=OcpSt;"//integratedSecurity=true;"
					+ "user=tirami;password=1234;");
			System.out.println("Seccess to Connection Database!!");
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException: "+e.getMessage());

		}catch(ClassNotFoundException cfe){
//			System.out.println("ClassNotFoundException" + cfe.getMessage());
			System.out.println("找不到驅動程式");

//		}catch(IllegalAccessException iae) {
//			System.out.println("IllegalAccessException:" + iae.getMessage());
//			System.out.println("無法讀取驅動程式");
//			
//		}catch(InstantiationException ie) {
//			System.out.println("InstatiationException:" + ie.getMessage());
//			System.out.println("無法載入驅動程式");
//			
		}finally {	//	回收資源
			try {
				if(conn!=null) {
					conn.close();	//	中斷與 database 連線
				}
			}catch(Exception ep) {
				
			}
			conn=null;	//	把物件資源釋放
		}
		System.out.println("Finish!!");
	}

}
