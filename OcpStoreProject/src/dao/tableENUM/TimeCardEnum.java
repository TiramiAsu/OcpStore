/*
 * KKSU.Studio &copy;
 */
package dao.tableENUM;
/**
 * Project: OcpStoreProject.dao.tableENUM<br>
 * Time: 2019年1月21日, 上午1:07:32<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public enum TimeCardEnum {
	
	EmployeesID("e_id",1),
	TimeCardDate("tc_date",2),
	TimeCardGoTime("tc_gotime",3),
	TimeCardOffTime("tc_offtime",4),
	TimeCardRemark("tc_remark",5);

	private String column;
	private int index;
	
	private TimeCardEnum(String column, int index) {
		this.column = column;
		this.index = index;
	}
	
	public String getEnum(int index) {
		for(TimeCardEnum tce:TimeCardEnum.values()) {
			if(tce.getIndex() == index) {
				return tce.column;
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



