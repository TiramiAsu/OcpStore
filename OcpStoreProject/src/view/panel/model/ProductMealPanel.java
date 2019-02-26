/*
 * TiramiAsu.Studio &copy;
 *
 *
 *
 *
 */
package view.panel.model;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;

import view.panel.MealPanel;

/**
 * Project: OcpStoreProject.view.panel.model<br>
 * Time   : 2019.2.22.PM 10:54:24<br><br>
 *
 * 
 *
 * @author  TiramiAsu (tiramisu0116@gmail.com)
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class ProductMealPanel extends JPanel {

	
	/**
	 * Create the panel.
	 */
	public ProductMealPanel() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MealPanel.class.getResource("/imgs/hamburger.png")));
		lblNewLabel.setBounds(15, 10, 100, 100);
		add(lblNewLabel);
		
		JLabel lblHamburger = new JLabel("Hamburger");
		lblHamburger.setHorizontalAlignment(SwingConstants.CENTER);
		lblHamburger.setBounds(0, 90, 130, 30);
		add(lblHamburger);
		

	}
	
	public void addMyListener(ProductMealPanel MP) {
		MP.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				MP.setBackground(Color.white);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				MP.setBackground(Color.yellow);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
	}
}
