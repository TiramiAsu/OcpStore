/**
*專案名稱 : FinancialFunction 
*	套件名稱 : tw.com.code_edit.financialfunction.model
*	建立時間 : 2018年10月8日 下午8:35:02
*	<h6>@author  : Wayne		E-mail : a0922015135@gmail.com</h6>
*	<h6>@version : 1.0</h6>
*	TODO : 
*/
package tw.com.code_edit.financialfunction.model;
public interface Model {
	public void setCalculateVariable (String variable01,String variable02,String variable03,String variable04,String variable05,String variable06) ;
	public void setCalculateOperator(String operator01,String operator02,String operator03,String operator04,String operator05);
	public String getCalculateResault();
	public void setAttributeDefault();
}
