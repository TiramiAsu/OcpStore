/*
 * KKSU.Studio &copy;
 */
package dao.tableENUM;
/**
 * Project: OcpStoreProject.dao.tableENUM<br>
 * Time: 2019年1月21日, 上午12:52:54<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public enum OrdersEnum {

	OrdersID("o_id",1),
	EmployeesID("e_id",2),
	CustomersID("c_id",3),
	OrdersDate("o_date",4),
	OrdersTime("o_time",5),
	OrdersRemark("o_remark",6);
	
	private String column;
	private int index;
	
	private OrdersEnum(String column, int index) {
		this.column = column;
		this.index = index;
	}
	
	public String getEnum(int index) {
		for(OrdersEnum oe:OrdersEnum.values()) {
			if(oe.getIndex() == index) {
				return oe.column;
			}
		}
		return null;
	}

	public String getColumn() {
		return column;
	}

	public int getIndex() {
		return index;
	}
	
	
}
