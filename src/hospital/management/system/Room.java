package hospital.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame {
    JTable table;
    JButton b1,b2;
    Room(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setBackground(new Color(7, 218, 199));
        panel.setLayout(null);
        add(panel);


         JLabel jLabelTitle = new JLabel("Room Status");
        jLabelTitle.setBounds(350, 8, 280, 60);
        jLabelTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(jLabelTitle);





        JLabel jLabelTitle1 = new JLabel("Room_no");
        jLabelTitle1.setBounds(17, 80, 280, 60);
        jLabelTitle1.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(jLabelTitle1);


        JLabel jLabelTitle2 = new JLabel("status");
        jLabelTitle2.setBounds(140, 80, 280, 60);
        jLabelTitle2.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(jLabelTitle2);


        JLabel jLabelTitle3 = new JLabel("Deposit");
        jLabelTitle3.setBounds(265, 80, 280, 60);
        jLabelTitle3.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(jLabelTitle3);



        JLabel jLabelTitle4 = new JLabel("Bed_types");
        jLabelTitle4.setBounds(390, 80, 280, 60);
        jLabelTitle4.setFont(new Font("Tahoma", Font.BOLD, 16));
        panel.add(jLabelTitle4);

        table = new JTable();
        table.setBounds(15,125,500,400);
        table.setBackground(new Color(7, 218, 199));
        panel.add(table);



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


        try{
            conn c = new conn();
            String q = "select * from Room";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/room3.png"));
        Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel label = new JLabel(new ImageIcon(image));
        label.setBounds(550, 150, 200, 200);
        panel.add(label);


        setUndecorated(true);
        setSize(925,550);
        setLayout(null);
        setLocation(300,250);
        setVisible(true);
    }




    public static void main(String[] args) {
        new Room();

    }
}
