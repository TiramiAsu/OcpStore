/*
 * TiramiAsu.Studio &copy;
 *
 *
 *
 *
 */
package view.panel;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JList;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import ocptool.OcpFontStyle;
import view.panel.model.ProductMealPanel;

import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.SystemColor;

/**
 * Project: OcpStoreProject.view.panel.model<br>
 * Time   : 2019.2.22.PM 10:34:36<br><br>
 *
 * 
 *
 * @author  TiramiAsu (tiramisu0116@gmail.com)
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class MealPanel extends JPanel {

	private JPanel panel;
	private ProductMealPanel[] icon = new ProductMealPanel[26];
	
	private JScrollPane scrollPane;
	private JPanel panelMain;
	private JList<String> mealList;
	private JButton btnExpand;
	private JPanel panelSecond;
	
	private String[] colName = {"Item", "Value"};
	private Object[][] colData = {
			{"Code","P015"},
			{"Quantity",2},
			{"Remark","include pork"}
	};
	
	public OcpFontStyle F = new OcpFontStyle();
	private JLabel lblCodefromDB;
	private JLabel lblName;
	private JLabel lblQuantity;
	private JTextField txtQuantity;
	private JLabel lblRemark;
	private JTextArea textAreaRemark;
	
	/**
	 * Create the panel.
	 */
	public MealPanel() {
		setLayout(null);
		setBackground(new Color(1,139,139));
		
		panelMain = new JPanel();
		panelMain.setBounds(591, 28, 111, 110);
//		add(panelMain);
		
		scrollPane = new JScrollPane(panelMain);
		panelMain.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel = new JPanel();
		panelMain.add(panel);
		panel.setPreferredSize(new Dimension(450, 1150));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		for(int i=1 ; i<25 ; i++) {
			
			icon[i] = new ProductMealPanel();
			icon[i].setPreferredSize(new Dimension(130, 130));
			icon[i].addMyListener(icon[i]);
			panel.add(icon[i]);
			
		}
		scrollPane.setBounds(-32, -22, 462, 472);
		panel.setBackground(new Color(0, 139, 139));
		scrollPane.setBackground(new Color(0, 139, 139));
		panelMain.setBackground(new Color(0, 139, 139));
		add(scrollPane);
		
		panelSecond = new JPanel();
		panelSecond.setBounds(741, -1, 30, 402);
		panelSecond.setBackground(new Color(1,139,139));
		add(panelSecond);
		panelSecond.setLayout(null);
		
		btnExpand = new JButton();
		btnExpand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int threshold = 77;
				
				if(panelSecond.getBounds().width>threshold) {
					int moveDimension = panelSecond.getBounds().width-btnExpand.getBounds().width;
					
					panelSecond.setBounds(
							panelSecond.getBounds().x+moveDimension-10,
							panelSecond.getBounds().y,
							panelSecond.getBounds().width-moveDimension+10,
							panelSecond.getBounds().height);
					
					btnExpand.setIcon(new ImageIcon(MealPanel.class.getResource("/imgs/ArrowA2.png")));
				}else {
					panelSecond.setBounds(521, -1, 250, 401);
					
					btnExpand.setIcon(new ImageIcon(MealPanel.class.getResource("/imgs/ArrowA1.png")));
					
				}
			}
		});
		btnExpand.setBounds(0, 160, 20, 40);
		btnExpand.setIcon(new ImageIcon(MealPanel.class.getResource("/imgs/ArrowA2.png")));
		btnExpand.setFont(new Font("新細明體", Font.BOLD, 13));
		btnExpand.setPreferredSize(new Dimension(20, 40));
		panelSecond.add(btnExpand);
		
		String[] dataList = {"hamburger1","hamburger2"};
		mealList = new JList<String>();
		mealList.setListData(dataList);
		
		JScrollPane scrollPane2 = new JScrollPane(mealList);
		scrollPane2.setBounds(20, 0, 230, 402);
		panelSecond.add(scrollPane2);
		
		JPanel panelMealOrder = new JPanel();
		panelMealOrder.setPreferredSize(new Dimension(200,500));
		panelMealOrder.setBackground(Color.white);
		panelMealOrder.setLayout(null);
		
		JLabel lblicon = new JLabel("");
		lblicon.setBounds(42, 13, 138, 100);
		lblicon.setHorizontalAlignment(SwingConstants.CENTER);
		lblicon.setBackground(Color.WHITE);
		lblicon.setIcon(new ImageIcon(MealPanel.class.getResource("/imgs/hamburger.png")));
		lblicon.setPreferredSize(new Dimension(120, 100));
		panelMealOrder.add(lblicon);
		
		JLabel lblprice = new JLabel("$49");
		lblprice.setBounds(42, 110, 138, 50);
		lblprice.setHorizontalAlignment(SwingConstants.CENTER);
		lblprice.setPreferredSize(new Dimension(150,50));
		lblprice.setFont(F.setIt(36));
		panelMealOrder.add(lblprice);
		
		lblName = new JLabel("Name:");
		lblName.setBounds(27, 165, 65, 30);
		lblName.setFont(F.setIt("bold",14));
		lblName.setPreferredSize(new Dimension(90,30));
		panelMealOrder.add(lblName);
		
		lblCodefromDB = new JLabel("Burger-chicken");
		lblCodefromDB.setBounds(104, 165, 121, 30);
		lblCodefromDB.setFont(F.setIt("bold",14));
		lblCodefromDB.setPreferredSize(new Dimension(90,30));
		panelMealOrder.add(lblCodefromDB);
		
		lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(27, 200, 65, 30);
		lblQuantity.setFont(F.setIt("bold",14));
		lblQuantity.setHorizontalAlignment(SwingConstants.LEFT);
		lblQuantity.setPreferredSize(new Dimension(90,30));
		panelMealOrder.add(lblQuantity);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(104, 202, 121, 25);
		panelMealOrder.add(txtQuantity);
		txtQuantity.setText("1");
		txtQuantity.setColumns(10);
		
		lblRemark = new JLabel("Remark:");
		lblRemark.setBounds(27, 235, 180, 30);
		lblRemark.setFont(F.setIt("bold",14));
		lblRemark.setPreferredSize(new Dimension(180,30));
		panelMealOrder.add(lblRemark);
		
		textAreaRemark = new JTextArea();
		textAreaRemark.setBackground(SystemColor.inactiveCaptionBorder);
		textAreaRemark.setFont(F.fTextP14());
		textAreaRemark.setBounds(27, 270, 180, 90);
		textAreaRemark.setPreferredSize(new Dimension(180,90));
		textAreaRemark.setText("Include pork");
		panelMealOrder.add(textAreaRemark);
		panelMealOrder.setBounds(478, 13, 240, 374);
		add(panelMealOrder);
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}
}
