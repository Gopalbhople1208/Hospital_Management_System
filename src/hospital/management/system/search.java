


package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class search extends JFrame {
    JButton b2,b1;


    public search() {
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        panel.setBackground(new Color(7, 218, 199));
        add(panel);

        JLabel lblTitle = new JLabel("Search For Room");
        lblTitle.setBounds(300, 15, 400, 30);
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 23));
        panel.add(lblTitle);

        JLabel lblStatus = new JLabel("Status:");
        lblStatus.setBounds(100, 80, 150, 25);
        lblStatus.setFont(new Font("Tahoma", Font.BOLD, 18));
        panel.add(lblStatus);

        Choice choice = new Choice();
        choice.setBounds(250, 80, 150, 25);
        choice.add("Available");
        choice.add("Occupied");
        panel.add(choice);

        JTable table = new JTable();
        table.setBounds(55, 150, 700, 320);
        table.setBackground(new Color(7, 218, 199));
        panel.add(table);

        try{
            conn c = new conn();
            String q = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        } catch (Exception e) {
            e.printStackTrace();
        }


        JLabel lblStatus1 = new JLabel("Room_No");
        lblStatus1.setBounds(57, 125, 150, 25);
        lblStatus1.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblStatus1);


        JLabel lblStatu2 = new JLabel("Availability");
        lblStatu2.setBounds(230, 125, 150, 25);
        lblStatu2.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblStatu2);


        JLabel lblStatu3 = new JLabel("Deposit");
        lblStatu3.setBounds(405, 125, 150, 25);
        lblStatu3.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblStatu3);


        JLabel lblStatus4 = new JLabel("Bad_Type");
        lblStatus4.setBounds(580, 125, 150, 25);
        lblStatus4.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblStatus4);


        b1 = new JButton("Search");
        b1.setBounds(120, 490, 200, 30);
        b1.setBackground(new Color(226, 226, 226));

        panel.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String q = "select * from Room where Availability = '"+choice.getSelectedItem()+"'";
                try {
                    conn c = new conn();
                    ResultSet resultSet = c.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                }catch (Exception E){
                    E.printStackTrace();

                }

            }
        });



        // Back button
        b2 = new JButton("Back");
        b2.setBounds(450, 490, 200, 30);
        b2.setBackground(new Color(226, 226, 226));
        b2.addActionListener(e -> setVisible(false));
        panel.add(b2);

        setUndecorated(true);
        setSize(925, 550);
        setLayout(null);
        setLocation(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new search();
    }
}





































































































































