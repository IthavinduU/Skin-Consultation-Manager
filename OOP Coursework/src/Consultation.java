import java.time.LocalDate;

public class Consultation {

    private Patient patient;
    private LocalDate consultDate;
    private int noOfHours;
    private static int cost;
    private static String notes;
    private static long docID;

    public Consultation(Patient patient,LocalDate consultDate,int noOfHours,int cost,String notes,long docID){
        this.patient = patient;
        this.consultDate = consultDate;
        this.noOfHours = noOfHours;
        Consultation.cost = cost;
        Consultation.notes = notes;
        Consultation.docID = docID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getConsultDate() {
        return consultDate;
    }

    public void setConsultDate(LocalDate consultDate) {
        this.consultDate = consultDate;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public static int getCost() {return cost;}

    public void setCost(int cost) {
        Consultation.cost = cost;
    }

    public static String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        Consultation.notes = notes;
    }

    public static long getDocID() {
        return docID;
    }

    public void setDocID(long docID) {
        Consultation.docID = docID;
    }
}
