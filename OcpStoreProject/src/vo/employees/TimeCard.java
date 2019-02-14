/*
* Hannah Chen &copy 
*/
package vo.employees;

import java.time.*;

/**
 * Project:tw.com.store.beanStore <br>
 * Time: Jan 11, 20192:36:43 PM <br><br>
 * @author Hannah Chen (jud40322@gapp.nthu.edu.tw)
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class TimeCard extends Employees{
	LocalDate date = LocalDate.now();
	LocalTime time = LocalTime.now();
		
	public TimeCard(String code, String employeeName, String phone, String type, String note) {
		super(code, employeeName, phone, type, note);
		setDate(date);
		setTime(time);
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}
	
	public LocalTime getTime() {
		return time;
	}

	@Override
	public String toString() {
		return String.format("%s現在日期: %s%n現在時間: %s", super.toString(), date, time);
	}
	
	
}
