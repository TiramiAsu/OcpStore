package vo.products;

/*
 * KKSU-Studio &copy;
 */
/**
 * Project: .OCP_OrderSystem
 * Time: 下午10:17:04
 * @author: KKSU <br>
 * Email: canosu0116@gmail.com
 * @version: 1.0 v 
 * TODO
 */
public class Products extends ProductCategory{
	
//	private int productID;
	private String productCode;
	private String productName;
	private String productUnit, productPrice;
//	private String productInArea, productOwner;
	private String productOther;
//	private ProductType type;
	
// constructor
	public Products() {
		// TODO Auto-generated constructor stub
	}

// Code
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

// Name
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

// Unit
	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

// Price
	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

// InArea
/*	public String getProductInArea() {
		return productInArea;
	}

	public void setProductInArea(String productInArea) {
		this.productInArea = productInArea;
	}

// Owner
	public String getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(String productOwner) {
		this.productOwner = productOwner;
	}*/

// Other
	public String getProductOther() {
		return productOther;
	}

	public void setProductOther(String productOther) {
		this.productOther = productOther;
	}
	
	

}
