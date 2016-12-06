package JavaCool303;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * 
 * @author Anurag Kalra
 * 
 * Implementation of a "push" button.
 * 
 */
public class Cool303Button extends JButton{	
	public Cool303Button(int label){
		super(Integer.toString(label));
		this.addActionListener(new
				ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						System.out.println(label);	//Cool303Button class has String field label
					}
				});
	}
}
