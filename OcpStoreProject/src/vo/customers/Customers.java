/*
 * KKSU-Studio &copy;
 */
package vo.customers;

import java.sql.SQLException;

import ocpstoreException.PositiveIntegerException;
import vo.APerson;

/**
 * Project: OcpStoreSystem.vo.customers<br>
 * Time: 2019.1.11, PM 10:33:29<br><br>
 * 
 * {@link Customers}
 * <p><b>About Class:</b><br>
 * &emsp;Increase about Customers other attributes. And the new 
 * attribute(mark * ) must Check too.
 * 
 * <p><b>About Attribute(private):</b>
 * <pre>
 *  1.    String Code;
 *  2.    String Name;
 *  3.    String Phone;
 * <b>*</b>4.       int Point;
 *  5.    String Remark;
 * <b>*</b>6. Customers customer = new Customers(); (static)
 * </pre>
 * 
 * <p><b>About Constructor(private):</b><br>
 * &emsp;Using {@link vo.IInnerStaticConstructor Inner Static Constructor Method}&nbsp;
 * to design the Constructor.<br>
 * <pre>
 *  1. Customers();
 * </pre>
 * 
 * <p><b>About Method(public):</b>
 * <pre>
 *  1. Customers create(); (static)
 *  2. Customers setCustomers(String c_Code, String c_Name, String c_Phone, int c_Point, String c_Remark);
 *  3. Customers setCustomers(String c_Code, String c_Name, String c_Phone, int c_Point);
 *  4.   boolean isPoint(int point);
 *  5. Customers setInitialize();
 *  6.    String toString(); (@Override)
 *  7-16. set and get methods (exclude attribute of <i>customer</i>)
 * </pre>
 * 
 * @see (Abstract Class)&nbsp;{@link vo.APerson APerson}
 * @see (Interface)&nbsp;{@link vo.IInnerStaticConstructor IInnerStaticConstructor}
 * @see (Interface)&nbsp;{@link vo.IValueObject IValueObject}
 * @see (Interface)&nbsp;{@link vo.JavaOcpStoreProject JavaOcpStoreProject}<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class Customers extends APerson{
	
// Attribute
    /**
     * It is the customer number of company internal.
     * @param c_Code
     */ 
	private String c_Code;
    
    /**
     * It is the customer name.
     * @param c_Name
     */ 
    private String c_Name;
    
    /**
     * It is the customer phone numbers.
     * @param c_Phone
     */ 
    private String c_Phone;
    
    /**
     * It is recorded content about this customer.
     * @param c_Remark
     */ 
    private String c_Remark;
    
    /**
     * It is the bonus point for this customer.
     * @param c_Point
     */ 
    private int c_Point;
    
    /**
     * Using by inner static constructor.
     * @param customer
     */
    private static Customers customer = new Customers();
    

	
// Constructor
    /**
     * Null Constructor of Customers.
     */
    private Customers() {}
    
    
    
// Method
    /**
     * The user calling this method to create the object.
     * 
     * @return customer
     */
    public static Customers create() {
    	return customer;
    }
    
    /**
     * Set all attributes value.
     * 
     * @param c_Code (Customer number of company internal)
     * @param c_Name (Customer name)
     * @param c_Phone (Customer phone numbers)
     * @param c_Point (Customer bonus point)
     * @param c_Remark (Remark about Customer)<br><br>
     * @return Customers customer<br><br>
     */
    public Customers setCustomers(
    		String c_Code, String c_Name, String c_Phone, int c_Point,
    		String c_Remark) {
		if(super.isCode(c_Code)) {
			this.c_Code = c_Code;
		}
		
		if(super.isName(c_Name)) {
			this.c_Name = c_Name;
		}
		
		if(super.isPhone(c_Phone)) {
			this.c_Phone = c_Phone;
		}
		
		if(super.isRemark(c_Remark)) {
			this.c_Remark = c_Remark;
		}
		
		if(isPoint(c_Point)) {
			this.c_Point = c_Point;
		}
		
		return this;
    }
    
    /**
     * Set all attributes value(exclude Remark, and it is null).
     * 
     * @param c_Code (Customer number of company internal)
     * @param c_Name (Customer name)
     * @param c_Phone (Customer phone numbers)
     * @param c_Point (Customer bonus point)<br><br>
     * @return Customers customer<br><br>
     */
    public Customers setCustomers(
    		String c_Code, String c_Name, String c_Phone, int c_Point) {
		if(super.isCode(c_Code)) {
			this.c_Code = c_Code;
		}
		
		if(super.isName(c_Name)) {
			this.c_Name = c_Name;
		}
		
		if(super.isPhone(c_Phone)) {
			this.c_Phone = c_Phone;
		}
		
		this.c_Remark = null;
		
		if(isPoint(c_Point)) {
			this.c_Point = c_Point;
		}

		return this;
    }
    
	/**
	 * <b>Check Point:</b><br>
	 * &nbsp;must more than or equal to 0.<br>
	 * 
	 * @param point <br><br>
	 * @return b (default: false)<br><br>
	 */
	public boolean isPoint(int point) {
		boolean b = false;
		
		try {
			if(point<0) {
				throw new PositiveIntegerException("Point must be Positive Integer(more than or equal to 0)");
			}else {
				this.c_Point = point;
				b = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

	/**
	 * Initialize Customers Class attributes.
	 * 
	 * @return this (return this Customers Class)
	 */
	@Override
	public Customers setInitialize() {
		this.c_Code = null;
		this.c_Name = null;
		this.c_Phone = null;
		this.c_Point = 0;
		this.c_Remark = null;
		return this;
	}
	
	/**
	 * Show the Customers Class information.
	 */
	@Override
	public String toString() {
		return String.format("Customers\n"
				+ "[c_Code   = %s, \n"
				+ " c_Name   = %s, \n"
				+ " c_Phone  = %s, \n"
				+ " c_Point  = %s, \n"
				+ " c_Remark = %s]",
				c_Code,c_Name,c_Phone,c_Point,c_Remark);
	}
	
	
    
// Set and Get of Method
	public String getC_Code() {
		return c_Code;
	}

	public void setC_Code(String c_Code) {
		this.c_Code = c_Code;
	}

	public String getC_Name() {
		return c_Name;
	}

	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}

	public String getC_Phone() {
		return c_Phone;
	}

	public void setC_Phone(String c_Phone) {
		this.c_Phone = c_Phone;
	}

	public String getC_Remark() {
		return c_Remark;
	}

	public void setC_Remark(String c_Remark) {
		this.c_Remark = c_Remark;
	}

	public int getC_Point() {
		return c_Point;
	}

	public void setC_Point(int c_Point) {
		this.c_Point = c_Point;
	}


}


