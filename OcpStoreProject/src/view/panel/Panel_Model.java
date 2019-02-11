/*
 * KKSU.Studio &copy;
 */
package view.panel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Project: view.panelOCP_OrderSystem
 * time: 2018年12月23日,下午6:10:09
 * @author: KKSU
 * E-mail: @gmail.com
 * @version: 1.0
 * TODO
 */
public abstract class Panel_Model extends JPanel {
	protected String ExecutePanel;
	
	protected JTextField textField_01;
	protected JTextField textField_02;
	protected JTextField textField_03;
	protected JTextField textField_04;
	protected JTextField textField_05;
	protected JTextField textField_06;
	protected JTextField textField_07;
	protected JTextField textField_08;
	protected JTextField textField_09;
	protected JTextField textField_10;
	
	protected JLabel lblTitle;
	protected JLabel lblColumn_01;
	protected JLabel lblColumn_02;
	protected JLabel lblColumn_03;
	protected JLabel lblColumn_04;
	protected JLabel lblColumn_05;
	protected JLabel lblColumn_06;
	protected JLabel lblColumn_07;
	protected JLabel lblColumn_08;
	protected JLabel lblColumn_09;
	protected JLabel lblColumn_10;
	
	protected JButton btnExecute;

	/**
	 * Create the panel.
	 */
	public Panel_Model() {
		setLayout(null);
		
		lblTitle = new JLabel("Sample_Customers");
		lblTitle.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		lblTitle.setBounds(37, 10, 502, 46);
		add(lblTitle);
		
		lblColumn_01 = new JLabel("Column 1*");
		lblColumn_01.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblColumn_01.setBounds(37, 81, 155, 40);
		add(lblColumn_01);
		
		lblColumn_02 = new JLabel("Column 2*");
		lblColumn_02.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblColumn_02.setBounds(37, 146, 155, 40);
		add(lblColumn_02);
		
		lblColumn_03 = new JLabel("Column 3");
		lblColumn_03.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblColumn_03.setBounds(37, 211, 155, 40);
		add(lblColumn_03);
		
		lblColumn_04 = new JLabel("Column 4");
		lblColumn_04.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblColumn_04.setBounds(37, 276, 155, 40);
		add(lblColumn_04);
		
		lblColumn_05 = new JLabel("Column 5");
		lblColumn_05.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblColumn_05.setBounds(37, 341, 155, 40);
		add(lblColumn_05);
		
		
		lblColumn_06 = new JLabel("Column 1*");
		lblColumn_06.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblColumn_06.setBounds(354, 81, 155, 40);
		add(lblColumn_06);
		
		lblColumn_07 = new JLabel("Column 2*");
		lblColumn_07.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblColumn_07.setBounds(354, 146, 155, 40);
		add(lblColumn_07);
		
		lblColumn_08 = new JLabel("Column 3");
		lblColumn_08.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblColumn_08.setBounds(354, 211, 155, 40);
		add(lblColumn_08);
		
		lblColumn_09 = new JLabel("Column 4");
		lblColumn_09.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblColumn_09.setBounds(354, 276, 155, 40);
		add(lblColumn_09);
		
		lblColumn_10 = new JLabel("Column 5");
		lblColumn_10.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		lblColumn_10.setBounds(354, 341, 155, 40);
		add(lblColumn_10);
		
		textField_01 = new JTextField();
		textField_01.setBounds(174, 81, 155, 40);
		add(textField_01);
		textField_01.setColumns(10);
		
		textField_02 = new JTextField();
		textField_02.setBounds(174, 143, 155, 40);
		add(textField_02);
		textField_02.setColumns(10);
		
		textField_03 = new JTextField();
		textField_03.setBounds(174, 205, 155, 40);
		add(textField_03);
		textField_03.setColumns(10);
		
		textField_04 = new JTextField();
		textField_04.setBounds(174, 267, 155, 40);
		add(textField_04);
		textField_04.setColumns(10);
		
		textField_05 = new JTextField();
		textField_05.setBounds(174, 329, 155, 40);
		add(textField_05);
		textField_05.setColumns(10);
		
		textField_06 = new JTextField();
		textField_06.setColumns(10);
		textField_06.setBounds(491, 81, 155, 40);
		add(textField_06);
		
		textField_07 = new JTextField();
		textField_07.setColumns(10);
		textField_07.setBounds(491, 143, 155, 40);
		add(textField_07);
		
		textField_08 = new JTextField();
		textField_08.setColumns(10);
		textField_08.setBounds(491, 205, 155, 40);
		add(textField_08);
		
		textField_09 = new JTextField();
		textField_09.setColumns(10);
		textField_09.setBounds(491, 267, 155, 40);
		add(textField_09);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(491, 329, 155, 40);
		add(textField_10);
		
		btnExecute = new JButton("Execute");
		btnExecute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				executeBotten();
			}
		});
		btnExecute.setFont(new Font("微軟正黑體", Font.PLAIN, 22));
		btnExecute.setBounds(658, 336, 131, 40);
		add(btnExecute);

	}
	public abstract void executeBotten();
}
