/**
*專案名稱 : FinancialFunction 
*	套件名稱 : tw.com.code_edit.financialfunction.view
*	建立時間 : Aug 21, 2018 8:08:45 PM
*	<h6>@author  : Wayne		E-mail : a0922015135@gmail.com</h6>
*	<h6>@version : 1.0</h6>
*	TODO : 
*/
package tw.com.code_edit.financialfunction.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import tw.com.code_edit.financialfunction.SQLite.DbConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class MainPage extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CalculationJPanel calculationPanel;
	public ListPanel listPanel;

	/**
	 * Create the frame.
	 */
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		try {
			Connection con = DbConnection.getConnection();
			DbConnection.createTable(con);
			DbConnection.createOperatorTable(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JPanel contentPane = new JPanel();
		getContentPane().setLayout(null);
		setBounds(100, 100, 948, 695);
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("code by Wayne~");
		lblNewLabel.setBounds(818, 641, 140, 25);
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);

		calculationPanel = new CalculationJPanel();
		listPanel = new ListPanel(calculationPanel);
		CreatJPanel createPanel = new CreatJPanel(calculationPanel, listPanel);

		listPanel.setBounds(10, 10, 922, 341);
		contentPane.add(listPanel);

		calculationPanel.setBounds(10, 495, 922, 152);
		contentPane.add(calculationPanel);

		createPanel.setBounds(10, 353, 922, 138);
		contentPane.add(createPanel);

		setTitle("Wayne Wung的小程式工具");
	}
}
