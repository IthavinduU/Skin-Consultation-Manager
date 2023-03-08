import java.time.LocalDate;

public class Doctor extends Person {

    private long licenseNo;
    private String specialization;

    public Doctor(String name, String surname, LocalDate dob, long mobNo, long licenseNo, String specialization) {
        super(name, surname, dob, mobNo);
        this.licenseNo = licenseNo;
        this.specialization = specialization;
    }

    public long getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(long licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
