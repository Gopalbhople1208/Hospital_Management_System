package hospital.management.system;

import javax.swing.*;
import java.awt.*;

public class BABY extends JFrame {
    public BABY(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        panel.setBackground(new Color(7, 218, 199));


        String s = "🏥 Pediatrics Department – Hospital Facilities and Information\n" +
                "\n" +
                "👶 1. Introduction\n" +
                "\n" +
                "The Pediatrics Department in our hospital provides complete medical care for infants, children, and young adolescents (0–18 years).\n" +
                "It ensures healthy growth, disease prevention, and emergency care for children at every stage of development.\n" +
                "\n" +
                "👨‍⚕️ 2. Specialized Doctors and Staff\n" +
                "\n" +
                "Our hospital has a team of experienced Pediatricians, Neonatologists, Child Nurses, and Nutritionists.\n" +
                "They work together to monitor child development, immunity, and mental health while providing compassionate care.\n" +
                "\n" +
                "🏥 3. Main Facilities\n" +
                "\n" +
                "• Neonatal Intensive Care Unit (NICU) for newborns requiring special medical attention.\n" +
                "• Pediatric Intensive Care Unit (PICU) for critically ill children.\n" +
                "• Vaccination and Immunization Centre for routine child vaccinations.\n" +
                "• Child Growth Monitoring Room with weighing and height measurement tools.\n" +
                "• Baby Feeding and Nutrition Counseling Area.\n" +
                "• Play and Activity Area to create a friendly environment.\n" +
                "\n" +
                "🧠 4. Services Offered\n" +
                "\n" +
                "• Regular child health checkups and growth tracking.\n" +
                "• Diagnosis and treatment of common childhood illnesses.\n" +
                "• Emergency pediatric care for fever, infections, or injuries.\n" +
                "• Nutritional guidance and diet planning for underweight or overweight children.\n" +
                "• Counseling for parents on hygiene, vaccination, and preventive care.\n" +
                "\n" +
                "⚙️ 5. Equipment and Technology\n" +
                "\n" +
                "• Infant warmers and incubators for newborns.\n" +
                "• Oxygen monitors and ventilators for critical care.\n" +
                "• Digital thermometers and pulse oximeters.\n" +
                "• Ultrasound and diagnostic tools for children’s health evaluation.\n" +
                "\n" +
                "📊 6. Data Managed in Hospital Management System (HMS)\n" +
                "\n" +
                "The Pediatrics Department records and manages:\n" +
                "• Child details: Name, Age, Gender, Birth Date, Parent Info.\n" +
                "• Medical history: Allergies, Vaccinations, Past Illnesses.\n" +
                "• Doctor’s prescriptions and reports.\n" +
                "• Growth charts, follow-up dates, and lab test results.\n" +
                "\n" +
                "This helps the hospital ensure personalized care and timely medical support for each child.\n" +
                "\n" +
                "💖 7. Department Goals\n" +
                "\n" +
                "• To provide safe and high-quality healthcare for all children.\n" +
                "• To reduce infant and child mortality rates.\n" +
                "• To promote awareness among parents about child health and nutrition.\n" +
                "• To build a healthy and disease-free childhood for the future generation.\n";










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
        new BABY();
    }
}
