package hospital.management.system;



import javax.swing.*;
import java.awt.*;

public class CARDIOLOGY extends JFrame {
    public CARDIOLOGY(){

        JPanel panel1 = new JPanel();
        panel1.setBounds(5, 5, 840, 540);
        panel1.setLayout(null);
        panel1.setBackground(new Color(7, 218, 199));
        String s = "❤️ Cardiology Department\n" +
                "\n" +
                "1. Introduction\n" +
                "\n" +
                "The Cardiology Department in our hospital focuses on the diagnosis, treatment, and prevention of heart and blood vessel diseases.\n" +
                "It is one of the most important departments responsible for handling emergency and routine cardiac care.\n" +
                "\n" +
                "2. Specialists\n" +
                "\n" +
                "Our hospital has well-trained Cardiologists, Cardiac Surgeons, and Cardiac Nurses.\n" +
                "They work together to ensure timely diagnosis and advanced treatment for all cardiac patients.\n" +
                "\n" +
                "3. Main Functions\n" +
                "\n" +
                "• Conducting heart checkups and ECG tests.\n" +
                "• Performing Echocardiograms and Angiography.\n" +
                "• Providing emergency care during heart attacks.\n" +
                "• Managing chronic heart diseases like hypertension and heart failure.\n" +
                "• Offering post-surgery and rehabilitation support.\n" +
                "\n" +
                "4. Equipment & Technology\n" +
                "\n" +
                "The department uses modern diagnostic tools, such as:\n" +
                "• ECG Machines\n" +
                "• Echocardiography Systems\n" +
                "• Cardiac Monitors\n" +
                "• Defibrillators\n" +
                "• Cath Lab for Angioplasty and Stent Procedures\n" +
                "\n" +
                "5. Data Collected in Hospital System\n" +
                "\n" +
                "In our Hospital Management System (HMS), the Cardiology Department records and maintains:\n" +
                "• Patient details: Name, Age, Gender, Contact, ID\n" +
                "• Medical history: Previous heart issues, allergies, medications\n" +
                "• Test results: ECG, Echo, Blood Pressure, Cholesterol reports\n" +
                "• Doctor’s notes & prescriptions\n" +
                "• Treatment plans and follow-up schedules\n" +
                "\n" +
                "All this data helps doctors track patient progress, improve treatment accuracy, and maintain digital records for future reference.\n" +
                "\n" +
                "6. Goals of the Department\n" +
                "\n" +
                "• To save lives through timely emergency response\n" +
                "• To promote heart health through awareness and preventive care\n" +
                "• To use technology for accurate diagnosis and efficient data management.\n";

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



        panel1.add(scrollPane);
        add(panel1);



        setUndecorated(true);
        setSize(925, 550);
        setLayout(null);
        setLocation(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CARDIOLOGY ();
    }
}
