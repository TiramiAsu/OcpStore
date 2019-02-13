/*
 * KKSU-Studio &copy;
 */
package vo.products;
/**
 * Project: products.OCP_OrderSystem
 * Time: 下午10:21:23
 * @author: KKSU <br>
 * Email: canosu0116@gmail.com
 * @version: 1.0 v 
 * TODO
 */
public class ProductCategory {
	
	private int productCategoryID;
	private String productCategoryCode;
	private String productCategoryName;
	private String productCategoryOther;
	private String productCategoryEmplyee;	//	廠商，建議放外面
	
// constructor
	public ProductCategory() {
		// TODO Auto-generated constructor stub
	}
	
// ID
	public int getProductTypeId() {
		return productCategoryID;
	}
	public void setProductTypeId(int productTypeId) {
		this.productCategoryID = productTypeId;
	}
	
// Code
	public String getProductTypeCode() {
		return productCategoryCode;
	}
	public void setProductTypeCode(String productTypeCode) {
		this.productCategoryCode = productTypeCode;
	}
	
// Name
	public String getProductTypeName() {
		return productCategoryName;
	}
	public void setProductTypeName(String productTypeName) {
		this.productCategoryName = productTypeName;
	}
	
// Other
	public String getProductTypeOther() {
		return productCategoryOther;
	}
	public void setProductTypeOther(String productTypeOther) {
		this.productCategoryOther = productTypeOther;
	}
	
	

}
