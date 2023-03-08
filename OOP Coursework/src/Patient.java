import java.time.LocalDate;

public class Patient extends Person{
    private int patientID;
    public Patient(String name, String surname, LocalDate dob, long mobNo, int patientID){
        super(name, surname, dob, mobNo);
        this.patientID = patientID;
    }
    public int getPatientID() {
        return patientID;
    }
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
}
