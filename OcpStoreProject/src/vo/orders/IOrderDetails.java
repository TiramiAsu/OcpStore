/*
 * KKSU.Studio &copy;
 */
package vo.orders;

import java.io.IOException;

/**
 * Project: OCP_OrderSystem.vo.customers
 * time: 2019年1月12日, 上午12:29:08
 * @author: KKSU
 * E-mail: tiramisu0116@gmail.com
 * @version 1.0
 * TODO
 */
public interface IOrderDetails {

	/**
	 * 						MySQL type  : Limit
	 * @param e_ID			int(12)		: not null, >0
	 * @param c_ID			int(12)		: not null, >0
	 * @param p_ID          int(12)     : not null, >0
	 * @param od_Price		decimal(9,3): not null
	 * @param od_Unit		nvarchar(5)	: not null
	 * @param od_Quantity	int(12)		: not null
	 * @param od_Remark		text(255)	: -
	 */
	boolean checkE_ID(String c_Code) throws IOException;
	boolean checkC_Name(String c_Name) throws IOException;
	boolean checkC_Phone(String c_Phone) throws IOException;
	boolean checkC_Point(int c_Point) throws IOException;
	boolean checkC_Remark(String c_Remark) throws IOException;

}
