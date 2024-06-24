import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CharCount extends JFrame implements ActionListener {
    JLabel lb1, lb2;
    JTextArea t1;
    JButton b1;

    JButton pad, text;

    CharCount() {

        super("CHARACTER WORD COUNT TOOL");
        lb1 = new JLabel("Character:");
        lb1.setBounds(50, 50, 100, 20);
        lb2 = new JLabel("Word:");
        lb2.setBounds(50, 80, 100, 20);

        t1 = new JTextArea();
        JScrollPane ta = new JScrollPane(t1);
        ta.setBounds(50, 110, 300, 200);

        b1 = new JButton("Count");
        b1.setBounds(50, 320, 80, 30);
        b1.addActionListener(this);

        pad = new JButton("Pad Color");
        pad.setBounds(140, 320, 100, 30);
        pad.addActionListener(this);

        text = new JButton("Text color");
        text.setBounds(260, 320, 100, 30);
        text.addActionListener(this);

        add(lb1);
        add(lb2);
        add(ta);
        add(b1);
        add(pad);
        add(text);

        setSize(450, 450);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBackground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String text = t1.getText();
            lb1.setText("CHARACTER: " + text.length());
            String words[] = text.split("\\s+");
            lb2.setText("WORDS: " + words.length);
        } else if (e.getSource() == pad) {
            Color c;
            c = JColorChooser.showDialog(this, "choose color", Color.BLACK);
            t1.setBackground(c);

        } else if (e.getSource() == text) {
            Color c;
            c = JColorChooser.showDialog(this, "choose color", Color.BLACK);
            t1.setForeground(c);
        }
    }
    public static void main(String[] args) {
        new CharCount();
    }
}


