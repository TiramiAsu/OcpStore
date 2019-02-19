/**
*專案名稱 : FinancialFunction 
*	套件名稱 : tw.com.code_edit.financialfunction.main
*	建立時間 : 2018年10月9日 上午11:28:06
*	<h6>@author  : Wayne		E-mail : a0922015135@gmail.com</h6>
*	<h6>@version : 1.0</h6>
*	TODO : 
*/
package tw.com.code_edit.financialfunction.main;

import tw.com.code_edit.financialfunction.SQLite.DbConnection;
import tw.com.code_edit.financialfunction.controller.Controller;
import tw.com.code_edit.financialfunction.model.Model;
import tw.com.code_edit.financialfunction.model.MyModel;
import tw.com.code_edit.financialfunction.view.LoginPage;
import tw.com.code_edit.financialfunction.view.MainPage;

public class Main {

	public static void main(String[] args) {
		Model model;
		MainPage mainPage;
		LoginPage loginPage;
		Controller controller;
		
//		loginPage=new LoginPage();
//		controller=new Controller(loginPage);
		mainPage = new MainPage();
		model = new MyModel();
		controller=new Controller(mainPage,model);
		DbConnection.displayErrorMessage("您好，感謝使用本軟體。");
		mainPage.setLocationRelativeTo(null);
		mainPage.setVisible(true);
	}
}
