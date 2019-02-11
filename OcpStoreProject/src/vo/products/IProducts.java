/*
 * KKSU.Studio &copy;
 */
package vo.products;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * Project: OcpStoreSystem.vo.products
 * time: 2019.1.14, PM 5:52:38
 * 
 *  * <p>Function:<br>
 * Check the attribute follow the rule or not.
 * 
 * <blockquote><pre>
 * Attribute:
 *     1. Code
 *     2. Name
 *     3. Price
 *     4. Cost
 *     5. Unit
 *     6. Status
 *     7. Remark
 * </pre></blockquote>
 * 
 * @author TiramiAsu (tiramisu0116@gmail.com)
 * @version 1.0
 */
public interface IProducts {
	
	/**
	 * 					MySQL type  : Limit
	 * @param p_Code	char(20)	: not null, length <=20
	 * @param p_Name	nvarchar(20): not null
	 * @param p_Price	decimal(9,3): not null, >0
	 * @param p_Cost	decimal(9,3): not null, >0
	 * @param p_Unit	nvarchar(5)	: not null
	 * @param p_Status	nchar(5)	: not null, 僅 "停售" 及 "販售中"
	 * @param p_Remark	text		: -
	 */
	boolean checkP_Code(String p_Code) throws IOException;
	boolean checkP_Name(String p_Name) throws IOException;
	boolean checkP_Price(BigDecimal p_Price) throws IOException;
	boolean checkP_Cost(BigDecimal p_Cost) throws IOException;
	boolean checkP_Unit(String p_Unit) throws IOException;
	boolean checkP_Status(String p_Status) throws IOException;
	boolean checkP_Remark(String p_Remark) throws IOException;
}


