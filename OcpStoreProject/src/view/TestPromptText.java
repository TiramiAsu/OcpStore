/*
 * KKSU.Studio &copy;
 */
package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.panel.CustomersLoginPanel;
import view.panel.EmployeesLoginPanel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

/**
 * Project: OcpStoreProject.view<br>
 * Time: 2019年2月16日, 上午12:01:43<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class TestPromptText extends JFrame {

	private JPanel contentPane;
	private JButton btnEmployeesPanel;
	private JButton btnCustomersPanel;
	private CustomersLoginPanel CPanel;
	private EmployeesLoginPanel EPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestPromptText frame = new TestPromptText();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestPromptText() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		EPanel = new EmployeesLoginPanel();
		EPanel.setBounds(22, 47, 770, 400);
		contentPane.add(EPanel);
		
		CPanel = new CustomersLoginPanel();
		CPanel.setBounds(22, 47, 770, 400);
		contentPane.add(CPanel);
		CPanel.setVisible(false);
		
		btnEmployeesPanel = new JButton("EmployeesLogin");
		btnEmployeesPanel.setFont(new Font("微軟正黑體", Font.BOLD, 12));
		btnEmployeesPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EPanel.setVisible(true);
				CPanel.setVisible(false);
				btnEmployeesPanel.setFont(new Font("微軟正黑體", Font.BOLD, 12));
				btnCustomersPanel.setFont(new Font("微軟正黑體", Font.PLAIN, 10));
			}
		});
		btnEmployeesPanel.setBounds(22, 14, 152, 23);
		contentPane.add(btnEmployeesPanel);
		
		btnCustomersPanel = new JButton("CustomersLogin");
		btnCustomersPanel.setFont(new Font("微軟正黑體", Font.PLAIN, 10));
		btnCustomersPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CPanel.setVisible(true);
				EPanel.setVisible(false);
				btnEmployeesPanel.setFont(new Font("微軟正黑體", Font.PLAIN, 10));
				btnCustomersPanel.setFont(new Font("微軟正黑體", Font.BOLD, 12));
			}
		});
		btnCustomersPanel.setBounds(184, 14, 152, 23);
		contentPane.add(btnCustomersPanel);
	}
}
