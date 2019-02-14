/*
 * KKSU-Studio &copy;
 */
package vo.products;

import java.math.BigDecimal;
import java.sql.SQLException;

import ocpstoreException.LengthException;
import ocpstoreException.NullException;
import vo.IValueObject;

/**
 * Project: OcpStoreProject.vo.orders<br>
 * Time: PM10:17:04<br><br>
 * 
 * {@link Products}
 * 
 * <p><b>About Class:</b><br>
 * &emsp;Increase about Products attributes. And must Check too.
 * 
 * <p><b>About Attribute(private):</b>
 * <pre>
 *  1.     String p_Code;
 *  2.     String p_Name;
 *  3. BigDecimal p_Price;
 *  4. BigDecimal p_Cost;
 *  5.     String p_Unit;
 *  6.     String p_Status;
 *  7.     String p_Remark;
 * </pre>
 * 
 * <p><b>About Constructor(public):</b><br>
 * <pre>
 *  1. Products(String p_Code, String p_Name,
 *            BigDecimal p_Price, BigDecimal p_Cost,
 *            String p_Unit, String p_Status, String remark);
 *  1. Products(String p_Code, String p_Name,
 *            BigDecimal p_Price, BigDecimal p_Cost,
 *            String p_Unit, String p_Status);
 * </pre>
 * 
 * <p><b>About Method(public):</b>
 * <pre>
 *  1.  boolean isCode(String p_code);
 *  2.  boolean isName(String p_name);
 *  3.  boolean isPrice(BigDecimal p_price);
 *  4.  boolean isCost(BigDecimal p_cost);
 *  5.  boolean isUnit(String p_unit);
 *  6.  boolean isStatus(String p_status);
 *  7.   String isRemark(String remark); (@Override)
 *  8. Products setInitialize(); (@Override)
 *  9.   String toString(); (@Override)
 * 10-23. set and get methods (exclude attribute of <i>Products</i>)
 * </pre>
 * 
 * @see (Interface)&nbsp;{@link vo.IValueObject IValueObject}
 * @see (Interface)&nbsp;{@link vo.JavaOcpStoreProject JavaOcpStoreProject}<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class Products extends ProductCategory implements IValueObject<Products>{
	
	private String p_Code;
	private String p_Name;
	private BigDecimal p_Price;
	private BigDecimal p_Cost;
	private String p_Unit;
	private String p_Status;
	private String p_Remark;
	
// constructor
	/**
     * Null Constructor of Customers.
     */
	private Products() {
	}
	
	/**
     * Normal Constructor of Customers.
     */
    public Products(String code, String name, BigDecimal price, BigDecimal cost,
    		String unit, String status, String remark) {
    	if(isCode(code)) {
    		this.p_Code = code;
    	}
    	
    	if(isName(name)) {
    		this.p_Name = name;
    	}
    	
    	if(isPrice(price)) {
    		this.p_Price = price;
    	}
    	
    	if(isCost(cost)) {
    		this.p_Cost = cost;
    	}
    	
    	if(isUnit(unit)) {
    		this.p_Unit = unit;
    	}
    	
    	if(isStatus(status)) {
    		this.p_Status = status;
    	}
    	
    	if(isRemark(remark)) {
    		this.p_Remark = remark;
    	}
    }
    
    /**
     * Normal Constructor of Customers(No remark).
     */
    public Products(String code, String name, BigDecimal price, BigDecimal cost,
    		String unit, String status) {
    	if(isCode(code)) {
    		this.p_Code = code;
    	}
    	
    	if(isName(name)) {
    		this.p_Name = name;
    	}
    	
    	if(isPrice(price)) {
    		this.p_Price = price;
    	}
    	
    	if(isCost(cost)) {
    		this.p_Cost = cost;
    	}
    	
    	if(isUnit(unit)) {
    		this.p_Unit = unit;
    	}
    	
    	if(isStatus(status)) {
    		this.p_Status = status;
    	}
    	
    	this.p_Remark = null;
    }
    
// Method
	/**
	 * <b>Check Code:</b><br>
	 * &nbsp;1. not null<br>
	 * &nbsp;2. length must less than or equal to 20.<br>
	 * 
	 * @param code <br><br>
	 * @return b (default: false)
	 */
	public boolean isCode(String code) {
		boolean b = false;
		
		try {
			if(code.equals("")) {
				throw new NullException("\"Code\" must be Not Null");
			}else if(code.length()>20){
				throw new LengthException("\"Code\" length must less than or equal to 20");
			}else {
				b = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	/**
	 * <b>Check Name:</b><br>
	 * &nbsp;not null<br>
	 * 
	 * @param name <br><br>
	 * @return b (default: false)
	 */
	public boolean isName(String name) {
		boolean b = false;
		
		try {
			if(name.equals("")) {
				throw new NullException("\"Name\" must be Not Null");
			}else {
				b = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	/**
	 * <b>Check price:</b><br>
	 * &nbsp;not null<br>
	 * 
	 * @param price <br><br>
	 * @return b (default: false)
	 */
	public boolean isPrice(BigDecimal price) {
		boolean b = false;
		
		try {
			if(price.equals(null)) {
				throw new NullException("\"p_Price\" must be Not Null");
			}else {
				b = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	/**
	 * <b>Check cost:</b><br>
	 * &nbsp;not null<br>
	 * 
	 * @param cost <br><br>
	 * @return b (default: false)
	 */
	public boolean isCost(BigDecimal cost) {
		boolean b = false;
		
		try {
			if(cost.equals(null)) {
				throw new NullException("\"p_Cost\" must be Not Null");
			}else {
				b = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	/**
	 * <b>Check unit:</b><br>
	 * &nbsp;not null<br>
	 * 
	 * @param unit <br><br>
	 * @return b (default: false)
	 */
	public boolean isUnit(String unit) {
		boolean b = false;
		
		try {
			if(unit.equals(null)) {
				throw new NullException("\"p_Uint\" must be Not Null");
			}else {
				b = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	/**
	 * <b>Check status:</b><br>
	 * &nbsp;not null<br>
	 * 
	 * @param status <br><br>
	 * @return b (default: false)
	 */
	public boolean isStatus(String status) {
		boolean b = false;
		
		try {
			if(status.equals(null)) {
				throw new NullException("\"p_Status\" must be Not Null");
			}else {
				b = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
    
    /**
	 * <b>Check Remark:</b><br>
	 * &nbsp;Allow null<br>
	 * 
	 * @param remark <br><br>
	 * @return b (default: false)
	 */
	@Override
	public boolean isRemark(String remark) {
		boolean b = false;
		
		/* can be null, doesn't check.
		 *	true: not null String
		 *	false: is null String
		 */
		if(!(remark.equals(""))) {
			b = true;
		}
		return b;
	}

	/**
	 * Initialize Products Class attributes.
	 * 
	 * @return this (return this Products Class)
	 */
	@Override
	public Products setInitialize() {
		this.p_Code = null;
		this.p_Name = null;
		this.p_Price = null;
		this.p_Cost = null;
		this.p_Unit = null;
		this.p_Remark = null;
		return this;
	}
	
	/**
	 * Show the Products Class information.
	 */
	@Override
	public String toString() {
		return String.format("Products\n"
				+ "[p_Code      = %s, \n"
				+ " p_Name      = %s, \n"
				+ " p_Price     = %s, \n"
				+ " p_Cost      = %s, \n"
				+ " p_Unit      = %s, \n"
				+ " p_Status    = %s, \n"
				+ " p_Remark    = %s]",
				p_Code, p_Name,
				p_Price.toString(), p_Cost.toString(),
				p_Unit, p_Status,
				p_Remark);
	}
	
// Set and Get of Method
	public String getP_Code() {
		return p_Code;
	}

	public void setP_Code(String p_Code) {
		this.p_Code = p_Code;
	}

	public String getP_Name() {
		return p_Name;
	}

	public void setP_Name(String p_Name) {
		this.p_Name = p_Name;
	}

	public BigDecimal getP_Price() {
		return p_Price;
	}

	public void setP_Price(BigDecimal p_Price) {
		this.p_Price = p_Price;
	}

	public BigDecimal getP_Cost() {
		return p_Cost;
	}

	public void setP_Cost(BigDecimal p_Cost) {
		this.p_Cost = p_Cost;
	}

	public String getP_Unit() {
		return p_Unit;
	}

	public void setP_Unit(String p_Unit) {
		this.p_Unit = p_Unit;
	}

	public String getP_Status() {
		return p_Status;
	}

	public void setP_Status(String p_Status) {
		this.p_Status = p_Status;
	}

	public String getP_Remark() {
		return p_Remark;
	}

	public void setP_Remark(String p_Remark) {
		this.p_Remark = p_Remark;
	}

	


}
