package JavaCool303;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

/**
 * 
 * @author Anurag Kalra
 * 
 * A testing class used to analyze JavaCool303 library.
 * 
 */
public class Cool303Tester {

	public static void main(String[] args) {
		JButton button1 = new JButton("test");
		button1.setBackground(Color.GREEN);
		button1.setForeground(Color.RED);
		button1.setBorder(new EtchedBorder());
		
		JButton button2 = new JButton("test");
		button2.setBackground(Color.ORANGE);
		button2.setForeground(Color.BLUE);
		button2.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		
		JButton button3 = new JButton("test");
		button3.setBackground(Color.YELLOW);
		button3.setForeground(Color.MAGENTA);
		button3.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 5, Color.red));
		
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
