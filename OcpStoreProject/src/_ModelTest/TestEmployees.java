/*
 * KKSU.Studio &copy;
 */
package _ModelTest;

import org.junit.Test;

import vo.employees.Employees;

/**
 * Project: OcpStoreSystem._ModelTest<br>
 * Time: 2019.1.15, AM 2:55:42<br><br>
 * 
 * <p> This Class used to test constructor Employees of process error or not.
 * <pre>
 * Test Item:
 *  1. constructor Employees
 *  2. NullException (Code, Name, Phone, Position)
 *  3. LengthException (Code)
 * </pre>
 * 
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class TestEmployees {

	@Test
	public void mainTest() {
		//	create null Employees Class
		Employees cnull = Employees.create();
		testBean("create null Employees Class", cnull, false);
		
	//	create and set value
		Employees c1 = Employees.create().setEmployees(
				"12345678901345678910", "Eson", "+886-095-095-095", "Manager", "213");
		testBean("create and set value", c1, true);
		
		Employees c2 = Employees.create().setEmployees(
				"1", "Eson", "+886-095-095-095", "Manager", "213");
		System.out.println(c1.toString()+"\n");
		testBean("", c1, true);
		c1.setInitialize();
		c2.setInitialize();
		
		System.out.println("*****Due to using same static block,"
				+ "thus the new to use can reflash data.\n\n");
		
		
		
	//	error for code
		Employees cErrorCode = Employees.create()
				.setEmployees("098765432109876543211", "Eson", "+886-095-095-095", "Manager", "213");
		testBean("error for Code",cErrorCode,false);
		
	//	error for Name
		Employees cErrorName = Employees.create()
				.setEmployees("09876543210987654321", "", "+886-095-095-095", "Manager");
		testBean("error for Name",cErrorName,false);
		
	//	error for Phone
		Employees cErrorPhone = Employees.create()
				.setEmployees("09876543210987654321", "Eson", "", "Manager", "213");
		testBean("error for Phone",cErrorPhone,false);
		
	//	error for point
		Employees cErrorPoint = Employees.create()
				.setEmployees("09876543210987654321", "Eson", "+886-095-095-095", "", "213");
		testBean("error for Point",cErrorPoint,false);
		
	//	Remark null
		Employees cErrorRemarknull = Employees.create()
				.setEmployees("09876543210987654321", "Eson", "+886-095-095-095", "Manager");
		testBean("Remark null",cErrorRemarknull,false);
		
	//	Remark not null
		Employees cErrorRemarknotnull = Employees.create()
				.setEmployees("09876543210987654321", "Eson", "+886-095-095-095", "Manager", "213");
		testBean("Remark not null",cErrorRemarknotnull,false);
		
	}

	
	public void testBean(String title,Employees Employee,boolean b) {
		if(!title.equals("")) {
			System.out.println("=== "+title+" ===");
		}
		System.out.println(Employee.toString()+"\n");
		if(!b) {
			Employee.setInitialize();
		}
	}

}
