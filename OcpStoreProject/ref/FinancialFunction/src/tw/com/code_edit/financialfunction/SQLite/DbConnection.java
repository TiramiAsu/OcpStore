/**
*專案名稱 : FinancialFunction 
*	套件名稱 : tw.com.code_edit.financialfunction.SQLite
*	建立時間 : 2018年8月21日 下午11:09:48
*	<h6>@author  : Wayne		E-mail : a0922015135@gmail.com</h6>
*	<h6>@version : 1.0</h6>
*	TODO : 
*/
package tw.com.code_edit.financialfunction.SQLite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteDataSource;

public class DbConnection {
	private static Statement st = null;
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;

	private DbConnection() {

	}

	public static synchronized Connection getConnection() throws SQLException {
		SQLiteConfig config = new SQLiteConfig();
		config.setSharedCache(true);
		config.enableRecursiveTriggers(true);

		SQLiteDataSource ds = new SQLiteDataSource(config);
		ds.setUrl("jdbc:sqlite:sample.db");
		return ds.getConnection();
	}

	public static void createTable(Connection con) throws SQLException {
		// String sql = "drop table if exists functions;create table
		// functions(functionname String,variable1 integer,variable2 integer,variable3
		// integer,variable4 integer,variable5 integer);";
		String sql = "create table if not exists functions(id integer not null primary key autoincrement,functionname next not null,variable01 next,variable02 next,variable03 next,variable04 next,variable05 next,variable06 next);";
		st = con.createStatement();
		st.execute(sql);
	}

	public static void addFunctions(Connection con, String functionname, String variable01, String variable02,
			String variable03, String variable04, String variable05, String variable06) throws SQLException {
		// String sql = "insert into functions values(1,2,3,4,5,6);"; 另一種注入資料的寫法
		String sql = "insert into functions(functionname,variable01,variable02,variable03,variable04,variable05,variable06)values('"
				+ functionname + "','" + variable01 + "','" + variable02 + "','" + variable03 + "','" + variable04
				+ "','" + variable05 + "','" + variable06 + "');";
		st = con.createStatement();
		st.executeUpdate(sql);
	}

	public static void createOperatorTable(Connection con) throws SQLException {
		String sql = "create table if not exists operators(id integer not null primary key autoincrement,functionname next not null,operator01 varchar(50),operator02 varchar(50),operator03 varchar(50),operator04 varchar(50),operator05 varchar(50));";
		st = con.createStatement();
		st.execute(sql);
	}

	public static void addOperators(Connection con, String operator01, String operator02, String operator03,
			String operator04, Object operator05, String functionname) throws SQLException {
		String sql = "insert into operators(operator01,operator02,operator03,operator04,operator05,functionname)values(?,?,?,?,?,?);";
		pst = con.prepareStatement(sql);
		pst.setString(1, "   " + operator01);
		pst.setString(2, "   " + operator02);
		pst.setString(3, "   " + operator03);
		pst.setString(4, "   " + operator04);
		pst.setObject(5, "   " + operator05);
		pst.setString(6, functionname);
		pst.executeUpdate();
	}

	public static ResultSet getRsList(Connection con) throws SQLException {
		String sql = "select f.functionname as 公式名稱,f.variable01 as 變數一,o.operator01 as 運算元,f.variable02 as 變數二,o.operator02 as 運算元,f.variable03 as 變數三,o.operator03 as 運算元,f.variable04 as 變數四,o.operator04 as 運算元,f.variable05 as 變數五,o.operator05 as 運算元,f.variable06 as 變數六 from functions as f,operators as o where f.id=o.id;";
		st = con.createStatement();
		rs = st.executeQuery(sql);
		return rs;
	}

	public static ResultSet selectComboBox(Connection con) throws SQLException {
		String sql = "select id,functionname from functions;";
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		return rs;
	}

	public static ResultSet actionComboBox(Connection con, String id) throws SQLException {
		String sql = "select * from (select * from functions,operators where functions.id=operators.id) where id=" + id
				+ ";";
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		return rs;
	}

	public static ResultSet addActionComboBox(Connection con, String functionname) throws SQLException {
		String sql = "select * from (select * from functions,operators where functions.id=operators.id) where functionname='"
				+ functionname + "'  ;";
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		return rs;
	}

	public static void deleteComboBox(Connection con, String id) throws SQLException {
		String sql = "delete  from functions where id=" + id + " ;";
		String ssql = "delete  from operators where id=" + id + ";";
		pst = con.prepareStatement(sql);
		pst.execute();
		pst = con.prepareStatement(ssql);
		pst.execute();
	}

	public static void displayErrorMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	public static void close(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}