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
public class InfoListSelection implements ListSelectionListener{

	private int selectIndex;
	private JList<String> targetList;
	private JList<String> showList;
	
	public InfoListSelection(JList<String> targetList, JList<String> showList) {
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
			String[] i1 = {"Code | EA006","Name | Peter","Phone | 0930-555-555","Position | Manager","Remark | "};
			info = i1;
			break;
		case 1:
			String[] i2 = {"Code | EA011","Name | Sam","Phone | 0930-333-111","Position | Employee","Remark | Positive"};
			info = i2;
			break;
		}
		/* test END*/
		
		// close port
		
		return info;
	}


}
