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

	/**
	 * Create the panel.
	 */
	public EmployeesManagePanel() {
		setLayout(null);
		
		lblMain = new JLabel("All Information");
		lblMain.setFont(new Font("微軟正黑體", Font.PLAIN, 10));
		lblMain.setBounds(10, 5, 254, 15);
		add(lblMain);
		
		lblSecond = new JLabel("Info");
		lblSecond.setFont(new Font("微軟正黑體", Font.PLAIN, 10));
		lblSecond.setBounds(287, 5, 223, 15);
		add(lblSecond);
		
		
		JTextArea textAreaMain = new JTextArea();
		textAreaMain.setText("Code | EA006\r\nName | Peter\r\nPhone | 0930-555-555\r\nPosition | Manager\r\nRemark | ");
		textAreaMain.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		
		scrollPaneMain = new JScrollPane(textAreaMain);
		scrollPaneMain.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneMain.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneMain.setBounds(287, 21, 223, 314);
		add(scrollPaneMain);
		
		
		JTextArea textAreaSecond = new JTextArea();
		textAreaSecond.setText("EA006-Peter\r\nEA011-Sam\r\nEB008-Mary\r\nEB009-Kitty\r\nEC013-Bob\r\nED001-Cano\r\nEF022-Sandy\r\nEE085-Mummy\r\nEE088-Max\r\nEG030-Eric\r\nEG041-Tirami\r\nEJ029-Peggy\r\nEJ033-Lisa\r\nEK040-Sonic\r\nEL022-John\r\nEL031-Jimmy\r\nEM066-Frank\r\nEO077-Robin\r\nES015-Victor\r\nEX085-Puppy");
		textAreaSecond.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		
		scrollPaneSecond = new JScrollPane(textAreaSecond);
		scrollPaneSecond.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneSecond.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneSecond.setBounds(10, 21, 254, 314);
		add(scrollPaneSecond);

	}
}
