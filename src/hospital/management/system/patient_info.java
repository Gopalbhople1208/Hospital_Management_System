package hospital.management.system;

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class patient_info extends JFrame {
    JButton b1, b2;
    JTable table;

    public patient_info() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        panel.setBackground(new Color(7, 218, 199));
        add(panel);

        table = new JTable();
        table.setFont(new Font("Tahoma", Font.PLAIN, 14));
        table.setBounds(25, 100, 780, 350);
        table.setBackground(new Color(7, 218, 199));
        panel.add(table);

        JLabel lblId = new JLabel("Patient Information");
        lblId.setBounds(300, 20, 300, 30);
        lblId.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(lblId);

        // Table headers (optional visual labels)
        JLabel lblId1 = new JLabel("ID Type");
        lblId1.setBounds(26, 60, 100, 30);
        lblId1.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId1);

        JLabel lblId2 = new JLabel("ID No");
        lblId2.setBounds(130, 60, 100, 30);
        lblId2.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId2);

        JLabel lblId3 = new JLabel("Name");
        lblId3.setBounds(225, 60, 100, 30);
        lblId3.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId3);

        JLabel lblId4 = new JLabel("Gender");
        lblId4.setBounds(325, 60, 100, 30);
        lblId4.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId4);

        JLabel lblId5 = new JLabel("Disease");
        lblId5.setBounds(425, 60, 100, 30);
        lblId5.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId5);

        JLabel lblId6 = new JLabel("Room No");
        lblId6.setBounds(522, 60, 100, 30);
        lblId6.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId6);

        JLabel lblId7 = new JLabel("Time");
        lblId7.setBounds(620, 60, 100, 30);
        lblId7.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId7);

        JLabel lblId8 = new JLabel("Deposit");
        lblId8.setBounds(720, 60, 100, 30);
        lblId8.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId8);

        // Fetch data from database
        try {
            conn c = new conn();
            String query = "SELECT * FROM patientinfo;";
            ResultSet rs = c.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Back button
        b2 = new JButton("Back");
        b2.setBounds(595, 500, 200, 30);
        b2.setBackground(new Color(226, 226, 226));
        b2.addActionListener(e -> setVisible(false));
        panel.add(b2);

        // Frame setup
        setUndecorated(true);
        setSize(925, 550);
        setLayout(null);
        setLocation(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new patient_info();
    }
}
