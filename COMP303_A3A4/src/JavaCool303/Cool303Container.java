package JavaCool303;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;

/**
 * 
 * @author Anurag Kalra
 * 
 * Components are individual units that are used to populate containers.
 * 
 * Containers store and display components in a fixed bounded area. 
 * But the bounded area cannot be seen. It is an invisible area; however 
 * the components can be seen. Containers can have an optional string. If 
 * this string is present, then the string is displayed as a title (in bold)
 * appearing at the top left corner of the container area. 
 * 
 */
public class Cool303Container extends Cool303Component{ // implements Cool303Component {
	private JPanel panel;
	private String label;
	protected LayoutManager layout = new BorderLayout();
	
	public Cool303Container(String label){
		panel = new JPanel();
		this.label = label;
	}
	
	public Cool303Container(){
		panel = new JPanel();
	}
	
	public void add(Cool303Component c){
		this.getPanel().add(c);
	}
	
	public JPanel getPanel(){
		return this.panel;
	}
}
