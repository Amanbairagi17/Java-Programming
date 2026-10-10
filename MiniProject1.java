
import java.util.ArrayList;
import java.util.Scanner;

public class MiniProject1 {
    static class Patient {
        private int id;
        private String name;
        private int age;
        private String disease;

        // Constructor
        public Patient(int id, String name, int age, String disease) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.disease = disease;
        }

        // Getters
        public int getId() { return id; }
        public String getName() { return name; }
        public int getAge() { return age; }
        public String getDisease() { return disease; }

        // Display details
        public void displayInfo() {
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease);
        }
    }
    static class PatientManagementSystem {
        private ArrayList<Patient> patients = new ArrayList<>();

        // Add Patient
        public void addPatient(Patient p) {
            patients.add(p);
            System.out.println("Patient added successfully!");
        }

        // View All Patients
        public void viewPatients() {
            if (patients.isEmpty()) {
                System.out.println("No patients found!");
                return;
            }
            for (Patient p : patients) {
                p.displayInfo();
            }
        }

        // Search Patient by ID
        public Patient searchPatient(int id) {
            for (Patient p : patients) {
                if (p.getId() == id) {
                    return p;
                }
            }
            return null;
        }

        // Delete Patient
        public boolean deletePatient(int id) {
            Patient p = searchPatient(id);
            if (p != null) {
                patients.remove(p);
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientManagementSystem pms = new PatientManagementSystem();

        while (true) {
            System.out.println("\n1. Add Patient\n2. View Patients\n3. Search Patient\n4. Delete Patient\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();
                    pms.addPatient(new Patient(id, name, age, disease));
                    break;

                case 2:
                    pms.viewPatients();
                    break;

                case 3:
                    System.out.print("Enter Patient ID to search: ");
                    int searchId = sc.nextInt();
                    Patient p = pms.searchPatient(searchId);
                    if (p != null) p.displayInfo();
                    else System.out.println("Patient not found!");
                    break;

                case 4:
                    System.out.print("Enter Patient ID to delete: ");
                    int deleteId = sc.nextInt();
                    if (pms.deletePatient(deleteId))
                        System.out.println("Patient deleted successfully!");
                    else
                        System.out.println("Patient not found!");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
// Next Task: This program only runs and stores data temporarily during execution.
// The next step is to save data permanently by storing it in a file format or a database.
