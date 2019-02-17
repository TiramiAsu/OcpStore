/*
 * KKSU.Studio &copy;
 */
package view.panel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019.2.15, PM 9:15:52<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class ManagePanel extends SuperPanel {
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private EmployeesManagePanel panel1;
	private AttendanceManagePanel panel2;


	/**
	 * Create the panel.
	 */
	public ManagePanel() {
		setLayout(null);
		
		
		JLabel lbManagelName = new JLabel("Name");
		lbManagelName.setBounds(40, 48, 170, 50);
		lbManagelName.setFont(getOcpStyle(20));
		add(lbManagelName);
		
		JLabel lblManageCode = new JLabel("Code");
		lblManageCode.setBounds(40, 101, 170, 28);
		lblManageCode.setFont(getOcpStyle());
		add(lblManageCode);
		
		btn1 = new JButton("Emploees");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(true);
				panel2.setVisible(false);
			}
		});
		btn1.setBounds(33, 140, 169, 35);
		btn1.setFont(getOcpStyle("bold",20));
		btn1.setHorizontalAlignment(SwingConstants.LEFT);
		add(btn1);
		
		btn2 = new JButton("Attendance");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(true);
				panel1.setVisible(false);
			}
		});
		btn2.setBounds(33, 174, 169, 35);
		btn2.setFont(getOcpStyle(12));
		btn2.setHorizontalAlignment(SwingConstants.LEFT);
		add(btn2);
		
		btn3 = new JButton("xxx");
		btn3.setHorizontalAlignment(SwingConstants.LEFT);
		btn3.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		btn3.setBounds(33, 208, 169, 35);
		add(btn3);
		
		btn4 = new JButton("xxx");
		btn4.setHorizontalAlignment(SwingConstants.LEFT);
		btn4.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		btn4.setBounds(33, 242, 169, 35);
		add(btn4);
		
		btn5 = new JButton("xxx");
		btn5.setHorizontalAlignment(SwingConstants.LEFT);
		btn5.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		btn5.setBounds(33, 276, 169, 35);
		add(btn5);
		
		btn6 = new JButton("xxx");
		btn6.setHorizontalAlignment(SwingConstants.LEFT);
		btn6.setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		btn6.setBounds(33, 310, 169, 35);
		add(btn6);
		
		panel1 = new EmployeesManagePanel();
		panel1.setBounds(225, 45, 520, 340);
		add(panel1);
		
		panel2 = new AttendanceManagePanel();
		panel2.setBounds(225, 45, 520, 340);
		add(panel2);
		panel2.setVisible(false);
		
	}
}
