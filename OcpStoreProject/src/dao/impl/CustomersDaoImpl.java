/*
 * KKSU.Studio &copy;
 */
package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dao.ADao;
import dao.SelectDao;
import dao.factory.VoFactoryDao;
import dao.jdbc.DatabaseManager;
import vo.customers.Customers;

/**
 * Project: OcpStoreProject.ndao<br>
 * Time: 2019.1.15, PM 11:27:08<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br>
 * @author Hannah Chen (jud40322@gapp.nthu.edu.tw)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class CustomersDaoImpl extends ADao<Customers> 
                              implements SelectDao<Customers>{
	
// Attribute
	Connection conn = null;
	PreparedStatement ps = null;
	Statement st = null;
	ResultSet rs = null;
	
	/**
	 * @author Hannah Chen (jud40322@gapp.nthu.edu.tw)
	 */
	List<Customers> customerList = null;

// Method
	/**
	 * @author TiramiAsu (tiramisu0116@gmail.com)
	 */
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

	/**
	 * @author 
	 */
	@Override
	public void delete(Customers customer) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @author 
	 */
	@Override
	public void update(Customers customer) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @author Hannah Chen (jud40322@gapp.nthu.edu.tw)
	 */
	@Override
	public void select(Customers customer) {
		try {
			conn = DatabaseManager.getInstance().getConnection();
			String sql = "insert into [dbo].[Customers] (c_code, c_name, c_phone, c_point, c_note)\r\n" +  
					     " values (?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, customer.getC_Code());
			ps.setString(2, customer.getC_Name());
			ps.setString(3, customer.getC_Phone());
			ps.setInt(4, customer.getC_Point());
			ps.setString(5, customer.getC_Remark());
			ps.executeUpdate();
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

// Implement SelectDao.java
	/**
	 * @author Hannah Chen (jud40322@gapp.nthu.edu.tw)
	 */
	@Override
	public Customers findByCode(String code) {
		SelectDao<Customers> cdao = VoFactoryDao.getCustomersSelect();
		String sql = "where [c_code] = '" + code + "'";
		List<Customers> customers = cdao.getData(sql);
		Customers customer = customers.get(0);
		return customer;
	}

	/**
	 * @author Hannah Chen (jud40322@gapp.nthu.edu.tw)
	 */
	@Override
	public List<Customers> findByName(String name) {
		SelectDao<Customers> cdao = VoFactoryDao.getCustomersSelect();
		String sql = " where[c_name] = '" + name + "'";
		List<Customers> customers = cdao.getData(sql);
		return customers;
	}

	/**
	 * @author Hannah Chen (jud40322@gapp.nthu.edu.tw)
	 */
	@Override
	public List<Customers> findByPhone(String phone) {
		SelectDao<Customers> cdao = VoFactoryDao.getCustomersSelect();
		String sql = "where [c_phone] = '" + phone + "'";
		List<Customers> customers = cdao.getData(sql);
		return customers;
	}

	/**
	 * @author Hannah Chen (jud40322@gapp.nthu.edu.tw)
	 */
	@Override
	public List<Customers> getData(String column) {
		try {
			conn = DatabaseManager.getInstance().getConnection();
			st = conn.createStatement();
			String sql ="select * from [dbo].[Customers]";
			rs = st.executeQuery(sql+column);
			customerList = new ArrayList<>();
			while(rs.next()) {
				Customers customers = new Customers(rs.getString(3), rs.getString(2), rs.getString(4), rs.getInt(5), rs.getString(6));
		
				/*
				 *  Customers.getCustomer().setCode(rs.getString(3));
					Customers.getCustomer().setCustomersName(rs.getString(2));
					Customers.getCustomer().setPhone(rs.getString(4));
					Customers.getCustomer().setPoint(rs.getInt(5));
					Customers.getCustomer().setNote(rs.getString(6));
				
				 *  customerList.add(Customers.getCustomer());
				 */
				

				customerList.add(customers);
//				System.out.println("name:"+rs.getString(2)+
//						";code:"+rs.getString(3)+
//						";phone:"+rs.getString(4)+
//						";point:"+rs.getInt(5)+
//						";note:"+rs.getString(6)
//						);
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(st!=null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return customerList;
	}


}
