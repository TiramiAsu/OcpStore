/*
 * KKSU.Studio &copy;
 */
package dao.tableENUM;
/**
 * Project: OcpStoreProject.dao.tableENUM<br>
 * Time: 2019年1月21日, 上午12:59:04<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */

import vo.products.Products;

public enum ProductsEnum {

	ProductsCode("p_code",1),
	ProductsName("p_name",2),
	ProductsPrice("p_price",3),
	ProductsCost("p_cost",4),
	ProductsUnit("p_unit",5),
	ProductsStatus("p_status",6),
	ProductsRemark("p_remark",7);
	
	private String column;
	private int index;
	
	private ProductsEnum(String column, int index) {
		this.column = column;
		this.index = index;
	}
	
	public String getEnum(int index) {
		for(ProductsEnum pe:ProductsEnum.values()) {
			if(pe.getIndex() == index) {
				return pe.column;
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


