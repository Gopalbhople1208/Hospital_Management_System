
package hospital.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Reception extends JFrame { Reception(){
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBounds(5,160,1525,770);
    panel.setBackground(new Color(7, 218, 199));
    add(panel);



    ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/Ambulance1.png"));
    Image image = imageIcon1.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    JButton panel2 = new JButton(new ImageIcon(image));
    panel2.setBounds(15, 45, 250, 175);
    panel2.setBorderPainted(false);   // remove button border
    panel2.setContentAreaFilled(false); // remove background
    panel2.setFocusPainted(false);     // remove focus rectangle
    panel.add(panel2);
    panel2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new Ambulance1();   // open the Ambulance window or class
        }
    });





    JButton bt11 = new JButton("Ambulance");
    bt11.setBounds(40,8,200,30);
    bt11.setBackground(new Color(226, 226, 226));
    panel.add(bt11);
    bt11.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             new Ambulance1();

        }
    });




    ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/ICU.png"));
    Image image2 = imageIcon2.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    JButton label3 = new JButton(new ImageIcon(image2));
    label3.setBounds(15,280,250,175);
    label3.setBorderPainted(false);   // remove button border
    label3.setContentAreaFilled(false); // remove background
    label3.setFocusPainted(false);
    panel.add(label3);
    label3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new ICU();

        }
    });


    JButton bt12 = new JButton("ICU ROOM");
    bt12.setBounds(40,240,200,30);
    bt12.setBackground(new Color(226, 226, 226));
    panel.add(bt12);
    bt12.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        new ICU ();

        }
    });




    ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/OPD1.png"));
    Image image3 = imageIcon3.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    JButton label4 = new JButton(new ImageIcon(image3));
    label4.setBounds(15,520,250,175);
    label4.setBorderPainted(false);   // remove button border
    label4.setContentAreaFilled(false); // remove background
    label4.setFocusPainted(false);
    panel.add(label4);
    label4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new ICU();

        }
    });




    JButton bt13 = new JButton("OPD ROOM");
    bt13.setBounds(40,480,200,30);
    bt13.setBackground(new Color(226, 226, 226));
    panel.add(bt13);
    bt13.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
              new OPD();

        }
    });



    ImageIcon imageIcon4 = new ImageIcon(ClassLoader.getSystemResource("icon/orthopedics1.png"));
    Image image4 = imageIcon4.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    JButton label5 = new JButton(new ImageIcon(image4));
    label5.setBounds(1000,45,750,175);
    label5.setBorderPainted(false);   // remove button border
    label5.setContentAreaFilled(false); // remove background
    label5.setFocusPainted(false);
    panel.add(label5);
    label5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new ORTHOPEDICS();

        }
    });




    JButton bt14 = new JButton("ORTHOPEDICS");
    bt14.setBounds(1275,8,200,30);
    bt14.setBackground(new Color(226, 226, 226));
    panel.add(bt14);
    bt14.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new ORTHOPEDICS();


        }
    });




    ImageIcon imageIcon5 = new ImageIcon(ClassLoader.getSystemResource("icon/pe1.png"));
    Image image5 = imageIcon5.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    JButton label6 = new JButton(new ImageIcon(image5));
    label6.setBounds(1000,280,750,175);
    label6.setBorderPainted(false);   // remove button border
    label6.setContentAreaFilled(false); // remove background
    label6.setFocusPainted(false);
    panel.add(label6);
    label6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new BABY();

        }
    });



    JButton bt15 = new JButton("BABY");
    bt15.setBounds(1275,240,200,30);
    bt15.setBackground(new Color(226, 226, 226));
    panel.add(bt15);
    bt15.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             new BABY ();

        }
    });




    ImageIcon imageIcon6 = new ImageIcon(ClassLoader.getSystemResource("icon/cardiology-banner.png"));
    Image image6 = imageIcon6.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    JButton label7 = new JButton(new ImageIcon(image6));
    label7.setBounds(1000,520,750,175);
    label7.setBorderPainted(false);   // remove button border
    label7.setContentAreaFilled(false); // remove background
    label7.setFocusPainted(false);
    panel.add(label7);
    label7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new CARDIOLOGY ();

        }
    });




    JButton bt16 = new JButton("CARDIOLOGY");
    bt16.setBounds(1275,480,200,30);
    bt16.setBackground(new Color(226, 226, 226));
    panel.add(bt16);
    bt16.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new CARDIOLOGY ();


        }
    });


        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,1525,150);
        panel1.setBackground(new Color(7, 218, 199));

        add(panel1);





        JButton bt1 = new JButton("Add New Patient");
        bt1.setBounds(30,25,200,30);
        bt1.setBackground(new Color(226, 226, 226));
        panel1.add(bt1);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            new new_patient();
            }
        });




         JButton bt2 = new JButton("Room");
        bt2.setBounds(30,75,200,30);
        bt2.setBackground(new Color(226, 226, 226));
        panel1.add(bt2);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Room();

            }
        });





        JButton bt3 = new JButton("Department");
        bt3.setBounds(300,25,200,30);
        bt3.setBackground(new Color(226, 226, 226));
        panel1.add(bt3);
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Department();

            }
        });




        JButton bt4 = new JButton("All Employee info");
        bt4.setBounds(300,75,200,30);
        bt4.setBackground(new Color(226, 226, 226));
        panel1.add(bt4);
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Employee_info();

            }
        });




        JButton bt5 = new JButton("Patient info");
        bt5.setBounds(570,25,200,30);
        bt5.setBackground(new Color(226, 226, 226));
        panel1.add(bt5);
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new patient_info();

            }
        });



        JButton bt7 = new JButton("Patient Discharge");
        bt7.setBounds(840,25,200,30);
        bt7.setBackground(new Color(226, 226, 226));
        panel1.add(bt7);
        bt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new patient_dieschage();

            }
        });




        JButton bt8 = new JButton("Update Patient Details");
        bt8.setBounds(840,75,200,30);
        bt8.setBackground(new Color(226, 226, 226));
        panel1.add(bt8);
        bt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new update();
            }
        });





        JButton bt6 = new JButton("Search Room");
        bt6.setBounds(570,75,200,30);
        bt6.setBackground(new Color(226, 226, 226));
        panel1.add(bt6);
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new search();

            }
        });




        JButton bt9 = new JButton("Hospital Ambulance");
        bt9.setBounds(1110,25,200,30);
        bt9.setBackground(new Color(226, 226, 226));
        panel1.add(bt9);
        bt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ambulance();

            }
        });




        JButton bt10 = new JButton("Logout");
        bt10.setBounds(1110,75,200,30);
        bt10.setBackground(new Color(226,226,226));
        panel1.add(bt10);
        bt10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new  Login();

            }
        });




        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/icon.png"));
        Image image1 = imageIcon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        JLabel label1 = new JLabel(new ImageIcon(image1));
        label1.setBounds(1315,5,200,150);

        panel1.add(label1);




    setSize(1950,1090);
    getContentPane().setBackground(Color.white);
    setLayout(null);
    setVisible(true);
    }
    public static void main(String[] args){
        new Reception();
    }
}

