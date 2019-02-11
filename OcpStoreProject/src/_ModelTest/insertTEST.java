/*
 * KKSU.Studio &copy;
 */
package _ModelTest;
/**
 * Project: OcpStoreProject._ModelTest<br>
 * Time: 2019年1月20日, 下午3:31:45<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */

import org.junit.Test;

import dao.factory.VoFactoryDao;
import dao.impl.CustomersDaoImpl;
import vo.customers.Customers;

public class insertTEST {
	String code = "E852";
	String name = "Soda";
	String phone = "0950-505-505";
	int point = 55;
	String remark = "mummy";
	
	@Test
	public void mainTest() {
//		getInsertTest();
		
		
		
	}
	
	/**
	 * insert
	 */
	@Test
	public void getInsertTest() {
		Customers customer = Customers.create().setCustomers(code, name, phone, point, remark);
		CustomersDaoImpl cust = VoFactoryDao.getCustomers();
		cust.insert(customer);
	}
}
