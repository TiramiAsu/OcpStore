/*
 * KKSU.Studio &copy;
 */
package dao.factory;

import dao.SelectDao;
import dao.impl.CustomersDaoImpl;
import vo.customers.Customers;

/**
 * Project: OcpStoreProject.ndao<br>
 * Time: 2019.1.16, AM 12:24:13<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class VoFactoryDao {

	//	以 static 建構，大家調用即可
	
	/**
	 * @author @author TiramiAsu (tiramisu0116@gmail.com)
	 */
	public static CustomersDaoImpl getCustomers() {
		return new CustomersDaoImpl();
	}
	
	/**
	 * @author Hannah Chen (jud40322@gapp.nthu.edu.tw)
	 */
	public static SelectDao<Customers> getCustomersSelect() {
		return new CustomersDaoImpl();
	}
	
//	public static EmployeesDaoImpl getEmployees() {
//		return new EmployeesDaoImpl();
//	}
//	
//	public static ProductsDaoImpl getProducts() {
//		return new ProductsDaoImpl();
//	}
//	
//	public static OrdersDaoImpl getOrders() {
//		return new OrdersDaoImpl();
//	}
}
