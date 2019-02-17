/*
 * KKSU.Studio &copy;
 */
package view.panel;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

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

	/**
	 * Create the panel.
	 */
	public SuperPanel() {
		setLayout(null);
		
		lblSystemMessage = new JLabel("System Status  ");
		lblSystemMessage.setBounds(633, 10, 127, 28);
		lblSystemMessage.setFont(getOcpStyleSystem());
		lblSystemMessage.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblSystemMessage);
		
		lblVersion = new JLabel("Version 1.1");
		lblVersion.setBounds(10, 362, 127, 28);
		lblVersion.setFont(getOcpStyleSystem());
		lblVersion.setHorizontalAlignment(SwingConstants.LEFT);
		add(lblVersion);

	}
	
	// using for System Message
	public Font getOcpStyleSystem() {
		return new Font("微軟正黑體", Font.ITALIC, 12);
	}
	
	// default Style for OcpStore Project
	public Font getOcpStyle() {
		return new Font("微軟正黑體", Font.PLAIN, 16);
	}
	
	// using for other style setting
	public Font getOcpStyle(String style, int size) {
		
		int fontStyle = 0;
		
		switch (style) {
		case "plain":
			fontStyle = 0;
			break;
		case "bold":
			fontStyle = 1;
			break;
		case "italic":
			fontStyle = 2;
			break;
		}
		return new Font("微軟正黑體", fontStyle, size);
	}
	
	public Font getOcpStyle(String style) {
		
		int fontStyle = 0;
		
		switch (style) {
		case "plain":
			fontStyle = 0;
			break;
		case "bold":
			fontStyle = 1;
			break;
		case "italic":
			fontStyle = 2;
			break;
		}
		return new Font("微軟正黑體", fontStyle, 16);
	}
	
	public Font getOcpStyle(int size) {
		return new Font("微軟正黑體", Font.PLAIN, size);
	}
	
	
}
