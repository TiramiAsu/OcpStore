/*
 * KKSU.Studio &copy;
 */
package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.ADao;
import dao.jdbc.DatabaseManager;
import vo.customers.Customers;

/**
 * Project: OcpStoreProject.ndao<br>
 * Time: 2019年1月15日, 下午11:27:08<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class CustomersDaoImpl extends ADao<Customers> {
	
// Attribute
	Connection conn = null;
	PreparedStatement ps = null;

// Method
	@Override
	public void insert(Customers customer) {
		try {
			//	Connection Database
			conn = DatabaseManager.getInstance().getConnection();
			
			/* SQL
			 *  c_Code  : char(20)
			 *  c_Name  : varchar(20)
			 *  c_Phone : varchar(16)
			 *  c_Point : int(12)
			 *  c_Remark: text
			 * 
			 * Java
			 *  1.    String Code;
			 *  2.    String Name;
			 *  3.    String Phone;
			 * *4.       int Point;
			 *  5.    String Remark;
			 * *6. Customers customer = new Customers(); (static)
			 */
			String sql = "INSERT INTO Customers(c_Code,"
											 + "c_Name,"
											 + "c_Phone,"
											 + "c_Point,"
											 + "c_Remark)"
									   +"VALUES(?,?,?,?,?);";
			
			// get data from vo-Customers
			ps = conn.prepareStatement(sql);
			ps.setString(1, customer.getC_Code());
			ps.setString(2, customer.getC_Name());
			ps.setString(3, customer.getC_Phone());
			ps.setString(4, customer.getC_Point()+"");
			ps.setString(5, customer.getC_Remark());
			
			// Insert data
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.toString(), "Error: ClassNotFoundException", 1);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.toString(), "Error: SQLException", 1);
		}finally{
			
			// close port
			try {
				DatabaseManager.getInstance().close(ps);
				DatabaseManager.getInstance().close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e.toString(), "Error: SQLException", 1);
			}
		}
	}

	@Override
	public void delete(Customers customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customers customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select(Customers customer) {
		// TODO Auto-generated method stub
		
	}


}
