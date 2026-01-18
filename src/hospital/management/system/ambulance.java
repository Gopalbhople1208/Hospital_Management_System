package hospital.management.system;

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class ambulance extends JFrame {
    JButton searchBtn, backBtn;

    public ambulance() {
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        panel.setBackground(new Color(7, 218, 199));
        add(panel);


        JTable table = new JTable();
        table.setBounds(55, 150, 700, 320);
        table.setBackground(new Color(7, 218, 199));
        panel.add(table);

        // Load all ambulances initially
        try {
            conn c = new conn();
            ResultSet rs = c.statement.executeQuery("SELECT * FROM ambulance");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel lblId1 = new JLabel("Ambulance Information");
        lblId1.setBounds(250, 15, 300, 25);
        lblId1.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(lblId1);

        // Column headers
        JLabel lblId = new JLabel("Ambulance ID");
        lblId.setBounds(57, 125, 150, 25);
        lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblId);

        JLabel lblVehicle = new JLabel("Vehicle No");
        lblVehicle.setBounds(180, 125, 150, 25);
        lblVehicle.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblVehicle);

        JLabel lblDriver = new JLabel("Driver Name");
        lblDriver.setBounds(290, 125, 150, 25);
        lblDriver.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblDriver);

        JLabel lblContact = new JLabel("Contact");
        lblContact.setBounds(410, 125, 150, 25);
        lblContact.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblContact);

        JLabel lblType = new JLabel("Type");
        lblType.setBounds(525, 125, 150, 25);
        lblType.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblType);

        JLabel lblLocation = new JLabel("Location");
        lblLocation.setBounds(640, 125, 150, 25);
        lblLocation.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblLocation);



        // Back button
        backBtn = new JButton("Back");
        backBtn.setBounds(300, 500, 200, 30);
        backBtn.setBackground(new Color(226, 226, 226));
        backBtn.addActionListener(e -> setVisible(false));
        panel.add(backBtn);

        setUndecorated(true);
        setSize(925, 550);
        setLayout(null);
        setLocation(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ambulance();
    }
}

