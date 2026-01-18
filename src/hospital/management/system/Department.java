package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {
    JButton b1,b2;

    public Department() {
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        panel.setBackground(new Color(7, 218, 199));
        add(panel);

        JLabel lblId6 = new JLabel("Department_information");
        lblId6.setBounds(290, 20, 420, 30);
        lblId6.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(lblId6);



        // Table setup
        JTable table = new JTable();
        table.setFont(new Font("Tahoma", Font.BOLD, 14));

        table.setBounds(25, 100, 790, 400);
        table.setBackground(new Color(7, 218, 199));
        panel.add(table);

        // Column labels
        JLabel lblId = new JLabel("Department ID");
        lblId.setBounds(25, 60, 120, 30);
        lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId);

        JLabel lblName = new JLabel("Department Name");
        lblName.setBounds(185, 60, 150, 30);
        lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblName);

        JLabel lblHead = new JLabel("Department Head");
        lblHead.setBounds(345, 60, 150, 30);
        lblHead.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblHead);

        JLabel lblFloor = new JLabel("Floor");
        lblFloor.setBounds(505, 60, 80, 30);
        lblFloor.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblFloor);

        JLabel lblContact = new JLabel("Contact Number");
        lblContact.setBounds(660, 60, 150, 30);
        lblContact.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblContact);



        b2 = new JButton("Back");
        b2.setBounds(595, 500, 200, 30);
        b2.setBackground(new Color(226, 226, 226));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(b2);

        // Fetch data from database
        try {
            conn c = new conn();
            String query = "SELECT * FROM department";
            ResultSet rs = c.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Frame settings
        setUndecorated(true);
        setSize(925, 550);
        setLayout(null);
        setLocation(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Department();
    }
}