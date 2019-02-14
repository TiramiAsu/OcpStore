/*
 * KKSU.Studio &copy;
 */
package view.panel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Panel;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019年2月15日, 上午12:03:22<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class SuperLoginPanel extends JPanel {
	public JTextField txtAccount;
	public JTextField txtPassword;
	public JLabel lblUserName;
	public JLabel lblversion;
	public JButton btnLogin;

	/**
	 * Create the panel.
	 */
	public SuperLoginPanel() {
		setBorder(UIManager.getBorder("Menu.border"));
		setLayout(null);
		
		txtAccount = new JTextField();
		txtAccount.setBounds(458, 112, 220, 46);
		add(txtAccount);
		txtAccount.setColumns(10);
		txtAccount.setText("Account");
		txtAccount.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		txtAccount.setForeground(Color.LIGHT_GRAY);
//		txtAccount.addFocusListener(new JTextfieldHidden("Account", txtAccount));
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setBounds(458, 168, 220, 46);
		add(txtPassword);
		txtPassword.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		txtPassword.setForeground(Color.LIGHT_GRAY);
		txtPassword.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("微軟正黑體", Font.BOLD, 16));
		btnLogin.setBounds(458, 256, 220, 46);
		add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\GitHub\\OcpStore\\OcpStoreProject\\imgs\\OcpStore_LogoRight.png"));
		lblNewLabel.setBounds(44, 48, 341, 290);
		add(lblNewLabel);
		
		lblUserName = new JLabel("UserName  ");
		lblUserName.setFont(new Font("微軟正黑體", Font.ITALIC, 12));
		lblUserName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserName.setBounds(633, 10, 127, 28);
		add(lblUserName);
		
		lblversion = new JLabel("Version 1.1");
		lblversion.setHorizontalAlignment(SwingConstants.LEFT);
		lblversion.setFont(new Font("微軟正黑體", Font.ITALIC, 12));
		lblversion.setBounds(10, 362, 127, 28);
		add(lblversion);

	}
	
	
}
