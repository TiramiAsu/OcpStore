/**
*專案名稱 : FinancialFunction 
*	套件名稱 : tw.com.code_edit.financialfunction.view
*	建立時間 : 2018年8月21日 下午10:35:38
*	<h6>@author  : Wayne		E-mail : a0922015135@gmail.com</h6>
*	<h6>@version : 1.0</h6>
*	TODO : 
*/
package tw.com.code_edit.financialfunction.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import tw.com.code_edit.financialfunction.SQLite.DbConnection;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JSeparator;

public class CalculationJPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField variable01, variable02, variable03, variable04, variable05, variable06;
	public JComboBox<String> comboBox;
	public JLabel variableOut01, variableOut02, variableOut03, variableOut04, variableOut05, variableOut06, reault;
	public JTextField operator01, operator02, operator03, operator04, operator05;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JButton button;

	/**
	 * Create the panel.
	 */
	public CalculationJPanel() {
		setBackground(new Color(70, 130, 180));
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u8A08\u7B97", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(null);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(740, 15, 160, 25);
		addComboBoxItem(comboBox);

		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String a = comboBox.getSelectedItem().toString().substring(0, 3);
				comboboxAction(a);
			}
		});
		add(comboBox);
		separator = new JSeparator();
		separator.setBounds(8, 96, 105, 2);
		add(separator);

		separator_1 = new JSeparator();
		separator_1.setBounds(155, 96, 105, 2);
		add(separator_1);

		separator_2 = new JSeparator();
		separator_2.setBounds(310, 96, 105, 2);
		add(separator_2);

		separator_3 = new JSeparator();
		separator_3.setBounds(460, 96, 105, 2);
		add(separator_3);

		separator_4 = new JSeparator();
		separator_4.setBounds(610, 96, 105, 2);
		add(separator_4);

		separator_5 = new JSeparator();
		separator_5.setBounds(765, 96, 105, 2);
		add(separator_5);

		variable01 = new JTextField();
		variable01.setForeground(Color.CYAN);
		variable01.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		variable01.setBorder(null);
		variable01.setBackground(new Color(70, 130, 180));
		variable01.setBounds(15, 68, 95, 25);
		add(variable01);
		variable01.setColumns(10);

		variable02 = new JTextField();
		variable02.setForeground(Color.CYAN);
		variable02.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		variable02.setBorder(null);
		variable02.setBackground(new Color(70, 130, 180));
		variable02.setBounds(162, 68, 95, 25);
		add(variable02);
		variable02.setColumns(10);

		variable03 = new JTextField();
		variable03.setForeground(Color.CYAN);
		variable03.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		variable03.setBorder(null);
		variable03.setBackground(new Color(70, 130, 180));
		variable03.setBounds(316, 68, 95, 25);
		add(variable03);
		variable03.setColumns(10);

		variable04 = new JTextField();
		variable04.setForeground(Color.CYAN);
		variable04.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		variable04.setBorder(null);
		variable04.setBackground(new Color(70, 130, 180));
		variable04.setBounds(470, 68, 95, 25);
		add(variable04);
		variable04.setColumns(10);

		variable05 = new JTextField();
		variable05.setForeground(Color.CYAN);
		variable05.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		variable05.setBorder(null);
		variable05.setBackground(new Color(70, 130, 180));
		variable05.setBounds(615, 68, 95, 25);
		add(variable05);
		variable05.setColumns(10);

		variable06 = new JTextField();
		variable06.setForeground(Color.CYAN);
		variable06.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		variable06.setBorder(null);
		variable06.setBackground(new Color(70, 130, 180));
		variable06.setBounds(770, 68, 96, 25);
		add(variable06);
		variable06.setColumns(10);

		variableOut01 = new JLabel();
		variableOut01.setHorizontalAlignment(SwingConstants.CENTER);
		variableOut01.setFont(new Font("標楷體", Font.PLAIN, 16));
		variableOut01.setBounds(10, 42, 105, 25);
		add(variableOut01);

		variableOut02 = new JLabel();
		variableOut02.setHorizontalAlignment(SwingConstants.CENTER);
		variableOut02.setFont(new Font("標楷體", Font.PLAIN, 16));
		variableOut02.setBounds(155, 42, 105, 25);
		add(variableOut02);

		variableOut03 = new JLabel();
		variableOut03.setHorizontalAlignment(SwingConstants.CENTER);
		variableOut03.setFont(new Font("標楷體", Font.PLAIN, 16));
		variableOut03.setBounds(307, 42, 105, 25);
		add(variableOut03);

		variableOut04 = new JLabel();
		variableOut04.setHorizontalAlignment(SwingConstants.CENTER);
		variableOut04.setFont(new Font("標楷體", Font.PLAIN, 16));
		variableOut04.setBounds(460, 42, 105, 25);
		add(variableOut04);

		variableOut05 = new JLabel();
		variableOut05.setHorizontalAlignment(SwingConstants.CENTER);
		variableOut05.setFont(new Font("標楷體", Font.PLAIN, 16));
		variableOut05.setBounds(610, 42, 105, 25);
		add(variableOut05);

		variableOut06 = new JLabel();
		variableOut06.setHorizontalAlignment(SwingConstants.CENTER);
		variableOut06.setFont(new Font("標楷體", Font.PLAIN, 16));
		variableOut06.setBounds(765, 42, 105, 25);
		add(variableOut06);

		operator01 = new JTextField("");
		operator01.setForeground(new Color(127, 255, 212));
		operator01.setBackground(new Color(70, 130, 180));
		operator01.setHorizontalAlignment(SwingConstants.CENTER);
		operator01.setFont(new Font("Dialog", Font.PLAIN, 16));
		operator01.setBounds(122, 68, 27, 25);
		add(operator01);

		operator02 = new JTextField("");
		operator02.setForeground(new Color(127, 255, 212));
		operator02.setBackground(new Color(70, 130, 180));
		operator02.setFont(new Font("Dialog", Font.PLAIN, 16));
		operator02.setHorizontalAlignment(SwingConstants.CENTER);
		operator01.setFont(new Font("新細明體", Font.BOLD, 14));
		operator02.setBounds(267, 69, 27, 25);
		add(operator02);

		operator03 = new JTextField("");
		operator03.setForeground(new Color(127, 255, 212));
		operator03.setBackground(new Color(70, 130, 180));
		operator03.setFont(new Font("Dialog", Font.PLAIN, 16));
		operator03.setHorizontalAlignment(SwingConstants.CENTER);
		operator01.setFont(new Font("新細明體", Font.BOLD, 14));
		operator03.setBounds(421, 68, 27, 25);
		add(operator03);

		operator04 = new JTextField("");
		operator04.setForeground(new Color(127, 255, 212));
		operator04.setBackground(new Color(70, 130, 180));
		operator04.setFont(new Font("Dialog", Font.PLAIN, 16));
		operator04.setHorizontalAlignment(SwingConstants.CENTER);
		operator01.setFont(new Font("新細明體", Font.BOLD, 14));
		operator04.setBounds(575, 68, 27, 25);
		add(operator04);

		operator05 = new JTextField("");
		operator05.setForeground(new Color(127, 255, 212));
		operator05.setBackground(new Color(70, 130, 180));
		operator05.setFont(new Font("Dialog", Font.PLAIN, 16));
		operator05.setHorizontalAlignment(SwingConstants.CENTER);
		operator05.setBounds(726, 68, 27, 25);
		add(operator05);

		reault = new JLabel("");
		reault.setForeground(Color.CYAN);
		reault.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
		reault.setHorizontalAlignment(SwingConstants.CENTER);
		reault.setBounds(137, 103, 644, 23);
		add(reault);

		JLabel lblNewLabel = new JLabel("結果為:");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		lblNewLabel.setBounds(71, 103, 56, 23);
		add(lblNewLabel);

		button = new JButton("計算");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		button.setBackground(new Color(127, 255, 212));
		button.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		button.setBounds(797, 107, 103, 25);
		add(button);

		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(133, 126, 626, 2);
		add(separator_6);

		JLabel label = new JLabel(" 請選擇已新增的計算公式 : ");
		label.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		label.setBounds(540, 15, 197, 25);
		add(label);

	}

	public void comboboxAction(String id) {
		Connection con = null;
		ResultSet rs = null;
		try {
			con = DbConnection.getConnection();
			rs = DbConnection.actionComboBox(con, id);
			variableOut01.setText(rs.getString("variable01"));
			variableOut02.setText(rs.getString("variable02"));
			variableOut03.setText(rs.getString("variable03"));
			variableOut04.setText(rs.getString("variable04"));
			variableOut05.setText(rs.getString("variable05"));
			variableOut06.setText(rs.getString("variable06"));
			operator01.setText(rs.getString("operator01").trim());
			operator02.setText(rs.getString("operator02").trim());
			operator03.setText(rs.getString("operator03").trim());
			operator04.setText(rs.getString("operator04").trim());
			operator05.setText(rs.getString("operator05").trim());
			reault.setText("");
			variable01.setText("");
			variable02.setText("");
			variable03.setText("");
			variable04.setText("");
			variable05.setText("");
			variable06.setText("");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbConnection.close(con);
			DbConnection.close(rs);
		}
	}

	public void addComboBoxItem(JComboBox<String> comboBox) {
		Connection con = null;
		ResultSet rs = null;
		try {
			con = DbConnection.getConnection();
			rs = DbConnection.selectComboBox(con);
			while (rs.next()) {
				comboBox.addItem(rs.getString("id") + ". " + rs.getString("functionname"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbConnection.close(con);
			DbConnection.close(rs);
		}

	}

	public void addComboBoxSingleItem(String item) {
		comboBox.addItem(item);
	}

	public void removeComboboxSelectItem(Object selectItem) {
		comboBox.removeItem(selectItem);
	}

	public void addCalculationListener(ActionListener actionListener) {
		button.addActionListener(actionListener);
	}

	public void setResult(String resault) {
		reault.setText(resault);
	}
}
