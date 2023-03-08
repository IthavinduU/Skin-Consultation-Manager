import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;

public class ConsultGUI {

    static JPanel consultPanel = new JPanel(null);

    static JTextField name = new JTextField();
    static JTextField surname = new JTextField();
    static JTextField bYear = new JTextField();
    static JTextField bMonth = new JTextField();
    static JTextField bDate = new JTextField();
    static JTextField mobile = new JTextField();
    static JTextField patID = new JTextField();
    static JTextField cYear = new JTextField();
    static JTextField cMonth = new JTextField();
    static JTextField cDate = new JTextField();
    static JTextField noOfHours = new JTextField();
    static JComboBox doctorID;
    static JTextArea addNotes = new JTextArea();
    static JButton submit = new JButton("Submit");
    static JButton view = new JButton("View");
    static JButton save = new JButton("Save");

    public ConsultGUI() {

        JFrame frame = new JFrame();
        frame.add(consultPanel);
        frame.setTitle("Skincare Consultation System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 800);
        frame.setVisible(true);

        consultPanel.setBackground(new Color(0xA6A5A5));

        JLabel topicMain = new JLabel("Skincare Consultation Center");
        topicMain.setBounds(110, 5, 600, 40);
        topicMain.setFont(new Font("ENGRAVERS MT", Font.BOLD, 20));
        topicMain.setForeground(Color.black);
        topicMain.setBackground(new Color(0xA6A5A5));
        topicMain.setOpaque(true);
        consultPanel.add(topicMain);

        JLabel consultTitle = new JLabel("Add a Consultation");
        consultTitle.setBounds(230, 60, 300, 40);
        consultTitle.setFont(new Font("IBM Plex Serif", Font.BOLD, 16));
        consultTitle.setForeground(Color.black);
        consultPanel.add(consultTitle);

        JLabel patientTitle = new JLabel("Enter Patient Information");
        patientTitle.setBounds(35, 110, 300, 40);
        patientTitle.setFont(new Font("IBM Plex Serif", Font.PLAIN, 15));
        patientTitle.setForeground(Color.black);
        consultPanel.add(patientTitle);

        JLabel patientName = new JLabel("Enter name:");
        consultPanel.add(patientName);
        patientName.setBounds(35,160,300,40);
        patientName.setForeground(Color.black);
        patientName.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel patientSurname = new JLabel("Enter surname:");
        consultPanel.add(patientSurname);
        patientSurname.setBounds(35,200,300,40);
        patientSurname.setForeground(Color.black);
        patientSurname.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel birthTitle = new JLabel("Enter birthday");
        consultPanel.add(birthTitle);
        birthTitle.setBounds(35,240,300,40);
        birthTitle.setForeground(Color.black);
        birthTitle.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel birthYear = new JLabel("Year:");
        consultPanel.add(birthYear);
        birthYear.setBounds(35,280,300,40);
        birthYear.setForeground(Color.black);
        birthYear.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel birthMonth = new JLabel("Month:");
        consultPanel.add(birthMonth);
        birthMonth.setBounds(200,280,300,40);
        birthMonth.setForeground(Color.black);
        birthMonth.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel birthDate = new JLabel("Date:");
        consultPanel.add(birthDate);
        birthDate.setBounds(365,280,300,40);
        birthDate.setForeground(Color.black);
        birthDate.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel mobNo = new JLabel("Mobile Number:");
        consultPanel.add(mobNo);
        mobNo.setBounds(35,320,300,40);
        mobNo.setForeground(Color.black);
        mobNo.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel patientID = new JLabel("Patient ID:");
        consultPanel.add(patientID);
        patientID.setBounds(35,360,300,40);
        patientID.setForeground(Color.black);
        patientID.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel consultTopic = new JLabel("Enter the Date of the Consultation");
        consultPanel.add(consultTopic);
        consultTopic.setBounds(35,400,300,40);
        consultTopic.setForeground(Color.black);
        consultTopic.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel consultYear = new JLabel("Year:");
        consultPanel.add(consultYear);
        consultYear.setBounds(35,440,300,40);
        consultYear.setForeground(Color.black);
        consultYear.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel consultMonth = new JLabel("Month:");
        consultPanel.add(consultMonth);
        consultMonth.setBounds(200,440,300,40);
        consultMonth.setForeground(Color.black);
        consultMonth.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel consultDate = new JLabel("Date:");
        consultPanel.add(consultDate);
        consultDate.setBounds(365,440,300,40);
        consultDate.setForeground(Color.black);
        consultDate.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel docID = new JLabel("Select the ID of the Doctor:");
        consultPanel.add(docID);
        docID.setBounds(35,480,300,40);
        docID.setForeground(Color.black);
        docID.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel hoursTitle = new JLabel("Enter the number of hours:");
        consultPanel.add(hoursTitle);
        hoursTitle.setBounds(35,520,300,40);
        hoursTitle.setForeground(Color.black);
        hoursTitle.setFont(new Font("Arial", Font.PLAIN,15));

        JLabel notes = new JLabel("Additional Notes:");
        consultPanel.add(notes);
        notes.setBounds(35,560,300,40);
        notes.setForeground(Color.black);
        notes.setFont(new Font("Arial", Font.PLAIN,15));

        consultPanel.add(name);
        name.setBounds(160,160,100,25);

        consultPanel.add(surname);
        surname.setBounds(160,200,100,25);

        consultPanel.add(bYear);
        bYear.setBounds(80,280,70,25);

        consultPanel.add(bMonth);
        bMonth.setBounds(255,280,70,25);

        consultPanel.add(bDate);
        bDate.setBounds(410,280,70,25);

        consultPanel.add(mobile);
        mobile.setBounds(160,320,100,25);

        consultPanel.add(patID);
        patID.setBounds(160,360,100,25);

        consultPanel.add(cYear);
        cYear.setBounds(80,440,70,25);

        consultPanel.add(cMonth);
        cMonth.setBounds(255,440,70,25);

        consultPanel.add(cDate);
        cDate.setBounds(410,440,70,25);

        doctorID = new JComboBox<>();
        for (int x=0; x<WestminsterSkinConsultationManager.doctorsList.size(); x++){
            doctorID.addItem(WestminsterSkinConsultationManager.doctorsList.get(x).getLicenseNo());
        }
        consultPanel.add(doctorID);
        doctorID.setBounds(240,490,100,25);

        consultPanel.add(noOfHours);
        noOfHours.setBounds(240,530,70,25);

        consultPanel.add(addNotes);
        addNotes.setBounds(160,570,400,120);

        consultPanel.add(submit);
        submit.setBounds(240,710,100,30);
        submit.addActionListener(this::actionPerformed);

       consultPanel.add(save);
        save.setBounds(240,710,100,30);
        save.addActionListener(this::actionPerformed);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==submit){
            addPatient();
            addConsultation();
            consultPanel.add(view);
            view.setBounds(480,710,100,30);
            view.addActionListener(this::actionPerformed);

        } else if (e.getSource()==view) {
            JFrame viewConsult = new JFrame();
            JPanel viewPanel = new JPanel(null); //Panel for viewing the added consultation.

            viewConsult.add(viewPanel);
            viewConsult.setTitle("Skincare Consultation System");
            viewConsult.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            viewConsult.setSize(640, 800);
            viewConsult.setVisible(true);

            viewPanel.setBackground(new Color(0xA6A5A5));

            JLabel topicMain = new JLabel("View Consultation");
            topicMain.setBounds(200, 5, 400, 40);
            topicMain.setFont(new Font("ENGRAVERS MT", Font.BOLD, 20));
            topicMain.setForeground(Color.black);
            topicMain.setBackground(new Color(0xA6A5A5));
            topicMain.setOpaque(true);
            viewPanel.add(topicMain);

            JLabel fName = new JLabel("First Name : ");
            viewPanel.add(fName);
            fName.setBounds(35, 130, 300, 40);
            fName.setForeground(Color.black);
            fName.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel fName1 = new JLabel(name.getText());
            viewPanel.add(fName1);
            fName1.setBounds(170, 130, 300, 40);
            fName1.setForeground(Color.black);
            fName1.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel lName = new JLabel("Last Name : ");
            viewPanel.add(lName);
            lName.setBounds(35, 180, 300, 40);
            lName.setForeground(Color.black);
            lName.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel lName1 = new JLabel(surname.getText());
            viewPanel.add(lName1);
            lName1.setBounds(170, 180, 300, 40);
            lName1.setForeground(Color.black);
            lName1.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel mobNumber = new JLabel("Mobile Number : ");
            viewPanel.add(mobNumber);
            mobNumber.setBounds(35, 230, 300, 40);
            mobNumber.setForeground(Color.black);
            mobNumber.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel mobile1 = new JLabel("0" + mobile.getText());
            viewPanel.add(mobile1);
            mobile1.setBounds(210, 230, 300, 40);
            mobile1.setForeground(Color.black);
            mobile1.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel cusID = new JLabel("Patient ID : ");
            viewPanel.add(cusID);
            cusID.setBounds(35, 280, 300, 40);
            cusID.setForeground(Color.black);
            cusID.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel cusID1 = new JLabel(patID.getText());
            viewPanel.add(cusID1);
            cusID1.setBounds(170, 280, 300, 40);
            cusID1.setForeground(Color.black);
            cusID1.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel consulTitle = new JLabel("Date of the Consultation : ");
            viewPanel.add(consulTitle);
            consulTitle.setBounds(35, 330, 300, 40);
            consulTitle.setForeground(Color.black);
            consulTitle.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            int conYear = Integer.parseInt(cYear.getText());
            int conMonth = Integer.parseInt(cMonth.getText());
            int conDate = Integer.parseInt(cDate.getText());
            LocalDate consulDate = LocalDate.of(conYear, conMonth, conDate);
            JLabel consuDate = new JLabel(String.valueOf(consulDate));
            viewPanel.add(consuDate);
            consuDate.setBounds(300, 330, 300, 40);
            consuDate.setForeground(Color.black);
            consuDate.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel hoursTitle = new JLabel("No. of Hours : ");
            viewPanel.add(hoursTitle);
            hoursTitle.setBounds(35, 380, 300, 40);
            hoursTitle.setForeground(Color.black);
            hoursTitle.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel hoursNo = new JLabel(noOfHours.getText());
            viewPanel.add(hoursNo);
            hoursNo.setBounds(170, 380, 300, 40);
            hoursNo.setForeground(Color.black);
            hoursNo.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel costTitle = new JLabel("Cost for the Consultation : ");
            viewPanel.add(costTitle);
            costTitle.setBounds(35, 430, 300, 40);
            costTitle.setForeground(Color.black);
            costTitle.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel costAmount = new JLabel(String.valueOf(Consultation.getCost()));
            viewPanel.add(costAmount);
            costAmount.setBounds(300, 430, 300, 40);
            costAmount.setForeground(Color.black);
            costAmount.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            viewPanel.add(save);
            save.setBounds(240,620,100,30);
            save.addActionListener(a -> {
                try {
                    actionPerformedSave(a);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            long docIndex = Consultation.getDocID();
            String doctorInfo = null;
            for (int x = 0; x < WestminsterSkinConsultationManager.doctorsList.size(); x++) {
                if (docIndex == WestminsterSkinConsultationManager.doctorsList.get(x).getLicenseNo()) {
                    doctorInfo = "Dr. " + WestminsterSkinConsultationManager.doctorsList.get(x).getName() + " " +
                            WestminsterSkinConsultationManager.doctorsList.get(x).getSurname();
                }
            }

            JLabel docInfo = new JLabel("Doctor : ");
            viewPanel.add(docInfo);
            docInfo.setBounds(35, 480, 300, 40);
            docInfo.setForeground(Color.black);
            docInfo.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel doc1 = new JLabel(doctorInfo);
            viewPanel.add(doc1);
            doc1.setBounds(170, 480, 300, 40);
            doc1.setForeground(Color.black);
            doc1.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel notesTitle = new JLabel("Additional Notes : ");
            viewPanel.add(notesTitle);
            notesTitle.setBounds(35, 530, 300, 40);
            notesTitle.setForeground(Color.black);
            notesTitle.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

            JLabel notes1 = new JLabel(Consultation.getNotes());
            viewPanel.add(notes1);
            notes1.setBounds(200, 530, 300, 40);
            notes1.setForeground(Color.black);
            notes1.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

        }
    }

    public void actionPerformedSave(ActionEvent a) throws IOException {
        if (a.getSource() == save) {
            consultSave();
        } else {
            System.out.println("Program exited without saving");
        }
    }

    public static void addPatient(){

        String firstName = name.getText();
        String lastName = surname.getText();
        int dobYear = Integer.parseInt(bYear.getText());
        int dobMonth = Integer.parseInt(bMonth.getText());
        int dobDate = Integer.parseInt(bDate.getText());
        long mobNo = Long.parseLong(mobile.getText());
        int patientID = Integer.parseInt(patID.getText());

        boolean newPatient = true;

        for (int x=0; x< WestminsterSkinConsultationManager.patientsList.size(); x++){
            if (WestminsterSkinConsultationManager.patientsList.get(x).getPatientID() == patientID) {
                newPatient = false;
                break;
            }
        }

        if (newPatient){
            WestminsterSkinConsultationManager.patientsList.add(new Patient(firstName,lastName, LocalDate.of(dobYear,dobMonth,dobDate),
                    mobNo,patientID));
        }

    }

    public static void addConsultation(){

        String firstName = name.getText();
        String lastName = surname.getText();
        int dobYear = Integer.parseInt(bYear.getText());
        int dobMonth = Integer.parseInt(bMonth.getText());
        int dobDate = Integer.parseInt(bDate.getText());
        long mobNo = Long.parseLong(mobile.getText());
        int patientID = Integer.parseInt(patID.getText());

        boolean newPatient = true;
        for (int x=0; x< WestminsterSkinConsultationManager.patientsList.size(); x++){
            if (WestminsterSkinConsultationManager.patientsList.get(x).getPatientID() == patientID) {
                newPatient = false;

            }
        }

        int conYear = Integer.parseInt(cYear.getText());
        int conMonth = Integer.parseInt(cMonth.getText());
        int conDate = Integer.parseInt(cDate.getText());
        LocalDate consultationDate = LocalDate.of(conYear,conMonth,conDate);
        int hours = Integer.parseInt(noOfHours.getText());

        int cost; // Calculating the cost according to the number of hrs.
        if (newPatient){
            cost = 15 * Integer.parseInt(noOfHours.getText());
        } else {
            cost = 25 * Integer.parseInt(noOfHours.getText());
        }

        JLabel costAmount = new JLabel(cost+"£");
        costAmount.setBounds(300, 390, 300, 40);
        costAmount.setForeground(Color.black);
        costAmount.setFont(new Font("IBM Plex Serif", Font.PLAIN, 18));

        String notes = addNotes.getText();

        long docNo = Long.parseLong(String.valueOf(doctorID.getSelectedItem()));
        boolean freeDoctor = true;
        for (int x=0; x<WestminsterSkinConsultationManager.consultList.size(); x++){
            if (docNo== Consultation.getDocID()){
                if (consultationDate==WestminsterSkinConsultationManager.consultList.get(x).getConsultDate()){
                    freeDoctor = false;
                }
            }
        }

        if (freeDoctor){
            Patient patient = new Patient(firstName,lastName,LocalDate.of(dobYear,dobMonth,dobDate),mobNo,patientID);
            Consultation consultation = new Consultation(patient,consultationDate,hours,cost,notes,docNo);
            WestminsterSkinConsultationManager.consultList.add(consultation);
        } else {
            JLabel noDoctor = new JLabel("Doctor unavailable");
            noDoctor.setBounds(400,490,100,25);
            noDoctor.setForeground(Color.RED);
            noDoctor.setFont(new Font("Arial", Font.PLAIN,15));
            consultPanel.add(noDoctor);

            while (true){
                Random random = new Random();
                int randomIndex = random.nextInt(WestminsterSkinConsultationManager.consultList.size());
                if (!(WestminsterSkinConsultationManager.consultList.get(randomIndex).getConsultDate()==consultationDate)) {
                    docNo = Consultation.getDocID();
                    break;
                }
            }

            Patient patient = new Patient(firstName,lastName,LocalDate.of(dobYear,dobMonth,dobDate),mobNo,patientID);
            Consultation consultation = new Consultation(patient,consultationDate,hours,cost,notes,docNo);
            WestminsterSkinConsultationManager.consultList.add(consultation);
        }
    }

    public static void consultSave() throws IOException {
             FileWriter myWriter = new FileWriter("Consultation.txt");
             myWriter.write(Consultation.getNotes());
             myWriter.close();


}

}




