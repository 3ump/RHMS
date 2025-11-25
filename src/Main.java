import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RHMS system = new RHMS();

        Patient patient = null;
        Doctor doctor = null;
        WearableDevice device = null;

        int choice = 0;

        while (choice != 5) {
            System.out.println("\n--- RHMS MENU ---");
            System.out.println("1. Register Patient");
            System.out.println("2. Register Doctor");
            System.out.println("3. Assign Device to Patient");
            System.out.println("4. Enter Vital Signs");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();  // consume leftover newline

            if (choice == 1) {
                System.out.print("Enter patient ID: ");
                String pid = sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter age: ");
                int age = sc.nextInt();

                patient = new Patient(pid, name, age);
                System.out.println("Patient registered!");

            } else if (choice == 2) {
                System.out.print("Enter doctor ID: ");
                String did = sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter specialization: ");
                String spec = sc.nextLine();

                doctor = new Doctor(did, name, spec);
                System.out.println("Doctor registered!");

            } else if (choice == 3) {
                if (patient == null) {
                    System.out.println("Register patient first!");
                    continue;
                }

                System.out.print("Enter device ID: ");
                String devId = sc.nextLine();

                device = new WearableDevice(devId, "Active");
                patient.setDevice(device);

                System.out.println("Device assigned!");

            } else if (choice == 4) {
                if (patient == null) {
                    System.out.println("Register patient first!");
                    continue;
                }

                System.out.print("Heart Rate: ");
                int hr = sc.nextInt();

                System.out.print("Blood Pressure: ");
                int bp = sc.nextInt();

                System.out.print("Temperature: ");
                double temp = sc.nextDouble();

                sc.nextLine(); // consume newline

                System.out.print("Time: ");
                String time = sc.nextLine();

                VitalSign v = new VitalSign(hr, bp, temp, time);
                system.checkVital(patient, v);

            } else if (choice == 5) {
                System.out.println("Exiting...");
            }
        }

        sc.close();
    }
}
