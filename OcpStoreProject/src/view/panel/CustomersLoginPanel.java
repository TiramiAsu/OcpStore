/*
 * KKSU.Studio &copy;
 */
package view.panel;

import listener.PromptTextField;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019.2.15, AM 1:54:27<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class CustomersLoginPanel extends LoginPanel {

	/**
	 * Create the panel.
	 */
	public CustomersLoginPanel() {
		
		// System message
		lblSystemMessage.setText("Welcome!!  ");
		
		// Inserted the Listener for txtAccount
		txtAccount.addMouseListener(new PromptTextField("Account", txtAccount));
		
		// Inserted the Listener for txtPassword
		txtPassword.addMouseListener(new PromptTextField("Password", txtPassword));
	}
}
