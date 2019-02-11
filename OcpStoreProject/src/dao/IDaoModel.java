/*
 * KKSU.Studio &copy;
 */
package dao;


/**
 * Project: OcpStoreProject.dao<br>
 * Time: 2019.1.15, PM 10:02:37<br><br>
 * 
 * [DAO Model]
 *  Data Access Object (資料存取物件)
 *  
 *  1. Database Connection: class
 *  2. DAO: interface
 *  3. Impl: class implement DAO
 *  4. Porxy: class
 *  5. Factory: class
 * 
 * @author TiramiAsu (tiramisu0116@gmail.com)
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public interface IDaoModel {
	/*
	 *	建立 VO(Value Object)：
	 *		主要由屬性、setter、getter方法組成，就是一個 Java beans 的結構 (屬性設定通常是對應資料庫的欄位)
	 *
	 * DAO 架構(資料存取物件)：
	 *	屬於數據層，主要提供多個資料存取的操作：新增、刪除、修改、查詢等
	 *
	 *	1.	DatabaseConnection：主要負責連接資料庫和關閉接口方法
	 *
	 *	2.	DAO(Data Access Object)：
	 *			主要將多個資料存取操作方法定義成抽象方法，提供多種實作(含新增、刪除、修改、不同欄位的查詢等功能)
	 *
	 *	3.	Impl-實作類：具體完成對資料庫的操作，但是不負責數據庫的打開和關閉	
	 *
	 *	4.	Proxy-代理實作類：主要完成資料庫的打開和關閉，並且調用 Impl 來操作存取資料
	 *
	 *	5.	Factory-工廠類：建立並實作 DAO 接口
	 *
	 *
	 * package 命名：
	 *	xxx.vo.Xxx					>VO - Class name 盡量與 Database 的 table name 一致
	 *
	 *	xxx.dbc.DatabaseConnection	>DB Connection
	 *
	 *	xxx.dao.IXxxDAO				>DAO - DAO接口定義
	 *	xxx.dao.impl.XxxDAOImpl		>Impl - DAO接口真實實作類
	 *	xxx.dao.proxy.XxxDAOProxy	>Proxy - DAO接口代理實作類
	 *
	 *	xxx.factory.DAOFactory		>Factory
	 *
	 *	[Reference]
	 *	https://www.itread01.com/content/1509285374.html
	 *
	 */
		
}
