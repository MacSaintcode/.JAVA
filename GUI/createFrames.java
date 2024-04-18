package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class createFrames extends JFrame implements ActionListener, WindowListener ,ItemListener{
    Font font = new Font("Seriff", Font.BOLD, 20);

    public JLabel createLabel(String txt) {
        JLabel label = new JLabel(txt);
        label.setFont(font);
        label.setForeground(new Color(125, 89, 100));
        label.setHorizontalAlignment(JLabel.CENTER);

        return label;
    }

    public JTextField createTextField() {
        JTextField txtField = new JTextField(50);
        txtField.setFont(font);
        txtField.setCaretColor(Color.CYAN);

        return txtField;
    }

    public JButton createButton(String txt) {
        JButton btn = new JButton(txt);
        btn.setFont(font);
        btn.setFocusable(false);
        btn.addActionListener(this);
        setSize(10, 10);
        return btn;
    }

    public JButton createButton(String txt, Font font) {
        JButton btn = new JButton(txt);
        btn.setFont(font);
        btn.setFocusable(false);
        btn.addActionListener(this);
        setSize(10, 10);
        return btn;
    }

    public JRadioButton createradio(String txt, Font font){
        JRadioButton btn=new JRadioButton(txt);
        btn.setFont(font);
        btn.setFocusable(false);
        btn.addActionListener(this);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }
}
