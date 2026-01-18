

package hospital.management.system;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField textField;
    JPasswordField jPasswordField;
    JButton b1, b2;

    public Login() {

        // Title Label
      //  JLabel name = new JLabel("Jay Hospital Management System");
        //name.setBounds(110, 48, 800, 25);
        //name.setFont(new Font("Tahoma", Font.BOLD, 25));
        //add(name);

        // Login Label
        JLabel loginLabel = new JLabel("Login");
        loginLabel.setBounds(365, 58, 100, 30);
        loginLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
        add(loginLabel);

        // Username Label
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(75, 150, 100, 30);
        usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(usernameLabel);

        // Password Label
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(75, 250, 100, 30);
        passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(passwordLabel);

        // Username Field
        textField = new JTextField();
        textField.setBounds(180, 150, 350, 30);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField.setBackground(Color.WHITE);
        add(textField);

        // Password Field
        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(180, 250, 350, 30);
        jPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jPasswordField.setBackground(Color.WHITE);
        add(jPasswordField);

        // Login Button
        b1 = new JButton("Login");
        b1.setBounds(200, 350, 120, 30);
        b1.setFont(new Font("Tahoma", Font.BOLD, 15));
        b1.addActionListener(this);
        add(b1);

        // Cancel Button
        b2 = new JButton("Cancel");
        b2.setBounds(400, 350, 120, 30);
        b2.setFont(new Font("Tahoma", Font.BOLD, 15));
        b2.addActionListener(this);
        add(b2);




        // Frame Settings
        setUndecorated(true);
      //  getContentPane().setBackground(new Color(7, 218, 199));
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 780, 540);
      // System.out.println("H");
        panel.setBackground(new Color(7, 218, 199));
        add(panel);
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/9870333.png"));
        Image image1 = imageIcon.getImage().getScaledInstance(750, 530, Image.SCALE_SMOOTH);
        JLabel label1 = new JLabel(new ImageIcon(image1));
        label1.setBounds(350,250,925,550);



        panel.add(label1);
        setSize(925, 550);
        setLocation(350, 250);
        setLayout(null);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                conn c = new conn();
                String user = textField.getText();
                String pass = new String(jPasswordField.getPassword()); // fixed here

                String q = "select * from login where ID = '" + user + "' and PW = '" + pass + "'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if (resultSet.next()) {
                    new Reception(); // You must have a 'test' class defined
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

