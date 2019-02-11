/*
 * KKSU.Studio &copy;
 */
package _ModelTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;

/**
 * Project: viewOCP_OrderSystem
 * time: 2018年12月24日,上午9:25:36
 * @author: KKSU
 * E-mail: @gmail.com
 * @version: 1.0
 * TODO
 */
public class AirTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AirTest frame = new AirTest();
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
	public AirTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(96, 10, 107, 86);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 71, 86);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(10, 116, 145, 25);
		contentPane.add(splitPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(165, 116, 84, 25);
		contentPane.add(tabbedPane);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(20, 151, 135, 37);
		contentPane.add(toolBar);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(175, 151, 107, 61);
		contentPane.add(layeredPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 229, 154, 116);
		contentPane.add(desktopPane);
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setBounds(185, 224, 145, 121);
		contentPane.add(internalFrame);
		internalFrame.setVisible(true);
	}
}
