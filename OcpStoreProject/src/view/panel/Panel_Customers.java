/*
 * KKSU.Studio &copy;
 */
package view.panel;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.factory.VoFactoryDao;
import dao.impl.CustomersDaoImpl;
import vo.customers.Customers;

/**
 * Project: view.panelOCP_OrderSystem
 * time: 2018年12月23日,下午9:49:58
 * @author: KKSU
 * E-mail: @gmail.com
 * @version: 1.0
 * TODO
 */
public class Panel_Customers extends Panel_Model {

	/**
	 * Create the panel.
	 */
	public Panel_Customers() {
		btnExecute.setLocation(520, 470);
		textField_10.setLocation(493, 392);
		textField_09.setLocation(493, 317);
		textField_08.setLocation(493, 242);
		textField_07.setLocation(493, 167);
		textField_06.setLocation(493, 92);
		lblColumn_10.setSize(131, 40);
		lblColumn_09.setSize(131, 40);
		lblColumn_08.setSize(131, 40);
		lblColumn_07.setSize(131, 40);
		lblColumn_06.setSize(131, 40);
		lblColumn_10.setLocation(356, 392);
		lblColumn_09.setLocation(356, 317);
		lblColumn_08.setLocation(356, 242);
		lblColumn_07.setLocation(356, 167);
		lblColumn_06.setLocation(356, 92);
		textField_04.setLocation(174, 317);
		textField_03.setLocation(174, 242);
		textField_02.setLocation(174, 167);
		lblColumn_04.setLocation(37, 317);
		lblColumn_03.setLocation(37, 242);
		lblColumn_02.setLocation(37, 167);
		lblColumn_05.setSize(131, 40);
		lblColumn_04.setSize(131, 40);
		lblColumn_03.setSize(131, 40);
		lblColumn_02.setSize(131, 40);
		lblColumn_01.setSize(131, 40);
		textField_01.setSize(155, 40);
		lblColumn_05.setLocation(37, 392);
		lblColumn_01.setLocation(37, 92);
		textField_01.setLocation(174, 92);
		textField_05.setLocation(174, 392);
		textField_10.setEnabled(false);
		textField_09.setEnabled(false);
		textField_08.setEnabled(false);
		textField_07.setEnabled(false);
		textField_06.setEnabled(false);
		lblColumn_10.setEnabled(false);
		lblColumn_09.setEnabled(false);
		lblColumn_08.setEnabled(false);
		lblColumn_07.setEnabled(false);
		lblColumn_06.setEnabled(false);
		lblTitle.setText("Insert Customers");
		lblColumn_01.setText("Code: ");
		lblColumn_02.setText("Name: ");
		lblColumn_03.setText("Phone: ");
		lblColumn_04.setText("Bouns Point:");
		lblColumn_05.setText("Remark:");
		lblColumn_06.setText("Column 1");
	}

	@Override
	public void executeBotten() {
		//	讀取 textField
		String code   = textField_01.getText().trim(); // trim 去字串的首尾空格
		String name   = textField_02.getText().trim();
		String phone  = textField_03.getText().trim();
		   int point  = Integer.parseInt(textField_04.getText().trim());
		String remark = textField_05.getText().trim();
		
		try {
			//	由 Factory 建立 DaoImpl 物件給 Dao 接口
			CustomersDaoImpl idao = VoFactoryDao.getCustomers();
					
			//	建構 customer object
			Customers c = Customers.create();
			c.setCustomers(code,name,phone,point,remark);

		
			//	將 customer object 寫入資料庫
			idao.insert(c);
			
			//	顯示完成資訊
			JOptionPane.showMessageDialog(null, String.format("Insert %s-%s Success!!",code,name), "Information", 2);
			
			//	執行完清除資料，讓使用者輸入下一筆
			textField_01.setText("");
			textField_02.setText("");
			textField_03.setText("");
			textField_04.setText("");
			textField_05.setText("");
			
		}catch(Exception e){
			System.out.println("Error: "+e.toString());
		}

	}
}
