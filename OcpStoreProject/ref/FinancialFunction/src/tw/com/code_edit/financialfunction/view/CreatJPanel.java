/**
*專案名稱 : FinancialFunction 
*	套件名稱 : tw.com.code_edit.financialfunction.view
*	建立時間 : 2018年8月21日 下午9:50:33
*	<h6>@author  : Wayne		E-mail : a0922015135@gmail.com</h6>
*	<h6>@version : 1.0</h6>
*	TODO : 
*/
package tw.com.code_edit.financialfunction.view;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import tw.com.code_edit.financialfunction.SQLite.DbConnection;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.math.BigDecimal;

public class CreatJPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField variable01, variable02, variable03, variable04, variable05, functionname = null, variable06;
	private String addition = "+", substraction = "-", multiply = "*", divide = "/";
	private JComboBox<String> operator01, operator02, operator03, operator04, operator05;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JSeparator separator_6;
	private DecimalFormat dl=new DecimalFormat(",##0.000");;

	/**
	 * Create the panel.
	 */
	public CreatJPanel(CalculationJPanel calculationJPanel, ListPanel listPanel) {
		setBackground(new Color(70, 130, 180));

		setBorder(
				new TitledBorder(null, "\u65B0\u589E\u516C\u5F0F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(null);

		JButton button = new JButton("新增公式");
		button.setBackground(new Color(127, 255, 212));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection con = null;
				ResultSet rs = null;
				if (!functionname.getText().equals("")) {
					try {
						con = DbConnection.getConnection();
						DbConnection.addFunctions(con, functionname.getText(), variable01.getText(),
								variable02.getText(), variable03.getText(), variable04.getText(), variable05.getText(),
								variable06.getText());
						DbConnection.addOperators(con, operator01.getSelectedItem().toString(),
								operator02.getSelectedItem().toString(), operator03.getSelectedItem().toString(),
								operator04.getSelectedItem().toString(), operator05.getSelectedItem().toString(),
								functionname.getText());
						rs = DbConnection.addActionComboBox(con, functionname.getText());
						calculationJPanel
								.addComboBoxSingleItem(rs.getString("id") + ". " + rs.getString("functionname"));
						listPanel.addComboboxSingleItem(rs.getString("id") + ". " + rs.getString("functionname"));
					} catch (SQLException e) {
						JOptionPane.showMessageDialog(null, "database有問題");
					} finally {
						DbConnection.close(con);
						DbConnection.close(rs);
					}
				} else {
					JOptionPane.showMessageDialog(null, "請輸入公式名稱");
				}
				variable01.setText("");
				variable02.setText("");
				variable03.setText("");
				variable04.setText("");
				variable05.setText("");
				variable06.setText("");
				functionname.setText("");
				operator01.setSelectedIndex(0);
				operator02.setSelectedIndex(0);
				operator03.setSelectedIndex(0);
				operator04.setSelectedIndex(0);
				operator05.setSelectedIndex(0);
			}
		});
		button.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		button.setBounds(797, 99, 103, 25);
		add(button);

		separator = new JSeparator();
		separator.setBounds(10, 80, 95, 2);
		add(separator);

		separator_1 = new JSeparator();
		separator_1.setBounds(164, 80, 95, 2);
		add(separator_1);

		separator_2 = new JSeparator();
		separator_2.setBounds(318, 80, 95, 2);
		add(separator_2);

		separator_3 = new JSeparator();
		separator_3.setBounds(472, 80, 95, 2);
		add(separator_3);

		separator_4 = new JSeparator();
		separator_4.setBounds(626, 80, 95, 2);
		add(separator_4);

		separator_5 = new JSeparator();
		separator_5.setBounds(780, 80, 95, 2);
		add(separator_5);

		separator_6 = new JSeparator();
		separator_6.setBounds(322, 120, 261, 2);
		add(separator_6);

		operator01 = new JComboBox<String>();
		operator01.setBounds(115, 59, 39, 23);
		setOperator(operator01);
		add(operator01);

		operator02 = new JComboBox<String>();
		operator02.setBounds(269, 59, 39, 23);
		setOperator(operator02);
		add(operator02);

		operator03 = new JComboBox<String>();
		operator03.setBounds(423, 59, 39, 23);
		setOperator(operator03);
		add(operator03);

		operator04 = new JComboBox<String>();
		operator04.setBounds(577, 59, 39, 23);
		setOperator(operator04);
		add(operator04);

		operator05 = new JComboBox<String>();
		operator05.setBounds(731, 59, 39, 23);
		setOperator(operator05);
		add(operator05);

		functionname = new JTextField();
		functionname.setForeground(Color.CYAN);
		functionname.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		functionname.setBackground(new Color(70, 130, 180));
		functionname.setBorder(null);
		functionname.setBounds(328, 95, 244, 25);
		add(functionname);
		functionname.setColumns(10);

		variable01 = new JTextField();
		variable01.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				
				variable01.setText(dl.format(Double.parseDouble(variable01.getText())));
				
			}
		});
		variable01.setForeground(Color.CYAN);
		variable01.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		variable01.setBorder(null);
		variable01.setBackground(new Color(70, 130, 180));
		variable01.setBounds(8, 50, 105, 25);
		add(variable01);
		variable01.setColumns(10);

		variable02 = new JTextField();
		variable02.setForeground(Color.CYAN);
		variable02.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		variable02.setBorder(null);
		variable02.setBackground(new Color(70, 130, 180));
		variable02.setBounds(160, 50, 105, 25);
		add(variable02);
		variable02.setColumns(10);

		variable03 = new JTextField();
		variable03.setForeground(Color.CYAN);
		variable03.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		variable03.setBorder(null);
		variable03.setBackground(new Color(70, 130, 180));
		variable03.setBounds(315, 50, 105, 25);
		add(variable03);
		variable03.setColumns(10);

		variable04 = new JTextField();
		variable04.setForeground(Color.CYAN);
		variable04.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		variable04.setBorder(null);
		variable04.setBackground(new Color(70, 130, 180));
		variable04.setBounds(466, 50, 105, 25);
		add(variable04);
		variable04.setColumns(10);

		variable05 = new JTextField();
		variable05.setForeground(Color.CYAN);
		variable05.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		variable05.setBorder(null);
		variable05.setBackground(new Color(70, 130, 180));
		variable05.setBounds(620, 50, 105, 25);
		add(variable05);
		variable05.setColumns(10);

		variable06 = new JTextField();
		variable06.setForeground(Color.CYAN);
		variable06.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		variable06.setBorder(null);
		variable06.setBackground(new Color(70, 130, 180));
		variable06.setBounds(776, 50, 105, 25);
		add(variable06);
		variable06.setColumns(10);

		JLabel label = new JLabel("第一項");
		label.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		label.setBounds(32, 24, 50, 25);
		add(label);

		JLabel label_1 = new JLabel("第二項");
		label_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		label_1.setBounds(185, 24, 60, 25);
		add(label_1);

		JLabel label_2 = new JLabel("第三項");
		label_2.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		label_2.setBounds(338, 24, 75, 25);
		add(label_2);

		JLabel label_3 = new JLabel("第四項");
		label_3.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		label_3.setBounds(490, 24, 77, 25);
		add(label_3);

		JLabel label_4 = new JLabel("第五項");
		label_4.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		label_4.setBounds(647, 24, 74, 25);
		add(label_4);

		JLabel label_6 = new JLabel("第六項");
		label_6.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		label_6.setBounds(801, 24, 60, 25);
		add(label_6);

		JLabel label_5 = new JLabel("公式名稱 :");
		label_5.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(221, 97, 97, 25);
		add(label_5);
	}

	public void setOperator(JComboBox<String> operator) {
		operator.addItem(" ");
		operator.addItem(addition);
		operator.addItem(substraction);
		operator.addItem(multiply);
		operator.addItem(divide);
	}
}
