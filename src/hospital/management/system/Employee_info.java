package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public  class Employee_info extends JFrame {

    JTable table;
    JButton b1,b2;

    Employee_info() {


        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        panel.setBackground(new Color(7, 218, 199));
        add(panel);

        JTable table = new JTable();
        table.setFont(new Font("Tahoma", Font.BOLD, 14));

        table.setBounds(25, 100, 790, 400);
        table.setBackground(new Color(7, 218, 199));
        panel.add(table);


        try {
            conn c = new conn();
            String query = "SELECT * FROM employee_information";
            ResultSet rs = c.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }


        JLabel lblId6 = new JLabel("Employee_information");
        lblId6.setBounds(300, 20, 420, 30);
        lblId6.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(lblId6);


        JLabel lblId = new JLabel("Employee_id");
        lblId.setBounds(25, 60, 120, 30);
        lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId);


        JLabel lblId1 = new JLabel("Name");
        lblId1.setBounds(163, 60, 120, 30);
        lblId1.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId1);


        JLabel lblId2 = new JLabel("Gender");
        lblId2.setBounds(295, 60, 120, 30);
        lblId2.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId2);

        JLabel lblId3 = new JLabel("Department");
        lblId3.setBounds(425, 60, 120, 30);
        lblId3.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId3);

        JLabel lblId4 = new JLabel("Designation");
        lblId4.setBounds(555, 60, 120, 30);
        lblId4.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId4);


        JLabel lblId5 = new JLabel("Contact_no");
        lblId5.setBounds(685, 60, 120, 30);
        lblId5.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId5);




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


        setUndecorated(true);
        setSize(925, 550);
        setLayout(null);
        setLocation(300, 250);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Employee_info();

    }
}
