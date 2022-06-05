import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ss extends JFrame implements ActionListener {
    JLabel pic;
    Timer tm;
    JButton b1;
    int x = 0;
    String[] list = { "images/kimono.png", "images/hobbit.jpg", "images/mr.png", "images/mjd.png", "images/oscar.png",
            "images/gollum.png", "images/matx.png", "images/gf.jpg", "images/harry.png", "images/TH.png"

    };

    public ss() {
        super("Project SlideShow");
        pic = new JLabel();
        pic.setBounds(0, 0, 1000, 600);

        b1 = new JButton("Back");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.RED);
        b1.addActionListener(this);

        b1.setBounds(390, 500, 180, 40);
        add(b1);

        setImageSize(9);
        tm = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setImageSize(x);
                x += 1;
                if (x >= list.length) {
                    x = 0;

                    // new test();
                    // System.exit(0);
                }

            }

        });
        add(pic);
        tm.start();
        setLayout(null);
        setSize(1000, 600);
        getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            this.setVisible(false);
            new test();

        }
    }

    public void setImageSize(int i) {
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newimg);
        pic.setIcon(newImc);
    }

    public static void main(String[] args) {
        new ss();

    }

}
