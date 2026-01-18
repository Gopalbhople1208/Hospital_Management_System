package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class patient_dieschage extends JFrame {

    JTable table;
    JButton b1, b2, b3;

    patient_dieschage() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        panel.setBackground(new Color(7, 218, 199));
        add(panel);

        JLabel lblId6 = new JLabel("Patient Discharge");
        lblId6.setBounds(300, 15, 400, 30);
        lblId6.setFont(new Font("Tahoma", Font.BOLD, 23));
        panel.add(lblId6);



        JLabel lblId1 = new JLabel("Patient ID:");
        lblId1.setBounds(55, 82, 200, 20);
        lblId1.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(lblId1);

        Choice choice = new Choice();
        choice.setBounds(260, 82, 200, 20);
        panel.add(choice);

        // Load patient IDs
        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("SELECT id_number FROM patientinfo");
            while (resultSet.next()) {
                choice.add(resultSet.getString("id_number"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel lblId2 = new JLabel("Room No:");
        lblId2.setBounds(55, 125, 200, 20);
        lblId2.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(lblId2);

        JLabel Rno = new JLabel();
        Rno.setBounds(260, 125, 200, 20);
        Rno.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(Rno);

        JLabel lblId3 = new JLabel("In Time:");
        lblId3.setBounds(55, 165, 200, 20);
        lblId3.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(lblId3);

        JLabel INTime = new JLabel();
        INTime.setBounds(260, 165, 300, 20);
        INTime.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(INTime);

        JLabel lblId4 = new JLabel("Out Time:");
        lblId4.setBounds(55, 205, 200, 20);
        lblId4.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(lblId4);

        java.util.Date date1 = new java.util.Date();
        JLabel date = new JLabel(date1.toString());
        date.setBounds(260, 205, 300, 20);
        date.setFont(new Font("Tahoma", Font.BOLD, 17));
        panel.add(date);



        JLabel lblId5 = new JLabel("Thank you for trusting our care. Wishing you the best of health!");
        lblId5.setBounds(65, 335, 890, 20);
        lblId5.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(lblId5);

        // Buttons
        JButton dischargeBtn = new JButton("Discharge");
        dischargeBtn.setBounds(45, 420, 200, 30);
        dischargeBtn.setBackground(new Color(226, 226, 226));
        panel.add(dischargeBtn);
        dischargeBtn.addActionListener(e -> {
            try {
                conn c = new conn();

                c.statement.executeUpdate("delete from patientinfo where number ='"+choice.getSelectedItem()+"'");
                c.statement.executeUpdate("update room set Availability  = 'Available' where room_no ='"+Rno.getText()+"'");


            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });




        JButton checkBtn = new JButton("Check");
        checkBtn.setBounds(320, 420, 200, 30);
        checkBtn.setBackground(new Color(226, 226, 226));
        panel.add(checkBtn);

        JButton backBtn = new JButton("Back");
        backBtn.setBounds(595, 420, 200, 30);
        backBtn.setBackground(new Color(226, 226, 226));
        panel.add(backBtn);

        // ✅ Check Button Action
        checkBtn.addActionListener(e -> {
            try {
                conn c = new conn();
                ResultSet resultSet = c.statement.executeQuery("SELECT * FROM patientinfo WHERE id_number = '" + choice.getSelectedItem() + "'");
                while (resultSet.next()) {
                    Rno.setText(resultSet.getString("room_no"));
                    INTime.setText(resultSet.getString("time"));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        // ✅ Discharge Button Action
        dischargeBtn.addActionListener(e -> {
            try {
                conn c = new conn();

                String id = choice.getSelectedItem();
                String room = Rno.getText();

                if (room.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please check patient details first.");
                    return;
                }

                // Delete patient record
                String deleteQuery = "DELETE FROM patientinfo WHERE id_number = '" + id + "'";
                c.statement.executeUpdate(deleteQuery);

                // Update room to available
                String updateRoom = "UPDATE Room SET availability = 'Available' WHERE room_no = '" + room + "'";
                c.statement.executeUpdate(updateRoom);

                JOptionPane.showMessageDialog(null, "✅ Patient Discharged Successfully!");
                setVisible(false);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        // ✅ Back Button
        backBtn.addActionListener(e -> setVisible(false));

        // Frame settings
        setUndecorated(true);
        setSize(925, 550);
        setLayout(null);
        setLocation(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new patient_dieschage();
    }
}
