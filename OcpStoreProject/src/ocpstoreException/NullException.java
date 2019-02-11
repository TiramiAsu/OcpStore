/*
 * KKSU.Studio &copy;
 */
package ocpstoreException;

import java.sql.DriverManager;
import java.sql.SQLWarning;

/**
 * Project: OcpStoreSystem.vo.customers<br>
 * Time: 2019年1月12日, 上午10:12:49<br>
 * @author TiramiAsu (tiramisu0116@gmail.com)
 * @version 1.0
 */
public class NullException extends java.sql.SQLException{
	
	public NullException(String msg) {
		super(msg);
	}
	
}



