import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Inst extends JFrame implements ActionListener {
    JButton b1, b2;
    String user;

    Inst(String user) {
        this.user = user;
        setBounds(0, 0, 800, 650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel l1 = new JLabel("Welcome " + user + " to GUESS IT ?");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 35));
        l1.setBounds(100, 20, 700, 30);
        add(l1);

        JLabel l2 = new JLabel("");
        l2.setBounds(60, 40, 700, 450);
        l2.setFont(new Font("Times New Roman", Font.BOLD, 25));

        l2.setText("<html>" + "1: There are total 10 question in this quiz related to entertainment field" + "<br><br>"
                + "2: You will get 12 second to answer the question" + "<br><br>"
                + "3:Each question carry 10 points.No negative marking" + "<br><br>" + "4: Auto submission is present"
                + "<br><br>" + "5: Click on Start button to move to the quiz." + "<br><br>"
                + "6: Dont click on refresh or close window" + "<br><br>" + "<html>");
        add(l2);

        b1 = new JButton("Back");
        b1.setBounds(170, 500, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.RED);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(530, 500, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.RED);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bacg1.jpg"));
        Image im = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(im);
        JLabel lj1 = new JLabel(i2);
        lj1.setBounds(0, 0, 1200, 600);
        add(lj1);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
            new test().setVisible(true);
        } else if (ae.getSource() == b2) {

            this.setVisible(false);
            new Main(user).setVisible(true);

        }

    }

    public static void main(String[] args) {
        Inst ob = new Inst("");
    }

}
