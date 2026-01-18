package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class new_patient extends JFrame implements ActionListener {

    JComboBox<String> jComboBox;
    JTextField jTextFieldNumber, textName, textFieldDisease, textFieldDeposite;
    JRadioButton r1, r2, r3;
    Choice c1;
    JLabel date;
    JButton b1, b2;

    new_patient() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setBackground(new Color(7, 218, 199));
        panel.setLayout(null);
        add(panel);

        // ✅ Image section (make sure icon/icon1.png exists in src/main/resources/icon/)
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel label = new JLabel(new ImageIcon(image));
        label.setBounds(550, 150, 200, 200);
        panel.add(label);

        JLabel jLabelTitle = new JLabel("Add New Patient");
        jLabelTitle.setBounds(118, 11, 260, 53);
        jLabelTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(jLabelTitle);

        JLabel jLabelid = new JLabel("ID:");
        jLabelid.setBounds(55, 76, 200, 14);
        jLabelid.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(jLabelid);

        jComboBox = new JComboBox<>(new String[]{"Aadhar Card", "Pan Card", "Driving License", "Voter ID"});
        jComboBox.setBounds(271, 73, 150, 20);
        jComboBox.setBackground(new Color(226, 226, 226));
        panel.add(jComboBox);

        JLabel jLabelNumber = new JLabel("Number:");
        jLabelNumber.setBounds(55, 111, 200, 14);
        jLabelNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(jLabelNumber);

        jTextFieldNumber = new JTextField();
        jTextFieldNumber.setBounds(271, 111, 150, 20);
        panel.add(jTextFieldNumber);

        JLabel jLabelName = new JLabel("Name:");
        jLabelName.setBounds(55, 151, 200, 14);
        jLabelName.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(jLabelName);

        textName = new JTextField();
        textName.setBounds(271, 151, 150, 20);
        panel.add(textName);

        JLabel labelGender = new JLabel("Gender:");
        labelGender.setBounds(55, 191, 200, 14);
        labelGender.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(labelGender);

        // ✅ Gender buttons
        ButtonGroup bg = new ButtonGroup();

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.BOLD, 14));
        r1.setBounds(271, 191, 80, 20);
        r1.setBackground(new Color(7, 218, 199));
        panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.BOLD, 14));
        r2.setBounds(350, 191, 90, 20);
        r2.setBackground(new Color(7, 218, 199));
        panel.add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Tahoma", Font.BOLD, 14));
        r3.setBounds(271, 225, 80, 20);
        r3.setBackground(new Color(7, 218, 199));
        panel.add(r3);

        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        JLabel jLabelDisease = new JLabel("Disease:");
        jLabelDisease.setBounds(55, 259, 200, 14);
        jLabelDisease.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(jLabelDisease);

        textFieldDisease = new JTextField();
        textFieldDisease.setBounds(271, 259, 150, 20);
        panel.add(textFieldDisease);

        JLabel jLabelRoom = new JLabel("Room:");
        jLabelRoom.setBounds(55, 300, 200, 14);
        jLabelRoom.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(jLabelRoom);

        c1 = new Choice();
        try {
            conn c = new conn();
            ResultSet resultset = c.statement.executeQuery("SELECT room_no FROM Room WHERE availability = 'Available'");
            while (resultset.next()) {
                c1.add(resultset.getString("room_no"));
            }
            resultset.close();
            c.statement.close();
            c.connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        c1.setBounds(271, 300, 150, 20);
        panel.add(c1);

        JLabel jLabelDate = new JLabel("Time:");
        jLabelDate.setBounds(55, 335, 200, 14);
        jLabelDate.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(jLabelDate);

        Date date1 = new Date();
        date = new JLabel(date1.toString());
        date.setBounds(271, 335, 250, 14);
        date.setFont(new Font("Tahoma", Font.BOLD, 15));
        date.setForeground(Color.WHITE);
        panel.add(date);

        JLabel jLabelDeposite = new JLabel("Deposit:");
        jLabelDeposite.setBounds(55, 370, 200, 14);
        jLabelDeposite.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(jLabelDeposite);

        textFieldDeposite = new JTextField();
        textFieldDeposite.setBounds(271, 370, 150, 20);
        panel.add(textFieldDeposite);

        b1 = new JButton("ADD");
        b1.setBounds(110, 450, 200, 30);
        b1.setBackground(new Color(226, 226, 226));
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(410, 450, 200, 30);
        b2.setBackground(new Color(226, 226, 226));
        b2.addActionListener(this);
        panel.add(b2);

        setUndecorated(true);
        setSize(925, 550);
        setLayout(null);
        setLocation(300, 250);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String s1 = (String) jComboBox.getSelectedItem();
            String s2 = jTextFieldNumber.getText();
            String s3 = textName.getText();
            String s4 = null;
            if (r1.isSelected()) s4 = "Male";
            else if (r2.isSelected()) s4 = "Female";
            else if (r3.isSelected()) s4 = "Other";

            String s5 = textFieldDisease.getText();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = textFieldDeposite.getText();

            if (s3.isEmpty() || s2.isEmpty() || s5.isEmpty() || s8.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all fields.");
                return;
            }

            try {
                conn c = new conn();
                String q = "INSERT INTO patientinfo (id_type, id_number, name, gender, disease, room_no, time, deposit) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = c.connection.prepareStatement(q);
                ps.setString(1, s1);
                ps.setString(2, s2);
                ps.setString(3, s3);
                ps.setString(4, s4);
                ps.setString(5, s5);
                ps.setString(6, s6);
                ps.setString(7, s7);
                ps.setString(8, s8);

                ps.executeUpdate();

                String q1 = "UPDATE Room SET availability = 'Occupied' WHERE room_no = ?";
                PreparedStatement ps2 = c.connection.prepareStatement(q1);
                ps2.setString(1, s6);
                ps2.executeUpdate();

                JOptionPane.showMessageDialog(null, "✅ Patient Added Successfully!");
                ps.close();
                ps2.close();
                c.connection.close();
                setVisible(false);

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "❌ Error: " + ex.getMessage());
            }
        } else if (e.getSource() == b2) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new new_patient();
    }
}

