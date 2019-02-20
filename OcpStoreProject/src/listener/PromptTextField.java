/*
 * KKSU.Studio &copy;
 */
package listener;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JTextField;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019.2.15, AM 12:58:11<br><br>
 * 
 * {@link listener.PromptTextField PromptTextField}
 * 
 * <p>Setting the prompt text function in JTextField.
 * 
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class PromptTextField implements MouseListener {

	/**
	 * Set prompt text.
	 */
	private String prompttext;
	
	/**
	 * The Listener target for this JTextFeild Object.
	 */
	private JTextField inputtext;
	
	public PromptTextField(String prompttext, JTextField inputtext) {
		this.prompttext = prompttext; // default text
		this.inputtext = inputtext;
		inputtext.setText(this.prompttext);
		inputtext.setForeground(Color.GRAY);
	}

	/**
	 * When user click for input the message, the default text disappear.
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		if(inputtext.getText().equals(prompttext)) {
			inputtext.setText("");
			inputtext.setForeground(Color.BLACK);
		}
	}
	
	/**
	 * When user not input in this JTextField, the default text display.
	 */
	@Override
	public void mouseEntered(MouseEvent e) {
		if(inputtext.getText().equals("")) {
			inputtext.setText(prompttext);
			inputtext.setForeground(Color.GRAY);
		}
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
