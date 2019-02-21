/*
 * KKSU.Studio &copy;
 */
package view.panel.model;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;

import javax.swing.JScrollPane;

import javax.swing.ScrollPaneConstants;

import listener.TimeCardListSelection;
import ocptool.OcpFontStyle;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019.2.16, PM 2:39:37<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public abstract class ManagePanel extends JPanel {
	protected JLabel lblMain;
	protected JLabel lblSecond;
	protected JScrollPane scrollPanelMain;
	protected JScrollPane scrollPaneSecond;
	public OcpFontStyle F = OcpFontStyle.getIt();
	
	protected JList<String> mainList;
	protected JList<String> secondList;
	
	protected String[] mainListName = {
			"ListName01",
			"ListName02",
			"ListName03",
			"ListName04",
			"ListName05",
			"ListName06",
			"ListName07",
			"ListName08",
			"ListName09",
			"ListName10",
			"ListName11",
			"ListName12",
			"ListName13",
			"ListName14",
			"ListName15",
			"ListName16",
			"ListName17",
			"ListName18",
			"ListName19",
			"ListName20"};
	
	/**
	 * Create the panel.
	 */
	public ManagePanel() {
		setLayout(null);
		
		lblMain = new JLabel("Main Info");
		lblMain.setFont(F.fTextP10());
		lblMain.setBounds(10, 5, 254, 15);
		add(lblMain);
		
		lblSecond = new JLabel("Second Info");
		lblSecond.setFont(F.fTextP10());
		lblSecond.setBounds(287, 5, 223, 15);
		add(lblSecond);
		
		
		secondList = new JList<String>();
		secondList.setFont(F.fTextP14());
		
		scrollPaneSecond = new JScrollPane(secondList);
		scrollPaneSecond.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneSecond.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneSecond.setBounds(287, 21, 223, 314);
		add(scrollPaneSecond);
		
		mainList = new JList<String>(mainListName);
		mainList.setFont(F.fTextP14());
//		mainList.addListSelectionListener(listener);
		
		scrollPanelMain = new JScrollPane(mainList);
		scrollPanelMain.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanelMain.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPanelMain.setBounds(10, 21, 254, 314);
		add(scrollPanelMain);
		
		

	}

	public JLabel getLblMain() {
		return lblMain;
	}

	public void setLblMain(JLabel lblMain) {
		this.lblMain = lblMain;
	}

	public JLabel getLblSecond() {
		return lblSecond;
	}

	public void setLblSecond(JLabel lblSecond) {
		this.lblSecond = lblSecond;
	}

	public JScrollPane getScrollPanelMain() {
		return scrollPanelMain;
	}

	public void setScrollPanelMain(JScrollPane scrollPanelMain) {
		this.scrollPanelMain = scrollPanelMain;
	}

	public JScrollPane getScrollPaneSecond() {
		return scrollPaneSecond;
	}

	public void setScrollPaneSecond(JScrollPane scrollPaneSecond) {
		this.scrollPaneSecond = scrollPaneSecond;
	}

	public JList<String> getMainList() {
		return mainList;
	}

	public void setMainList(JList<String> mainList) {
		this.mainList = mainList;
	}

	public JList<String> getSecondList() {
		return secondList;
	}

	public void setSecondList(JList<String> secondList) {
		this.secondList = secondList;
	}

	public String[] getMainListName() {
		return mainListName;
	}

	public void setMainListName(String[] mainListName) {
		this.mainListName = mainListName;
	}
	
	
}
