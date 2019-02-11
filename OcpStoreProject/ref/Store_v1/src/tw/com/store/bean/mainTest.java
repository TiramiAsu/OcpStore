/*
* Hannah Chen &copy 
*/
package tw.com.store.bean;

import java.math.BigDecimal;

/**
* Project:tw.com.store.beanStore
* Time: Jan 10, 20193:07:28 PM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class mainTest {
	public static void main(String[] args) {
		
		//========前提假設===============
		/*現在有個顧客john先生
		 *  原本點數為129點
		 *  客戶編號為123
		 * */
		Customers c1 = new Customers("123", "john", 129, "0912345678");
		//產生一個新訂單，假設他前一個訂單為129元
		Orders o1 = new Orders();
		o1.setSales(new BigDecimal(129));
		
		
		System.out.println("===========模擬狀況============");
		//=========john開始消費========
		
		//user:訂購一個220元的套餐
		o1.setSales(new BigDecimal(220));
		//app:john本次消費金額
		System.out.println("本次消費金額:"+o1.getSales());
		//app:新增點數
		c1.addPoint(o1);
		//app:顯示目前點數
		System.out.println("目前點數:"+c1.getPoint());
		//app:顯示目前可折抵金額
		System.out.println("目前可折抵金額(300點折抵1元):"+c1.discountMoney());
		//user:john表示想要點數當次折抵消費
		int userDiscountPoint = 1;
		System.out.println("user想要折抵的金額:"+userDiscountPoint);
		try {
			c1.deletPoint(o1, userDiscountPoint);
		} catch (Exception e) {
			System.out.println("注意:"+e.getMessage());
		}
		//app:顯示剩餘點數
		System.out.println("剩餘點數:"+c1.getPoint());
		//app:顯示john本次消費金額
		System.out.println("本次消費總額:"+o1.getSales());
		
		
		
		
		
		
		
		
	}
}
