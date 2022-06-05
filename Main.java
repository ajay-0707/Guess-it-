
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Image;
//import java.applet.*;

public class Main extends JFrame implements ActionListener {
    JButton next, submit;
    JLabel qn, que;
    String q[][] = new String[10][5];
    public static int count = 0;
    JRadioButton op1, op2, op3, op4;
    ButtonGroup options;
    public static int timer = 12;
    String pa[][] = new String[10][1];
    public static int ans_given = 0;
    String qa[][] = new String[10][2];
    public static int score = 0;
    String user;
    String qimg[] = new String[10];
    ImageIcon opi1;
    JLabel qi;

    Main(String user) {
        this.user = user;
        setBounds(0, 0, 1400, 800);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/gameintro.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1400, 200);
        add(l1);
        setVisible(true);

        qn = new JLabel("");
        qn.setFont(new Font("Tahoma", Font.PLAIN, 24));
        qn.setBounds(30, 230, 900, 60);
        add(qn);

        // opi1 = new ImageIcon(ClassLoader.getSystemResource(""));
        que = new JLabel("");
        que.setFont(new Font("Tahoma", Font.PLAIN, 24));
        que.setBounds(70, 230, 900, 60);
        add(que);

        qi = new JLabel("");
        qi.setFont(new Font("Tahoma", Font.PLAIN, 24));
        qi.setBounds(550, 250, 400, 400);
        add(qi);

        qimg[0] = "images/kimono.png";
        qimg[1] = "images/harry.png";
        qimg[2] = "images/oscar.png";
        qimg[3] = "images/TH.png";
        qimg[4] = "images/mr.png";
        qimg[5] = "images/matx.jpg";
        qimg[6] = "images/gollum.png";
        qimg[7] = "images/godf.jpg";
        qimg[8] = "images/holl.jpg";
        qimg[9] = "images/mjd.png";

        q[0][0] = "What is the name of this traditional garment, which is the national dress of Japan?";
        q[0][1] = "Ao dai";
        q[0][2] = "Hanbok";
        q[0][3] = "Kimono";
        q[0][4] = "Saree";

        q[1][0] = "This picture reminds you of which famous movie series?";
        q[1][1] = "Harry Potter";
        q[1][2] = "Van Helsing";
        q[1][3] = "Indiana Jones";
        q[1][4] = "Dracula Untold";

        q[2][0] = "Which Indian costume designer won an Oscar for their work on the film Gandhi in 1983?";
        q[2][1] = "Ritu Kumar";
        q[2][2] = "Ritu Beri";
        q[2][3] = "Bhanu Athaiya";
        q[2][4] = "Vaishali Kasaravalli";

        q[3][0] = "Guess! What is the name of this Hollywood Celebrity?";
        q[3][1] = "Tom Cruise";
        q[3][2] = "Tom Hanks";
        q[3][3] = "Michael Stahl-David";
        q[3][4] = "Tom Holland";

        q[4][0] = "What is the name of this Australian actress?";
        q[4][1] = "Scarlett Johnson";
        q[4][2] = "Margot Robbie";
        q[4][3] = "Taylor Swift";
        q[4][4] = "Dakota Johnson";

        q[5][0] = "The code in The Matrix comes from what food recipes?";
        q[5][1] = "Sushi recipes";
        q[5][2] = "Dumpling recipes";
        q[5][3] = "Stir-fry recipes";
        q[5][4] = "Pad thai recipes";

        q[6][0] = "Where were The Lord of the Rings movies filmed?";
        q[6][1] = "Ireland";
        q[6][2] = "Iceland";
        q[6][3] = "New Zealand";
        q[6][4] = "Australia";

        q[7][0] = "Who did the cat in The Godfather belong to?";
        q[7][1] = "Francis Ford Coppola";
        q[7][2] = "Diane Keaton";
        q[7][3] = "Al Pachino";
        q[7][4] = "No one—the cat was a stray";

        q[8][0] = "Michael Myers’ mask in Halloween is which actor’s face?";
        q[8][1] = "Clint Eastwood";
        q[8][2] = "Marlon Brando";
        q[8][3] = "Paul Newman";
        q[8][4] = "William Shatner";

        q[9][0] = "What comic book character did Michael Jackson wants to play?";
        q[9][1] = "Iron Man";
        q[9][2] = "Wolverine";
        q[9][3] = "Spider Man";
        q[9][4] = "Ant Man";

        /* answers */
        qa[0][1] = "Kimono";
        qa[1][1] = "Harry Potter";
        qa[2][1] = "Bhanu Athaiya";
        qa[3][1] = "Tom Hanks";
        qa[4][1] = "Margot Robbie";
        qa[5][1] = "Sushi recipes";
        qa[6][1] = "New Zealand";
        qa[7][1] = "No one—the cat was a stray";
        qa[8][1] = "William Shatner";
        qa[9][1] = "Spider Man";

        op1 = new JRadioButton("");
        op1.setBounds(30, 280, 400, 30);
        op1.setFont(new Font("Tahoma", Font.PLAIN, 24));
        op1.setBackground(Color.WHITE);
        add(op1);

        op2 = new JRadioButton("");
        op2.setBounds(30, 330, 400, 30);
        op2.setFont(new Font("Tahoma", Font.PLAIN, 24));
        op2.setBackground(Color.WHITE);
        add(op2);

        op3 = new JRadioButton("");
        op3.setBounds(30, 380, 400, 30);
        op3.setFont(new Font("Tahoma", Font.PLAIN, 24));
        op3.setBackground(Color.WHITE);
        add(op3);

        op4 = new JRadioButton("");
        op4.setBounds(30, 430, 400, 30);
        op4.setFont(new Font("Tahoma", Font.PLAIN, 24));
        op4.setBackground(Color.WHITE);
        add(op4);

        options = new ButtonGroup();
        options.add(op1);
        options.add(op2);
        options.add(op3);
        options.add(op4);

        next = new JButton("Next");
        next.setBounds(1100, 300, 100, 30);
        next.setFont(new Font("Tahoma", Font.PLAIN, 14));
        next.addActionListener(this);
        next.setBackground(Color.WHITE);
        add(next);

        submit = new JButton("Submit");
        submit.setBounds(1100, 350, 100, 30);
        submit.setEnabled(false);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 14));
        submit.addActionListener(this);
        submit.setBackground(Color.WHITE);
        add(submit);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("bacg1.jpg"));
        Image im = ii1.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(im);
        JLabel lj1 = new JLabel(i2);
        lj1.setBounds(0, 0, 1400, 800);
        add(lj1);

        start(0);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            repaint();
            ans_given = 1;
            if (options.getSelection() == null) {
                pa[count][0] = "";

            } else {
                pa[count][0] = options.getSelection().getActionCommand();

            }
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);

        } else if (e.getSource() == submit) {
            ans_given = 1;
            if (options.getSelection() == null) {
                pa[count][0] = "";

            } else {
                pa[count][0] = options.getSelection().getActionCommand();

            }
            for (int i = 0; i < pa.length; i++) {
                if (pa[i][0].equals(qa[i][1])) {
                    score += 10;

                }

            }
            this.setVisible(false);
            new Score(user, score).setVisible(true);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time Left - " + timer + "sec";
        g.setColor(Color.BLUE);
        g.setFont(new Font("Tahoma", Font.BOLD, 15));
        if (timer > 0) {
            g.drawString(time, 1110, 300);
        } else {
            g.drawString("Time's Up", 1100, 300);
        }
        timer--;
        try {
            Thread.sleep(1000);
            repaint();

        } catch (Exception e) {

        }
        if (ans_given == 1) {
            ans_given = 0;
            timer = 12;
        }

        else if (timer < 0) {
            timer = 12;
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) {
                if (options.getSelection() == null) {
                    pa[count][0] = "";

                } else {
                    pa[count][0] = options.getSelection().getActionCommand();

                }
                for (int i = 0; i < pa.length; i++) {
                    if (pa[i][0].equals(qa[i][1])) {
                        score += 10;

                    }

                }
                this.setVisible(false);
                new Score(user, score).setVisible(true);

            } else {
                if (options.getSelection() == null) {
                    pa[count][0] = "";

                } else {
                    pa[count][0] = options.getSelection().getActionCommand();

                }
                count++;
                start(count);

            }
        }
    }

    public void start(int count) {
        qn.setText("" + (count + 1) + ": ");

        // que.setText(q[count][0]);
        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource(qimg[count]));

        Image img = im.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(img);
        que.setText(q[count][0]);
        qi.setIcon(i2);

        op1.setLabel(q[count][1]);
        op1.setActionCommand(q[count][1]);
        op2.setLabel(q[count][2]);
        op2.setActionCommand(q[count][2]);

        op3.setLabel(q[count][3]);
        op3.setActionCommand(q[count][3]);
        op4.setLabel(q[count][4]);
        op4.setActionCommand(q[count][4]);
        options.clearSelection();

    }

    public static void main(String[] args) {
        new Main("");
    }

}
