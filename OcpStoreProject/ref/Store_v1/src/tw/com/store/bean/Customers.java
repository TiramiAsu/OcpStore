/*
* Hannah Chen &copy 
*/
package tw.com.store.bean;
/**
* Project:tw.com.pcschool.storeStore
* Time: Jan 10, 2019 2:34:14 PM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class Customers extends Point{
	//顧客編碼
	private String code;
	//顧客名字
	private String customersName;
	private String phone;
	
	/**
	 * constructor<br>
	  * 即消費即為會員<br>
	 * 所以消費者消費先檢查是否為會員:<br>
	 * 是 -> 直接用資料庫資料<br>
	 * 否 -> 新建立會員資料<br>* 
	 */
	public Customers() {
		super();
	}
	
	/**
	 * @param code 
	 * @param customersName
	 * @param point 由資料庫查詢到點數輸入
	 * @param phone
	 */
	
	public Customers(String code, String customersName, int point, String phone) {
		super(point);
		setCode(code);
		setCustomersName(customersName);
		setPhone(phone);
	}

	public String getCustomersName() {
		return customersName;
	}

	public String getCode() {
		return code;
	}
	
	public String getPhone() {
		return phone;
	}

	/**
	 * 
	 * @param customersName
	 */
	public void setCustomersName(String customersName) {
		this.customersName = customersName;
	}
	/**
	 * 
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
