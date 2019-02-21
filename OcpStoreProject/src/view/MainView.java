/*
 * KKSU.Studio &copy;
 */
package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ocptool.ISetEnture;
import ocptool.OcpFontStyle;
import view.panel.CustomersLoginPanel;
import view.panel.EmployeesLoginPanel;
import view.panel.ManagerManagePanel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Project: OcpStoreProject.view<br>
 * Time: 2019.2.21, AM 2:03:44<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class MainView extends JFrame implements ISetEnture{

	private JPanel contentPane;
	
	private EmployeesLoginPanel panelE;
	private CustomersLoginPanel panelC;
	private ManagerManagePanel panelM;
	
	private JButton btnLoginDefault;
	private JButton btnEmployeesLogin;
	private JButton btnCustomersLogin;
	private JButton btnMealDefualt;
	private JButton btnManageDefault;
	
	private OcpFontStyle F = OcpFontStyle.getIt();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
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
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		btnLoginDefault = new JButton("LoginDefault");
		btnLoginDefault.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getSelectButton(btnLoginDefault);
				getVisiablePanel(panelE);
			}
		});
		btnLoginDefault.setBounds(177, 10, 146, 23);
		btnLoginDefault.setFont(F.setIt("bold",12));
		contentPane.add(btnLoginDefault);
		
		btnEmployeesLogin = new JButton("EmployeesLogin");
		btnEmployeesLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getSelectButton(btnEmployeesLogin);
				getVisiablePanel(panelE);
			}
		});
		btnEmployeesLogin.setBounds(216, 43, 107, 23);
		btnEmployeesLogin.setFont(F.fTextP10());
		contentPane.add(btnEmployeesLogin);
		
		btnCustomersLogin = new JButton("CustomersLogin");
		btnCustomersLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getSelectButton(btnCustomersLogin);
				getVisiablePanel(panelC);
			}
		});
		btnCustomersLogin.setBounds(216, 76, 107, 23);
		btnCustomersLogin.setFont(F.fTextP10());
		contentPane.add(btnCustomersLogin);
		
		btnManageDefault = new JButton("ManageDefault");
		btnManageDefault.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getSelectButton(btnManageDefault);
				getVisiablePanel(panelM);
			}
		});
		btnManageDefault.setBounds(514, 10, 146, 23);
		btnManageDefault.setFont(F.fTextP10());
		contentPane.add(btnManageDefault);
		
		btnMealDefualt = new JButton("MealDefualt");
		btnMealDefualt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMealDefualt.setBounds(350, 10, 146, 23);
		btnMealDefualt.setFont(F.fTextP10());
		contentPane.add(btnMealDefualt);
		
	// Login Panel
		panelE = new EmployeesLoginPanel();
		panelE.btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelE.setBounds(177, 111, 770, 400);
		contentPane.add(panelE);
		
		panelC = new CustomersLoginPanel();
		panelC.setBounds(177, 111, 770, 400);
		contentPane.add(panelC);
		panelC.setVisible(false);
		
	// Manager Panel
		panelM = new ManagerManagePanel();
		panelM.setBounds(177, 111, 770, 400);
		contentPane.add(panelM);
		panelM.setVisible(false);
		
		
	}
	
	@Override
	public void getVisiablePanel(JPanel showPanel) {
		
		boolean boolpanelE = false;
		boolean boolpanelC = false;
		boolean boolpanelM = false;
		
		if(showPanel instanceof EmployeesLoginPanel) {
			boolpanelE = true;
		}else if(showPanel instanceof CustomersLoginPanel) {
			boolpanelC = true;
		}else if(showPanel instanceof ManagerManagePanel) {
			boolpanelM = true;
		}
		
		panelE.setVisible(boolpanelE);
		panelC.setVisible(boolpanelC);
		panelM.setVisible(boolpanelM);
	}
	
	@Override
	public void getSelectButton(JButton showBtn) {
		
		// all set original Font
		btnLoginDefault.setFont(F.fTextP10());
		btnEmployeesLogin.setFont(F.fTextP10());
		btnCustomersLogin.setFont(F.fTextP10());
		btnManageDefault.setFont(F.fTextP10());
		btnMealDefualt.setFont(F.fTextP10());
		
		// using Text identify
		String[] box = {
				btnLoginDefault.getText(),
				btnEmployeesLogin.getText(),
				btnCustomersLogin.getText(),
				btnManageDefault.getText(),
				btnMealDefualt.getText()
		};
		
		// set it
		for(String s:box) {
			if(showBtn.getText().equals(s)) {
				showBtn.setFont(F.setIt("bold",12));
			}
		}
		
	}
	
}
