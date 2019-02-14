/*
 * KKSU.Studio &copy;
 */
package vo.orders;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import ocpstoreException.PositiveIntegerException;
import vo.IValueObject;

/**
 * Project: OcpStoreProject.vo.orders<br>
 * Time: 2019.2.13, PM 10:44:09<br><br>
 * 
 * {@link Orders}
 * 
 * <p><b>About Class:</b><br>
 * &emsp;Increase about Orders attributes. And must Check too.
 * 
 * <p><b>About Attribute(private):</b>
 * <pre>
 *  1.           int o_Code;
 *  2.           int e_Code;
 *  3.           int c_Code;
 *  4.     LocalDate o_Date;
 *  5. LocalDateTime o_Time;
 *  6.        String o_Reamrk;
 * </pre>
 * 
 * <p><b>About Constructor(public):</b><br>
 * <pre>
 *  1. Orders(int o_code, int e_code, int c_code,
 *            LocalDate date, LocalDateTime time, String remark);
 *  1. Orders(int o_code, int e_code, int c_code,
 *            LocalDate date, LocalDateTime time);
 * </pre>
 * 
 * <p><b>About Method(public):</b>
 * <pre>
 *  1. boolean isOcode(int o_code);
 *  2. boolean isEcode(int e_code);
 *  3. boolean isCcode(int c_code);
 *  4. boolean isDate(LocalDate date);
 *  5. boolean isTime(LocalDateTime time);
 *  6.  String isRemark(String remark); (@Override)
 *  7.  Orders setInitialize(); (@Override)
 *  8.  String toString(); (@Override)
 *  9-20. set and get methods (exclude attribute of <i>Orders</i>)
 * </pre>
 * 
 * @see (Interface)&nbsp;{@link vo.IValueObject IValueObject}
 * @see (Interface)&nbsp;{@link vo.JavaOcpStoreProject JavaOcpStoreProject}<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class Orders implements IValueObject<Orders>{

// Attribute
	private int o_Code;
	private int e_Code;
	private int c_Code;
	private LocalDate o_Date;
	private LocalDateTime o_Time;
	private String o_Remark;
	
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
		
		this.o_Remark = remark;
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
		
		this.o_Remark = null;
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
	 * Initialize Employees Class attributes.
	 * 
	 * @return this (return this Employees Class)
	 */
	@Override
	public Orders setInitialize() {
		this.o_Code = 0;
		this.e_Code = 0;
		this.c_Code = 0;
		this.o_Date = null;
		this.o_Time = null;
		this.o_Remark = null;
		return this;
	}

	/**
	 * Show the Orders Class information.
	 */
	@Override
	public String toString() {
		return String.format("Orders\n"
				+ "[o_Code      = %s, \n"
				+ " e_Code      = %s, \n"
				+ " c_Code      = %s, \n"
				+ " o_Date      = %s, \n"
				+ " o_Time      = %s, \n"
				+ " o_Remark    = %s]",
				o_Code, e_Code, c_Code,
				o_Date.toString(), o_Time.toString(),
				o_Remark);
	}

// Set and Get of Method
	public int getO_Code() {
		return o_Code;
	}

	public void setO_Code(int o_Code) {
		this.o_Code = o_Code;
	}

	public int getE_Code() {
		return e_Code;
	}

	public void setE_Code(int e_Code) {
		this.e_Code = e_Code;
	}

	public int getC_Code() {
		return c_Code;
	}

	public void setC_Code(int c_Code) {
		this.c_Code = c_Code;
	}

	public LocalDate getO_Date() {
		return o_Date;
	}

	public void setO_Date(LocalDate o_Date) {
		this.o_Date = o_Date;
	}

	public LocalDateTime getO_Time() {
		return o_Time;
	}

	public void setO_Time(LocalDateTime o_Time) {
		this.o_Time = o_Time;
	}

	public String getO_remark() {
		return o_Remark;
	}

	public void setO_remark(String o_remark) {
		this.o_Remark = o_remark;
	}
	
	
	


}
