package GUI.Trials;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Beginnerr extends JFrame {

	Font font = new Font("Monospace", Font.BOLD, 25);
	JPanel added = formPanel();//using one method to create for different JPanels

	JButton createButton(String text) {

		JButton btn1 = new JButton(text);
//			btn1.setText(text);
		btn1.setToolTipText("Click here to login...");
		btn1.setFocusable(false);
		btn1.setBackground(Color.black);
		btn1.setForeground(Color.yellow);

		btn1.setFont(font);
		btn1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));

		return btn1;

	}

	JLabel createLabel(String text) {
		JLabel label = new JLabel(text);
		label.setForeground(Color.red);
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);

		return label;
	}

	JTextField createTextField(String defaultText) {
		JTextField fNameField = new JTextField(defaultText, 15);
		fNameField.setFont(font);
		fNameField.setBackground(Color.black);
		fNameField.setForeground(Color.yellow);
		fNameField.setCaretColor(Color.green);

		return fNameField;
	}

	JPanel formPanel() {
		JPanel formPanel = new JPanel();
		formPanel.setBorder(BorderFactory.createLineBorder(Color.black, 10, true));
		formPanel.setBackground(Color.pink);
		GridLayout gl = new GridLayout();
		formPanel.setLayout(gl);
		gl.setColumns(2);
		gl.setRows(2);
		gl.setHgap(40);
		gl.setVgap(10);

		return formPanel;

	}
	
	JPanel CenterPanel() {
		JPanel CenterPanel = new JPanel();
		CenterPanel.setBackground(Color.green);
		CenterPanel.add(added);
		add(CenterPanel, BorderLayout.CENTER);
		
		return CenterPanel;

	}


	public Beginnerr() {

		super("FIRST GUI");
		super.setFont(font);

		FlowLayout fl = new FlowLayout();
		BorderLayout bl = new BorderLayout();
		setLayout(bl);

		JButton btn1 = createButton("Button 1 text");

		JButton btn2 = createButton("Button 2 text");
//		add(btn2);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.orange);
		add(buttonPanel, BorderLayout.SOUTH);
		buttonPanel.add(btn1);
		buttonPanel.add(btn2);
		

		JPanel added = formPanel();//using one method to create for different JPanels
		
		CenterPanel();//putting the form at the center
		
		JLabel fname = createLabel("First-Name");
		added.add(fname);

		JTextField fNameField = createTextField("First-Name-Field");

		added.add(fNameField);

		JLabel lname = createLabel("Last-Name");
		added.add(lname);

		JTextField lNameField = createTextField("Last-Name-Field");
		lNameField.setText("New-Field");
		added.add(lNameField);

		JButton btn3 = createButton("Button 3 text");
		buttonPanel.add(btn3);

		JLabel title = createLabel("Simple Java Swing");
		add(title, BorderLayout.NORTH);

		setVisible(true);
		getContentPane().setBackground(Color.pink);
		setResizable(true);
		setDefaultCloseOperation(Beginnerr.EXIT_ON_CLOSE);
//			setSize(450, 350);
		pack();
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new Beginnerr();

	}

}
