/*
 * KKSU.Studio &copy;
 */
package dao.tableENUM;
/**
 * Project: OcpStoreProject.dao.tableENUM<br>
 * Time: 2019年1月21日, 上午12:17:09<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public enum EmployeesEnum {
	
	EmployeesCode("e_code",1),
	EmployeesName("e_name",2),
	EmployeesPhone("e_phone",3),
	EmployeesPosition("e_position",4),
	EmployeesRemark("e_remark",5);

	private String column;
	private int index;
	
	private EmployeesEnum(String column, int i) {
		this.column = column;
		this.index = i;
	}
	
	public String getEnum(int index) {
		for(EmployeesEnum ee:EmployeesEnum.values()) {
			if(ee.getIndex() == index) {
				return ee.column;
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
