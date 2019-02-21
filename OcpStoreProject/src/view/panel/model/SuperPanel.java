/*
 * KKSU.Studio &copy;
 */
package view.panel.model;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import ocptool.OcpFontStyle;

import java.awt.Color;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019.2.15, PM 9:23:46<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class SuperPanel extends JPanel {
	public JLabel lblVersion;
	public JLabel lblSystemMessage;
	public OcpFontStyle F = OcpFontStyle.getIt();

	/**
	 * Create the panel.
	 */
	public SuperPanel() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		lblSystemMessage = new JLabel("System Status  ");
		lblSystemMessage.setBounds(633, 10, 127, 28);
		lblSystemMessage.setFont(F.fSystemI12());
		lblSystemMessage.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblSystemMessage);
		
		lblVersion = new JLabel("Version 1.1");
		lblVersion.setBounds(10, 362, 127, 28);
		lblVersion.setFont(F.fSystemI12());
		lblVersion.setHorizontalAlignment(SwingConstants.LEFT);
		add(lblVersion);

	}
		
	
}
