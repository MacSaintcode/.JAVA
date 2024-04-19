package GUI.flagtrivia2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import GUI.createFrames;

public class GuiFlagTrivia extends createFrames {
    private JPanel guessing, keypad, key1, key2, key3, notify, center;
    private JLabel wordle, clues, words, word, img;
    private JButton a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, enter, delete;

    String[] arr_words = { "Nigeria", "canada", "Afghanistan", "Albania", "Algeria", "Andorra",
            "Angola", "Antarctica", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas",
            "Bahrain", "Bangladesh", "Barbados", "Belarus" };
    ImageIcon image;

    StringBuffer str_word;
    int rnd, index = 0, begin, fail,tries;
    Random rd;
    
    String hiddenWord, word2 = "", check,username,diffi;


    public GuiFlagTrivia(String diff) {
        diffi=diff;
        if (diff.equalsIgnoreCase("easy")||diff.equalsIgnoreCase("hard")) {
            tries=3;
        
        }else{
            tries=5;
        }
        center = new JPanel();
        center.setLayout(new GridLayout(2, 1));
        notify = new JPanel();
        notify.setLayout(new FlowLayout());
        wordle = new JLabel("Guess The Country?");
        wordle.setFont(new Font("Serif", Font.BOLD, 30));
        notify.add(wordle);

        guessing = new JPanel();
        GridBagConstraints gc1 = new GridBagConstraints();
        guessing.setLayout(new GridBagLayout());
        clues = new JLabel();
        clues.setFont(new Font("serif", Font.BOLD, 25));
        gc1.gridx = 5;
        gc1.gridy = 5;
        guessing.add(clues, gc1);
        clues.setSize(100, 0);
        word = new JLabel();
        word.setFont(new Font("Serif", Font.BOLD, 25));
        gc1.gridx = 5;
        gc1.gridy = 7;
        guessing.add(word, gc1);

        a = createButton("A");
        b = createButton("B");
        c = createButton("C");
        d = createButton("D");
        e = createButton("E");
        f = createButton("F");
        g = createButton("G");
        h = createButton("H");
        i = createButton("I");
        j = createButton("J");
        k = createButton("K");
        l = createButton("L");
        m = createButton("M");
        n = createButton("N");
        o = createButton("O");
        p = createButton("P");
        q = createButton("Q");
        r = createButton("R");
        s = createButton("S");
        t = createButton("T");
        u = createButton("U");
        v = createButton("V");
        w = createButton("W");
        x = createButton("X");
        y = createButton("Y");
        z = createButton("Z");
        enter = createButton("ENTER");
        delete = createButton("DELETE");

        keypad = new JPanel();
        GridBagConstraints gc = new GridBagConstraints();
        keypad.setLayout(new GridBagLayout());

        key1 = new JPanel();
        key1.setLayout(new FlowLayout());
        key1.add(q);
        key1.add(w);
        key1.add(e);
        key1.add(r);
        key1.add(t);
        key1.add(y);
        key1.add(u);
        key1.add(i);
        key1.add(o);
        key1.add(p);

        gc.gridx = 0;
        gc.gridy = 0;
        keypad.add(key1, gc);

        key2 = new JPanel();
        key2.setLayout(new FlowLayout());
        key2.add(a);
        key2.add(s);
        key2.add(d);
        key2.add(f);
        key2.add(g);
        key2.add(h);
        key2.add(i);
        key2.add(j);
        key2.add(k);
        key2.add(l);

        gc.gridx = 0;
        gc.gridy = 1;
        keypad.add(key2, gc);

        key3 = new JPanel();
        key3.setLayout(new FlowLayout());
        key3.add(delete);
        key3.add(z);
        key3.add(x);
        key3.add(c);
        key3.add(v);
        key3.add(b);
        key3.add(n);
        key3.add(m);
        key3.add(enter);

        gc.gridx = 0;
        gc.gridy = 2;
        keypad.add(key3, gc);

        rd = new Random();
        
        playGame();

        setLayout(new BorderLayout());
        add(notify, BorderLayout.NORTH);
        add(keypad, BorderLayout.SOUTH);
        add(center, BorderLayout.CENTER);

        setSize(800, 650);
        setVisible(true);

        enter.setEnabled(false);
        delete.setEnabled(false);
        addWindowListener(this);
        setTitle("Flag Trivia");
        setSize(900, 700);
        setDefaultCloseOperation(0);
        setLocationRelativeTo(null);
    }

    public void playGame() {
        begin = 0;
        rnd = rd.nextInt(arr_words.length);
        hiddenWord = arr_words[rnd].toUpperCase();

        center.removeAll();
        image = new ImageIcon(
                "C:/Users/Saintcoded/Documents/.JAVA/GUI/flagtrivia2/flags/" + hiddenWord + ".png");
        img = new JLabel(image);
        center.add(img);
        center.add(guessing);
        if (diffi.equalsIgnoreCase("easy")) {
            fail=0;
        }

        dashes();

        System.out.println(hiddenWord);
    }

    void dashes() {
        str_word = new StringBuffer();
        for (int i = 0; i < hiddenWord.length(); i++) {
            str_word.append("_  ");
        }
        word2 = "";
        

        word.setText(str_word.toString());
    }

    public void actionPerformed(ActionEvent e) {
        String letter = e.getActionCommand();
        delete.setEnabled(true);

        if (fail != tries) {
            if (letter.equals("DELETE")) {

                // Saintcoded Comment: disable delete button if there is no entry or entry was
                // deleted

                check = str_word.substring(0, 1);
                if (!(check.equals("_"))) {
                    begin--;
                    str_word.replace((begin * 3), ((begin * 3) + 1), "_");
                    check = str_word.substring(0, 1);
                    if (check.equals("_")) {
                        delete.setEnabled(false);
                    }
                }

            } else if (letter.equals("ENTER")) {
                String str = str_word.toString();
                str = str.replace(" ", "");
                if (hiddenWord.equals(str)) {
                    index++;
                    // int score = showScore(index);
                    playGame();
                    clues.setText(word2);
                } else {
                    for (int j = 0; j < str.length(); j++) {
                        if (hiddenWord.charAt(j) == str.charAt(j)) {
                            word2 += "*  ";
                        } else if (hiddenWord.contains(str.substring(j, j + 1))) {
                            word2 += "+  ";
                        } else {
                            word2 += "x  ";
                        }
                    }
                    fail++;
                    if (fail == tries) {
                        ended();
                    }
                    clues.setText(word2);
                    begin = 0;
                    dashes();
                    // clues.setText(word2);
                    enter.setEnabled(false);

                }
            } else {
                if ((str_word.substring(str_word.length() - 3, str_word.length() - 2).equals("_"))) {
                    str_word.replace((begin * 3), ((begin * 3) + 1), letter);
                    begin++;
                }
            }

            word.setText(str_word.toString());
            if (begin == hiddenWord.length()) {
                enter.setEnabled(true);
                // Saintcoded Comment: disable enter button if entry not equals to 5
            } else {
                enter.setEnabled(false);
            }

        } else {
            ended();
        }
    }

    void ended() {

        confirmExit();
    }

    public void confirmExit() {
        int n = JOptionPane.showConfirmDialog(this,
                "Sorry you have used all of your chances \n \n Do You Want Start New Game\n \n", "OPTION",
                JOptionPane.YES_NO_OPTION, 3);
        if (n == 1) {
            this.dispose();
            new menu(diffi);
        } else {
            fail = 0;
            playGame();
        }
    }

    // public int showScore(int value) {
    // int score = 0;
    // switch (value) {
    // case 0 ->
    // score = 30;
    // case 1 ->
    // score = 25;
    // case 2 ->
    // score = 20;
    // case 3 ->
    // score = 15;
    // case 4 ->
    // score = 10;
    // case 5 ->
    // score = 5;
    // }
    // return score;
    // }

    @Override
    public void windowClosing(WindowEvent e) {
        int n = JOptionPane.showConfirmDialog(this,
                "Are You Sure You Want To End Game \n \n All Progress Would Be Lost!\n\n",
                "OPTION",
                JOptionPane.YES_NO_OPTION, 3);
        if (n == 0) {
            this.dispose();
            new menu(diffi);
        }
    }
    @Override
    public void windowOpened(WindowEvent e) {
       username=JOptionPane.showInputDialog("Enter Player Name");
       if (username==null) {
        username="user";
        System.out.println(username);
       }
    }
}
