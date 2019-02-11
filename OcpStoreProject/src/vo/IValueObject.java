/*
 * KKSU.Studio &copy;
 */
package vo;

import java.io.IOException;

/**
 * Project: OcpStoreSystem.vo<br>
 * Time: 2019.1.12, AM 12:33:15<br><br>
 * 
 * {@link vo.IValueObject ValueObject}<br>
 *  - Create it of Project from Database
 * <p><b>About Database:</b><br>
 * &nbsp;Using MySQL by workbench.<br>
 * 
 * <pre>
 * <b>The Database of Tables, Columns and attribute by SQL:</b>
 * <b>1. {@link vo.customers.Customers Customers}</b>
 *  c_ID int(12) not null primary key auto_increment,
 *  c_Code char(20) not null,        # 單純英文數字
 *  c_Name nvarchar(20) not null,    # 可能有其他語系名字
 *  c_Phone nvarchar(16) not null,   # +886-977-989-898，可能沒打符號會<16
 *  c_Point int(12) not null,        # 點數: 單純數字
 *  c_Remark text(255)

 * <b>2. {@link vo.employees.Employees Employees}</b>
 *  e_ID int(12) not null primary key auto_increment,
 *  e_Code char(20) not null,        # 單純英文數字
 *  e_Name nvarchar(20) not null,    # 可能有其他語系名字
 *  e_Phone nvarchar(12) not null,   # +886-977-989-898，可能沒打符號會<16
 *  e_Position varchar(20) not null, # 職務: 單純英文
 *  e_Remark text(255)

 * <b>3. {@link vo.products.Products Products}</b>
 *  p_ID int(12) not null primary key auto_increment,
 *  p_Code char(20) not null,        # 單純英文數字
 *  p_Name nvarchar(20) not null,    # 可能有其他語系名字
 *  p_Price decimal(9,3) not null,
 *  p_Cost decimal(9,3) not null,
 *  p_Unit nvarchar(5) not null,
 *  p_Status nchar(5) not null,      # 狀態: 停售/販售中
 *  p_Remark text(255)

 * <b>4. {@link vo.orders.Orders Orders}</b>
 *  o_ID int(12) not null primary key auto_increment,
 *  e_ID int(12) not null,
 *  c_ID int(12) not null,
 *  o_Date date not null,
 *  o_Time time not null,
 *  o_Remark text(255)

 * <b>5. {@link vo.orders.OrderDetailsEnum OrderDetails}</b>	# 未設 Primary Key
 *  e_ID int(12) not null,
 *  c_ID int(12) not null,
 *  od_Price decimal(9,3) not null,
 *  od_Unit nvarchar(5) not null,
 *  od_Quantity int(12) not null,
 *  od_Remark text(255)

 * <b>6. {@link vo.employees.TimeCard TimeCard}</b>	# 未設 Primary Key
 *  e_ID int(12) not null,
 *  tc_Date date not null,
 *  tc_GoTime time not null,
 *  tc_OffTime time not null,
 *  tc_Remark text(255)
 * </pre>
 * 
 * @see (Interface)&nbsp;{@link vo.JavaOcpStoreProject JavaOcpStoreProject}<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public interface IValueObject extends JavaOcpStoreProject{
	
	/**
	 * @param remark	<br>text(255)
	 * 					<br> - allow null
	 * @return boolean (Check remark follow the standard)
	 * @throws IOException
	 */
	boolean isRemark(String remark) throws IOException;
	
}



