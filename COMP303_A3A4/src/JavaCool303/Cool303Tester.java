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
		method2();
	}

	public static void method1(){
		JButton button1 = new JButton("test");
		button1.setBackground(Color.GREEN);
		button1.setForeground(Color.RED);
		//button1.setBorder(new EtchedBorder());
		
		JButton button2 = new JButton("test");
		button2.setBackground(Color.ORANGE);
		button2.setForeground(Color.BLUE);
		button2.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		
		JButton button3 = new JButton("test");
		button3.setBackground(Color.YELLOW);
		button3.setForeground(Color.MAGENTA);
		//button3.setBorder(BorderFactory.createMatteBorder(1, 5, 1, 5, Color.red));
		button3.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
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
	
	public static void method2(){
		Cool303Box box1 = new Cool303Box(new Winter());
		box1.getFrame().setLayout(new FlowLayout());
		
		Cool303Button cbutton1 = new Cool303Button(12);
		
		//creating button1
		JButton button1 = new JButton("test");
		button1.setBackground(Color.BLACK);
		button1.setForeground(Color.CYAN);
		
		
		Cool303Container container = new Cool303Container();
		
		Cool303Button cbutton2 = new Cool303Button(12323);
		Cool303Button cbutton3 = new Cool303Button(333);
		container.add(cbutton2);
		container.add(cbutton3);
		
		box1.add(container);
		
		//adding buttons
		//box1.add(cbutton1);
		//box1.add(button1);
		
		
		box1.getFrame().setLocationRelativeTo(null);
		box1.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		box1.getFrame().pack();
		box1.setVisible(true);
	}
}
