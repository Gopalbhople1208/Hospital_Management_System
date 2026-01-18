package hospital.management.system;

import javax.swing.*;
import java.awt.*;

public class OPD extends JFrame {
    public OPD (){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        panel.setBackground(new Color(7, 218, 199));



        String s = "🏥 Outpatient Department (OPD) – Hospital Facilities and Information\n\n" +
                "💡 1. Introduction\n" +
                "The Outpatient Department (OPD) is the first point of contact between patients and the hospital.\n" +
                "It provides consultation, diagnosis, and minor treatment services to patients who do not require admission.\n" +
                "The OPD helps in early detection, regular checkups, and preventive healthcare, reducing the need for hospitalization.\n\n" +

                "👨‍⚕️ 2. Specialized Doctors and Staff\n" +
                "The OPD is managed by a team of:\n" +
                "• General Physicians\n" +
                "• Specialist Doctors (Cardiologists, Orthopedists, Dermatologists, etc.)\n" +
                "• Nurses and Medical Assistants\n" +
                "• Reception and Record Staff\n" +
                "• Laboratory Technicians and Pharmacists\n\n" +
                "They work together to ensure smooth patient flow and quality care.\n\n" +

                "🏥 3. Main Facilities\n" +
                "• Patient Registration and Billing Counters\n" +
                "• Multiple Consulting Rooms for various specialties\n" +
                "• Minor Operation and Dressing Rooms\n" +
                "• Diagnostic Lab (Blood, Urine, ECG, X-ray, etc.)\n" +
                "• Pharmacy and Medicine Dispensing Unit\n" +
                "• Waiting Area with Seating and Display Information System\n" +
                "• Online Appointment and Token System for time management\n\n" +

                "🧠 4. Services Offered\n" +
                "• General health consultations and follow-ups\n" +
                "• Diagnosis and treatment of common illnesses\n" +
                "• Specialist consultations (Cardiology, ENT, Skin, Eye, etc.)\n" +
                "• Minor surgical procedures and wound dressing\n" +
                "• Immunization and preventive health services\n" +
                "• Health education and awareness programs\n\n" +

                "⚙️ 5. Equipment and Technology\n" +
                "• Computerized Registration and Billing Systems\n" +
                "• Digital Display Boards for patient tokens\n" +
                "• Electronic Medical Record (EMR) system\n" +
                "• Basic diagnostic equipment (BP machine, ECG, Stethoscope, etc.)\n" +
                "• Lab and Radiology interfaces connected with HMS\n" +
                "• CCTV and queue management systems\n\n" +

                "📊 6. Data Managed in Hospital Management System (HMS)\n" +
                "The OPD maintains all records digitally, including:\n" +
                "• Patient registration details and ID numbers\n" +
                "• Doctor’s diagnosis, prescription, and consultation history\n" +
                "• Laboratory and test reports\n" +
                "• Billing and payment information\n" +
                "• Follow-up appointments and referral details\n\n" +
                "This data helps in maintaining continuity of care and improves coordination between departments.\n\n" +

                "💖 7. Department Goals\n" +
                "• To provide quick and affordable medical consultation\n" +
                "• To ensure preventive healthcare and early disease detection\n" +
                "• To maintain accurate digital records for every patient\n" +
                "• To improve patient satisfaction with efficient service and minimum waiting time";







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
        new OPD();
    }
}
