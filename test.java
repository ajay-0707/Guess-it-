import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.Image;

public class test extends JFrame implements ActionListener {
    JButton b1, b2, b3;
    JTextField t1;

    test() {
        setBounds(0, 0, 1200, 600);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l2 = new JLabel("GUESS IT ?");
        l2.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        l2.setForeground(Color.GRAY);
        l2.setBounds(480, 50, 300, 45);
        add(l2);

        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        l3.setForeground(Color.GRAY);
        l3.setBounds(500, 200, 300, 45);
        add(l3);

        t1 = new JTextField();
        t1.setBounds(450, 250, 300, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);

        b1 = new JButton("Instructions");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.RED);
        b1.setBorderPainted(true);
        b1.setBounds(380, 350, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Exit");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.RED);
        b2.setBorderPainted(true);
        b2.setBounds(540, 480, 100, 40);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("SlideShow");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.RED);
        b3.setBorderPainted(true);
        b3.setBounds(700, 350, 150, 40);
        b3.addActionListener(this);
        add(b3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bacg1.jpg"));
        Image im = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(im);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(0, 0, 1200, 600);
        add(l1);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String name = t1.getText();
            this.setVisible(false);
            new Inst(name);

        } else if (ae.getSource() == b3)

        {
            this.setVisible(false);
            new ss();

        } else {
            System.exit(0);

        }

    }

    public static void main(String[] args) {
        test ob = new test();
    }

}
