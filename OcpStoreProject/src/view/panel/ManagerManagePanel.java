/*
 * KKSU.Studio &copy;
 */
package view.panel;

import javax.swing.SwingConstants;

import ocptool.ISetEnture;
import view.panel.model.SuperPanel;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019.2.15, PM 9:15:52<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class ManagerManagePanel extends SuperPanel implements ISetEnture{
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
	public ManagerManagePanel() {
		setLayout(null);
		
		
		JLabel lbManagelName = new JLabel("Name");
		lbManagelName.setBounds(40, 48, 170, 50);
		lbManagelName.setFont(F.fTitleP20());
		add(lbManagelName);
		
		JLabel lblManageCode = new JLabel("Code");
		lblManageCode.setBounds(40, 101, 170, 28);
		lblManageCode.setFont(F.fDefaultP16());
		add(lblManageCode);
		
		btn1 = new JButton("Emploees");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getSelectButton(btn1);
				getVisiablePanel(panel1);
			}
		});
		btn1.setBounds(33, 140, 169, 35);
		btn1.setFont(F.setIt("bold",16));
		btn1.setHorizontalAlignment(SwingConstants.LEFT);
		add(btn1);
		
		btn2 = new JButton("Attendance");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getSelectButton(btn2);
				getVisiablePanel(panel2);
			}
		});
		btn2.setBounds(33, 174, 169, 35);
		btn2.setFont(F.fTextP12());
		btn2.setHorizontalAlignment(SwingConstants.LEFT);
		add(btn2);
		
		btn3 = new JButton("btn3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getSelectButton(btn3);
			}
		});
		btn3.setHorizontalAlignment(SwingConstants.LEFT);
		btn3.setFont(F.fTextP12());
		btn3.setBounds(33, 208, 169, 35);
		add(btn3);
		
		btn4 = new JButton("btn4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getSelectButton(btn4);
			}
		});
		btn4.setHorizontalAlignment(SwingConstants.LEFT);
		btn4.setFont(F.fTextP12());
		btn4.setBounds(33, 242, 169, 35);
		add(btn4);
		
		btn5 = new JButton("btn5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getSelectButton(btn5);
			}
		});
		btn5.setHorizontalAlignment(SwingConstants.LEFT);
		btn5.setFont(F.fTextP12());
		btn5.setBounds(33, 276, 169, 35);
		add(btn5);
		
		btn6 = new JButton("btn6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getSelectButton(btn6);
			}
		});
		btn6.setHorizontalAlignment(SwingConstants.LEFT);
		btn6.setFont(F.fTextP12());
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


	@Override
	public void getVisiablePanel(JPanel panel) {
		
		boolean boolpanel1 = false;
		boolean boolpanel2 = false;
		
		if(panel instanceof EmployeesManagePanel) {
			boolpanel1 = true;
		}else if(panel instanceof AttendanceManagePanel) {
			boolpanel2 = true;
		}
		
		panel1.setVisible(boolpanel1);
		panel2.setVisible(boolpanel2);
	}


	@Override
	public void getSelectButton(JButton btn) {
		// all set original Font
		btn1.setFont(F.fTextP12());
		btn2.setFont(F.fTextP12());
		btn3.setFont(F.fTextP12());
		btn4.setFont(F.fTextP12());
		btn5.setFont(F.fTextP12());
		btn6.setFont(F.fTextP12());
		
		// using Text identify
		String[] box = {
				btn1.getText(),
				btn2.getText(),
				btn3.getText(),
				btn4.getText(),
				btn5.getText(),
				btn6.getText()
		};
		
		// set it
		for(String s:box) {
			if(btn.getText().equals(s)) {
				btn.setFont(F.setIt("bold",16));
			}
		}
		
	}
}
