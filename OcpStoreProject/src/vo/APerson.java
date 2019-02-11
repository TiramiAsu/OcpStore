/*
 * KKSU.Studio &copy;
 */
package vo;

import java.sql.SQLException;

import ocpstoreException.LengthException;
import ocpstoreException.NullException;

/**
 * Project: OcpStoreSystem.vo<br>
 * Time: 2019.1.12, AM 2:16:36<br><br>
 * 
 * {@link vo.APerson APerson}
 * 
 * <p><b>About Class:</b><br>
 * &nbsp;Implement the Check Method with attributes, and extend to subclass.
 * 
 * <p><b>About Methods(public):</b>
 * <pre>
 *  1. boolean isCode(String code);
 *  2. boolean isName(String name);
 *  3. boolean isPhone(String phone);
 *  4. boolean isRemark(String remark); (@Override)
 *  5. APerson setInitialize(); (abstract)
 *  6.  String toString(); (abstract)
 * </pre>
 * 
 * @see (Interface)&nbsp;{@link vo.IInnerStaticConstructor IInnerStaticConstructor}
 * @see (Interface)&nbsp;{@link vo.IValueObject IValueObject}
 * @see (Interface)&nbsp;{@link vo.JavaOcpStoreProject JavaOcpStoreProject}<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public abstract class APerson implements IValueObject{
	
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
	 * <b>Check Phone:</b><br>
	 * &nbsp;not null<br>
	 * 
	 * @param phone <br><br>
	 * @return b (default: false)
	 */
	public boolean isPhone(String phone) {
		boolean b = false;
		
		try {
			if(phone.equals("")) {
				throw new NullException("\"Phone\" must be Not Null");
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
	 * Using object initialize. Any subclass should Override it.
	 * 
	 * @return APerson person (or any inherit from APerson Class of subclass)
	 */
	public abstract APerson setInitialize();

	/**
	 * Should override about toString(), because the attribute are not same
	 * at every subclasses.
	 * 
	 * @return String
	 */
	public abstract String toString();
}


