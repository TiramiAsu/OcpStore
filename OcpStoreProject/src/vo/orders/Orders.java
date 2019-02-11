/*
 * KKSU-Studio &copy;
 */
package vo.orders;

import vo.customers.Customers;
import vo.products.Products;

/**
 * Project: orders.OCP_OrderSystem
 * Time: 下午10:36:05
 * @author: KKSU <br>
 * Email: canosu0116@gmail.com
 * @version: 1.0 v 
 * TODO
 */
public class Orders {
	
//	private int orderID;
	private String orderCode;
	private String orderTime;
//	private String orderOther;
	private String orderPrice;
	private String orderQuantity; 
	private Customers customerID;
	private Products productID;

// constructor
	public Orders() {
	}

// Code
	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

// Time
	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

// Price
	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

// Quantity
	public String getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(String orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

// CustomerID
	public Customers getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Customers customerID) {
		this.customerID = customerID;
	}

// ProductID
	public Products getProductID() {
		return productID;
	}

	public void setProductID(Products productID) {
		this.productID = productID;
	}
	
	
}
