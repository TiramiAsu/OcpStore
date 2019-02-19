/*
 * KKSU.Studio &copy;
 */
package view.panel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Component;
import javax.swing.ScrollPaneConstants;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019年2月16日, 下午2:39:37<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class EmployeesManagePanel extends JPanel {
	private JLabel lblMain;
	private JLabel lblSecond;
	private JScrollPane scrollPaneMain;
	private JScrollPane scrollPaneSecond;
	public OcpFontStyle F = new OcpFontStyle();

	/**
	 * Create the panel.
	 */
	public EmployeesManagePanel() {
		setLayout(null);
		
		lblMain = new JLabel("All Information");
		lblMain.setFont(F.fTextP10());
		lblMain.setBounds(10, 5, 254, 15);
		add(lblMain);
		
		lblSecond = new JLabel("Info");
		lblSecond.setFont(F.fTextP10());
		lblSecond.setBounds(287, 5, 223, 15);
		add(lblSecond);
		
		
		JTextArea textAreaMain = new JTextArea();
		textAreaMain.setText("Code | EA006\r\nName | Peter\r\nPhone | 0930-555-555\r\nPosition | Manager\r\nRemark | ");
		textAreaMain.setFont(F.fTextP14());
		
		scrollPaneMain = new JScrollPane(textAreaMain);
		scrollPaneMain.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneMain.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneMain.setBounds(287, 21, 223, 314);
		add(scrollPaneMain);
		
		
		JTextArea textAreaSecond = new JTextArea();
		textAreaSecond.setText("EA006-Peter\r\n"
				+ "EA011-Sam\r\n"
				+ "EB008-Mary\r\n"
				+ "EB009-Kitty\r\n"
				+ "EC013-Bob\r\n"
				+ "ED001-Cano\r\n"
				+ "EF022-Sandy\r\n"
				+ "EE085-Mummy\r\n"
				+ "EE088-Max\r\n"
				+ "EG030-Eric\r\n"
				+ "EG041-Tirami\r\n"
				+ "EJ029-Peggy\r\n"
				+ "EJ033-Lisa\r\n"
				+ "EK040-Sonic\r\n"
				+ "EL022-John\r\n"
				+ "EL031-Jimmy\r\n"
				+ "EM066-Frank\r\n"
				+ "EO077-Robin\r\n"
				+ "ES015-Victor\r\n"
				+ "EX085-Puppy");
		textAreaSecond.setFont(F.fTextP14());
		
		scrollPaneSecond = new JScrollPane(textAreaSecond);
		scrollPaneSecond.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneSecond.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneSecond.setBounds(10, 21, 254, 314);
		add(scrollPaneSecond);

	}
}
