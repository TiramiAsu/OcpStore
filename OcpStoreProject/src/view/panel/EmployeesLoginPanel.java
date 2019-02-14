/*
 * KKSU.Studio &copy;
 */
package view.panel;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019年2月15日, 上午1:47:08<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class EmployeesLoginPanel extends SuperLoginPanel {

	/**
	 * Create the panel.
	 */
	public EmployeesLoginPanel() {
		txtAccount.setText("Employee Code");
		txtPassword.setText("none");
		lblUserName.setText("Employees  ");
	}
}
