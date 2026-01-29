public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Hospital Management System v1.0.0");
        Patient patient = new Patient("John Doe", 30);
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Patient Age: " + patient.getAge()); 
        System.out.println("Thank you for using Hospital Management System.");
    }
}
