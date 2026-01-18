package hospital.management.system;

import javax.swing.*;
import java.awt.*;

public class ORTHOPEDICS extends JFrame {
    public ORTHOPEDICS(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        panel.setBackground(new Color(7, 218, 199));




        String s = "🦴 Orthopedics Department – Hospital Facilities and Information\n\n" +
                "💪 1. Introduction\n\n" +
                "The Orthopedics Department in our hospital specializes in the diagnosis, treatment, and rehabilitation of disorders related to bones, joints, muscles, ligaments, and the skeletal system.\n" +
                "It plays a vital role in helping patients recover from fractures, deformities, arthritis, and spinal problems to restore movement and improve quality of life.\n\n" +

                "👨‍⚕️ 2. Specialized Doctors and Staff\n\n" +
                "Our hospital has a highly experienced team of Orthopedic Surgeons, Physiotherapists, Sports Injury Experts, and Rehabilitation Specialists.\n" +
                "They provide surgical and non-surgical treatments using advanced medical techniques and patient-centered care.\n\n" +

                "🏥 3. Main Facilities\n\n" +
                "• Orthopedic Operation Theatre (OT) equipped for fracture fixation and joint replacement surgeries.\n" +
                "• Fracture and Trauma Unit for emergency bone injury treatment.\n" +
                "• Physiotherapy & Rehabilitation Centre for post-surgery recovery and mobility improvement.\n" +
                "• Joint Replacement Clinic for hip, knee, and shoulder replacement procedures.\n" +
                "• Spine Care Unit for managing back pain, scoliosis, and spinal injuries.\n" +
                "• Sports Injury Care Unit for athletes and fitness-related treatments.\n\n" +

                "🧠 4. Services Offered\n\n" +
                "• Treatment for bone fractures and dislocations.\n" +
                "• Management of arthritis, osteoporosis, and joint pain.\n" +
                "• Orthopedic surgeries — internal fixation, arthroscopy, and joint replacement.\n" +
                "• Post-operative physiotherapy and exercise programs.\n" +
                "• Pediatric orthopedics for children with growth or limb deformities.\n" +
                "• Counseling and guidance for bone health and injury prevention.\n\n" +

                "⚙️ 5. Equipment and Technology\n\n" +
                "• Digital X-ray and MRI scanning systems.\n" +
                "• Bone density analyzer (DEXA Scan).\n" +
                "• C-arm imaging for precision in surgeries.\n" +
                "• Orthopedic surgical instruments for fixation and replacement.\n" +
                "• Physiotherapy tools — ultrasound therapy, traction machines, and exercise equipment.\n\n" +

                "📊 6. Data Managed in Hospital Management System (HMS)\n\n" +
                "The Orthopedics Department maintains detailed digital records, including:\n\n" +
                "• Patient details: Name, Age, Gender, Contact, and ID.\n" +
                "• Injury or diagnosis reports with X-ray/MRI images.\n" +
                "• Doctor’s prescriptions and treatment notes.\n" +
                "• Surgery details, post-operative reports, and recovery progress.\n" +
                "• Physiotherapy session records and follow-up dates.\n\n" +
                "All data is stored securely in the HMS to ensure accurate tracking and faster coordination among the medical team.\n\n" +

                "💖 7. Department Goals\n\n" +
                "• To restore mobility and independence to every patient.\n" +
                "• To provide modern, minimally invasive orthopedic treatments.\n" +
                "• To ensure early recovery through effective physiotherapy.\n" +
                "• To promote awareness about bone health, posture, and injury prevention.";






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
        new ORTHOPEDICS();
    }
}

