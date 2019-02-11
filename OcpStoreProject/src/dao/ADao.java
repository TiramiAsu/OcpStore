/*
 * KKSU.Studio &copy;
 */
package dao;

import vo.customers.Customers;

/**
 * Project: OcpStoreProject.ndao<br>
 * Time: 2019年1月15日, 下午11:22:56<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public abstract class ADao<T> implements IDaoModel{

	/**
	 * 
	 * @param customer
	 * @return 
	 */
	public abstract void insert(T t);
	
	public abstract void delete(T t);
	
	public abstract void update(T t);
	
	public abstract void select(T t);
	
}
