/*
 * KKSU.Studio &copy;
 */
package dao.tableENUM;
/**
 * Project: OcpStoreProject.dao.tableENUM<br>
 * Time: 2019年1月21日, 上午12:03:32<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public enum CustomersEnum {
	
	CustomersCode("c_code",1),
	CustomersName("c_name",2),
	CustomersPhone("c_phone",3),
	CustomersPoint("c_point",4),
	CustomersRemark("c_remark",5);
	
	private String column;
	private int index;
	
	private CustomersEnum(String column,int index) {
		this.column = column;
		this.index = index;
	}
	
	public String getEnum(int index) {
		for(CustomersEnum ce:CustomersEnum.values()) {
			if(ce.getIndex() == index) {
				return ce.column;
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
