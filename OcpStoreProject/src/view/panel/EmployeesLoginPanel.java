/*
 * KKSU.Studio &copy;
 */
package view.panel;

import listener.PromptTextField;
import view.panel.model.LoginPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019.2.15, AM 1:47:08<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class EmployeesLoginPanel extends LoginPanel {

	/**
	 * Create the panel.
	 */
	public EmployeesLoginPanel() {
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		// System message
		lblSystemMessage.setText("Employees  ");
		
		// Inserted the Listener for txtAccount
		txtAccount.addMouseListener(new PromptTextField("Employee Code", txtAccount));
		
		// Employee just using "Employee Code" login
		txtPassword.setText("none");
		txtPassword.setEnabled(false);
		
	}
}
