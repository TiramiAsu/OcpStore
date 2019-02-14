/*
* Hannah Chen &copy 
*/
package dao;

import java.util.List;


/**
 * Project: tw.com.store.daoStore01 <br>
 * Time: Jan 12, 20191:00:26 AM <br><br>
 * 
 * @author Hannah Chen (jud40322@gapp.nthu.edu.tw)
 * @author TiramiAsu (tiramisu0116@gmail.com)
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
*/
public interface SelectDao<T> {
	
	public T findByCode(String code);
	
	public List<T> findByName(String name);
	
	public List<T> findByPhone(String phone);
	
	public List<T> getData(String column);
	
}
