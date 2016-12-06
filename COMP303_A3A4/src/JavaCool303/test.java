package JavaCool303;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author Anurag Kalra
 *	
 * A simple test class to visualize the correct GUI using classical JavaFX library calls.
 * 
 */
public class test {

	public static void main(String[] args) {
		
		JPanel panel = new JPanel(new GridLayout(4, 5));
		
		for(int i = 1; i < 21; i++){
			String num = Integer.toString(i);
			JButton button = new JButton(num);
			button.addActionListener(new
					ActionListener(){
						public void actionPerformed(ActionEvent arg0) {
							System.out.println(num);
						}
				});
			panel.add(button);
		}
		
		JFrame frame = new JFrame();
		frame.add(panel);
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info :  javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
			        break;
			    }
			}
		}catch(Exception e){
			
		}
		
		frame.pack();
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
