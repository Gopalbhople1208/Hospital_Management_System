package hospital.management.system;

import javax.swing.*;
import java.awt.*;

public class Ambulance1 extends JFrame {



    public Ambulance1 () {
     JPanel panel = new JPanel();
     panel.setBounds(5, 5, 840, 540);
        panel.setBackground(new Color(7, 218, 199));
     panel.setLayout(null);



     String s ="\n" + "\n" +
             " 1)  The National Ambulance Service (NAS) refers to government-run emergency medical services in various countries.\n" +
             "\n" +
             " 2)  In Ireland, the NAS was established in 2005 under the Health Service Executive (HSE). It provides nationwide emergency care through over 620 vehicles and employs around 2,300 staff. Its main control centre is in Tallaght, Dublin, handling more than 435,000 calls yearly. The service also trains paramedics through the National Ambulance Service College.\n" +
             "\n" +
             " 3)  In India, NAS is known as the 102 ambulance service, launched in 2014 under the National Health Mission (NHM). It offers free 24/7 transport for pregnant women, newborns, and sick children. Over 10,000 ambulances operate across all states with GPS tracking and life-support equipment, helping reduce maternal and infant deaths.\n" +
             "\n" +
             " 4)  In Ghana, the NAS started in 2004 under the Ministry of Health. It provides pre-hospital emergency care nationwide and has expanded from a few regions to all districts.\n" +
             "\n" +
             " 5)  Overall, NAS systems in these countries aim to deliver quick, reliable, and lifesaving emergency services through trained medical teams and modern ambulances" ;
     JTextArea textArea = new JTextArea(s);
     textArea.setBounds(300, 50, 800, 400);
     textArea.setLineWrap(true);
     textArea.setWrapStyleWord(true);
     textArea.setEditable(false);
     textArea.setFont(new Font("Arial", Font.PLAIN, 14));
     textArea.setBackground(new Color(7, 218, 199));


     JScrollPane scrollPane = new JScrollPane(textArea);
     scrollPane.setBounds(5, 5, 840, 540);
        scrollPane.setBackground(new Color(7, 218, 199));


     panel.add(scrollPane);
     add(panel);

    setUndecorated(true);
    setSize(925, 550);
    setLayout(null);
    setLocation(300, 250);
    setVisible(true);
}

public static void main(String[] args) {
    new Ambulance1();
}
}
