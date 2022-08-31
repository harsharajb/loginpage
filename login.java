
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class login {
    private JPasswordField passwordField1;
    login()
    {
        JFrame f = new JFrame("LOGIN PAGE");
        f.setBounds(600,200,100,100);
        JLabel l1 = new JLabel("Enter your email :");
        l1.setBounds(100, 100, 150, 30);
        JLabel l2 = new JLabel("Enter your password   :");
        l2.setBounds(100, 160, 150, 30);
        JTextField jtf= new JTextField();
        jtf.setBounds(100, 130, 200, 30);
        JPasswordField jpf1 = new JPasswordField();
        jpf1.setBounds(100, 190, 200, 30);
        JButton b = new JButton("Login");
        b.setBounds(100, 240, 200, 30);
        Button rb=new Button("Forgot password..?");
        rb.setBounds(100,280,200,20);
        rb.setForeground(Color.red);
        JButton b1 = new JButton("Sign up");
        b1.setBounds(100, 350, 200, 30);
        JLabel l3 = new JLabel("------------------ OR ------------------ ");
        l3.setBounds(115, 310, 200, 20);
        f.add(l1);
        f.add(l2);
        f.add(jtf);
        f.add(jpf1);
        f.add(b);
        f.add(rb);
        f.add(b1);
        f.add(l3);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JFrame f1= new JFrame("Create account");
                f1.setBounds(600,200,100,100);
                JLabel l4 = new JLabel("Enter first name :");
                l4.setBounds(100, 100, 200, 30);
                JLabel l5 = new JLabel("Enter last name :");
                l5.setBounds(100, 160, 150, 30);
                JLabel l6 = new JLabel("Create password :");
                l6.setBounds(100, 220, 150, 30);
                JTextField jtf1= new JTextField();
                jtf1.setBounds(100, 130, 200, 30);
                JTextField jtf2 = new JTextField();
                jtf2.setBounds(100, 190, 200, 30);
                JTextField jtf3= new JTextField();
                jtf3.setBounds(100, 250, 200, 30);
                JButton b2 = new JButton("Create");
                b2.setBounds(100, 310, 200, 30);
                JLabel l7 = new JLabel();
                l7.setBounds(50, 350, 300, 30);
                f1.add(l4);
                f1.add(l5);
                f1.add(l6);
                f1.add(jtf1);
                f1.add(jtf2);
                f1.add(jtf3);
                f1.add(b2);
                f1.add(l7);
                f1.setSize(400, 500);
                f1.setLayout(null);
                f1.setVisible(true);
                b2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        l7.setText(jtf1.getText()+ " " +jtf2.getText()+" your account is successfully created");
                    }
                });
            }
        });
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JFrame f2 = new JFrame("login....");
                f2.setBounds(600,200,100,100);
                JLabel l8 = new JLabel( "WELCOME " + jtf.getText());

                l8.setBounds(130, 190, 200, 20);
                f2.add(l8);
                f2.setSize(400, 500);
                f2.setLayout(null);
                f2.setVisible(true);
            }
        });

        rb.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JFrame f3 = new JFrame("Reset password....");
                f3.setBounds(600, 200, 100, 100);
                JLabel l9 = new JLabel("New Password :");
                l9.setBounds(100, 100, 120, 30);
                JLabel l10 = new JLabel("Confirm password :");
                l10.setBounds(100, 160, 120, 30);
                JTextField jtf4 = new JTextField();
                jtf4.setBounds(100, 130, 200, 30);
                JTextField jtf5 = new JTextField();
                jtf5.setBounds(100, 190, 200, 30);
                JButton b3 = new JButton("Set password");
                b3.setBounds(100, 250, 200, 30);
                JLabel l11 = new JLabel();
                l11.setBounds(150, 290, 200, 20);
                f3.add(l9);
                f3.add(l10);
                f3.add(jtf4);
                f3.add(jtf5);
                f3.add(b3);
                f3.add(l11);
                f3.setSize(400, 500);
                f3.setLayout(null);
                f3.setVisible(true);
                b3.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        l11.setText("Successfully set...");
                    }
                });
            }
        });
    }
    public static void main(String[] args)
    {
        new login();
    }
}
