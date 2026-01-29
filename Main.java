public class Main {
    public static void main(String[] args) {
        System.out.println("Hospital Management System v1.0.0");
        Patient patient = new Patient("John Doe", 30);
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Patient Age: " + patient.getAge()); 
    }
}
