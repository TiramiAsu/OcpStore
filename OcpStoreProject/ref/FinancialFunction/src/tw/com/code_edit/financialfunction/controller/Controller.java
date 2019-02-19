/**
*專案名稱 : FinancialFunction 
*	套件名稱 : tw.com.code_edit.financialfunction.controller
*	建立時間 : 2018年8月22日 上午4:11:22
*	<h6>@author  : Wayne		E-mail : a0922015135@gmail.com</h6>
*	<h6>@version : 1.0</h6>
*	TODO : 
*/
package tw.com.code_edit.financialfunction.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import tw.com.code_edit.financialfunction.SQLite.DbConnection;
import tw.com.code_edit.financialfunction.model.Model;
import tw.com.code_edit.financialfunction.view.LoginPage;
import tw.com.code_edit.financialfunction.view.MainPage;

public class Controller {
	private MainPage mainPage;
	private Model model;
	private LoginPage loginPage;
	
	public Controller(LoginPage loginPage) {
		this.loginPage=loginPage;
	}
	
	public Controller(MainPage mainPage, Model model) {
		super();
		this.mainPage = mainPage;
		this.model = model;
		this.mainPage.calculationPanel.addCalculationListener(new AddListener());
	}
	
	class registerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		}
		
	}

	class LoginListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
	
	class AddListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
				model.setCalculateOperator(mainPage.calculationPanel.operator01.getText().trim(),
						mainPage.calculationPanel.operator02.getText().trim(), mainPage.calculationPanel.operator03.getText().trim(),
						mainPage.calculationPanel.operator04.getText().trim(), mainPage.calculationPanel.operator05.getText().trim());
				model.setCalculateVariable(mainPage.calculationPanel.variable01.getText(),
						mainPage.calculationPanel.variable02.getText(), mainPage.calculationPanel.variable03.getText(),
						mainPage.calculationPanel.variable04.getText(), mainPage.calculationPanel.variable05.getText(),
						mainPage.calculationPanel.variable06.getText());
				mainPage.calculationPanel.setResult(model.getCalculateResault());
			} catch (Exception e) {
				DbConnection.displayErrorMessage("請輸入正確數字");
			}finally {
				model.setAttributeDefault();
			}
		}
	}
}
