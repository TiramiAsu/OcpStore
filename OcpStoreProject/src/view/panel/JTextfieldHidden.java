/*
 * KKSU.Studio &copy;
 */
package view.panel;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019.2.15, AM 12:58:11<br><br>
 * @author clayanddev
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @see https://blog.csdn.net/clayanddev/article/details/53794070
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class JTextfieldHidden implements FocusListener {

	private String hiddenText;
	private JTextField inputText;
	
	String info;
    JTextField jtf;
    
	
//	public JTextfieldHidden(String hiddentext, JTextField inputtext) {
//		this.hiddenText = hiddentext;
//      this.inputText = inputtext;
    public JTextfieldHidden(String info, JTextField jtf) {
    	this.info = info;
	    this.jtf = jtf;
	    
//        inputtext.setForeground(Color.GRAY);
	}
	
	@Override
	public void focusGained(FocusEvent e) {
		String temp = jtf.getText();
        if(temp.equals(info)){
            jtf.setText("");
        }

	}

	@Override
	public void focusLost(FocusEvent e) {
        String temp = jtf.getText();
        if(temp.equals("")){
            jtf.setText(info);
        }
    }
}
