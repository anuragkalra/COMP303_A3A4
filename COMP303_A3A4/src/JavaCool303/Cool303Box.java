package JavaCool303;

import java.awt.Component;

import javax.swing.JFrame;

/**
 * 
 * @author Anurag Kalra
 *
 * The Box container is a container where Components and Containers populate it. The box
 * is fancy and follows the selected theme, and it does not have a title or any other text, but
 * it does display all the items within the boxed area. The box will auto size itself to the
 * minimum size needed to display all the components if the user does not specify a size. If
 * the user of box defines a size the box will attempt to follow that request if it is sufficient
 * to display all the components. If it is not big enough then the automatic sizing option is
 * automatically initiated overriding the user’s specified size.
 * 
 */

public class Cool303Box extends Cool303Container{
	private Cool303Theme theme;
	private JFrame frame;
	private int width = 100;
	private int height = 100;
	
	public Cool303Box(Cool303Theme theme){
		frame = new JFrame();
		frame.setSize(this.width, this.height);
		frame.setLayout(layout);
		this.theme = theme;
	}
	
	public Cool303Box(Cool303Theme theme, int width, int height){
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setLayout(layout);
		this.theme = theme;
		this.width = width;
		this.height = height;
	}	
	
	public void add(Cool303Button b){
		System.out.println("add1");
		this.getFrame().add(b);
	}
	
	/**
	public Component add(Component c){
		System.out.println("add2");
		this.getFrame().add(c);
		return null;
	}
	*/
	
	public void add(Cool303Container c){
		this.getFrame().add(c);
	}
	
	public JFrame getFrame(){
		return this.frame;
	}
	
	public void setVisible(boolean b){
		frame.setVisible(b);
	}
	
}
