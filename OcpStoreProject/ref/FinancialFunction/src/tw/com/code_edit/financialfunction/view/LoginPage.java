/**
*專案名稱 : FinancialFunction 
*	套件名稱 : tw.com.code_edit.financialfunction.view
*	建立時間 : 2019年2月17日 下午11:13:02
*	<h6>@author  : Wayne		E-mail : a0922015135@gmail.com</h6>
*	<h6>@version : 1.0</h6>
*	TODO : 
*/
package tw.com.code_edit.financialfunction.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("帳號 :");
		label.setFont(new Font("新細明體", Font.PLAIN, 18));
		label.setBounds(72, 66, 46, 25);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("密碼 :");
		label_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		label_1.setBounds(72, 101, 83, 25);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(163, 68, 220, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(163, 104, 220, 23);
		contentPane.add(textField_1);
		
		JButton button = new JButton("登入");
		button.setBounds(235, 193, 87, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("註冊");
		btnNewButton.setBounds(95, 193, 87, 23);
		contentPane.add(btnNewButton);
	}
}
