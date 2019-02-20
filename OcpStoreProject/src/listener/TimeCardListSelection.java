/*
 * KKSU.Studio &copy;
 */
package listener;

import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019.2.20, PM 11:59:43<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class TimeCardListSelection implements ListSelectionListener{

	private int selectIndex;
	private JList<String> targetList;
	private JList<String> showList;
	
	public TimeCardListSelection(JList<String> targetList, JList<String> showList) {
		this.targetList = targetList;
		this.showList = showList;
	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		selectIndex = targetList.getSelectedIndex();
		showList.setListData(getDBinfo(selectIndex));
	}

	public String[] getDBinfo(int selectIndex) {
		
		// connection Database
		// using SQL select Employee Name
		String[] info = {};
		
		/* test it*/
		switch(selectIndex) {
		case 0:
			String[] i1 = {
					"Code | EA006",
					"Name | Peter",
					"-------------------",
					"GoTime: 19/02/01 07:33 AM",
					"OffTime: 19/02/01 12:07 PM",
					"GoTime: 19/02/01 13:28 PM",
					"OffTime: 19/02/01 18:23 PM",
					"GoTime: 19/02/02 07:24 AM",
					"OffTime: 19/02/02 12:01 PM",
					"GoTime: 19/02/02 13:41 PM",
					"OffTime: 19/02/02 18:54 PM",
					"...","...","..."};
			info = i1;
			break;
		case 1:
			String[] i2 = {
					"Code | EA011",
					"Name | Sam",
					"-------------------",
					"GoTime: 19/02/03 07:22 AM",
					"OffTime: 19/02/03 11:55 PM",
					"GoTime: 19/02/03 14:01 PM",
					"OffTime: 19/02/03 19:12 PM",
					"GoTime: 19/02/04 07:10 AM",
					"OffTime: 19/02/04 12:22 PM",
					"GoTime: 19/02/04 13:15 PM",
					"OffTime: 19/02/04 19:01 PM",
					"...","...","..."};
			info = i2;
			break;
		}
		/* test END*/
		
		// close port
		
		return info;
	}


}
