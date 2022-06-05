import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    public int score;

    Score(String user, int score) {
        this.score = score;
        setBounds(0, 0, 800, 800);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/score.png"));
        Image im = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(im);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(150, 0, 500, 300);
        add(l1);

        JLabel l2 = new JLabel("Thanks " + user + " for Playing ");

        l2.setForeground(Color.GRAY);
        l2.setBounds(280, 310, 500, 150);
        l2.setFont(new Font("Tahoma", Font.BOLD, 25));

        add(l2);

        JLabel l3 = new JLabel("Your Score is :  " + score);
        l3.setForeground(Color.GRAY);
        l3.setBounds(280, 400, 500, 100);
        l3.setFont(new Font("Tahoma", Font.BOLD, 25));

        add(l3);

        JButton b1 = new JButton("Once More");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.RED);
        b1.addActionListener(this);

        b1.setBounds(290, 550, 180, 40);
        add(b1);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("bacg2.jpg"));
        Image img = ic.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon ic2 = new ImageIcon(img);
        JLabel lj = new JLabel(ic2);
        lj.setBounds(0, 0, 800, 800);
        add(lj);

    }

    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        new test().setVisible(true);
    }

    public static void main(String[] args) {
        new Score("", 0).setVisible(true);
    }

}
