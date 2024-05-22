package GUI.Trials;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JButton;


public class Beginner /*extends JFrame*/ {
	Font font = new Font("Monospace", Font.BOLD, 25);
	
	Beginner(){
//		System.out.println("Start");
		JFrame frame = new JFrame(/*"New Any String"*/);
		frame.setTitle("New Any String");
		frame.setFont(font);
		FlowLayout f1 = new FlowLayout();
		BorderLayout b1 = new BorderLayout();
		frame.setLayout(b1);
		
		
		JButton btn1 = createButton();
		btn1.setText("Button 1 Text!");
		frame.add(btn1);
		
		
		
		
		
		
		
		
		JButton btn2 = createButton();
		btn2.setText("Button 2 Text!");
		frame.add(btn2);
		
		
		
		
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("End");
		frame.setSize(300,350);
//		frame.setTitle("Any String");
//		frame.setLocation(300, 200);
		frame.setLocationRelativeTo(null);
	}
	
	
	static JButton createButton() {
		JButton btn1 = new JButton();
		btn1.setText("My Button Text!");
		btn1.setToolTipText("Click here to login...");
		btn1.setFocusable(true);
		btn1.setBackground(Color.black);
		btn1.setForeground(Color.yellow);
		return btn1;
		
	}

	
	public static void main(String[] args) {
		
		new Beginner();
//		
	}
	
}



