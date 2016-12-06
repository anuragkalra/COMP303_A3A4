package JavaCool303;

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
	private int length;
	private int width;
	
	public Cool303Box(Cool303Theme theme){
		frame = new JFrame();
		this.theme = theme;
	}
	
	public Cool303Box(Cool303Theme theme, int length, int width){
		frame = new JFrame();
		this.theme = theme;
		this.length = length;
		this.width = width;
	}
	
}
