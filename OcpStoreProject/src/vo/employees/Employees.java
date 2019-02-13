/*
 * KKSU.Studio &copy;
 */
package vo.employees;

import java.sql.SQLException;

import ocpstoreException.NullException;
import vo.APerson;

/**
 * Project: OcpStoreSystem.vo.employees<br>
 * Time: 2019.1.14, PM 10:42:30<br><br>
 * 
 * {@link Employees}
 * 
 * <p><b>About Class:</b><br>
 * &emsp;Increase about Employees other attributes. And the new 
 * attribute(mark * ) must Check too.
 * 
 * <p><b>About Attribute(private):</b>
 * <pre>
 *  1.    String Code;
 *  2.    String Name;
 *  3.    String Phone;
 * <b>*</b>4.    String Position;
 *  5.    String Remark;
 * <b>*</b>6. Employees employee = new Employees(); (static)
 * </pre>
 * 
 * <p><b>About Constructor(private):</b><br>
 * &emsp;Using {@link vo.IInnerStaticConstructor Inner Static Constructor Method}&nbsp;
 * to design the Constructor.<br>
 * <pre>
 *  1. Employees();
 * </pre>
 * 
 * <p><b>About Method(public):</b>
 * <pre>
 *  1. Employees create(); (static)
 *  2. Employees setEmployees(String c_Code, String c_Name, String c_Phone, int c_Point, String c_Remark);
 *  3. Employees setEmployees(String c_Code, String c_Name, String c_Phone, int c_Point);
 *  4.   boolean isPosition(String e_Position);
 *  5. Employees setInitialize(); (@Override)
 *  6.    String toString(); (@Override)
 *  7-16. set and get methods (exclude attribute of <i>employee</i>)
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
public class Employees extends APerson{
	
// Attribute
    /**
     * It is the Employee number of company internal.
     * @param e_Code
     */ 
	private String e_Code;
    
    /**
     * It is the Employee name.
     * @param e_Name
     */ 
    private String e_Name;
    
    /**
     * It is the Employee phone numbers.
     * @param e_Phone
     */ 
    private String e_Phone;
    
    /**
     * It is recorded content about this Employee.
     * @param e_Remark
     */ 
    private String e_Remark;
    
    /**
     * It is the position of this Employee.
     * @param e_Position
     */ 
    private String e_Position;
    
    /**
     * Using by inner static constructor.
     * @param employee
     */
    private static Employees employee = new Employees();
    
    
    
 // Constructor
    /**
     * Null Constructor of Employees.
     */
    private Employees() {}
    
    /**
     * Normal Constructor of Employees.
     */
    public Employees(String code, String name, String phone, String position,
    		String remark) {
    	if(isCode(code)) {
    		this.e_Code = code;
    	}
    	
    	if(isName(name)){
    		this.e_Name = name;
    	}
    	
    	if(isPhone(phone)) {
    		this.e_Phone = phone;
    	}
    	
    	if(isPosition(position)) {
    		this.e_Position = position;
    	}
    	
    	this.e_Remark = remark;
    }
    
    /**
     * Normal Constructor of Employees(No remark).
     */
    public Employees(String code, String name, String phone, String position) {
    	if(isCode(code)) {
    		this.e_Code = code;
    	}
    	
    	if(isName(name)){
    		this.e_Name = name;
    	}
    	
    	if(isPhone(phone)) {
    		this.e_Phone = phone;
    	}
    	
    	if(isPosition(position)) {
    		this.e_Position = position;
    	}
    	
    	this.e_Remark = null;
    }
    
 // Method
    /**
     * The user calling this method to create the object.
     * 
     * @return customer
     */
    public static Employees create() {
    	return employee;
    }
    
    /**
     * Set all attributes value.
     * 
     * @param e_Code (Employee number of company internal)
     * @param e_Name (Employee name)
     * @param e_Phone (Employee phone numbers)
     * @param e_Position (Posirion of Employee)
     * @param e_Remark (Remark about Employee)<br><br>
     * @return Employees Employee
     */
    public Employees setEmployees(
    		String e_Code, String e_Name, String e_Phone, String e_Position,
    		String e_Remark) {
		if(super.isCode(e_Code)) {
			this.e_Code = e_Code;
		}
		
		if(super.isName(e_Name)) {
			this.e_Name = e_Name;
		}
		
		if(super.isPhone(e_Phone)) {
			this.e_Phone = e_Phone;
		}
		
		if(super.isRemark(e_Remark)) {
			this.e_Remark = e_Remark;
		}
		
		if(isPosition(e_Position)) {
			this.e_Position = e_Position;
		}
		
		return this;
    }
    
    /**
     * Set all attributes value(exclude Remark, and it is null).
     * 
     * @param e_Code (Employee number of company internal)
     * @param e_Name (Employee name)
     * @param e_Phone (Employee phone numbers)
     * @param e_Position (Posirion of Employee)<br><br>
     * @return Employees Employee<br><br>
     */
    public Employees setEmployees(
    		String e_Code, String e_Name, String e_Phone, String e_Position) {
		if(super.isCode(e_Code)) {
			this.e_Code = e_Code;
		}
		
		if(super.isName(e_Name)) {
			this.e_Name = e_Name;
		}
		
		if(super.isPhone(e_Phone)) {
			this.e_Phone = e_Phone;
		}
		
		this.e_Remark = null;
		
		if(isPosition(e_Position)) {
			this.e_Position = e_Position;
		}

		return this;
    }
    
	/**
	 * <b>Check Point:</b><br>
	 * &nbsp;not null<br>
	 * 
	 * @param position <br><br>
	 * @return b (default: false)<br><br>
	 */
	public boolean isPosition(String position) {
		boolean b = false;
		
		try {
			if(position.equals("")) {
				throw new NullException("\"Position\" must be Not Null");
			}else {
				this.e_Position = position;
				b = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

	/**
	 * Initialize Employees Class attributes.
	 * 
	 * @return this (return this Employees Class)
	 */
	@Override
	public Employees setInitialize() {
		this.e_Code = null;
		this.e_Name = null;
		this.e_Phone = null;
		this.e_Position = null;
		this.e_Remark = null;
		return this;
	}

	/**
	 * Show the Employees Class information.
	 */
	@Override
	public String toString() {
		return String.format("Employees\n"
				+ "[e_Code      = %s, \n"
				+ " e_Name      = %s, \n"
				+ " e_Phone     = %s, \n"
				+ " e_Position  = %s, \n"
				+ " e_Remark    = %s]",
				e_Code,e_Name,e_Phone,e_Position,e_Remark);
	}

	

// Set and Get of Method
	public String getE_Code() {
		return e_Code;
	}

	public void setE_Code(String e_Code) {
		this.e_Code = e_Code;
	}

	public String getE_Name() {
		return e_Name;
	}

	public void setE_Name(String e_Name) {
		this.e_Name = e_Name;
	}

	public String getE_Phone() {
		return e_Phone;
	}

	public void setE_Phone(String e_Phone) {
		this.e_Phone = e_Phone;
	}

	public String getE_Remark() {
		return e_Remark;
	}

	public void setE_Remark(String e_Remark) {
		this.e_Remark = e_Remark;
	}

	public String getE_Position() {
		return e_Position;
	}

	public void setE_Position(String e_Position) {
		this.e_Position = e_Position;
	}

	
}


