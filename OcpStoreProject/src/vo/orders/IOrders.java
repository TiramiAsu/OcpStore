/*
 * KKSU.Studio &copy;
 */
package vo.orders;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Project: OCP_OrderSystem.vo.customers
 * time: 2019年1月12日, 上午12:15:37
 * @author: KKSU
 * E-mail: tiramisu0116@gmail.com
 * @version 1.0
 * TODO
 */
public interface IOrders {
	
	/**
	 * 				 MySQL type  : Limit
	 * @param e_ID		int(12)	 : not null, >0
	 * @param c_ID		int(12)	 : not null, >0
	 * @param o_Date	date	 : not null
	 * @param o_Time	time	 : not null
	 * @param o_Remark	text(255): -
	 */
	boolean checkE_ID(String e_ID) throws IOException;
	boolean checkC_ID(String c_ID) throws IOException;
	boolean checkO_Date(LocalDate o_Date) throws IOException;
	boolean checkO_Time(LocalTime o_Time) throws IOException;
	boolean checkO_Remark(String o_Remark) throws IOException;

}
