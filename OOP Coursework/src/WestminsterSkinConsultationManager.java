import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class WestminsterSkinConsultationManager implements SkinConsultationManager {

    public static ArrayList<Doctor> doctorsList = new ArrayList<>(); // Arraylist to hold doctor information
    public static ArrayList<Consultation> consultList = new ArrayList<>();
    public static ArrayList<Patient> patientsList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in); // Creating scanner class for inputs

        initial: // Naming the loop
        while (true) { // Creating a while loop to display and iterate through the console menu.

            System.out.println(" ");
            System.out.println("----------WESTMINSTER SKINCARE CENTER----------");
            System.out.println(" ");
            System.out.println("CONSOLE MENU");
            System.out.println(" ");
            System.out.println("1 - Add a new Doctor");
            System.out.println("2 - Delete a Doctor");
            System.out.println("3 - View the list of Doctors");
            System.out.println("4 - Save data");
            System.out.println("5 - Load Data");
            System.out.println("6 - Open the GUI");
            System.out.println("7 - Exit the Program.");
            System.out.println(" ");
            System.out.print("Enter an option : ");
            String option = sc.nextLine();
            System.out.println(" ");

            switch (option) { // Using a switch case to loop through all the functions.

                case "1":
                    addNewDoctor();
                    break;
                case "2":
                    removeDoctor();
                    break;
                case "3":
                    viewDoctorList();
                    break;
                case "4":
                    saveData();
                    break;
                case "5":
                    loadData();
                    break;
                case "6":
                    new DocListGUI();
                    break;
                case "7":
                    break initial;
                default:
                    System.out.println("Please enter a valid input"); // Validating user input.
            }
        }
    }

    //------Method declaration-------
    public static void addNewDoctor(){

        boolean available = checkAvailability(); //Checking the doctor's availability.
        if (available) {
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the first name of the doctor : ");
                if (sc.hasNextLine()) {
                    String docFirstName = sc.nextLine();
                    while (!docFirstName.matches("[a-zA-Z ]+")) { // Check if user has input any number
                        System.out.print("Please enter a valid name : ");
                        docFirstName = sc.nextLine();
                    }
                    System.out.print("Enter the surname of the doctor : ");
                    if (sc.hasNextLine()) {
                        String docSurname = sc.nextLine();
                        while (!docSurname.matches("[a-zA-Z ]+")) { // Check if user has input any number
                            System.out.print("Please enter a valid name : ");
                            docSurname = sc.nextLine();
                        }
                        System.out.println();
                        System.out.println("Enter the date of birth of the doctor");
                        System.out.println();
                        System.out.print("Enter the year : ");
                        if (sc.hasNextInt()) {
                            int year = sc.nextInt();
                            while (!(year >1930 && year<=2001)) {
                                System.out.print("Please enter a valid year : ");
                                year = sc.nextInt();
                            }
                            System.out.print("Enter the month : ");
                            if (sc.hasNextInt()) {
                                int month = sc.nextInt();
                                while (!(month >0 && month<13)) {
                                    System.out.print("Please enter a valid month : ");
                                    month = sc.nextInt();
                                }
                                System.out.print("Enter the date : ");
                                if (sc.hasNextInt()) {
                                    int date = sc.nextInt();
                                    while (!(date >0 && date<=31)) {
                                        System.out.print("Please enter a valid date : ");
                                        date = sc.nextInt();
                                    }
                                    System.out.print("Enter the mobile number : ");
                                    if (sc.hasNextLong()) {
                                        long mobNo = sc.nextLong();
                                        while (!(mobNo >0 && mobNo<=999999999)) {
                                            System.out.print("Please enter a valid mobile number : ");
                                            mobNo = sc.nextLong();
                                        }
                                        System.out.print("Enter the license number : ");
                                        if (sc.hasNextLong()) {
                                            long licenseNo = sc.nextLong();
                                            while (!(licenseNo >0 && licenseNo<=999999)) {
                                                System.out.print("Please enter a valid license number : ");
                                                licenseNo = sc.nextLong();
                                            }
                                            System.out.print("Enter the specialization of the doctor : ");
                                            if (sc.hasNext()) {
                                                String docSpecialization = sc.next();
                                                while (!docSpecialization.matches("[a-zA-Z ]+")) { // Check if user has input any number
                                                    System.out.print("Please enter a valid input! : ");
                                                    docSpecialization = sc.next();
                                                }
                                                doctorsList.add(new Doctor(docFirstName,docSurname, LocalDate.of(year,month,date),mobNo,licenseNo,docSpecialization));
                                                break;
                                            } else {
                                                System.out.println("Please enter a valid input");
                                            }
                                        } else {
                                            System.out.println("Please enter a valid license number");
                                        }
                                    } else {
                                        System.out.println("Please enter a valid mobile number");
                                    }
                                } else {
                                    System.out.println("Please enter a valid date");
                                }
                            } else {
                                System.out.println("Please enter a valid month");
                            }
                        } else {
                            System.out.println("Please enter a valid year");
                        }
                    } else {
                        System.out.println("Please enter a valid name");
                    }
                } else {
                    System.out.println("Please enter a valid name");
                }
            }
        } else {
            System.out.println("There are no more available slots for doctors"); // Output if there are no slots available.
        }
    }

    public static void removeDoctor(){

        if (doctorsList.size()>0){
            System.out.println("Number of available doctors : "+doctorsList.size());
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the medical license number of the doctor you wish to remove : ");
            if (sc.hasNextLong()){
                long licenseNo = sc.nextLong();
                while (!(licenseNo >0 && licenseNo<=999999)) {
                    System.out.print("Please enter a valid license number : ");
                    licenseNo = sc.nextLong();
                }
                boolean doctorAvailable = false; // Checking the medical license number availability.
                for (int x=0; x<doctorsList.size(); x++){
                    if (licenseNo == doctorsList.get(x).getLicenseNo()){
                        doctorAvailable = true;
                        System.out.println("Dr."+doctorsList.get(x).getName()+" "+doctorsList.get(x).getSurname()+" has been removed from the list");
                        doctorsList.remove(x); // Removing the doctor from the arraylist
                    }
                }
                if (!doctorAvailable){
                    System.out.println("The license number doesn't match any of the doctors in the list");
                }
            } else {
                System.out.println("Please enter a valid license number");
            }
        } else {
            System.out.println("There are no available doctors");
        }
    }


    public static void viewDoctorList(){
        System.out.println(" ----------------------------------- List of doctors ------------------------------------");
        System.out.println(" ");
        doctorsList.sort(new Comparator<>() { // Sorting the doctor list arraylist according to the lastname of the doctor.
            @Override
            public int compare(Doctor o1, Doctor o2) {
                return
                        o1.getSurname().compareToIgnoreCase(o2.getSurname());
            }
        });
        System.out.printf("%-15s%-15s%-20s%-20s%-20s%-20s\n","First Name","Last Name","Date of Birth","Mobile Number","License Number","Specialization");
        for (Doctor doctor : doctorsList) { // Enhanced for loop is used here.
            System.out.printf("%-15s%-15s%-20s%-20d%-20d%-20s\n",doctor.getName(),doctor.getSurname(),doctor.getDob(),doctor.getMobNo(),doctor.getLicenseNo(),doctor.getSpecialization()); // inserting data to the table view.
        }
    }


    public static void saveData() throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter myWriter = new FileWriter("Doctor list.txt"); // Create a FileWriter object
        System.out.println("Are you sure you want to overwrite the saved data if data is already stored?");
        System.out.print("Enter Y or N : ");
        if (sc.hasNextLine()){ // Input validation
            String ans = sc.nextLine().toUpperCase();
            if (ans.equals("Y")){

                for (int y=0; y<doctorsList.size(); y++){ // Write details of the doctor to the file in a specific format
                    myWriter.write(getDoctorString(y));
                }
                if (doctorsList.size()<10){// Write empty spaces if no doctor is available
                    for (int z=0; z<10-doctorsList.size();z++){
                        myWriter.write("\n");
                    }
                }
                myWriter.close(); // Close the writer object
                System.out.println("The data has been successfully stored");
            }else {
                System.out.println("The saved data won't be overwritten");
            }
        }else{
            System.out.println("Please enter a valid input. Try again");
        }
    }

    public static void loadData() throws FileNotFoundException { // Method to load data from a CSV file

        //Reference : https://www.youtube.com/watch?v=zKDmzKaAQro&ab_channel=BroCode
        File dataFile = new File("Doctor list.txt"); // Create a File object
        Scanner read = new Scanner(dataFile); // Create a Scanner object to read the file
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you sure you want to load data and overwrite the current data?");
        System.out.print("Enter Y or N : ");
        if (sc.hasNextLine()){ // Input validation
            String ans = sc.nextLine().toUpperCase();
            if (ans.equals("Y")){
                // Clear existing data
                doctorsList.clear();
                String doctorDetails;
                for (int x=0; x<10; x++){ // Loop for 10 times to get all the doctor details in the CSV file
                    doctorDetails = read.nextLine();
                    // Store each line into an array and separate the data using commas
                    String[] parts = doctorDetails.split(",");
                    // Check if the line is an empty space
                    if (doctorDetails.length()>2){
                        // Add passenger using the comma separated values in the array above
                        String firstName = parts[0];
                        String surName = parts[1];
                        LocalDate dob = LocalDate.parse(parts[2]);
                        long mobNo = Long.parseLong(parts[3]);
                        long licenseNo = Long.parseLong(parts[4]);
                        String specialization = parts[5];
                        doctorsList.add(new Doctor(firstName,surName,dob,mobNo,licenseNo,specialization));
                    }
                }
                read.close();
                System.out.println("The data has been successfully loaded");

            } else {
                System.out.println("The data won't be overwritten");
            }
        }else {
            System.out.println("Please enter a valid input. Try again");
        }
    }


    public static boolean checkAvailability(){ // Method to check doctors availability

        boolean available = false;
        for (int x=0; x<10; x++){
            if (doctorsList.size() <= 10) {
                available = true;
                break;
            }
        }
        return available;
    }

    public static String getDoctorString(int x){ // Method to insert data into table view in a correct order.
        String data;
        String firstName = doctorsList.get(x).getName();
        String lastName = doctorsList.get(x).getSurname();
        LocalDate dob = doctorsList.get(x).getDob();
        long mobNo = doctorsList.get(x).getMobNo();
        long licenseNo = doctorsList.get(x).getLicenseNo();
        String specialization = doctorsList.get(x).getSpecialization();
        data = firstName+","+lastName+","+dob+","+mobNo+","+licenseNo+","+specialization+"\n";
        return data;
    }
}
