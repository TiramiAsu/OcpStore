/*
 * KKSU.Studio &copy;
 */
package dao.tableENUM;
/**
 * Project: OcpStoreProject.dao.tableENUM<br>
 * Time: 2019年1月21日, 上午1:04:03<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public enum OrderDetailsEnum {
	
	EmployeesID("e_id",1),
	CustomersID("c_id",2),
	OrderDetailsPrice("od_price",3),
	OrderDetailsUnit("od_unit",4),
	OrderDetailsQuantity("od_quantity",5),
	OrderDetailsRemark("od_remark",6);

	private String column;
	private int index;
	
	private OrderDetailsEnum(String column, int index) {
		this.column = column;
		this.index = index;
	}
	
	public String getEnum(int index) {
		for(OrderDetailsEnum ode:OrderDetailsEnum.values()) {
			if(ode.getIndex() == index) {
				return ode.column;
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



