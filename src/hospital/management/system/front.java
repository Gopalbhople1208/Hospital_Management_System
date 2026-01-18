package hospital.management.system;  // ✅ fixed spelling of "system"

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class front extends JFrame implements ActionListener {

    private JTextField textField;
    private JPasswordField jPasswordField;
    private JButton b1, b2;

    public void front() {
        setTitle("Jay Hospital Management System");

        // 🩺 Header label
        JLabel name = new JLabel("🏥 Jay Hospital Management System", SwingConstants.CENTER);
        name.setFont(new Font("Segoe UI", Font.BOLD, 26));
        name.setForeground(new Color(33, 150, 243)); // Blue accent
        name.setBounds(0, 30, 650, 40);
        add(name);

        // 🧭 Login title
        JLabel title = new JLabel("User Login", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 22));
        title.setForeground(new Color(0, 77, 64)); // Teal green
        title.setBounds(0, 100, 650, 30);
        add(title);

        // 👤 Username label + field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        userLabel.setBounds(130, 200, 100, 30);
        add(userLabel);

        textField = new JTextField();
        textField.setBounds(250, 200, 250, 30);
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        textField.setBorder(BorderFactory.createLineBorder(new Color(33, 150, 243), 1, true));
        add(textField);

        // 🔒 Password label + field
        JLabel passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        passLabel.setBounds(130, 270, 100, 30);
        add(passLabel);

        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(250, 270, 250, 30);
        jPasswordField.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        jPasswordField.setBorder(BorderFactory.createLineBorder(new Color(33, 150, 243), 1, true));
        add(jPasswordField);

        // 🎨 Buttons with hover effects
        b1 = new JButton("Login");
        b1.setBounds(200, 370, 100, 35);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 15));
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(33, 150, 243));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder());
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(350, 370, 100, 35);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 15));
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(244, 67, 54)); // Red
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder());
        add(b2);

        // ✨ Button hover effects
        addHoverEffect(b1, new Color(30, 136, 229), new Color(21, 101, 192));
        addHoverEffect(b2, new Color(229, 57, 53), new Color(211, 47, 47));

        // 📋 Background gradient
        JPanel background = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(0, 0,
                        new Color(224, 247, 250), 0, getHeight(),
                        new Color(178, 235, 242));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        setContentPane(background);
        setLayout(null);

        // ⚙️ Action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);

        // 🪟 Window settings
        setSize(650, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Hover color change effect
    private void addHoverEffect(JButton button, Color normal, Color hover) {
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button.setBackground(hover);
            }
            public void mouseExited(MouseEvent e) {
                button.setBackground(normal);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String username = textField.getText();
            String password = new String(jPasswordField.getPassword());

            if ("admin".equals(username) && "1234".equals(password)) {
                JOptionPane.showMessageDialog(this, "✅ Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "❌ Invalid Credentials", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(front::new);
    }
}



