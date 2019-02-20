/*
 * KKSU.Studio &copy;
 */
package view.panel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Component;
import javax.swing.ScrollPaneConstants;

import listener.InfoListSelection;
import listener.TimeCardListSelection;
import ocptool.OcpFontStyle;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019年2月16日, 下午2:39:37<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class AttendanceManagePanel extends JPanel {
	private JLabel lblMain;
	private JLabel lblSecond;
	private JScrollPane scrollPanelMain;
	private JScrollPane scrollPaneSecond;
	public static OcpFontStyle F = new OcpFontStyle();
	
	private JList<String> employeeList;
	private JList<String> showInfoList;

	private String[] employeesName = {
			"EA006-Peter",
			"EA011-Sam",
			"EB008-Mary",
			"EB009-Kitty",
			"EC013-Bob",
			"ED001-Cano",
			"EF022-Sandy",
			"EE085-Mummy",
			"EE088-Max",
			"EG030-Eric",
			"EG041-Tirami",
			"EJ029-Peggy",
			"EJ033-Lisa",
			"EK040-Sonic",
			"EL022-John",
			"EL031-Jimmy",
			"EM066-Frank",
			"EO077-Robin",
			"ES015-Victor",
			"EX085-Puppy"};
	
	/**
	 * Create the panel.
	 */
	public AttendanceManagePanel() {
		setLayout(null);
		
		lblMain = new JLabel("All Employees");
		lblMain.setFont(F.fTextP10());
		lblMain.setBounds(10, 5, 254, 15);
		add(lblMain);
		
		lblSecond = new JLabel("Info");
		lblSecond.setFont(F.fTextP10());
		lblSecond.setBounds(287, 5, 223, 15);
		add(lblSecond);
		
		
		showInfoList = new JList<String>();
		showInfoList.setFont(F.fTextP14());
		
		scrollPaneSecond = new JScrollPane(showInfoList);
		scrollPaneSecond.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneSecond.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneSecond.setBounds(287, 21, 223, 314);
		add(scrollPaneSecond);
		
		employeeList = new JList<String>(employeesName);
		employeeList.setFont(F.fTextP14());
		employeeList.addListSelectionListener(new TimeCardListSelection(employeeList,showInfoList));
		
		scrollPanelMain = new JScrollPane(employeeList);
		scrollPanelMain.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanelMain.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPanelMain.setBounds(10, 21, 254, 314);
		add(scrollPanelMain);

	}
}
