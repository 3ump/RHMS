// This class handles vital checking and alerts
public class RHMS {

    // Checks if vital sign is abnormal and prints alert
    public void checkVital(Patient p, VitalSign v) {
        System.out.println("\nReceived vital for " + p.getName());
        System.out.println(v);

        if (v.heartRate > 120 || v.temperature > 38.5) {
            Alert a = new Alert("A1", "Abnormal vital detected!", "HIGH");
            sendAlert(p, a);
        } else {
            System.out.println("Vitals are normal.");
        }
    }

    // Sends alert for patient
    public void sendAlert(Patient p, Alert a) {
        System.out.println("ALERT for " + p.getName() + ": " + a);
    }
}
