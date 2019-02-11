/*
 * KKSU.Studio &copy;
 */
package _ModelTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.panel.Panel_Customers;
import view.panel.Panel_Model;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

/**
 * Project: viewOCP_OrderSystem
 * time: 2018年12月23日,下午6:30:27
 * @author: KKSU
 * E-mail: @gmail.com
 * @version: 1.0
 * TODO
 */
public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnInsert;
	private JButton btnUpdate;
	private JButton btnSelect;
	private JPanel mainPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("OrderSystem");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		mainPanel = new JPanel();
		mainPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, null));
		mainPanel.setBounds(23, 42, 800, 450);
		contentPane.add(mainPanel);

		
				
		btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_Customers PanelInsert = new Panel_Customers();
				PanelInsert.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, null));
				PanelInsert.setBounds(23, 42, 800, 450);
				contentPane.add(PanelInsert);
				
			}
		});
		btnInsert.setBounds(23, 21, 110, 23);
		contentPane.add(btnInsert);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.setBounds(133, 21, 110, 23);
		contentPane.add(btnUpdate);
		
		btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSelect.setBounds(243, 21, 110, 23);
		contentPane.add(btnSelect);
	}
}
