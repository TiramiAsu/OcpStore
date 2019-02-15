/*
 * KKSU.Studio &copy;
 */
package view.panel;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019.2.15, AM 12:03:22<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class LoginPanel extends SuperPanel {
	public JTextField txtAccount;
	public JTextField txtPassword;
	public JButton btnLogin;

	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		setBorder(UIManager.getBorder("Menu.border"));
		setLayout(null);
		
		txtAccount = new JTextField();
		txtAccount.setBounds(458, 112, 220, 46);
		txtAccount.setColumns(10);
		txtAccount.setFont(getOcpStyle());
		txtAccount.setForeground(Color.LIGHT_GRAY);
		txtAccount.setText("Account");
		add(txtAccount);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(458, 168, 220, 46);
		txtPassword.setColumns(10);
		txtPassword.setFont(getOcpStyle());
		txtPassword.setForeground(Color.LIGHT_GRAY);
		txtPassword.setText("Password");
		add(txtPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(getOcpStyle("bold"));
		btnLogin.setBounds(458, 256, 220, 46);
		add(btnLogin);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("D:\\GitHub\\OcpStore\\OcpStoreProject\\imgs\\OcpStore_LogoRight.png"));
		lblLogo.setBounds(44, 48, 341, 290);
		add(lblLogo);

	}
	
	
}
