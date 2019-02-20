/*
 * KKSU.Studio &copy;
 */
package _ModelTest;

import javax.swing.JFrame;

import view.panel.EmployeesManagePanel;


/**
 * Project: OcpStoreProject.view<br>
 * Time: 2019年2月20日, 上午1:41:05<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class testttttttttt {

	public static void main(String[] args) {
		EmployeesManagePanel pp = new EmployeesManagePanel();
		JFrame msf = new JFrame();
		msf.add(pp);
		msf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		msf.setSize(540, 380);
		msf.setVisible(true);
	}
}
