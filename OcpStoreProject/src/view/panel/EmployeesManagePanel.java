/*
 * KKSU.Studio &copy;
 */
package view.panel;

import listener.InfoListSelection;
import view.panel.model.ManagePanel;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019.2.16, AM 2:39:37<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class EmployeesManagePanel extends ManagePanel {
	
	private String[] thisList = {
			"EA006-Peter",
			"EA011-Sam",
			"EB008-Mary",
			"EB009-Kitty",
			"EC013-Bob",
			"ED001-Cano",
			"EF022-Sandy",
			"EE085-Mummy",
			"EE088-Max",
			"EG030-Eric",
			"EG041-Tirami",
			"EJ029-Peggy",
			"EJ033-Lisa",
			"EK040-Sonic",
			"EL022-John",
			"EL031-Jimmy",
			"EM066-Frank",
			"EO077-Robin",
			"ES015-Victor",
			"EX085-Puppy"};

	/**
	 * Create the panel.
	 */
	public EmployeesManagePanel() {
		super();
		
		// flash Data
		mainList.setListData(thisList);
		lblMain.setText("All Employees");
		lblSecond.setText("Employee Info");
		
		// add Listener
		mainList.addListSelectionListener(new InfoListSelection(mainList,secondList));
		
	}
}


