/**
*專案名稱 : FinancialFunction 
*	套件名稱 : tw.com.code_edit.financialfunction.model
*	建立時間 : 2018年10月8日 下午8:37:57
*	<h6>@author  : Wayne		E-mail : a0922015135@gmail.com</h6>
*	<h6>@version : 1.0</h6>
*	TODO : 
*/
package tw.com.code_edit.financialfunction.model;

import javax.swing.JOptionPane;

public class MyModel implements Model {
	private String variable01, variable02, variable03, variable04, variable05, variable06;
	private String operator01, operator02, operator03, operator04, operator05;
	private double rs = 0;

	@Override
	public void setCalculateVariable(String variable01, String variable02, String variable03, String variable04,
			String variable05, String variable06) {
		this.variable01 = variable01;
		this.variable02 = variable02;
		this.variable03 = variable03;
		this.variable04 = variable04;
		this.variable05 = variable05;
		this.variable06 = variable06;
	}

	@Override
	public void setCalculateOperator(String operator01, String operator02, String operator03, String operator04,
			String operator05) {
		this.operator01 = operator01;
		this.operator02 = operator02;
		this.operator03 = operator03;
		this.operator04 = operator04;
		this.operator05 = operator05;
	}

	public void setAttributeDefault() {
		this.variable01 = "";
		this.variable02 = "";
		this.variable03 = "";
		this.variable04 = "";
		this.variable05 = "";
		this.variable06 = "";
		this.operator01 = "";
		this.operator02 = "";
		this.operator03 = "";
		this.operator04 = "";
		this.operator05 = "";
		this.rs = 0;
	}

	@Override
	public String getCalculateResault() {
		switch (operator01) {
		case "+":
			rs = Double.parseDouble(variable01) + Double.parseDouble(variable02);
			break;
		case "-":
			rs = Double.parseDouble(variable01) - Double.parseDouble(variable02);
			break;
		case "*":
			rs = Double.parseDouble(variable01) * Double.parseDouble(variable02);
			break;
		case "/":
			rs = Double.parseDouble(variable01) / Double.parseDouble(variable02);
			break;
		default:
			JOptionPane.showMessageDialog(null, "請輸入正確運算子");
			return null;
		}

		swichOperators(operator02, variable03);
		swichOperators(operator03, variable04);
		swichOperators(operator04, variable05);
		swichOperators(operator05, variable06);
		return String.valueOf(rs);
	}

	public void swichOperators(String operators, String variable02) {
		switch (operators) {
		case "+":
			rs += Double.parseDouble(variable02);
			break;
		case "-":
			rs -= Double.parseDouble(variable02);
			break;
		case "*":
			rs *= Double.parseDouble(variable02);
			break;
		case "/":
			rs /= Double.parseDouble(variable02);
			break;
		case "":
			break;
		default:
			JOptionPane.showMessageDialog(null, "請輸入正確運算子");
			break;
		}
	}
}
