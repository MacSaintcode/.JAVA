package saintcoded;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Combo extends JFrame implements ActionListener {

    JComboBox Itemize;
    JTextField name;
    Font font = new Font("Sans Seriff", Font.BOLD, 20);

    void Combo() {
        JPanel centerpanel = new JPanel();
        centerpanel.setBackground(Color.black);
        add(centerpanel);

        GridLayout gl = new GridLayout(2, 2);
        gl.setVgap(10);
        centerpanel.setLayout(gl);

        centerpanel.add(createlabel("Fullname:"));

        name = createtextfield();
        centerpanel.add(name);
        
        centerpanel.add(createlabel("Options:"));

        String ard[] = {"jsns", "rjshjrk"};

        Itemize = createcombobox(ard);
        centerpanel.add(Itemize);
        
        JPanel southpanel=new JPanel();
        southpanel.setBackground(Color.GRAY);
        add(southpanel,BorderLayout.SOUTH);
        
        southpanel.add(createbutton("Submit"));
        southpanel.add(createbutton("Reset"));
        
        

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("ComboRumble");
        pack();
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    JLabel createlabel(String txt) {
        JLabel label = new JLabel(txt);
        label.setFont(font);
        label.setForeground(Color.yellow);
        label.setHorizontalAlignment(JLabel.CENTER);

        return label;
    }

    JTextField createtextfield() {
        JTextField text = new JTextField();
        text.setFont(font);
        text.setForeground(Color.yellow);
        text.setHorizontalAlignment(JLabel.CENTER);

        return text;
    }

    JComboBox createcombobox(String arr[]) {
        JComboBox box = new JComboBox(arr);
        box.setFont(font);
        box.setForeground(Color.yellow);
        box.setForeground(Color.yellow);

        return box;
    }
    
    JButton createbutton(String txt) {
        JButton btn = new JButton(txt);
        btn.setFont(font);
        btn.setForeground(Color.yellow);
        btn.setForeground(Color.yellow);
        btn.setFocusable(false);
        btn.addActionListener(this);
        
        return btn;
    }

    public static void main(String[] args) {
        new Combo();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }

}
