/*
 * KKSU.Studio &copy;
 */
package _ModelTest;

import org.junit.Test;

import vo.customers.Customers;

/**
 * Project: OcpStoreSystem._ModelTest<br>
 * Time: 2019.1.12, AM 3:01:36<br>
 * 
 * <p> This Class used to test constructor Customers of process error or not.
 * <pre>
 * Test Item:
 *  1. constructor Customers
 *  2. NullException (Code, Name, Phone)
 *  3. LengthException (Code)
 *  4. PositiveIntegerException (Point)
 * </pre>
 * 
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class TestCustomers {
	
	@Test
	public void mainTest() {
		
	
	//	create null Customers Class
		Customers cnull = Customers.create();
		testBean("create null Customers Class", cnull, false);
		
	//	create and set value
		Customers c1 = Customers.create().setCustomers(
				"12345678901345678910", "Eson", "+886-095-095-095", 55, "213");
		testBean("create and set value", c1, true);
		
		Customers c2 = Customers.create().setCustomers(
				"1", "Eson", "+886-095-095-095", 55, "213");
		System.out.println(c1.toString()+"\n");
		testBean("", c1, true);
		c1.setInitialize();
		c2.setInitialize();
		
		System.out.println("*****Due to using same static block,"
				+ "thus the new to use can reflash data.\n\n");
		
		
		
	//	error for code
		Customers cErrorCode = Customers.create()
				.setCustomers("098765432109876543211", "Eson", "+886-095-095-095", 55, "213");
		testBean("error for Code",cErrorCode,false);
		
	//	error for Name
		Customers cErrorName = Customers.create()
				.setCustomers("09876543210987654321", "", "+886-095-095-095", 55);
		testBean("error for Name",cErrorName,false);
		
	//	error for Phone
		Customers cErrorPhone = Customers.create()
				.setCustomers("09876543210987654321", "Eson", "", 55, "213");
		testBean("error for Phone",cErrorPhone,false);
		
	//	error for point
		Customers cErrorPoint = Customers.create()
				.setCustomers("09876543210987654321", "Eson", "+886-095-095-095", -1, "213");
		testBean("error for Point",cErrorPoint,false);
		
	//	Remark null
		Customers cErrorRemarknull = Customers.create()
				.setCustomers("09876543210987654321", "Eson", "+886-095-095-095", 55);
		testBean("Remark null",cErrorRemarknull,false);
		
	//	Remark not null
		Customers cErrorRemarknotnull = Customers.create()
				.setCustomers("09876543210987654321", "Eson", "+886-095-095-095", 55, "213");
		testBean("Remark not null",cErrorRemarknotnull,false);
		
	}
	
	
	public void testBean(String title,Customers customer,boolean b) {
		if(!title.equals("")) {
			System.out.println("=== "+title+" ===");
		}
		System.out.println(customer.toString()+"\n");
		if(!b) {
			customer.setInitialize();
		}
	}
	

}
