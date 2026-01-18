package hospital.management.system;

import javax.swing.*;
import java.awt.*;

public class ICU extends JFrame {
    public ICU (){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        panel.setBackground(new Color(7, 218, 199));


        String s = "🏥 Intensive Care Unit (ICU) – Hospital Facilities and Information\n\n" +

                "💡 1. Introduction\n" +
                "The ICU (Intensive Care Unit) is a specialized department in the hospital that provides critical care for patients with life-threatening conditions.\n" +
                "It is equipped to monitor and treat patients who need constant medical supervision, advanced life support, and emergency interventions.\n\n" +

                "👨‍⚕️ 2. Specialized Doctors and Staff\n" +
                "The ICU team includes:\n" +
                "• Intensivists / Critical Care Physicians\n" +
                "• ICU Nurses specialized in critical care\n" +
                "• Respiratory Therapists\n" +
                "• Physiotherapists and Rehabilitation Specialists\n" +
                "• Technicians for monitoring equipment\n" +
                "• Support staff for patient care and hygiene\n\n" +
                "The team works 24/7 to provide round-the-clock monitoring and immediate response.\n\n" +

                "🏥 3. Main Facilities\n" +
                "• Fully equipped ICU Beds with patient monitoring systems\n" +
                "• Ventilators for patients needing respiratory support\n" +
                "• Cardiac Monitors for continuous ECG and vital signs tracking\n" +
                "• Defibrillators and emergency resuscitation equipment\n" +
                "• Isolation ICU Beds for contagious or immunocompromised patients\n" +
                "• Infusion Pumps and automated drug delivery systems\n" +
                "• Emergency Crash Carts and emergency medicine supplies\n\n" +

                "🧠 4. Services Offered\n" +
                "• Continuous monitoring of critically ill patients\n" +
                "• Management of heart attacks, strokes, severe infections, and trauma\n" +
                "• Mechanical ventilation and respiratory support\n" +
                "• Dialysis and renal replacement therapy for kidney failure patients\n" +
                "• Post-surgery critical care for high-risk operations\n" +
                "• Pain management and sedation therapy\n" +
                "• Early mobilization and physiotherapy support\n\n" +

                "⚙️ 5. Equipment and Technology\n" +
                "• Advanced ICU patient monitors (blood pressure, oxygen, ECG, temperature)\n" +
                "• Ventilators and oxygen delivery systems\n" +
                "• Defibrillators and cardiac resuscitation equipment\n" +
                "• Infusion pumps and automated medication dispensers\n" +
                "• ICU beds with adjustable positioning and pressure relief\n" +
                "• Portable X-ray and ultrasound for bedside diagnostics\n" +
                "• Electronic ICU (eICU) monitoring for remote supervision\n\n" +

                "📊 6. Data Managed in Hospital Management System (HMS)\n" +
                "The ICU maintains critical patient data digitally, including:\n" +
                "• Patient personal details (Name, Age, Gender, ID)\n" +
                "• Vital signs, lab results, and imaging reports\n" +
                "• Doctor’s notes, prescriptions, and treatment plans\n" +
                "• Ventilator settings and infusion details\n" +
                "• ICU stay duration and discharge summary\n\n" +

                "💖 7. Department Goals\n" +
                "• To provide life-saving treatment and intensive monitoring\n" +
                "• To stabilize critically ill patients and prevent complications\n" +
                "• To use advanced technology for accurate, timely interventions\n" +
                "• To coordinate with other departments for holistic patient care";








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
        new ICU();
    }
}
