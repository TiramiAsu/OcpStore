/*
 * KKSU.Studio &copy;
 */
package ocptool;
import java.awt.Font;

/**
 * Project: OcpStoreProject.view.panel<br>
 * Time: 2019.2.19, PM 11:20:52<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public class OcpFontStyle {
	
	// For System Message
	public Font fSystemI12() {
		return new Font("微軟正黑體", Font.ITALIC, 12);
	}
	
	// For Title: Plain 20
	public Font fTitleP20() {
		return new Font("微軟正黑體", Font.PLAIN, 20);
	}
	
	// Default Style for this Project
	public Font fDefaultP16() {
		return new Font("微軟正黑體", Font.PLAIN, 16);
	}
	
	// For Text: Plain 14
	public Font fTextP14() {
		return new Font("微軟正黑體", Font.PLAIN, 14);
	}
	
	// For Text: Plain 12
	public Font fTextP12() {
		return new Font("微軟正黑體", Font.PLAIN, 12);
	}
	
	// For Text: Plain 10
	public Font fTextP10() {
		return new Font("微軟正黑體", Font.PLAIN, 10);
	}
	
	
	
	// Setting for style and size 
	public Font setIt(String style, int size) {
		
		int fontStyle = 0;
		
		switch (style) {
		case "plain":
			fontStyle = 0;
			break;
		case "bold":
			fontStyle = 1;
			break;
		case "italic":
			fontStyle = 2;
			break;
		}
		return new Font("微軟正黑體", fontStyle, size);
	}
	
	// Setting for style
	public Font setIt(String style) {
		
		int fontStyle = 0;
		
		switch (style.toLowerCase()) {
		case "plain":
			fontStyle = 0;
			break;
		case "bold":
			fontStyle = 1;
			break;
		case "italic":
			fontStyle = 2;
			break;
		}
		return new Font("微軟正黑體", fontStyle, 16);
	}
	
	// Setting for size 
	public Font setIt(int size) {
		return new Font("微軟正黑體", Font.PLAIN, size);
	}
		

}
