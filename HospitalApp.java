public class HospitalApp {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println(" MINI HOSPITAL EMERGENCY SYSTEM ");
        System.out.println("================================");

        Patient patient1 = new Patient(
                101,
                "sumas",
                23,
                "0771234567",
                "Fever"
        );

        Patient patient2 = new Patient(
                102,
                "Arsath",
                35,
                "0719876543",
                "Chest Pain"
        );

        System.out.println("\nPatient 1");
        patient1.displayPatient();

        System.out.println("\nPatient 2");
        patient2.displayPatient();
    }
}