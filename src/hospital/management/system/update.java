package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class update extends JFrame {
    JButton b2, updateBtn, checkBtn;
    JTextField jTextFieldRn, jTextFieldIt, jTextFieldAp, jTextFieldPa;
    Choice choice;

    public update() {
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        panel.setBackground(new Color(7, 218, 199));
        add(panel);

        JLabel lblTitle = new JLabel("Update Patient Details");
        lblTitle.setBounds(300, 15, 400, 30);
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 23));
        panel.add(lblTitle);

        JLabel lblName = new JLabel("Patient Name:");
        lblName.setBounds(40, 95, 200, 20);
        lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(lblName);

        choice = new Choice();
        choice.setBounds(260, 95, 200, 20);
        panel.add(choice);

        JLabel lblRoom = new JLabel("Room No:");
        lblRoom.setBounds(40, 150, 200, 20);
        lblRoom.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(lblRoom);

        jTextFieldRn = new JTextField();
        jTextFieldRn.setBounds(260, 150, 200, 20);
        panel.add(jTextFieldRn);

        JLabel lblInTime = new JLabel("In Time:");
        lblInTime.setBounds(40, 210, 200, 20);
        lblInTime.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(lblInTime);

        jTextFieldIt = new JTextField();
        jTextFieldIt.setBounds(260, 210, 200, 20);
        panel.add(jTextFieldIt);

        JLabel lblAmountPaid = new JLabel("Amount Paid (Rs):");
        lblAmountPaid.setBounds(40, 270, 200, 20);
        lblAmountPaid.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(lblAmountPaid);

        jTextFieldAp = new JTextField();
        jTextFieldAp.setBounds(260, 270, 200, 20);
        panel.add(jTextFieldAp);

        JLabel lblRemaining = new JLabel("Remaining Amount (Rs):");
        lblRemaining.setBounds(40, 325, 250, 20);
        lblRemaining.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(lblRemaining);

        jTextFieldPa = new JTextField();
        jTextFieldPa.setBounds(260, 325, 200, 20);
        jTextFieldPa.setEditable(false); // user can't edit remaining
        panel.add(jTextFieldPa);

        // ✅ Load patient names
        try {
            conn c = new conn();
            ResultSet rs = c.statement.executeQuery("SELECT name FROM patientinfo");
            while (rs.next()) {
                choice.add(rs.getString("name"));
            }
            rs.close();
            c.connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ✅ CHECK BUTTON - now correctly calculates remaining amount
        checkBtn = new JButton("Check");
        checkBtn.setBounds(45, 450, 200, 30);
        checkBtn.setBackground(new Color(226, 226, 226));
        panel.add(checkBtn);

        checkBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String patientName = choice.getSelectedItem();
                try {
                    conn c = new conn();

                    // Get patient details
                    String query = "SELECT * FROM patientinfo WHERE name='" + patientName + "'";
                    ResultSet rsPatient = c.statement.executeQuery(query);

                    if (rsPatient.next()) {
                        String roomNo = rsPatient.getString("room_no");
                        String time = rsPatient.getString("time");
                        String depositStr = rsPatient.getString("deposit");

                        int deposit = 0;
                        try {
                            deposit = Integer.parseInt(depositStr);
                        } catch (NumberFormatException ex) {
                            deposit = 0;
                        }

                        jTextFieldRn.setText(roomNo);
                        jTextFieldIt.setText(time);
                        jTextFieldAp.setText(String.valueOf(deposit));

                        // ✅ Now get room price and calculate remaining
                        String roomQuery = "SELECT Price FROM Room WHERE room_no='" + roomNo + "'";
                        ResultSet rsRoom = c.statement.executeQuery(roomQuery);

                        if (rsRoom.next()) {
                            int price = rsRoom.getInt("Price");
                            int remaining = price - deposit;
                            jTextFieldPa.setText(String.valueOf(remaining));
                        } else {
                            jTextFieldPa.setText("Room not found");
                        }

                        rsRoom.close();
                    } else {
                        JOptionPane.showMessageDialog(null, "No patient found!");
                    }

                    rsPatient.close();
                    c.connection.close();

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });

        // ✅ UPDATE BUTTON
        updateBtn = new JButton("Update");
        updateBtn.setBounds(270, 450, 200, 30);
        updateBtn.setBackground(new Color(226, 226, 226));
        panel.add(updateBtn);

        updateBtn.addActionListener(e -> {
            try {
                conn c = new conn();
                String patientName = choice.getSelectedItem();
                String room = jTextFieldRn.getText();
                String time = jTextFieldIt.getText();
                String amount = jTextFieldAp.getText();

                String query = "UPDATE patientinfo SET room_no='" + room + "', time='" + time + "', deposit='" + amount + "' WHERE name='" + patientName + "'";
                c.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Updated Successfully!");
                c.connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        // ✅ BACK BUTTON
        b2 = new JButton("Back");
        b2.setBounds(540, 450, 200, 30);
        b2.setBackground(new Color(226, 226, 226));
        b2.addActionListener(e -> setVisible(false));
        panel.add(b2);

        // ✅ IMAGE
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/updated.png"));
        Image image = imageIcon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        JLabel label = new JLabel(new ImageIcon(image));
        label.setBounds(550, 150, 250, 250);
        panel.add(label);

        setUndecorated(true);
        setSize(925, 550);
        setLayout(null);
        setLocation(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new update();
    }
}
