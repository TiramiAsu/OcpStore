/**
*專案名稱 : FinancialFunction 
*	套件名稱 : tw.com.code_edit.financialfunction.view
*	建立時間 : 2018年8月22日 上午12:50:24
*	<h6>@author  : Wayne		E-mail : a0922015135@gmail.com</h6>
*	<h6>@version : 1.0</h6>
*	TODO : 
*/
package tw.com.code_edit.financialfunction.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;
import tw.com.code_edit.financialfunction.SQLite.DbConnection;
import javax.swing.border.TitledBorder;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.Font;

public class ListPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable itemList;
	private ResultSet rs;
	private Connection con;
	private JComboBox<String> ccomboBox;

	/**
	 * Create the panel.
	 */
	public ListPanel(CalculationJPanel calculationJPanel) {
		setBackground(new Color(70, 130, 180));
		setBorder(new TitledBorder(null, "\u6B77\u53F2\u65B9\u7A0B\u5F0F", TitledBorder.LEADING, TitledBorder.TOP, null,
				null));
		setLayout(null);
		JButton btnNewButton = new JButton("重新整理");
		btnNewButton.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(127, 255, 212));
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				show();
			}
		});
		btnNewButton.setBounds(809, 301, 103, 25);
		add(btnNewButton);

		ccomboBox = new JComboBox<String>();
		ccomboBox.setBounds(10, 304, 160, 25);
		try {
			con = DbConnection.getConnection();
			rs = DbConnection.selectComboBox(con);
			while (rs.next()) {
				ccomboBox.addItem(rs.getString("id") + ". " + rs.getString("functionname"));
			}
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			DbConnection.close(con);
			DbConnection.close(rs);
		}
		add(ccomboBox);

		JButton btnNewButton_1 = new JButton("移除方程式");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					con = DbConnection.getConnection();
					DbConnection.deleteComboBox(con, ccomboBox.getSelectedItem().toString().substring(0, 3));
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					DbConnection.close(con);
				}
				removeComboboxItem(calculationJPanel);
			}
		});
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.PLAIN, 16));
		btnNewButton_1.setBackground(new Color(127, 255, 212));
		btnNewButton_1.setBounds(180, 304, 126, 25);
		add(btnNewButton_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 20, 902, 274);
		add(scrollPane);

		itemList = new JTable();
		itemList.setFont(new Font("新細明體", Font.PLAIN, 12));
		scrollPane.setViewportView(itemList);

		show();
	}

	public void show() {
		try {
			con = DbConnection.getConnection();
			rs = DbConnection.getRsList(con);
			itemList.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbConnection.close(con);
			DbConnection.close(rs);
		}
	}

	public void addComboboxSingleItem(String item) {
		ccomboBox.addItem(item);
	}

	public void removeComboboxItem(CalculationJPanel calculationJPanel) {
		calculationJPanel.comboBox.removeItem(ccomboBox.getSelectedItem());
		ccomboBox.removeItem(ccomboBox.getSelectedItem());
	}

}