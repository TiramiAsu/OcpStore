/*
 * KKSU.Studio &copy;
 */
package vo.orders;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import ocpstoreException.PositiveIntegerException;
import vo.IValueObject;
import vo.employees.Employees;

/**
 * Project: OcpStoreProject.vo.orders<br>
 * Time: 2019.2.13, PM 10:44:09<br><br>
 * 
 * {@link Orders}
 * 
 * <p><b>About Class:</b><br>
 * &emsp;Increase about Orders other attributes. And the new 
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
 * @see (Interface)&nbsp;{@link vo.IInnerStaticConstructor IInnerStaticConstructor}
 * @see (Interface)&nbsp;{@link vo.IValueObject IValueObject}
 * @see (Interface)&nbsp;{@link vo.JavaOcpStoreProject JavaOcpStoreProject}<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class Orders implements IValueObject{

// Attribute
	private int o_Code;
	private int e_Code;
	private int c_Code;
	private LocalDate o_Date;
	private LocalDateTime o_Time;
	private String o_remark;
	
// Constructor
	/**
	 * Normal Constructor of Orders.
	 */
	public Orders(int o_code, int e_code, int c_code,
			LocalDate date, LocalDateTime time, String remark) {
		
		if(isOcode(o_code)) {
			this.o_Code = o_code;
		}
		
		if(isEcode(e_code)) {
			this.e_Code = e_code;
		}
		
		if(isCcode(c_code)) {
			this.c_Code = c_code;
		}
		
		if(isDate(date)) {
			this.o_Date = date;
		}
		
		if(isTime(time)) {
			this.o_Time = time;
		}
		
		this.o_remark = remark;
	}
	
	/**
	 * Normal Constructor of Orders(No remark).
	 */
	public Orders(int o_code, int e_code, int c_code,
			LocalDate date, LocalDateTime time) {
		
		if(isOcode(o_code)) {
			this.o_Code = o_code;
		}
		
		if(isEcode(e_code)) {
			this.e_Code = e_code;
		}
		
		if(isCcode(c_code)) {
			this.c_Code = c_code;
		}
		
		if(isDate(date)) {
			this.o_Date = date;
		}
		
		if(isTime(time)) {
			this.o_Time = time;
		}
		
		this.o_remark = null;
	}
	
// Method
	/**
	 * <b>Check o_Code:</b><br>
	 * &nbsp;must more than or equal to 0.<br>
	 * 
	 * @param o_code <br><br>
	 * @return b (default: false)<br><br>
	 */
	public boolean isOcode(int o_code) {
		boolean b = false;
		
		try {
			if(o_code<0) {
				throw new PositiveIntegerException("o_Code must be Positive Integer(more than or equal to 0)");
			}else {
				this.o_Code = o_code;
				b = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	/**
	 * <b>Check e_Code:</b><br>
	 * &nbsp;must more than or equal to 0.<br>
	 * 
	 * @param e_code <br><br>
	 * @return b (default: false)<br><br>
	 */
	public boolean isEcode(int e_code) {
		boolean b = false;
		
		try {
			if(e_code<0) {
				throw new PositiveIntegerException("e_Code must be Positive Integer(more than or equal to 0)");
			}else {
				this.e_Code = e_code;
				b = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	
	/**
	 * <b>Check c_Code:</b><br>
	 * &nbsp;must more than or equal to 0.<br>
	 * 
	 * @param c_code <br><br>
	 * @return b (default: false)<br><br>
	 */
	public boolean isCcode(int c_code) {
		boolean b = false;
		
		try {
			if(c_code<0) {
				throw new PositiveIntegerException("c_Code must be Positive Integer(more than or equal to 0)");
			}else {
				this.c_Code = c_code;
				b = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	/**
	 * <b>Check date:</b><br>
	 * &nbsp;must not null.<br>
	 * 
	 * @param date <br><br>
	 * @return b (default: false)<br><br>
	 */
	public boolean isDate(LocalDate date) {
		boolean b = false;
		
		try {
			if(date.equals("")) {
				throw new PositiveIntegerException("\"date\" must be Not Null.");
			}else {
				this.o_Date = date;
				b = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	
	/**
	 * <b>Check date:</b><br>
	 * &nbsp;must not null.<br>
	 * 
	 * @param date <br><br>
	 * @return b (default: false)<br><br>
	 */
	public boolean isTime(LocalDateTime time) {
		boolean b = false;
		
		try {
			if(time.equals("")) {
				throw new PositiveIntegerException("\"time\" must be Not Null.");
			}else {
				this.o_Time = time;
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
	public boolean isRemark(String remark) throws IOException {
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
	


}
